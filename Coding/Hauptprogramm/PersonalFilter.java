package Hauptprogramm;
// Autor: Julian Krieger
// Datum: 13.11.2019

import javax.swing.*;

public class PersonalFilter extends Filter {
    //Attribute
    JNumberField main_numberfieldPersonalnr;
    JNumberField main_numberfieldTelefon;
    JNumberField main_numberfieldDurchwahl;
    JTextField main_textfieldVorname;
    JTextField main_textfieldNachname;
    JTextField main_textfieldPosition;
    JTextField main_textfieldStrasse;
    JTextField main_textfieldPlz;
    JTextField main_textfieldOrt;
    JTextField main_textfieldLand;
    JFormattedTextField main_datefieldGeburtsdatum;
    JFormattedTextField main_datefieldEinstellung;
    JComboBox main_comboboxAnrede;

    public PersonalFilter(JPanel panel) {
        //OBJEKTE ERSTELLEN
        JLabel label_personalnr = new JLabel();
        label_personalnr.setText("Personalnr.:");
        JNumberField numberfield_personalnr = new JNumberField();
        this.main_numberfieldPersonalnr = numberfield_personalnr;
        numberfield_personalnr.setToolTipText("Personalnummer angeben");

        JLabel label_vorname = new JLabel();
        label_vorname.setText("Vorname:");
        JTextField textfield_vorname = new JTextField();
        this.main_textfieldVorname = textfield_vorname;
        textfield_vorname.setToolTipText("Vorname angeben");

        JLabel label_nachname = new JLabel();
        label_nachname.setText("Nachname:");
        JTextField textfield_nachname = new JTextField();
        this.main_textfieldNachname = textfield_nachname;
        textfield_nachname.setToolTipText("Nachname angeben");

        JLabel label_position = new JLabel();
        label_position.setText("Position:");
        JTextField textfield_position = new JTextField();
        this.main_textfieldPosition = textfield_position;
        textfield_position.setToolTipText("Position angeben");

        JLabel label_anrede = new JLabel();
        label_anrede.setText("Anrede:");
        JComboBox<String> combobox_anrede = new JComboBox<String>();
        this.main_comboboxAnrede = combobox_anrede;
        DefaultComboBoxModel<String> combobox_anredeModel = new DefaultComboBoxModel<String>();
        combobox_anrede.setModel(combobox_anredeModel);
        combobox_anredeModel.addElement("Herr");
        combobox_anredeModel.addElement("Frau");
        combobox_anredeModel.addElement("Dr.");

        JLabel label_geburtsdatum = new JLabel();
        label_geburtsdatum.setText("Geburtsdatum:");
        JFormattedTextField datefield_geburtsdatum = new JFormattedTextField(normalDateFormat);
        this.main_datefieldGeburtsdatum = datefield_geburtsdatum;

        JLabel label_einstellung = new JLabel();
        label_einstellung.setText("Einstellung:");
        JFormattedTextField datefield_einstellung = new JFormattedTextField(normalDateFormat);
        this.main_datefieldEinstellung = datefield_einstellung;

        JLabel label_strasse = new JLabel();
        label_strasse.setText("Stra�e:");
        JTextField textfield_strasse = new JTextField();
        this.main_textfieldStrasse = textfield_strasse;
        textfield_strasse.setToolTipText("Stra�e angeben");

        JLabel label_plz = new JLabel();
        label_plz.setText("PLZ:");
        JTextField textfield_plz = new JTextField();
        this.main_textfieldPlz = textfield_plz;
        textfield_plz.setToolTipText("PLZ angeben");

        JLabel label_ort = new JLabel();
        label_ort.setText("Ort:");
        JTextField textfield_ort = new JTextField();
        this.main_textfieldOrt = textfield_ort;
        textfield_ort.setToolTipText("Ort angeben");

        JLabel label_land = new JLabel();
        label_land.setText("Land:");
        JTextField textfield_land = new JTextField();
        this.main_textfieldLand = textfield_land;
        textfield_land.setToolTipText("Land angeben");

        JLabel label_telefon = new JLabel();
        label_telefon.setText("Telefon:");
        JNumberField numberfield_telefon = new JNumberField();
        this.main_numberfieldTelefon = numberfield_telefon;
        numberfield_telefon.setToolTipText("Telefon angeben");

        JLabel label_durchwahl = new JLabel();
        label_durchwahl.setText("Durchwahl:");
        JNumberField numberfield_durchwahl = new JNumberField();
        this.main_numberfieldDurchwahl = numberfield_durchwahl;
        numberfield_durchwahl.setToolTipText("Durchwahl angeben");

        panel.add(label_personalnr);
        panel.add(numberfield_personalnr);
        panel.add(label_vorname);
        panel.add(textfield_vorname);
        panel.add(label_nachname);
        panel.add(textfield_nachname);
        panel.add(label_position);
        panel.add(textfield_position);
        panel.add(label_anrede);
        panel.add(combobox_anrede);
        panel.add(label_geburtsdatum);
        panel.add(datefield_geburtsdatum);
        panel.add(label_einstellung);
        panel.add(datefield_einstellung);
        panel.add(label_strasse);
        panel.add(textfield_strasse);
        panel.add(label_plz);
        panel.add(textfield_plz);
        panel.add(label_ort);
        panel.add(textfield_ort);
        panel.add(label_land);
        panel.add(textfield_land);
        panel.add(label_telefon);
        panel.add(numberfield_telefon);
        panel.add(label_durchwahl);
        panel.add(numberfield_durchwahl);
        panel.add(button_submit);
        setFilterBounds(panel);
    }
}






