// Autor: Julian Krieger
// Datum: 13.11.2019

package Hauptprogramm;

import javax.swing.*;
import java.text.SimpleDateFormat;
import javax.swing.*;
import java.awt.Component;
import java.awt.event.*;

public class BestelldetailsFilter extends Filter {
    //Attribute
    JNumberField main_numberfieldBestellnr;
    JNumberField main_numberfieldArtikelnr;
    JNumberField main_numberfieldEinzelpreis;
    JNumberField main_numberfieldAnzahl;
    JNumberField main_numberfieldRabatt;



    public BestelldetailsFilter(JPanel panel) {
        //OBJEKTE ERSTELLEN

        //Bestellnummer erstellen
        JLabel label_bestellnr = new JLabel();
        label_bestellnr.setText("Bestellnummer:");
        JNumberField numberfield_bestellnr = new JNumberField();
        this.main_numberfieldBestellnr = numberfield_bestellnr;
        numberfield_bestellnr.setToolTipText("Bestellnummer angeben");

        //Artikelnummer erstellen
        JLabel label_artikelnr = new JLabel();
        label_artikelnr.setText("Artikelnummer:");
        JNumberField numberfield_artikelnr = new JNumberField();
        this.main_numberfieldArtikelnr = numberfield_artikelnr;
        numberfield_artikelnr.setToolTipText("Artikelnummer angeben");

        //Einzelpreis erstellen
        JLabel label_einzelpreis = new JLabel();
        label_einzelpreis.setText("Einzelpreis:");
        JNumberField numberfield_einzelpreis = new JNumberField();
        this.main_numberfieldEinzelpreis = numberfield_einzelpreis;
        numberfield_einzelpreis.setToolTipText("Ertikelnummer angeben");

        //Anzahl erstellen
        JLabel label_anzahl = new JLabel();
        label_anzahl.setText("Anzahl:");
        JNumberField numberfield_anzahl = new JNumberField();
        this.main_numberfieldAnzahl = numberfield_anzahl;
        numberfield_anzahl.setToolTipText("Anzahl angeben");

        //Anzahl erstellen
        JLabel label_rabatt = new JLabel();
        label_rabatt.setText("Rabatt:");
        JNumberField numberfield_rabatt = new JNumberField();
        this.main_numberfieldRabatt = numberfield_rabatt;
        numberfield_rabatt.setToolTipText("Rabatt angeben");

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


