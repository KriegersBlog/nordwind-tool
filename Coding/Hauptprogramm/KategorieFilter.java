package Hauptprogramm;
// Autor: Julian Krieger
// Datum: 13.11.2019

import javax.swing.*;

public class KategorieFilter extends Filter{

    public KategorieFilter(JPanel panel){
        //OBJEKTE ERSTELLEN

        JLabel label_kategoriennr = new JLabel();
        label_kategoriennr.setText("Kategorienr.:");
        JNumberField numberfield_kategorienr = new JNumberField();
        numberfield_kategorienr.setToolTipText("Kategorienummer angeben");

        JLabel label_kategoriename = new JLabel();
        label_kategoriename.setText("Kategoriename:");
        JTextField textfield_kategoriename = new JTextField();
        textfield_kategoriename.setToolTipText("Kategoriename angeben");

        JLabel label_beschreibung = new JLabel();
        label_beschreibung.setText("Beschreibung:");
        JTextField textfield_beschreibung = new JTextField();
        textfield_beschreibung.setToolTipText("Beschreibung angeben");

        //Submit Button erstellen
        private JButton button_submit = new JButton();
        button_submit.setText(");

        panel.add(label_kategoriennr);
        panel.add(numberfield_kategorienr);
        panel.add(label_kategoriename);
        panel.add(textfield_kategoriename);
        panel.add(label_beschreibung);
        panel.add(textfield_beschreibung);
        panel.add(button_submit);

        setFilterBounds(panel);
    }
}






