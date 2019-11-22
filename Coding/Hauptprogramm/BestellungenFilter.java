package Hauptprogramm;
// Autor: Julian Krieger
// Datum: 13.11.2019

import javax.swing.*;
import java.util.Date;

public class BestellungenFilter extends Filter {
    //Attribute
    JNumberField main_numberfieldBestellnr;
    JNumberField main_numberfieldPersonalnr;
    JNumberField main_numberfieldVersandUeber;
    JNumberField main_numberfieldFrachtkosten;
    JTextField main_textfieldBestelldatum;
    JTextField main_textfieldLieferdatum;
    JTextField main_textfieldVersanddatum;
    JTextField main_textfieldKundencode;
    JTextField main_textfieldEmpfaenger;
    JTextField main_textfieldStrasse;
    JTextField main_textfieldPlz;
    JTextField main_textfieldOrt;
    JTextField main_textfieldLand;

    public BestellungenFilter(JPanel panel) {
        //OBJEKTE ERSTELLEN

        //Bestellnummer erstellen
        JLabel label_bestellnr = new JLabel();
        label_bestellnr.setText("Bestellnummer:");
        JNumberField numberfield_bestellnr = new JNumberField();
        this.main_numberfieldBestellnr = numberfield_bestellnr;
        numberfield_bestellnr.setToolTipText("Bestellnummer angeben");

        //Kundencode erstellen
        JLabel label_kundencode = new JLabel();
        label_kundencode.setText("Kundencode:");
        JTextField textfield_kundencode = new JTextField();
        this.main_textfieldKundencode = textfield_kundencode;
        textfield_kundencode.setToolTipText("Kundencode angeben");

        //Personalnummer erstellen
        JLabel label_personalnr = new JLabel();
        label_personalnr.setText("Personalnr.:");
        JNumberField numberfield_personalnr = new JNumberField();
        this.main_numberfieldPersonalnr = numberfield_personalnr;
        numberfield_personalnr.setToolTipText("Personalnummer angeben");

        //Bestelldatum erstellen
        JLabel label_bestelldatum = new JLabel();
        label_bestelldatum.setText("Bestelldatum:");
        JTextField textfield_bestelldatum = new JTextField();
        this.main_textfieldBestelldatum = textfield_bestelldatum;

        //Anzahl erstellen
        JLabel label_lieferdatum = new JLabel();
        label_lieferdatum.setText("Lieferdatum:");
        JTextField textfield_lieferdatum = new JTextField();
        this.main_textfieldLieferdatum = textfield_lieferdatum;


        JLabel label_versanddatum = new JLabel();
        label_versanddatum.setText("Versanddatum:");
        JTextField textfield_versanddatum = new JTextField();
        this.main_textfieldVersanddatum = textfield_versanddatum;


        JLabel label_versandUeber = new JLabel();
        label_versandUeber.setText("Versand �ber:");
        JNumberField numberfield_versandUeber = new JNumberField();
        this.main_numberfieldVersandUeber = numberfield_versandUeber;
        numberfield_versandUeber.setToolTipText("Versandfirmennummer angeben");


        JLabel label_frachtkosten = new JLabel();
        label_frachtkosten.setText("Frachtkosten:");
        JNumberField numberfield_frachtkosten = new JNumberField();
        this.main_numberfieldFrachtkosten = numberfield_frachtkosten;
        numberfield_frachtkosten.setToolTipText("Frachtkosten angeben");


        JLabel label_empfaenger = new JLabel();
        label_empfaenger.setText("Empf�nger:");
        JTextField textfield_empfaenger = new JTextField();
        this.main_textfieldEmpfaenger = textfield_empfaenger;
        textfield_empfaenger.setToolTipText("Empfaenger angeben");


        JLabel label_strasse = new JLabel();
        label_strasse.setText("Straße:");
        JTextField textfield_strasse = new JTextField();
        this.main_textfieldStrasse = textfield_strasse;
        textfield_strasse.setToolTipText("Straße angeben");


        JLabel label_plz = new JLabel();
        label_plz.setText("PLZ:");
        JTextField textfield_plz = new JTextField();
        textfield_plz.setToolTipText("PLZ angeben");
        this.main_textfieldPlz = textfield_plz;

        JLabel label_ort = new JLabel();
        label_ort.setText("Ort:");
        JTextField textfield_ort = new JTextField();
        textfield_ort.setToolTipText("Ort angeben");
        this.main_textfieldOrt = textfield_ort;

        JLabel label_land = new JLabel();
        label_land.setText("Land:");
        JTextField textfield_land = new JTextField();
        textfield_land.setToolTipText("Land angeben");
        this.main_textfieldLand = textfield_land;


        panel.add(label_bestellnr);
        panel.add(numberfield_bestellnr);
        panel.add(label_kundencode);
        panel.add(textfield_kundencode);
        panel.add(label_personalnr);
        panel.add(numberfield_personalnr);
        panel.add(label_bestelldatum);
        panel.add(textfield_bestelldatum);
        panel.add(label_lieferdatum);
        panel.add(textfield_lieferdatum);
        panel.add(label_versanddatum);
        panel.add(textfield_versanddatum);
        panel.add(label_versandUeber);
        panel.add(numberfield_versandUeber);
        panel.add(label_frachtkosten);
        panel.add(numberfield_frachtkosten);
        panel.add(label_empfaenger);
        panel.add(textfield_empfaenger);
        panel.add(label_strasse);
        panel.add(textfield_strasse);
        panel.add(label_plz);
        panel.add(textfield_plz);
        panel.add(label_ort);
        panel.add(textfield_ort);
        panel.add(label_land);
        panel.add(textfield_land);
        panel.add(button_submit);
        setFilterBounds(panel);
    }

    public void createRecord() {
        int[] integers = new int[3];
        integers[0] = this.main_numberfieldBestellnr.getInt();
        integers[1] = this.main_numberfieldPersonalnr.getInt();
        integers[2] = this.main_numberfieldVersandUeber.getInt();

        String[] strings = new String[9];
        strings[0] = this.main_textfieldKundencode.getText();
        strings[1] = this.main_textfieldBestelldatum.getText();
        strings[2] = this.main_textfieldLieferdatum.getText();
        strings[3] = this.main_textfieldVersanddatum.getText();
        strings[4] = this.main_textfieldEmpfaenger.getText();
        strings[5] = this.main_textfieldStrasse.getText();
        strings[6] = this.main_textfieldOrt.getText();
        strings[7] = this.main_textfieldPlz.getText();
        strings[8] = this.main_textfieldLand.getText();

        double[] doubles = new double[1];
        doubles[0] = this.main_numberfieldFrachtkosten.getDouble();

        boolean[] booleans = new boolean[0];

        DBQuery.createRecord("bestellungen", integers, strings, doubles, booleans);
    }

}


