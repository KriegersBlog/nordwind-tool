package Hauptprogramm;
// Autor: Julian Krieger
// Datum: 13.11.2019

import javax.swing.*;

public class BestellungenFilter extends Filter{
    //Attribute
    JNumberField main_numberfieldBestellnr;
    JNumberField main_numberfieldPersonalnr;
    JNumberField main_numberfieldVersandUeber;
    JNumberField main_numberfieldFrachtkosten;
    JFormattedTextField main_datefieldBestelldatum;
    JFormattedTextField main_datefieldLieferdatum;
    JFormattedTextField main_datefieldVersanddatum;
    JTextField main_textfieldKundencode;
    JTextField main_textfieldEmpfaenger;
    JTextField main_textfieldStrasse;
    JTextField main_textfieldPlz;
    JTextField main_textfieldOrt;
    JTextField main_textfieldLand;

    public BestellungenFilter(JPanel panel){
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
        JFormattedTextField datefield_bestelldatum = new JFormattedTextField(normalDateFormat);
        this.main_datefieldBestelldatum = datefield_bestelldatum;

        //Anzahl erstellen
        JLabel label_lieferdatum = new JLabel();
        label_lieferdatum.setText("Lieferdatum:");
        JFormattedTextField datefield_lieferdatum = new JFormattedTextField(normalDateFormat);
        this.main_datefieldLieferdatum = datefield_lieferdatum;


        JLabel label_versanddatum = new JLabel();
        label_versanddatum.setText("Versanddatum:");
        JFormattedTextField datefield_versanddatum = new JFormattedTextField(normalDateFormat);
        this.main_datefieldVersanddatum = datefield_versanddatum;


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
        label_strasse.setText("Stra�e:");
        JTextField textfield_strasse = new JTextField();
        this.main_textfieldStrasse = textfield_strasse;
        textfield_strasse.setToolTipText("Stra�e angeben");


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
        panel.add(datefield_bestelldatum);
        panel.add(label_lieferdatum);
        panel.add(datefield_lieferdatum);
        panel.add(label_versanddatum);
        panel.add(datefield_versanddatum);
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
}


