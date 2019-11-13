package Hauptprogramm;
// Autor:Julian Krieger
// Datum: 13.11.2019

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.*;

public class Filter{
  DateFormat normalDateFormat = new SimpleDateFormat("dd.MM.yyyy");

  public void createArtikelnummer(){
       JLabel label_artikelnr = new JLabel();
      label_artikelnr.setText("Artikelnummer:");
       JNumberField numberfield_artikelnr = new JNumberField();
      numberfield_artikelnr.setToolTipText("Artikelnummer angeben");
  }
  public void createArtikelname(){
       JLabel label_artikelname = new JLabel();
      label_artikelname.setText("Artikelname:");
       JTextField textfield_artikelname = new JTextField();
      textfield_artikelname.setToolTipText("Artikelname angeben");
  }
  public void createLieferantennummer(){
       JLabel label_lieferantennr = new JLabel();
      label_lieferantennr.setText("Lieferantennr.:");
       JNumberField numberfield_lieferantennr = new JNumberField();
      numberfield_lieferantennr.setToolTipText("Lieferantennummer angeben");
  }
  public void createKategorienummer(){
       JLabel label_kategoriennr = new JLabel();
      label_kategoriennr.setText("Kategorienr.:");
       JNumberField numberfield_kategorienr = new JNumberField();
      numberfield_kategorienr.setToolTipText("Kategorienummer angeben");
  }
  public void createLiefereinheit(){
       JLabel label_liefereinheit = new JLabel();
      label_liefereinheit.setText("Liefereinheit:");
       JTextField textfield_liefereinheit = new JTextField();
      textfield_liefereinheit.setToolTipText("Liefereinheit angeben");
  }
  public void createEinzelpreis(){
       JLabel label_einzelpreis = new JLabel();
      label_einzelpreis.setText("Einzelpreis:");
       JNumberField numberfield_einzelpreis = new JNumberField();
      numberfield_einzelpreis.setToolTipText("Einzelpreis angeben");
  }
  public void createLagerbestand(){
       JLabel label_lagerbestand = new JLabel();
      label_lagerbestand.setText("Lagerbestand:");
       JNumberField numberfield_lagerbestand = new JNumberField();
      numberfield_lagerbestand.setToolTipText("Lagerbestand angeben");
  }
  public void createBestellteEinheiten(){
       JLabel label_bestellteEinheiten = new JLabel();
      label_bestellteEinheiten.setText("Bestellte Einh.:");
       JNumberField numberfield_bestellteEinheiten = new JNumberField();
      numberfield_bestellteEinheiten.setToolTipText("Bestellte Einheiten angeben");
  }
  public void createMindestbestand(){
       JLabel label_mindestbestand = new JLabel();
      label_mindestbestand.setText("Mindestbestand:");
       JNumberField numberfield_mindestbestand = new JNumberField();
      numberfield_mindestbestand.setToolTipText("Mindestbestand angeben");
  }
  public void createAuslaufartikel(){
       JLabel label_auslaufartikel = new JLabel();
      label_auslaufartikel.setText("Auslaufartikel:");
      JCheckBox checkbox_auslaufartikel = new JCheckBox();
      checkbox_auslaufartikel.setToolTipText("Ist das Produkt ein Auslaufartikel?");
  }
  public void createBestellnummer(){
       JLabel label_bestellnr = new JLabel();
      label_bestellnr.setText("Bestellnummer:");
       JNumberField numberfield_bestellnr = new JNumberField();
      numberfield_bestellnr.setToolTipText("Bestellnummer angeben");
  }
  public void createHomepage(){
       JLabel label_homepage = new JLabel();
      label_homepage.setText("Homepage:");
       JTextField textfield_homepage = new JTextField();
      textfield_homepage.setToolTipText("Homepage angeben");
  }
  public void createVorname(){
       JLabel label_vorname = new JLabel();
      label_vorname.setText("Vorname:");
       JTextField textfield_vorname = new JTextField();
      textfield_vorname.setToolTipText("Vorname angeben");
  }
  public void createTelefax(){
       JLabel label_telefax = new JLabel();
      label_telefax.setText("Telefax:");
       JNumberField numberfield_telefax = new JNumberField();
      numberfield_telefax.setToolTipText("Telefax angeben");
  }
  public void createTelefon(){
       JLabel label_telefon = new JLabel();
      label_telefon.setText("Telefon:");
       JNumberField numberfield_telefon = new JNumberField();
      numberfield_telefon.setToolTipText("Telefon angeben");
  }
  public void createPosition(){
       JLabel label_position = new JLabel();
      label_position.setText("Position:");
       JTextField textfield_position = new JTextField();
      textfield_position.setToolTipText("Position angeben");
  }
  public void createKontaktperson(){
       JLabel label_kontaktperson = new JLabel();
      label_kontaktperson.setText("Kontaktperson:");
       JTextField textfield_kontaktperson = new JTextField();
      textfield_kontaktperson.setToolTipText("Kontaktperson angeben");
  }
  public void createFirma(){
       JLabel label_firma = new JLabel();
      label_firma.setText("Firma:");
       JTextField textfield_firma = new JTextField();
      textfield_firma.setToolTipText("Firmenname angeben");
  }
  public void createBeschreibung(){
       JLabel label_beschreibung = new JLabel();
      label_beschreibung.setText("Beschreibung:");
       JTextField textfield_beschreibung = new JTextField();
      textfield_beschreibung.setToolTipText("Beschreibung angeben");
  }
  public void createKategoriename(){
       JLabel label_kategoriename = new JLabel();
      label_kategoriename.setText("Kategoriename:");
       JTextField textfield_kategoriename = new JTextField();
      textfield_kategoriename.setToolTipText("Kategoriename angeben");
  }
  public void createLand(){
       JLabel label_land = new JLabel();
      label_land.setText("Land:");
       JTextField textfield_land = new JTextField();
      textfield_land.setToolTipText("Land angeben");
  }
  public void createPLZ(){
       JLabel label_plz = new JLabel();
      label_plz.setText("PLZ:");
       JTextField textfield_plz = new JTextField();
      textfield_plz.setToolTipText("PLZ angeben");
  }
  public void createOrt(){
       JLabel label_ort = new JLabel();
      label_ort.setText("Ort:");
       JTextField textfield_ort = new JTextField();
      textfield_ort.setToolTipText("Ort angeben");
  }
  public void createStrasse(){
       JLabel label_strasse = new JLabel();
      label_strasse.setText("Stra�e:");
       JTextField textfield_strasse = new JTextField();
      textfield_strasse.setToolTipText("Stra�e angeben");
  }
  public void createEmpfaenger(){
       JLabel label_empfaenger = new JLabel();
      label_empfaenger.setText("Empf�nger:");
       JTextField textfield_empfaenger = new JTextField();
      textfield_empfaenger.setToolTipText("Empfaenger angeben");
  }
  public void createFrachtkosten(){
       JLabel label_frachtkosten = new JLabel();
      label_frachtkosten.setText("Frachtkosten:");
       JNumberField numberfield_frachtkosten = new JNumberField();
      numberfield_frachtkosten.setToolTipText("Frachtkosten angeben");
  }
  public void createVersandUeber(){
       JLabel label_versandUeber = new JLabel();
      label_versandUeber.setText("Versand �ber:");
       JNumberField numberfield_versandUeber = new JNumberField();
      numberfield_versandUeber.setToolTipText("Versandfirmennummer angeben");
  }
  public void createVersanddatum(){
       JLabel label_versanddatum = new JLabel();
      label_versanddatum.setText("Versanddatum:");
      JFormattedTextField datefield_versanddatum = new JFormattedTextField(normalDateFormat);
  }
  public void createLieferdatum(){
       JLabel label_lieferdatum = new JLabel();
      label_lieferdatum.setText("Lieferdatum:");
      JFormattedTextField datefield_lieferdatum = new JFormattedTextField(normalDateFormat);
  }
  public void createBestelldatum(){
       JLabel label_bestelldatum = new JLabel();
      label_bestelldatum.setText("Bestelldatum:");
      JFormattedTextField datefield_bestelldatum = new JFormattedTextField(normalDateFormat);
  }
  public void createPersonalnummer(){
       JLabel label_personalnr = new JLabel();
      label_personalnr.setText("Personalnr.:");
       JNumberField numberfield_personalnr = new JNumberField();
      numberfield_personalnr.setToolTipText("Personalnummer angeben");
  }
  public void createRabatt(){
       JLabel label_rabatt = new JLabel();
      label_rabatt.setText("Rabatt:");
       JNumberField numberfield_rabatt = new JNumberField();
      numberfield_rabatt.setToolTipText("Rabatt angeben");
  }
  public void createAnzahl(){
       JLabel label_anzahl = new JLabel();
      label_anzahl.setText("Anzahl:");
       JNumberField numberfield_anzahl = new JNumberField();
      numberfield_anzahl.setToolTipText("Anzahl angeben");
  }
  public void createKundencode(){
       JLabel label_kundencode = new JLabel();
      label_kundencode.setText("Kundencode:");
       JTextField textfield_kundencode = new JTextField();
      textfield_kundencode.setToolTipText("Kundencode angeben");
  }
  public void createNachname(){
      JLabel label_nachname = new JLabel();
      label_nachname.setText("Nachname:");
      JTextField textfield_nachname = new JTextField();
      textfield_nachname.setToolTipText("Nachname angeben");
  }
  public void createGeburtsdatum(){
       JLabel label_geburtsdatum = new JLabel();
      label_geburtsdatum.setText("Geburtsdatum:");
      JFormattedTextField datefield_geburtsdatum = new JFormattedTextField(normalDateFormat);
  }
  public void createBemerkungen(){
       JLabel label_bemerkungen = new JLabel();
      label_bemerkungen.setText("Bemerkungen:");
       JTextField textfield_bemerkungen = new JTextField();
      textfield_bemerkungen.setToolTipText("Bemerkungen angeben");
  }
  public void createFirmennummer(){
       JLabel label_firmennr = new JLabel();
      label_firmennr.setText("Firmennr.:");
       JNumberField numberfield_firmennr = new JNumberField();
      numberfield_firmennr.setToolTipText("Firmennummer angeben");
  }
  public void createAnrede(){
       JLabel label_anrede = new JLabel();
      label_anrede.setText("Anrede:");
      JComboBox<String> combobox_anrede = new JComboBox<String>();
      DefaultComboBoxModel<String> combobox_anredeModel = new DefaultComboBoxModel<String>();
  }
  public void createEinstellung(){
       JLabel label_einstellung = new JLabel();
      label_einstellung.setText("Einstellung:");
      JFormattedTextField datefield_einstellung = new JFormattedTextField(normalDateFormat);
  }
  public void createDurchwahl(){
       JLabel label_durchwahl = new JLabel();
      label_durchwahl.setText("Durchwahl:");
       JNumberField numberfield_durchwahl = new JNumberField();
      numberfield_durchwahl.setToolTipText("Durchwahl angeben");
  }
  public void createBemerkung(){
       JLabel label_bemerkung = new JLabel();
       JTextField textfield_bemerkung = new JTextField();
      textfield_bemerkung.setToolTipText("Bemerkung angeben");
  }
}

