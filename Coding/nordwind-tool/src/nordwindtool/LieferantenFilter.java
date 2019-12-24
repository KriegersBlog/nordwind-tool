package nordwindtool;

import javax.swing.*;

public class LieferantenFilter extends Filter {
    //Attribute
    JNumberField main_numberfieldLieferantennr;
    JTextField main_textfieldTelefon;
    JTextField main_textfieldTelefax;
    JTextField main_textfieldFirma;
    JTextField main_textfieldKontaktperson;
    JTextField main_textfieldPosition;
    JTextField main_textfieldStrasse;
    JTextField main_textfieldPlz;
    JTextField main_textfieldOrt;
    JTextField main_textfieldLand;
    JTextField main_textfieldHomepage;

    public LieferantenFilter(JPanel panel) {
        //OBJEKTE ERSTELLEN
        JLabel label_lieferantennr = new JLabel();
        label_lieferantennr.setText("Lieferantennr.:");
        JNumberField numberfield_lieferantennr = new JNumberField();
        this.main_numberfieldLieferantennr = numberfield_lieferantennr;
        numberfield_lieferantennr.setToolTipText("Lieferantennummer angeben");

        JLabel label_firma = new JLabel();
        label_firma.setText("Firma:");
        JTextField textfield_firma = new JTextField();
        this.main_textfieldFirma = textfield_firma;
        textfield_firma.setToolTipText("Firmenname angeben");

        JLabel label_kontaktperson = new JLabel();
        label_kontaktperson.setText("Kontaktperson:");
        JTextField textfield_kontaktperson = new JTextField();
        this.main_textfieldKontaktperson = textfield_kontaktperson;
        textfield_kontaktperson.setToolTipText("Kontaktperson angeben");

        JLabel label_position = new JLabel();
        label_position.setText("Position:");
        JTextField textfield_position = new JTextField();
        this.main_textfieldPosition = textfield_position;
        textfield_position.setToolTipText("Position angeben");

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
        JTextField textfield_telefon = new JTextField();
        this.main_textfieldTelefon = textfield_telefon;
        textfield_telefon.setToolTipText("Telefon angeben");

        JLabel label_telefax = new JLabel();
        label_telefax.setText("Telefax:");
        JTextField textfield_telefax = new JTextField();
        this.main_textfieldTelefax = textfield_telefax;
        textfield_telefax.setToolTipText("Telefax angeben");

        JLabel label_homepage = new JLabel();
        label_homepage.setText("Homepage:");
        JTextField textfield_homepage = new JTextField();
        this.main_textfieldHomepage = textfield_homepage;
        textfield_homepage.setToolTipText("Homepage angeben");

        panel.add(label_lieferantennr);
        panel.add(numberfield_lieferantennr);
        panel.add(label_firma);
        panel.add(textfield_firma);
        panel.add(label_kontaktperson);
        panel.add(textfield_kontaktperson);
        panel.add(label_position);
        panel.add(textfield_position);
        panel.add(label_strasse);
        panel.add(textfield_strasse);
        panel.add(label_plz);
        panel.add(textfield_plz);
        panel.add(label_ort);
        panel.add(textfield_ort);
        panel.add(label_land);
        panel.add(textfield_land);
        panel.add(label_telefon);
        panel.add(textfield_telefon);
        panel.add(label_telefax);
        panel.add(textfield_telefax);
        panel.add(label_homepage);
        panel.add(textfield_homepage);
        panel.add(button_submit);

        setFilterBounds(panel);
    }

    public void createRecord() {
        int[] integers = new int[1];
        integers[0] = this.main_numberfieldLieferantennr.getInt();

        String[] strings = new String[10];
        strings[0] = this.main_textfieldFirma.getText();
        strings[1] = this.main_textfieldKontaktperson.getText();
        strings[2] = this.main_textfieldPosition.getText();
        strings[3] = this.main_textfieldStrasse.getText();
        strings[4] = this.main_textfieldOrt.getText();
        strings[5] = this.main_textfieldPlz.getText();
        strings[6] = this.main_textfieldLand.getText();
        strings[7] = this.main_textfieldTelefon.getText();
        strings[8] = this.main_textfieldTelefax.getText();
        strings[9] = this.main_textfieldHomepage.getText();

        double[] doubles = new double[0];

        boolean[] booleans = new boolean[0];

        DBQuery.createRecord("lieferanten", integers, strings, doubles, booleans);
    }

}