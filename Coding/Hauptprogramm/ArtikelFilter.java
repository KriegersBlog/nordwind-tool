// Autor: Julian Krieger
// Datum: 13.11.2019

package Hauptprogramm;

import javax.swing.*;

public class ArtikelFilter extends Filter {
    //Attribute
    JNumberField main_numberfieldArtikelnr;
    JTextField main_textfieldArtikelname;
    JNumberField main_numberfieldLieferantennr;
    JNumberField main_numberfieldKategorienr;
    JTextField main_textfieldLiefereinheit;
    JNumberField main_numberfieldEinzelpreis;
    JNumberField main_numberfieldLagerbestand;
    JNumberField main_numberfieldBestellteEinheiten;
    JNumberField main_numberfieldMindestbestand;
    JCheckBox main_checkboxAuslaufartikel;



    public ArtikelFilter(JPanel panel) {
        //OBJEKTE ERSTELLEN

        //Artikelnummer erstellen
        JLabel label_artikelnr = new JLabel();
        label_artikelnr.setText("Artikelnummer:");
        JNumberField numberfield_artikelnr = new JNumberField();
        this.main_numberfieldArtikelnr = numberfield_artikelnr;
        numberfield_artikelnr.setToolTipText("Artikelnummer angeben");

        //Artikelname erstellen
        JLabel label_artikelname = new JLabel();
        label_artikelname.setText("Artikelname:");
        JTextField textfield_artikelname = new JTextField();
        this.main_textfieldArtikelname = textfield_artikelname;
        textfield_artikelname.setToolTipText("Artikelname angeben");

        //Lieferantennummer erstellen
        JLabel label_lieferantennr = new JLabel();
        label_lieferantennr.setText("Lieferantennr.:");
        JNumberField numberfield_lieferantennr = new JNumberField();
        this.main_numberfieldLieferantennr = numberfield_lieferantennr;
        numberfield_lieferantennr.setToolTipText("Lieferantennummer angeben");

        //Kategorienummer erstellen
        JLabel label_kategoriennr = new JLabel();
        label_kategoriennr.setText("Kategorienr.:");
        JNumberField numberfield_kategorienr = new JNumberField();
        this.main_numberfieldKategorienr = numberfield_kategorienr;
        numberfield_kategorienr.setToolTipText("Kategorienummer angeben");

        //Liefereinheit erstellen
        JLabel label_liefereinheit = new JLabel();
        label_liefereinheit.setText("Liefereinheit:");
        JTextField textfield_liefereinheit = new JTextField();
        this.main_textfieldLiefereinheit = textfield_liefereinheit;
        textfield_liefereinheit.setToolTipText("Liefereinheit angeben");

        //Einzelpreis erstellen
        JLabel label_einzelpreis = new JLabel();
        label_einzelpreis.setText("Einzelpreis:");
        JNumberField numberfield_einzelpreis = new JNumberField();
        this.main_numberfieldEinzelpreis = numberfield_einzelpreis;
        numberfield_einzelpreis.setToolTipText("Einzelpreis angeben");

        //Lagerbestand erstellen
        JLabel label_lagerbestand = new JLabel();
        label_lagerbestand.setText("Lagerbestand:");
        JNumberField numberfield_lagerbestand = new JNumberField();
        this.main_numberfieldLagerbestand = numberfield_lagerbestand;
        numberfield_lagerbestand.setToolTipText("Lagerbestand angeben");

        //BestellteEinheiten erstellen
        JLabel label_bestellteEinheiten = new JLabel();
        label_bestellteEinheiten.setText("Bestellte Einh.:");
        JNumberField numberfield_bestellteEinheiten = new JNumberField();
        this.main_numberfieldBestellteEinheiten = numberfield_bestellteEinheiten;
        numberfield_bestellteEinheiten.setToolTipText("Bestellte Einheiten angeben");

        //Mindestbestand erstellen
        JLabel label_mindestbestand = new JLabel();
        label_mindestbestand.setText("Mindestbestand:");
        JNumberField numberfield_mindestbestand = new JNumberField();
        this.main_numberfieldMindestbestand = numberfield_mindestbestand;
        numberfield_mindestbestand.setToolTipText("Mindestbestand angeben");

        //Auslaufartikel erstellen
        JLabel label_auslaufartikel = new JLabel();
        label_auslaufartikel.setText("Auslaufartikel:");
        JCheckBox checkbox_auslaufartikel = new JCheckBox();
        this.main_checkboxAuslaufartikel = checkbox_auslaufartikel;
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
    public void getValues(){
       System.out.println(this.main_numberfieldArtikelnr.getInt());
       System.out.println(this.main_textfieldArtikelname.getText());
    }
}


