package Hauptprogramm;
// Autor: Julian Krieger
// Datum: 13.11.2019

import javax.swing.*;

public class VersandfirmenFilter extends Filter {
    //Attribute
    JNumberField main_numberfieldFirmennr;
    JTextField main_textfieldFirma;
    JTextField main_textfieldTelefon;

    public VersandfirmenFilter(JPanel panel) {
        //OBJEKTE ERSTELLEN
        JLabel label_firmennr = new JLabel();
        label_firmennr.setText("Firmennr.:");
        JNumberField numberfield_firmennr = new JNumberField();
        this.main_numberfieldFirmennr = numberfield_firmennr;
        numberfield_firmennr.setToolTipText("Firmennummer angeben");

        JLabel label_firma = new JLabel();
        label_firma.setText("Firma:");
        JTextField textfield_firma = new JTextField();
        this.main_textfieldFirma = textfield_firma;
        textfield_firma.setToolTipText("Firmenname angeben");

        JLabel label_telefon = new JLabel();
        label_telefon.setText("Telefon:");
        JTextField textfield_telefon = new JTextField();
        this.main_textfieldTelefon = textfield_telefon;
        textfield_telefon.setToolTipText("Telefon angeben");

        panel.add(label_firmennr);
        panel.add(numberfield_firmennr);
        panel.add(label_firma);
        panel.add(textfield_firma);
        panel.add(label_telefon);
        panel.add(textfield_telefon);
        panel.add(button_submit);

        setFilterBounds(panel);
    }

    public void createRecord() {
        int[] integers = new int[1];
        integers[0] = this.main_numberfieldFirmennr.getInt();

        String[] strings = new String[2];
        strings[0] = this.main_textfieldFirma.getText();
        strings[1] = this.main_textfieldTelefon.getText();

        double[] doubles = new double[0];

        boolean[] booleans = new boolean[0];

        DBQuery.createRecord("versandfirmen", integers, strings, doubles, booleans);
    }
}






