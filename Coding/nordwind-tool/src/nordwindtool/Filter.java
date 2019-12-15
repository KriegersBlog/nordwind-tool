package nordwindtool;

import lombok.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.*;
import java.awt.Component;
import java.awt.event.*;

public class Filter {
    //Universales Format für Daten erstellen
    DateFormat normalDateFormat = new SimpleDateFormat("dd.MM.yyyy");
    public JButton button_submit = new JButton();
    public static JOptionPane optionpane_error = new JOptionPane();

    public Filter() {
        button_submit.setText("");
        button_submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                button_submit_ActionPerformed(evt);
            }
        });
    }

    public void button_submit_ActionPerformed(ActionEvent evt) {
        filterAbfrage(Menu.liste_tabellen.main_list.getSelectedIndex());
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

    public static void error_message() {
        optionpane_error.showMessageDialog(null, "Bitte gueltige Zahlenwerte eingeben!", "Fehler!", JOptionPane.ERROR_MESSAGE);
    }

    public static void clearNumberFields() {
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

    public static void clearFilter() {
        JPanel panel_filter = NordwindTool.getMain_panel_filter();
        for (Component c : panel_filter.getComponents()) {
            if (c instanceof JTextField) {
                JTextField tf = (JTextField) c;
                tf.setText(null);
            } else if (c instanceof JNumberField) {
                JNumberField nf = (JNumberField) c;
                nf.clear();
            } else if (c instanceof JComboBox) {
                JComboBox cb = (JComboBox) c;
                cb.setSelectedIndex(0);
            } else if (c instanceof JCheckBox) {
                JCheckBox cb = (JCheckBox) c;
                cb.setSelected(false);
            } else if (c instanceof JFormattedTextField) {
                JFormattedTextField ftf = (JFormattedTextField) c;
                ftf.setText(null);
            }
        }
    }

    public static void resetFilter() {
        JPanel panel_filter = NordwindTool.getMain_panel_filter();
        for (Component c : panel_filter.getComponents()) {
            c.setEnabled(false);
            c.setVisible(false);
            panel_filter.remove(c);
            c = null;
        }
    }

    public static void filterAbfrage(int index) {
        JPanel panel_filter = NordwindTool.getMain_panel_filter();
        int error_counter = filterTesten(panel_filter);
        if (error_counter > 0) {
            error_message();
            clearNumberFields();
        } else {
            switch (index) {
                case 0:
                    ArtikelFilter artikelfilter = NordwindTool.getMain_artikelFilter();
                    switch (NordwindTool.modus) {
                        case "Abfragen":
                            artikelfilter.createQuery();
                            break;
                        case "Editieren":
                            artikelfilter.editRecord();
                            break;
                        case "Anlegen":
                            artikelfilter.createRecord();
                            break;
                    }
                    clearNumberFields();
                    break;

                case 1:
                    BestelldetailsFilter bestelldetailsfilter = NordwindTool.getMain_bestelldetailsFilter();
                    switch (NordwindTool.modus) {
                        case "Abfragen":
                            //   bestelldetailsfilter.createQuery();
                            break;
                        case "Editieren":
                            //    bestelldetailsfilter.editRecord();
                            break;
                        case "Anlegen":
                            bestelldetailsfilter.createRecord();
                            break;
                    }
                    clearNumberFields();
                    break;

                case 2:
                    BestellungenFilter bestellungenfilter = NordwindTool.getMain_bestellungenFilter();
                    switch (NordwindTool.modus) {
                        case "Abfragen":
                            //   bestellungenfilter.createQuery();
                            break;
                        case "Editieren":
                            //   bestellungenfilter.editRecord();
                            break;
                        case "Anlegen":
                            bestellungenfilter.createRecord();
                            break;
                    }
                    clearNumberFields();
                    break;

                case 3:
                    KategorieFilter kategoriefilter = NordwindTool.getMain_kategorieFilter();
                    switch (NordwindTool.modus) {
                        case "Abfragen":
                            //    kategoriefilter.createQuery();
                            break;
                        case "Editieren":
                            //   kategoriefilter.editRecord();
                            break;
                        case "Anlegen":
                            kategoriefilter.createRecord();
                            break;
                    }
                    clearNumberFields();
                    break;

                case 4:
                    KundenFilter kundenfilter = NordwindTool.getMain_kundenFilter();
                    switch (NordwindTool.modus) {
                        case "Abfragen":
                            //    kundenfilter.createQuery();
                            break;
                        case "Editieren":
                            //    kundenfilter.editRecord();
                            break;
                        case "Anlegen":
                            kundenfilter.createRecord();
                            break;
                    }
                    clearNumberFields();
                    break;

                case 5:
                    LieferantenFilter lieferantenfilter = NordwindTool.getMain_lieferantenFilter();
                    switch (NordwindTool.modus) {
                        case "Abfragen":
                            //    lieferantenfilter.createQuery();
                            break;
                        case "Editieren":
                            //   lieferantenfilter.editRecord();
                            break;
                        case "Anlegen":
                            lieferantenfilter.createRecord();
                            break;
                    }
                    clearNumberFields();
                    break;

                case 6:
                    PersonalFilter personalfilter = NordwindTool.getMain_personalFilter();
                    switch (NordwindTool.modus) {
                        case "Abfragen":
                            //    personalfilter.createQuery();
                            break;
                        case "Editieren":
                            //   personalfilter.editRecord();
                            break;
                        case "Anlegen":
                            personalfilter.createRecord();
                            break;
                    }
                    clearNumberFields();
                    break;

                case 7:
                    VersandfirmenFilter versandfirmenfilter = NordwindTool.getMain_versandfirmenFilter();
                    switch (NordwindTool.modus) {
                        case "Abfragen":
                            //   versandfirmenfilter.createQuery();
                            break;
                        case "Editieren":
                            //   versandfirmenfilter.editRecord();
                            break;
                        case "Anlegen":
                            versandfirmenfilter.createRecord();
                            break;
                    }
                    clearNumberFields();
                    break;

                default:

            }
        }
    }
}