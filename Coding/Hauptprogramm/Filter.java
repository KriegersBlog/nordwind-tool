package Hauptprogramm;
// Autor:Julian Krieger
// Datum: 13.11.2019

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.*;
import java.awt.Component;
public class Filter{
    //Universales Format für Daten erstellen
    DateFormat normalDateFormat = new SimpleDateFormat("dd.MM.yyyy");
    private int[] position = {10, 45, 80, 115, 150, 185, 220, 255, 290, 325, 360,395, 430, 465, 500, 535};

    public void setFilterBounds(JPanel panel){
        int i = 2;
        int x = 0;
        int p = 10;
        int f = 0;

        for(Component c: panel.getComponents()) {
            if(c instanceof JButton){
                c.setBounds(50, position[x],200,20);
            }
            else if(i % 2 == 0){
                c.setBounds(p, position[x],100,20);
                p = 125;
            }
            else if(i % 2 == 1){
                if(c instanceof JNumberField){
                    f = 50;
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
    }
}

