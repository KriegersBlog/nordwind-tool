package Hauptprogramm;
// Autor: Julian Krieger
// Datum: 13.11.2019

import javax.swing.*;

public class KategorieFilter extends Filter {
    //Attribute
    JNumberField main_numberfieldKategorienr;
    JTextField main_textfieldKategoriename;
    JTextField main_textfieldBeschreibung;

    public KategorieFilter(JPanel panel) {
        //OBJEKTE ERSTELLEN
        JLabel label_kategoriennr = new JLabel();
        label_kategoriennr.setText("Kategorienr.:");
        JNumberField numberfield_kategorienr = new JNumberField();
        this.main_numberfieldKategorienr = numberfield_kategorienr;
        numberfield_kategorienr.setToolTipText("Kategorienummer angeben");

        JLabel label_kategoriename = new JLabel();
        label_kategoriename.setText("Kategoriename:");
        JTextField textfield_kategoriename = new JTextField();
        this.main_textfieldKategoriename = textfield_kategoriename;
        textfield_kategoriename.setToolTipText("Kategoriename angeben");

        JLabel label_beschreibung = new JLabel();
        label_beschreibung.setText("Beschreibung:");
        JTextField textfield_beschreibung = new JTextField();
        this.main_textfieldBeschreibung = textfield_beschreibung;
        textfield_beschreibung.setToolTipText("Beschreibung angeben");

        panel.add(label_kategoriennr);
        panel.add(numberfield_kategorienr);
        panel.add(label_kategoriename);
        panel.add(textfield_kategoriename);
        panel.add(label_beschreibung);
        panel.add(textfield_beschreibung);
        panel.add(button_submit);

        setFilterBounds(panel);
    }

    public void createRecord() {
        int[] integers = new int[1];

        integers[0] = this.main_numberfieldKategorienr.getInt();

        String[] strings = new String[2];
        strings[0] = this.main_textfieldKategoriename.getText();
        strings[1] = this.main_textfieldBeschreibung.getText();

        double[] doubles = new double[0];

        boolean[] booleans = new boolean[0];

        DBQuery.createRecord("kategorien", integers, strings, doubles, booleans);
    }

}






