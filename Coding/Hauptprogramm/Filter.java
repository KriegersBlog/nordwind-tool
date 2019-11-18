package Hauptprogramm;
// Autor:Julian Krieger
// Datum: 13.11.2019

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.*;
import java.awt.Component;
import java.awt.event.*;

public class Filter{
    //Universales Format für Daten erstellen
    DateFormat normalDateFormat = new SimpleDateFormat("dd.MM.yyyy");
    public JButton button_submit = new JButton();

    public Filter(){
        button_submit.setText("");
        button_submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                button_submit_ActionPerformed(evt);
            }
        });
    }



    public void button_submit_ActionPerformed(ActionEvent evt) {
       // filterAbfrage(*OBJEKTLISTEAUSMAIN*.getMainList().getSelectedIndex());

        //AKTIVE TABELLE ABFRAGEN
        //AM ENDE DAS OBJEKT EINER BESTIMMTEN Methode �BERGEBEN*
    }




    public static void setFilterBounds(JPanel panel){
        int[] position = {20, 55, 90, 125, 160, 195, 230, 265, 300, 335, 370,405, 440, 475, 510, 545};
        int i = 2;
        int x = 0;
        int p = 10;
        int f = 0;

        for(Component c: panel.getComponents()) {
            if(i % 2 == 0){
                c.setBounds(p, position[x],100,20);
                p = 125;
            }
            else if(i % 2 == 1){
                if(c instanceof JNumberField){
                    f = 50;
                    System.out.println("50");
                }
                else if(c instanceof JTextField){
                    f = 150;
                }
                else if(c instanceof JCheckBox){
                    f = 20;
                }
                c.setBounds(p, position[x], f,20);
                x++;
                p = 10;
            }
            i++;
        }
        x = 0;
    }
}

