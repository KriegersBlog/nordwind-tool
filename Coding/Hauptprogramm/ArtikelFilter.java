// Autor: Julian Krieger
// Datum: 13.11.2019

package Hauptprogramm;

import javax.swing.*;

public class ArtikelFilter extends Filter {

    public ArtikelFilter(JPanel panel) {
        //OBJEKTE ERSTELLEN

        //Artikelnummer erstellen
        JLabel label_artikelnr = new JLabel();
        label_artikelnr.setText("Artikelnummer:");
        JNumberField numberfield_artikelnr = new JNumberField();
        numberfield_artikelnr.setToolTipText("Artikelnummer angeben");

        //Artikelname erstellen
        JLabel label_artikelname = new JLabel();
        label_artikelname.setText("Artikelname:");
        JTextField textfield_artikelname = new JTextField();
        textfield_artikelname.setToolTipText("Artikelname angeben");

        //Lieferantennummer erstellen
        JLabel label_lieferantennr = new JLabel();
        label_lieferantennr.setText("Lieferantennr.:");
        JNumberField numberfield_lieferantennr = new JNumberField();
        numberfield_lieferantennr.setToolTipText("Lieferantennummer angeben");

        //Kategorienummer erstellen
        JLabel label_kategoriennr = new JLabel();
        label_kategoriennr.setText("Kategorienr.:");
        JNumberField numberfield_kategorienr = new JNumberField();
        numberfield_kategorienr.setToolTipText("Kategorienummer angeben");

        //Liefereinheit erstellen
        JLabel label_liefereinheit = new JLabel();
        label_liefereinheit.setText("Liefereinheit:");
        JTextField textfield_liefereinheit = new JTextField();
        textfield_liefereinheit.setToolTipText("Liefereinheit angeben");

        //Einzelpreis erstellen
        JLabel label_einzelpreis = new JLabel();
        label_einzelpreis.setText("Einzelpreis:");
        JNumberField numberfield_einzelpreis = new JNumberField();
        numberfield_einzelpreis.setToolTipText("Einzelpreis angeben");

        //Lagerbestand erstellen
        JLabel label_lagerbestand = new JLabel();
        label_lagerbestand.setText("Lagerbestand:");
        JNumberField numberfield_lagerbestand = new JNumberField();
        numberfield_lagerbestand.setToolTipText("Lagerbestand angeben");

        //BestellteEinheiten erstellen
        JLabel label_bestellteEinheiten = new JLabel();
        label_bestellteEinheiten.setText("Bestellte Einh.:");
        JNumberField numberfield_bestellteEinheiten = new JNumberField();
        numberfield_bestellteEinheiten.setToolTipText("Bestellte Einheiten angeben");

        //Mindestbestand erstellen
        JLabel label_mindestbestand = new JLabel();
        label_mindestbestand.setText("Mindestbestand:");
        JNumberField numberfield_mindestbestand = new JNumberField();
        numberfield_mindestbestand.setToolTipText("Mindestbestand angeben");

        //Auslaufartikel erstellen
        JLabel label_auslaufartikel = new JLabel();
        label_auslaufartikel.setText("Auslaufartikel:");
        JCheckBox checkbox_auslaufartikel = new JCheckBox();
        checkbox_auslaufartikel.setToolTipText("Ist das Produkt ein Auslaufartikel?");


        panel.add(label_artikelnr);
        panel.add(numberfield_artikelnr);
        panel.add(label_artikelname);
        panel.add(textfield_artikelname);
        panel.add(label_lieferantennr);
        panel.add(numberfield_lieferantennr);
        panel.add(label_kategoriennr);
        panel.add(numberfield_kategorienr);
        panel.add(label_liefereinheit);
        panel.add(textfield_liefereinheit);
        panel.add(label_einzelpreis);
        panel.add(numberfield_einzelpreis);
        panel.add(label_lagerbestand);
        panel.add(numberfield_lagerbestand);
        panel.add(label_bestellteEinheiten);
        panel.add(numberfield_bestellteEinheiten);
        panel.add(label_mindestbestand);
        panel.add(numberfield_mindestbestand);
        panel.add(label_auslaufartikel);
        panel.add(checkbox_auslaufartikel);
        panel.add(button_submit);
        setFilterBounds(panel);

    }
}


