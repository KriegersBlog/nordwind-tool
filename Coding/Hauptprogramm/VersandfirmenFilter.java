package Hauptprogramm;
// Autor: Julian Krieger
// Datum: 13.11.2019

import javax.swing.*;

public class VersandfirmenFilter extends Filter {
    //Attribute
    JNumberField main_numberfieldFirmennr;
    JTextField main_textfieldFirma;
    JNumberField main_numberfieldTelefon;

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
        JNumberField numberfield_telefon = new JNumberField();
        this.main_numberfieldTelefon = numberfield_telefon;
        numberfield_telefon.setToolTipText("Telefon angeben");


        panel.add(label_firmennr);
        panel.add(numberfield_firmennr);
        panel.add(label_firma);
        panel.add(textfield_firma);
        panel.add(label_telefon);
        panel.add(numberfield_telefon);
        panel.add(button_submit);

        setFilterBounds(panel);
    }
}






