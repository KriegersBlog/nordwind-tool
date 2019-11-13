package Hauptprogramm;
// Autor: Julian Krieger
// Datum: 13.11.2019

import javax.swing.*;

public class BestelldetailsFilter extends Filter{

    public BestelldetailsFilter(JPanel panel){
        //OBJEKTE ERSTELLEN

        //Bestellnummer erstellen
        JLabel label_bestellnr = new JLabel();
        label_bestellnr.setText("Bestellnummer:");
        JNumberField numberfield_bestellnr = new JNumberField();
        numberfield_bestellnr.setToolTipText("Bestellnummer angeben");

        //Artikelnummer erstellen
        JLabel label_artikelnr = new JLabel();
        label_artikelnr.setText("Artikelnummer:");
        JNumberField numberfield_artikelnr = new JNumberField();
        numberfield_artikelnr.setToolTipText("Artikelnummer angeben");

        //Einzelpreis erstellen
        JLabel label_einzelpreis = new JLabel();
        label_einzelpreis.setText("Einzelpreis:");
        JNumberField numberfield_einzelpreis = new JNumberField();
        numberfield_einzelpreis.setToolTipText("Ertikelnummer angeben");

        //Anzahl erstellen
        JLabel label_anzahl = new JLabel();
        label_anzahl.setText("Anzahl:");
        JNumberField numberfield_anzahl = new JNumberField();
        numberfield_anzahl.setToolTipText("Anzahl angeben");

        //Anzahl erstellen
        JLabel label_rabatt = new JLabel();
        label_rabatt.setText("Rabatt:");
        JNumberField numberfield_rabatt = new JNumberField();
        numberfield_rabatt.setToolTipText("Rabatt angeben");

        //Submit Button erstellen
        private JButton button_submit = new JButton();
        button_submit.setText(");

        panel.add(label_bestellnr);
        panel.add(numberfield_bestellnr);
        panel.add(label_artikelnr);
        panel.add(numberfield_artikelnr);
        panel.add(label_einzelpreis);
        panel.add(numberfield_einzelpreis);
        panel.add(label_anzahl);
        panel.add(numberfield_anzahl);
        panel.add(label_rabatt);
        panel.add(numberfield_rabatt);
        panel.add(button_submit);

        setFilterBounds(panel);
    }
}


