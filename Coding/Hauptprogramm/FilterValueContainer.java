public class FilterValueContainer extends NordwindTool {
  int artikelnr;
  int lieferantennr;
  int kategorienr;
  int lagerbestand; 
  int bestellteEinheiten;
  int mindestbestand;
  int bestellnr;
  int rabatt;
  int personalnr;
  int versandUeber;
  int telefon;
  int telefax; 
  int durchwahl;
  
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
  
  boolean auslaufartikel;
  double einzelpreis;
  double rabatt;  
  
  //Konstruktor f�r 'artikel'
  public FilterValueContainer(int givenArtikelnr, String givenArtikelname, int givenLieferantennr, int givenKategorienr, String givenLiefereinheit, 
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
  
  }
  
  //Konstruktor f�r 'bestelldetails'
  public FilterValueContainer(int givenBestellnr, int givenArtikelnr, double givenEinzelpreis, double givenRabatt){
    this.bestellnr = givenBestellnr;
    this.artikelnr = givenArtikelnr;
    this.einzelpreis = givenEinzelpreis;
    this.rabatt = givenRabatt;
    }
  
  //Konstruktor f�r 'bestellungen'
  public FilterValueContainer(int givenBestellnr, String givenKundencode, int givenPersonalnr, ){
    
    }
  
  //Konstruktor f�r 'personal'
  public FilterValueContainer(){
    
    }
  
  //Konstruktor f�r 'lieferanten'
  public FilterValueContainer(){
    
    }
  
  //Konstruktor f�r 'kunden'
  public FilterValueContainer(){
    
    }
  
  //Konstruktor f�r 'kategorien'
  public FilterValueContainer(){
    
    }
  
  //Konstruktor f�r 'bestellungen'
  public FilterValueContainer(){
    
    }
