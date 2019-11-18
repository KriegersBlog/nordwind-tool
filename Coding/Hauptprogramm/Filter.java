// Autor:Julian Krieger
// Datum: 13.11.2019

package Hauptprogramm;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.*;
import java.awt.Component;
import java.awt.event.*;

public class Filter {
    //Universales Format für Daten erstellen
    DateFormat normalDateFormat = new SimpleDateFormat("dd.MM.yyyy");
    public JButton button_submit = new JButton();
    public JOptionPane optionpane_error = new JOptionPane();

    public Filter() {
        button_submit.setText("");
        button_submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                button_submit_ActionPerformed(evt);
            }
        });
    }

    public void button_submit_ActionPerformed(ActionEvent evt) {
        // filterAbfrage(*OBJEKTLISTEAUSMAIN*.getMainList().getSelectedIndex());
        System.out.println("Modus: " + NordwindTool.modus);
        //AKTIVE TABELLE ABFRAGEN
        //AM ENDE DAS OBJEKT EINER BESTIMMTEN Methode �BERGEBEN*
    }

    public static void setFilterBounds(JPanel panel) {
        int[] position_y = {20, 55, 90, 125, 160, 195, 230, 265, 300, 335, 370, 405, 440, 475, 510, 545};
        int component_counter = 2;
        int position_index = 0;
        int position_x = 10;
        int width = 0;

        for (Component c : panel.getComponents()) {
            if (component_counter % 2 == 0) {
                c.setBounds(position_x, position_y[position_index], 100, 20);
                position_x = 125;
            } else if (component_counter % 2 == 1) {
                if (c instanceof JNumberField) {
                    width = 50;
                } else if (c instanceof JTextField) {
                    width = 150;
                } else if (c instanceof JCheckBox) {
                    width = 20;
                }
                c.setBounds(position_x, position_y[position_index], width, 20);
                position_index++;
                position_x = 10;
            }
            component_counter++;
        }
        position_index = 0;
    }

    public static int filterTesten(Component panel) {
        JPanel usedPanel = (JPanel) panel;
        int error_counter = 0;
        for (Component cp : usedPanel.getComponents()) {
            if (cp instanceof JNumberField) {
                JNumberField nf = (JNumberField) cp;
                if (nf.getText().equals("")) {
                    nf.setInt(-1);
                } else if (!nf.isNumeric()) {
                    error_counter++;
                }
            } else if (cp instanceof JTextField) {
                JTextField tf = (JTextField) cp;
                if (tf.getText().equals("")) {
                    tf.setText(null);
                }
            }
        }
        return (error_counter);
    }
    public void error_message(){
        optionpane_error.showMessageDialog(null, "Bitte gueltige Zahlenwerte eingeben!", "Fehler!", JOptionPane.ERROR_MESSAGE);
    }

    public void clearNumberFields() {
        JPanel panel_filter = NordwindTool.getMain_panel_filter();
        for (Component cp : panel_filter.getComponents()) {
            if (cp instanceof JNumberField) {
                JNumberField nf = (JNumberField) cp;
                if (!nf.isNumeric()) {
                    nf.setInt(-1);
                }
                if (nf.getInt() == -1) {
                    nf.clear();
                }
            }
        }
    }

    public void filterAbfrage(int index) {
        JPanel panel_filter = NordwindTool.getMain_panel_filter();
        if (filterTesten(panel_filter) > 0) {
            error_message();
        } else {
            switch (index) {
                case 0:

                    clearNumberFields();
                    break;
                case 1:

                    clearNumberFields();
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:

                    break;
                default:

            }
        }
    }
}

