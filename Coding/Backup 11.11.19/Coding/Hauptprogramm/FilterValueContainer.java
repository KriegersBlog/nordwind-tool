import java.text.DateFormat;
import java.text.SimpleDateFormat; 
import java.util.Date;

public class FilterValueContainer{
  int artikelnr;
  int lieferantennr;
  int kategorienr;
  int lagerbestand; 
  int bestellteEinheiten;
  int mindestbestand;
  int bestellnr;
  int personalnr;
  int versandUeber;
  int telefon;
  int telefax; 
  int durchwahl;
  int firmennummer;
  String artikelname; 
  String liefereinheit;
  String kundencode;
  String empfaenger;
  String strasse;
  String plz;
  String ort;
  String land;
  String kategoriename;
  String beschreibung;
  String firma;  
  String kontaktperson;
  String position;
  String homepage;
  String vorname;
  String nachname;
  String anrede;
  String einstellung;
  String objektname;
  Date bestelldatum;
  Date versanddatum;
  Date lieferdatum;
  
  boolean auslaufartikel;
  double einzelpreis;
  double rabatt;  
  double frachtkosten;
  
  //Konstruktor f�r 'artikel'
  public FilterValueContainer(String objektname, int givenArtikelnr, String givenArtikelname, int givenLieferantennr, int givenKategorienr, String givenLiefereinheit, 
  double givenEinzelpreis, int givenLagerbestand, int givenBestellteEinheiten, int givenMindestbestand, boolean givenAuslaufartikel){
    this.artikelnr = givenArtikelnr;
    this.artikelname = givenArtikelname;
    this.lieferantennr = givenLieferantennr;
    this.kategorienr = givenKategorienr;
    this.liefereinheit = givenLiefereinheit;
    this.einzelpreis = givenEinzelpreis;
    this.lagerbestand = givenLagerbestand;
    this.bestellteEinheiten = givenBestellteEinheiten;
    this.mindestbestand = givenMindestbestand;
    this.auslaufartikel = givenAuslaufartikel;  
    this.objektname = objektname;
  }
  
  //Konstruktor f�r 'bestelldetails'
  public FilterValueContainer(String objektname, int givenBestellnr, int givenArtikelnr, double givenEinzelpreis, double givenRabatt){
    this.bestellnr = givenBestellnr;
    this.artikelnr = givenArtikelnr;
    this.einzelpreis = givenEinzelpreis;
    this.rabatt = givenRabatt;
    this.objektname = objektname;
    }
  
  //Konstruktor f�r 'bestellungen'
  public FilterValueContainer(String objektname, int givenBestellnr, String givenKundencode, int givenPersonalnr, Date givenBestelldatum, Date givenLieferdatum, Date givenVersanddatum,
    int givenVersandUeber, double givenFrachtkosten, String givenEmpfaenger, String givenStrasse, String givenPlz, String givenOrt, String givenLand){
    this.bestellnr = givenBestellnr;
    this.kundencode = givenKundencode;
    this.personalnr = givenPersonalnr;
    this.bestelldatum = givenBestelldatum;
    this.lieferdatum = givenLieferdatum;
    this.versanddatum = givenVersanddatum;
    this.versandUeber = givenVersandUeber;
    this.frachtkosten = givenFrachtkosten;
    this.empfaenger = givenEmpfaenger;
    this.strasse = givenStrasse;
    this.plz = givenPlz;
    this.ort = givenOrt;
    this.land = givenLand;
    this.objektname = objektname;
    }
  
  //Konstruktor f�r 'kategorien'
  public FilterValueContainer(String objektname, int givenKategorienr, String givenKategoriename, String givenBeschreibung){
    this.kategorienr = givenKategorienr;
    this.kategoriename = givenKategoriename;
    this.beschreibung = givenBeschreibung;
    }
  
  //Konstruktor f�r 'kunden'
  public FilterValueContainer(String objektname, String givenKundencode, int givenFirma, String givenKontaktperson, String givenPosition, String givenStrasse,
    String givenPlz, String givenOrt, String givenLand, int givenTelefon, int givenTelefax){
    this.kundencode = givenKundencode;
    this.firmennummer = givenFirma;
    this.kontaktperson = givenKontaktperson;
    this.position = givenPosition;
    this.strasse = givenStrasse;
    this.plz = givenPlz;
    this.ort = givenOrt;
    this.land = givenLand;
    this.telefon = givenTelefon;
    this.telefax = givenTelefax;
    }
  /*
  //Konstruktor f�r 'kunden'
  public FilterValueContainer(){
    
    }
  
  //Konstruktor f�r 'kategorien'
  public FilterValueContainer(){
    
    }
  
  //Konstruktor f�r 'bestellungen'
  public FilterValueContainer(){
    
    }    */
  }