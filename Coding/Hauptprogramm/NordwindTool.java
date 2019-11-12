import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.event.*;
import java.util.*;
import java.awt.font.TextAttribute;  
import java.text.DateFormat;
import java.text.SimpleDateFormat;

// Autor: Julian Krieger
// Datum: 15.10.2019

public class NordwindTool extends JFrame {
  
  /*--------------------OBJEKTE INSTANZIIEREN---------------------------------*/
  // Anfang Attribute
  ImageIcon info = new ImageIcon("images/about.png");
  ImageIcon admin = new ImageIcon("images/admin.png");
  ImageIcon create = new ImageIcon("images/create.png");
  ImageIcon edit = new ImageIcon("images/edit.png");
  ImageIcon query = new ImageIcon("images/query.png");
  ImageIcon user = new ImageIcon("images/user.png");
  ImageIcon home = new ImageIcon("images/home.png");
  Image logo = new ImageIcon("images/logo_32.png").getImage();
  ImageIcon main_logo = new ImageIcon(getClass().getResource("images/main_logo.png"));
  
  DateFormat normalDateFormat = new SimpleDateFormat("dd.MM.yyyy");
  private JLabel label_about_versionAutor =  new JLabel();
  private JLabel label_githubProject = new JLabel();
  private JLabel label_readMe = new JLabel();
  private JLabel label_githubUser = new JLabel();
  TitledBorder titledBorder_versionAutor = new TitledBorder("Version und Autor");
  TitledBorder titledBorder_links = new TitledBorder("Links");
  TitledBorder titledBorder_filter = new TitledBorder("Filterauswahl");
  TitledBorder titledBorder_tables = new TitledBorder("Tabellenauswahl");
  EmptyBorder emptyBorder_filter = new EmptyBorder(0,0,0,0);
  EmptyBorder emptyBorder_tables = new EmptyBorder(0,0,0,0);
  private JPanel panel_versionAutor = new JPanel(null, true);
  private JPanel panel_links = new JPanel(null, true);
  private JPanel panel_about = new JPanel(null, true);
  private JLabel label_logo = new JLabel();
  
    
  //OptionPanes
  private JOptionPane optionpane_about = new JOptionPane();
  private JOptionPane optionpane_error = new JOptionPane();
  //Main - Panel
  private JPanel panel_main = new JPanel(new CardLayout());
  private JPanel panel_home = new JPanel(null, true);
  private JLabel label_function = new JLabel();
  private JTextField textfield_loginname = new JTextField();
  private JLabel label_logout = new JLabel();
  
  //RESULT - PANEL
  private JPanel panel_results = new JPanel(null, true);
  
  //LOGIN - PANEL
  private JPanel panel_login = new JPanel(null, true); 
  private JLabel label_loginname = new JLabel();
  private JLabel label_login = new JLabel();
  private JLabel label_loginstatus = new JLabel();
  private JPasswordField passwordfield_login = new JPasswordField();
  private JButton button_login = new JButton();
  
  //Liste aller Tabellen
  private JPanel panel_tables = new JPanel(null, true);
  private JList list_tables = new JList();
  private DefaultListModel list_tablesModel = new DefaultListModel();
  private JScrollPane list_tablesScrollPane = new JScrollPane(list_tables);
  private JButton button_resetList = new JButton();
  
  //Filterpanels
  private JPanel panel_filter = new JPanel(new CardLayout()); //Haupt-Panel, auf dem alle Panels angzeigt werden 
  private JPanel panel_bestellungen = new JPanel(null, true);
  private JPanel panel_kategorien = new JPanel(null, true);
  private JPanel panel_kunden = new JPanel(null, true);
  private JPanel panel_lieferanten = new JPanel(null, true);
  private JPanel panel_personal = new JPanel(null, true); 
  private JPanel panel_versandfirmen = new JPanel(null, true);
  private JPanel panel_null = new JPanel(null, true);
  private JPanel panel_bestelldetails = new JPanel(null, true);
  private JPanel panel_artikel = new JPanel(null, true);

  
  //Swing Elemente der Filter: Label + passendes Eingabefeld
  private JLabel label_artikelnr = new JLabel();
  private JNumberField numberfield_artikelnr = new JNumberField();
  
  private JLabel label_artikelname = new JLabel();
  private JTextField textfield_artikelname = new JTextField();
  
  private JLabel label_lieferantennr = new JLabel();
  private JNumberField numberfield_lieferantennr = new JNumberField();
  
  private JLabel label_kategoriennr = new JLabel();
  private JNumberField numberfield_kategorienr = new JNumberField();
  
  private JLabel label_liefereinheit = new JLabel();
  private JTextField textfield_liefereinheit = new JTextField();
  
  private JLabel label_einzelpreis = new JLabel();
  private JNumberField numberfield_einzelpreis = new JNumberField();
  
  private JLabel label_lagerbestand = new JLabel();
  private JNumberField numberfield_lagerbestand = new JNumberField();
  
  private JLabel label_bestellteEinheiten = new JLabel();
  private JNumberField numberfield_bestellteEinheiten = new JNumberField();
  
  private JLabel label_mindestbestand = new JLabel();
  private JNumberField numberfield_mindestbestand = new JNumberField();
  
  private JLabel label_auslaufartikel = new JLabel();
  private JCheckBox checkbox_auslaufartikel = new JCheckBox();
  
  private JLabel label_bestellnr = new JLabel();
  private JNumberField numberfield_bestellnr = new JNumberField();
  
  private JLabel label_kundencode = new JLabel();
  private JTextField textfield_kundencode = new JTextField();
  
  private JLabel label_anzahl = new JLabel();
  private JNumberField numberfield_anzahl = new JNumberField();
  
  private JLabel label_rabatt = new JLabel();
  private JNumberField numberfield_rabatt = new JNumberField();
   
  private JLabel label_personalnr = new JLabel();
  private JNumberField numberfield_personalnr = new JNumberField();    
  
  private JLabel label_bestelldatum = new JLabel();
  private JFormattedTextField datefield_bestelldatum = new JFormattedTextField(normalDateFormat);
  
  private JLabel label_lieferdatum = new JLabel();
  private JFormattedTextField datefield_lieferdatum = new JFormattedTextField(normalDateFormat);
  
  private JLabel label_versanddatum = new JLabel();
  private JFormattedTextField datefield_versanddatum = new JFormattedTextField(normalDateFormat);
  
  private JLabel label_versandUeber = new JLabel();
  private JNumberField numberfield_versandUeber = new JNumberField();
  
  private JLabel label_frachtkosten = new JLabel();
  private JNumberField numberfield_frachtkosten = new JNumberField();
  
  private JLabel label_empfaenger = new JLabel();
  private JTextField textfield_empfaenger = new JTextField();
  
  private JLabel label_strasse = new JLabel();
  private JTextField textfield_strasse = new JTextField();
  
  private JLabel label_plz = new JLabel();
  private JTextField textfield_ort = new JTextField();
  
  private JLabel label_ort = new JLabel();
  private JTextField textfield_plz = new JTextField();
  
  private JLabel label_land = new JLabel();
  private JTextField textfield_land = new JTextField();
  
  private JLabel label_kategoriename = new JLabel();
  private JTextField textfield_kategoriename = new JTextField();
  
  private JLabel label_beschreibung = new JLabel();
  private JTextField textfield_beschreibung = new JTextField();
  
  private JLabel label_firma = new JLabel();
  private JTextField textfield_firma = new JTextField();
  
  private JLabel label_kontaktperson = new JLabel();
  private JTextField textfield_kontaktperson = new JTextField();
  
  private JLabel label_position = new JLabel();
  private JTextField textfield_position = new JTextField(); 
  
  private JLabel label_telefon = new JLabel(); 
  private JNumberField numberfield_telefon = new JNumberField();
  
  private JLabel label_telefax = new JLabel();
  private JNumberField numberfield_telefax = new JNumberField();
  
  private JLabel label_homepage = new JLabel();   
  private JTextField textfield_homepage = new JTextField();
  
  private JLabel label_vorname = new JLabel();
  private JTextField textfield_vorname = new JTextField();
  
  private JLabel label_nachname = new JLabel();    
  private JTextField textfield_nachname = new JTextField();
  
  private JLabel label_geburtsdatum = new JLabel();
  private JFormattedTextField datefield_geburtsdatum = new JFormattedTextField(normalDateFormat);
  
  private JLabel label_bemerkungen = new JLabel();
  private JTextField textfield_bemerkungen = new JTextField();
  
  private JLabel label_firmennr = new JLabel(); 
  private JNumberField numberfield_firmennr = new JNumberField();
  
  private JLabel label_anrede = new JLabel();
  private JComboBox<String> combobox_anrede = new JComboBox<String>();
  private DefaultComboBoxModel<String> combobox_anredeModel = new DefaultComboBoxModel<String>();
  
  private JLabel label_einstellung = new JLabel();
  private JFormattedTextField datefield_einstellung = new JFormattedTextField(normalDateFormat);
  
  private JLabel label_durchwahl = new JLabel();
  private JNumberField numberfield_durchwahl = new JNumberField();
  
  private JLabel label_bemerkung = new JLabel();
  private JTextField textfield_bemerkung = new JTextField();
  
  private JButton button_submit = new JButton();
  
  /*-----------------MENÜ-KOMPONENTEN ERSTELLEN-------------------------------*/
  //Menüleiste erstellen
  private JMenuBar menu_bar = new JMenuBar();
  
  //Menüs erstellen
  private JMenu menu_dml = new JMenu("Funktionen");
  private JMenu menu_admin = new JMenu("Admin");
  private JMenu menu_info = new JMenu("Info");
  
  //Menüitems erstellen
  //Für menu_dml
  private JMenuItem item_query = new JMenuItem("Abfragen erstellen", query);
  private JMenuItem item_create = new JMenuItem("Datensätze anlegen", create);
  private JMenuItem item_edit = new JMenuItem("Datensätze editieren", edit);
  private JMenuItem item_home = new JMenuItem("Home", home);
  //Für menu_admin
  private JMenuItem item_rightAdministration = new JMenuItem("Rechteverwaltung", admin);
  private JMenuItem item_userAdministration = new JMenuItem("Benutzerverwaltung", user);
  
  //Für menu_info  
  private JMenuItem item_about = new JMenuItem("Über 'Nordwind - Tool'", info);
  
  
  
  
  
  /*------------------------VARIABLEN-----------------------------------------*/
  String loginname;
  boolean loginstate = false;
  int[] position = {10, 45, 80, 115, 150, 185, 220, 255, 290, 325, 360,
    395, 430, 465, 500, 535};
  String button_mode = null;
  String mode = null; 
  
  //Card Layouts
  CardLayout cl_main = (CardLayout) panel_main.getLayout();
  CardLayout cl_filter = (CardLayout) panel_filter.getLayout();
  // Ende Attribute
  
  
  public NordwindTool() { 
    /*-----------------FRAME-INITIALISIERUNG----------------------------------*/
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 1280; 
    int frameHeight = 720;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("Nordwind Tool - Made by Julian Krieger");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    
    /*------------------PANELS KONFIGURIEREN----------------------------------*/
    
    /*           MAIN PANEL            */
    panel_main.setBounds(0, 0, 1366, 680);
    panel_main.setOpaque(false);
    cp.add(panel_main);
    
    /*           HOME PANEL            */
    panel_home.setBounds(0, 0, 1366, 680);
    panel_home.setOpaque(false);
    panel_main.add(panel_home, "HOME");
    
    /*           LOGIN PANEL            */
    panel_login.setBounds(0, 0, 1366, 680);
    panel_login.setOpaque(false);
    panel_main.add(panel_login, "LOGIN"); 
    
    
    /*           FILTER PANEL          */ 
    panel_filter.setBounds(370, 100, 300, 512);
    panel_filter.setOpaque(true);
    panel_home.add(panel_filter);
    //Objekte zum Panel hinzufügen
    panel_filter.add(panel_artikel, "ARTIKEL");
    panel_filter.add(panel_bestelldetails, "BESTELLDETAILS");
    panel_filter.add(panel_bestellungen, "BESTELLUNGEN");
    panel_filter.add(panel_kategorien, "KATEGORIEN");
    panel_filter.add(panel_kunden, "KUNDEN");
    panel_filter.add(panel_lieferanten, "LIEFERANTEN");
    panel_filter.add(panel_personal, "PERSONAL");
    panel_filter.add(panel_versandfirmen, "VERSANDFIRMEN"); 
    panel_filter.add(panel_null, "NULL");
    
    /*        TABELLEN PANEL          */ 
    panel_tables.setBounds(30, 100, 300, 472);
    panel_tables.setOpaque(true);
    panel_home.add(panel_tables);
    
    /*      ALLE FILTER PANELS       */
    panel_artikel.setBounds(328, 576, 300, 400);
    panel_artikel.setOpaque(true);
    
    panel_bestelldetails.setBounds(360, 576, 300, 532);
    panel_bestelldetails.setOpaque(true);
    
    panel_bestellungen.setBounds(336, 584, 300, 400);
    panel_bestellungen.setOpaque(true);
    
    panel_kategorien.setBounds(352, 576, 300, 400);
    panel_kategorien.setOpaque(true);
    
    panel_kunden.setBounds(362, 577, 300, 400);
    panel_kunden.setOpaque(true);
    
    panel_lieferanten.setBounds(355, 576, 300, 400);
    panel_lieferanten.setOpaque(true);
    
    panel_personal.setBounds(0, 32, 300, 400);
    panel_personal.setOpaque(true);
    
    panel_versandfirmen.setBounds(368, 571, 300, 400);
    panel_versandfirmen.setOpaque(true);
    
    panel_null.setBounds(376, 576, 300, 400);
    panel_null.setOpaque(true);
    
    
    /*-----------------SWING-ELEMENTE KONFIGURIEREN---------------------------*/
    //LOGIN PANEL
    passwordfield_login.setBounds(525, 270, 230, 40);
    passwordfield_login.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
    passwordfield_login.setToolTipText("Passwort eingeben");
    panel_login.add(passwordfield_login);
    
    label_logo.setBounds(390,25,500,66);
    label_logo.setIcon(main_logo);
    panel_login.add(label_logo);
    
    textfield_loginname.setBounds(525, 220, 230, 40);
    textfield_loginname.setText("");
    textfield_loginname.setToolTipText("Anmeldename eingeben");
    textfield_loginname.setHorizontalAlignment(SwingConstants.LEFT);
    textfield_loginname.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
    panel_login.add(textfield_loginname);
     
    button_login.setBounds(525, 320, 230, 35);
    button_login.setText("ANMELDEN");
    button_login.setMargin(new Insets(2, 2, 2, 2)); 
    button_login.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
    panel_login.add(button_login);
    
    label_login.setBounds(525, 185, 230, 40);
    label_login.setText("Bitte melden Sie sich an");
    label_login.setHorizontalAlignment(SwingConstants.CENTER);
    label_login.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
    panel_login.add(label_login);
    
    label_loginstatus.setBounds(525, 360, 230, 25);
    label_loginstatus.setText("");
    label_loginstatus.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
    label_loginstatus.setOpaque(true);
    label_loginstatus.setHorizontalAlignment(SwingConstants.CENTER);
    panel_login.add(label_loginstatus);
    
    //HOME PANEL
    label_loginname.setBounds(1008, 2, 182, 20);
    label_loginname.setHorizontalAlignment(SwingConstants.RIGHT);
    panel_home.add(label_loginname);
    
    panel_results.setBounds(721, 104, 500, 536);
    panel_results.setOpaque(true);
    panel_results.setBackground(new Color(0xFFAFAF));
    panel_home.add(panel_results);
    
    label_logout.setBounds(1196, 0, 70, 22);
    label_logout.setText("ABMELDEN");
    label_logout.setForeground(Color.BLUE);
    label_logout.setHorizontalAlignment(SwingConstants.CENTER);
    Hashtable<TextAttribute, Object> label_abmelden_map = new Hashtable<TextAttribute, Object>();
    label_abmelden_map.put(TextAttribute.FAMILY, "Trebuchet MS");
    label_abmelden_map.put(TextAttribute.SIZE, new Integer(12));
    label_abmelden_map.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
    Hashtable<TextAttribute, Object> label_logout_map = new Hashtable<TextAttribute, Object>();
    label_logout_map.put(TextAttribute.FAMILY, "Trebuchet MS");
    label_logout_map.put(TextAttribute.SIZE, new Integer(12));
    label_logout_map.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
    label_logout.setFont(new Font(label_logout_map));
    panel_home.add(label_logout);
    
    //TABELLEN PANEL
    button_resetList.setBounds(10, 420, 280, 40);
    button_resetList.setText("Auswahl zurücksetzen");
    button_resetList.setMargin(new Insets(2, 2, 2, 2));
    button_resetList.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
    panel_tables.add(button_resetList);
    
    list_tablesScrollPane.setBounds(10, 20, 280, 388);    
    list_tablesModel.addElement("artikel");
    list_tablesModel.addElement("bestelldetails");
    list_tablesModel.addElement("bestellungen");
    list_tablesModel.addElement("kategorien");
    list_tablesModel.addElement("kunden");
    list_tablesModel.addElement("lieferanten");
    list_tablesModel.addElement("personal");
    list_tablesModel.addElement("versandfirmen");  
    panel_tables.add(list_tablesScrollPane);
    
    list_tables.setFont(new Font("Trebuchet MS", Font.BOLD, 36));
    list_tables.setModel(list_tablesModel);
    
    //ALLE FILTER PANELS
    //Labels: Texte setzen
    label_artikelname.setText("Artikelname:");
    label_lagerbestand.setText("Lagerbestand:"); 
    label_bestellteEinheiten.setText("Bestellte Einh.:");
    label_liefereinheit.setText("Liefereinheit:");
    label_kategoriennr.setText("Kategorienr.:");
    label_lieferantennr.setText("Lieferantennr.:");   
    label_bestellnr.setText("Bestellnummer:");  
    label_artikelnr.setText("Artikelnummer:"); 
    label_bestelldatum.setText("Bestelldatum:"); 
    label_lieferdatum.setText("Lieferdatum:");    
    label_versanddatum.setText("Versanddatum:");      
    label_anrede.setText("Anrede:");
    label_versandUeber.setText("Versand über:"); 
    label_frachtkosten.setText("Frachtkosten:");
    label_land.setText("Land:");         
    label_empfaenger.setText("Empfänger:");    
    label_strasse.setText("Straße:");
    label_einzelpreis.setText("Einzelpreis:"); 
    label_anzahl.setText("Anzahl:"); 
    label_rabatt.setText("Rabatt:");
    label_telefon.setText("Telefon:");   
    label_plz.setText("PLZ:"); 
    label_ort.setText("Ort:");   
    label_kontaktperson.setText("Kontaktperson:");       
    label_kundencode.setText("Kundencode:"); 
    label_durchwahl.setText("Durchwahl:");
    label_bemerkungen.setText("Bemerkungen:");    
    label_personalnr.setText("Personalnr.:");
    label_geburtsdatum.setText("Geburtsdatum:"); 
    label_vorname.setText("Vorname:");  
    label_einstellung.setText("Einstellung:");    
    label_nachname.setText("Nachname:");   
    label_homepage.setText("Homepage:"); 
    label_beschreibung.setText("Beschreibung:");  
    label_kategoriename.setText("Kategoriename:");
    label_position.setText("Position:");
    label_telefax.setText("Telefax:");          
    label_firmennr.setText("Firmennr.:"); 
    label_firma.setText("Firma:");
    
    //Alle ToolTipTexte setzen
    textfield_artikelname.setToolTipText("Artikelname angeben");
    textfield_liefereinheit.setToolTipText("Liefereinheit angeben");
    textfield_land.setToolTipText("Land angeben");
    textfield_empfaenger.setToolTipText("Empfänger angeben");
    textfield_strasse.setToolTipText("Straße angeben");
    textfield_plz.setToolTipText("PLZ angeben");
    textfield_ort.setToolTipText("Ort angeben");
    textfield_kontaktperson.setToolTipText("Kontaktperson angeben");
    textfield_kundencode.setToolTipText("Kundencode angeben");
    textfield_bemerkungen.setToolTipText("Bemerkungen angeben");
    textfield_vorname.setToolTipText("Vorname angeben");
    textfield_nachname.setToolTipText("Nachname angeben");
    textfield_homepage.setToolTipText("Homepage angeben");
    textfield_beschreibung.setToolTipText("Beschreibung angeben");
    textfield_kategoriename.setToolTipText("Kategoriename angeben");
    textfield_position.setToolTipText("Position angeben");
    textfield_firma.setToolTipText("Firmenname angeben");
    
    numberfield_bestellteEinheiten.setToolTipText("Bestellte Einheiten angeben");
    numberfield_lagerbestand.setToolTipText("Lagerbestand angeben");
    numberfield_kategorienr.setToolTipText("Kategorienummer angeben");
    numberfield_lieferantennr.setToolTipText("Lieferantennummer angeben");
    numberfield_bestellnr.setToolTipText("Bestellnummer angeben");
    numberfield_artikelnr.setToolTipText("Artikelnummer angeben");
    numberfield_versandUeber.setToolTipText("Versandfirmennummer angeben");
    numberfield_frachtkosten.setToolTipText("Frachtkosten angeben");
    numberfield_einzelpreis.setToolTipText("Einzelpreis angeben");
    numberfield_anzahl.setToolTipText("Anzahl angeben");
    numberfield_rabatt.setToolTipText("Rabatt angeben");
    numberfield_telefon.setToolTipText("Telefon angeben");
    numberfield_durchwahl.setToolTipText("Durchwahl angeben");
    numberfield_personalnr.setToolTipText("Personalnummer angeben");
    numberfield_telefax.setToolTipText("Telefax angeben");
    numberfield_firmennr.setToolTipText("Firmennummer angeben");
    numberfield_mindestbestand.setToolTipText("Mindestbestand angeben");
    
    //Feste Objekte konfigurieren
    combobox_anrede.setModel(combobox_anredeModel);
    combobox_anredeModel.addElement("Herr");
    combobox_anredeModel.addElement("Frau");
    combobox_anredeModel.addElement("Dr."); 
    label_about_versionAutor.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
    String msg = "<html>Nordwind-Tool 0.9.3, 24.10.19<br>Made by Julian Krieger</html>";
    label_about_versionAutor.setText(msg);
    label_about_versionAutor.setHorizontalAlignment(JLabel.CENTER);
    
  
    panel_about.add(panel_versionAutor);
    panel_versionAutor.setBorder(titledBorder_versionAutor);
    panel_versionAutor.setBounds(20,0,200,60);
    panel_versionAutor.add(label_about_versionAutor);
    label_about_versionAutor.setBounds(0,10,200,50);
    panel_about.add(panel_links);
    panel_links.setBorder(titledBorder_links);
    panel_links.setBounds(20,60,200,80);
    
    
    label_githubProject.setBounds(0,10,200,25);
    label_githubProject.setForeground(Color.BLUE);
    label_githubProject.setText("Projekt auf Github");
    label_githubProject.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
    label_githubProject.setHorizontalAlignment(JLabel.CENTER);
    Hashtable<TextAttribute, Object> label_githubProject_map = new Hashtable<TextAttribute, Object>();
    label_githubProject_map.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
    label_githubProject.setFont(new Font(label_githubProject_map));
    panel_links.add(label_githubProject);
    /***/
    label_readMe.setBounds(0,50,200,25);
    label_readMe.setForeground(Color.BLUE);
    label_readMe.setText("ReadMe lesen");
    label_readMe.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
    label_readMe.setHorizontalAlignment(JLabel.CENTER);
    Hashtable<TextAttribute, Object> label_readMe_map = new Hashtable<TextAttribute, Object>();
    label_readMe_map.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
    label_readMe.setFont(new Font(label_readMe_map));
    panel_links.add(label_readMe);
    
    
    label_githubUser.setBounds(0,30,200,25);
    label_githubUser.setForeground(Color.BLUE);
    label_githubUser.setText("Autor auf Github");
    label_githubUser.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
    label_githubUser.setHorizontalAlignment(JLabel.CENTER);
    Hashtable<TextAttribute, Object> label_githubUser_map = new Hashtable<TextAttribute, Object>();
    label_githubUser_map.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
    label_githubUser.setFont(new Font(label_githubUser_map));
    
    panel_links.add(label_githubUser);
    
    optionpane_about.setPreferredSize(new Dimension(0,140));
    optionpane_about.setSize(0,140);
    panel_about.setPreferredSize(new Dimension(0,140));
    panel_about.setSize(0,140);
    
    
    /*-------------------MENÜ KONFIGURIEREN-----------------------------------*/
    //Items zu "menu_dml" hinzufügen
    menu_dml.add(item_query);
    menu_dml.add(item_create);
    menu_dml.add(item_edit);
    menu_dml.addSeparator();
    menu_dml.add(item_home);
    
    //Items zu "menu_admin" hinzufügen
    menu_admin.add(item_rightAdministration);
    menu_admin.add(item_userAdministration);
    
    //Items zu "menu_info" hinzufügen
    menu_info.add(item_about);
    
    //Menüs zur Menüleiste hinzufügen
    menu_bar.add(menu_dml);
    menu_bar.add(menu_admin);
    menu_bar.add(menu_info);
    
    
    /*---------------------STARTBEDINGUNGEN-----------------------------------*/
    cl_filter.show(panel_filter, "NULL");
    setJMenuBar(menu_bar);
    setVisible(true);
    label_loginstatus.setBackground(null);
    menu_control();
    //titledBorder_filter.setBorderPainted(false);
    
    /*--------------------------LISTENER--------------------------------------*/ 
     
    //ACTIONLISTENER
    
    //Actionlistener für Menüitems
    //Menü: "menu_dml"
    item_query.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        label_function.setText("Abfragen erstellen");
        mode = "abfragen";
        button_mode = "Datensätze abfragen";
        
        reset_filter();     
        enable_listPanel();
        //VARIABLE STRING REINBRINGEN MODUS
      }
    }); 
    
    item_create.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        label_function.setText("Datensätze anlegen");
        mode = "erstellen";
        button_mode = "Datensatz anlegen";
        
        reset_filter();     
        enable_listPanel();
        //VARIABLE STRING REINBRINGEN MODUS
      }
    });
    
    item_edit.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        label_function.setText("Datensätze editieren");
        mode = "editieren";
        button_mode = "Datensätze suchen";
        
        reset_filter();     
        enable_listPanel();
        //VARIABLE STRING REINBRINGEN MODUS
      }
    });
    
    item_home.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        reset_filter();     
        disable_listPanel();
        //VARIABLE STRING REINBRINGEN MODUS
      }
    });
    
    //Menü: "menu_admin"
    item_rightAdministration.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        System.out.println("HIER ENSTEHT DAS MODUL 'RECHTEVERWALTUNG'");
      }
    }); 
    
    item_userAdministration.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        System.out.println("HIER ENSTEHT DAS MODUL 'BENUTZERVERWALTUNG'");
      }
    });
    
    //Menü: "menu_info"
    item_about.addActionListener(new ActionListener() {;
      public void actionPerformed(ActionEvent e) {
        optionpane_about_ShowDialog();
      }
    });
    
    //Sonstige Actionlistener
    //Panel: "panel_login"
    button_login.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent e) { 
        login_process();
      }
    });
        
    passwordfield_login.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        login_process();
      }
    });   
    
    label_logout.addMouseListener(new MouseAdapter(){
      public void mouseClicked(MouseEvent e){
        logout();
        }
    });
    
    label_githubProject.addMouseListener(new MouseAdapter(){
      public void mouseClicked(MouseEvent e){
        try { 
         String url = "https://github.com/KriegersBlog/nordwind-tool";
         java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
       }
       catch (java.io.IOException ex) {
           System.out.println("Bitte Admin kontaktieren:" + ex.getMessage());
       }
        }
    });
    
    label_githubUser.addMouseListener(new MouseAdapter(){
      public void mouseClicked(MouseEvent e){
        try { 
         String url = "https://github.com/KriegersBlog";
         java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
       }
       catch (java.io.IOException ex) {
           System.out.println("Bitte Admin kontaktieren:" + ex.getMessage());
       }
        }
    });
    
    label_readMe.addMouseListener(new MouseAdapter(){
      public void mouseClicked(MouseEvent e){
        try { 
         String url = "https://github.com/KriegersBlog/nordwind-tool/blob/master/README.md";
         java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
       }
       catch (java.io.IOException ex) {
           System.out.println("Bitte Admin kontaktieren:" + ex.getMessage());
       }
        }
    });               
    list_tables.addListSelectionListener(new ListSelectionListener() { 
      public void valueChanged(ListSelectionEvent evt) { 
        list_tables_ValueChanged(evt);
      }
    });
    
    button_resetList.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        button_resetList_ActionPerformed(evt);
      }
    });
    
    button_submit.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        button_submit_ActionPerformed(evt);
      }
    });
  
    // Anfang Komponenten    
    label_function.setFont(new Font("Trebuchet MS", Font.BOLD, 36));
    label_function.setText(null);
    label_function.setHorizontalAlignment(SwingConstants.CENTER);
    panel_home.add(label_function);
    label_function.setBounds(438, 4, 358, 48);
    
    this.setIconImage(logo);
    // Ende Komponenten
  // Anfang Methoden
  }
  
  /*------------------------MAIN METHODE--------------------------------------*/
  
  public static void main(String[] args) {
    new NordwindTool();
  }
  
  /*------------------LISTENER METHODEN---------------------------------------*/
  
  public void button_resetList_ActionPerformed(ActionEvent evt) {
    list_tables.clearSelection();
  }
  
  
    
    
  public void button_submit_ActionPerformed(ActionEvent evt) {
    int index = list_tables.getSelectedIndex();
    int error_counter = 0;
    switch (index) {
      case 0:
        for (Component cp: panel_artikel.getComponents()) {
          if(cp instanceof JNumberField){
            JNumberField nf = (JNumberField) cp;
            if(nf.getText().equals("")){
              nf.setInt(-1);
            }
            else if(!nf.isNumeric()){
              error_counter++;
            }
          } 
          else if(cp instanceof JTextField){
            JTextField tf = (JTextField) cp;
            if(tf.getText().equals("")){
              tf.setText(null);
            }          
          }
        }
        
        if(error_counter > 0){
          optionpane_error_ShowDialog();
        }
        else {
          FilterValueContainer artikel = new FilterValueContainer("artikel", numberfield_artikelnr.getInt(), textfield_artikelname.getText(), numberfield_lieferantennr.getInt(),
          numberfield_kategorienr.getInt(), textfield_liefereinheit.getText(), numberfield_einzelpreis.getDouble(), numberfield_lagerbestand.getInt(), 
          numberfield_bestellteEinheiten.getInt(), numberfield_mindestbestand.getInt(), checkbox_auslaufartikel.isSelected());
          }
          for (Component cp: panel_artikel.getComponents()){
            if(cp instanceof JNumberField) {
              JNumberField nf = (JNumberField) cp;
              if(!nf.isNumeric()){
                nf.setInt(-1);
              }
              if(nf.getInt() == -1){
                nf.clear(); 
              }
            }
          }
        break;
      case 1: 
        for (Component cp: panel_bestelldetails.getComponents()) {
          if(cp instanceof JNumberField){
            JNumberField nf = (JNumberField) cp;
            if(nf.getText().equals("")){
              nf.setInt(-1);
            }
            else if(!nf.isNumeric()){
              error_counter++;
            }
          } 
          else if(cp instanceof JTextField){
            JTextField tf = (JTextField) cp;
            if(tf.getText().equals("")){
              tf.setText(null);
            }          
          }
        }
        if(error_counter > 0){
          optionpane_error_ShowDialog();
        }
        else {
          FilterValueContainer bestelldetails = new FilterValueContainer("bestelldetails", numberfield_bestellnr.getInt(), numberfield_artikelnr.getInt(),
          numberfield_einzelpreis.getDouble(), numberfield_rabatt.getDouble());
        }
        for (Component cp: panel_bestelldetails.getComponents()){
          if(cp instanceof JNumberField) {
            JNumberField nf = (JNumberField) cp;
            if(!nf.isNumeric()){
              nf.setInt(-1);
            }
            if(nf.getInt() == -1){
              nf.clear(); 
            }
          }
        }
        break;
      case 2: 
        
        break;
      case 3: 
        
        break;
      case 4: 
        
        break;
      case 5: 
        
        break;
      case 6: 
        
        break;
      case 7: 
        
        break;
      default: 
        
    }
    //AKTIVE TABELLE ABFRAGEN
    //AM ENDE DAS OBJEKT EINER BESTIMMTEN Methode ÜBERGEBEN*
  }
      
    
  public void list_tables_ValueChanged(ListSelectionEvent evt) {
    if (!evt.getValueIsAdjusting()) {
      openFilterPanel(list_tables.getSelectedIndex());
    }  
  }
  
  public void optionpane_about_ShowDialog() {
    optionpane_about.showMessageDialog(this, panel_about, "Über 'Nordwind-Tool'", optionpane_about.PLAIN_MESSAGE, null);
  }
  public void optionpane_error_ShowDialog() {
    optionpane_about.showMessageDialog(null, "Bitte gültige Zahlenwerte eingeben!", "Fehler!", JOptionPane.ERROR_MESSAGE);
  }
  
  
  public void login_process(){
    loginname = textfield_loginname.getText();
    
    if(loginname.length() == 0){
      label_loginstatus.setText("Bitte Benutzernamen eingeben");
      }
    
    else {
      if(!dbQuery.checkName(loginname)){
        char[] passwordfield_input = passwordfield_login.getPassword();
        if(passwordfield_input.length == 0){
          label_loginstatus.setText("Bitte Passwort eingeben");
        }
        
        else{
          try{
            if(PasswordHasher.validatePassword(passwordfield_input, dbQuery.getPassword(loginname))){     
              login();
            }
            
            else{
              label_loginstatus.setBackground(Color.RED);
              label_loginstatus.setText("Falsches Passwort");
              Arrays.fill(passwordfield_input, '0'); //FÜLLT ARRAY MIT 0 UM PASSWÖRTER ZU LÖSCHEN      
              passwordfield_login.selectAll();
              passwordfield_login.requestFocusInWindow();
            }
          }
          catch(Exception e){
            System.out.println("Schwerwiegender Passwortfehler, bitte wenden Sie sich an einen Admin");
            label_loginstatus.setText("Fehler: Bitte an Admin wenden");
          }
        }         
      }
      else{
        label_loginstatus.setBackground(Color.RED);
        label_loginstatus.setText("Benutzer existiert nicht!");
      }
    }
  }
  
  public void login(){
    loginstate = true;
    menu_control();
    
    //LOGINMASKE LEEREN
    textfield_loginname.setText("");
    passwordfield_login.setText("");
    label_loginstatus.setText("");
    label_loginstatus.setBackground(null);
    item_home.setText("Home");
    
    cl_main.show(panel_main, "HOME");
    label_loginname.setText("Angemeldet als '" + loginname + "'");
    disable_listPanel();
    list_tables.clearSelection();
  }
  
  public void logout(){
    loginstate = false;
    menu_control();
    }
    
  public void menu_control(){   
    boolean insert;
    String text;
    if(loginstate == true){
      insert = true;
      text = null;
      }
    
      else{
        insert = false;
        text = "Diese Funktion ist nur für angemeldete Benutzer verfügbar";
        label_loginname.setText(null); //LEEREN - DATENSCHUTZ
      }    
    
    menu_dml.setEnabled(insert); 
    menu_admin.setEnabled(insert);
    
    item_query.setEnabled(insert);  
    item_create.setEnabled(insert);
    item_edit.setEnabled(insert);
    item_home.setEnabled(insert);
    
    menu_dml.setToolTipText(text);
    menu_admin.setToolTipText(text);
    
    cl_main.show(panel_main, "LOGIN");
    } 
  
  public void reset_filter(){
    cl_filter.show(panel_filter, "NULL");
    list_tables.clearSelection();
  }
  public void enable_listPanel(){
    panel_tables.setEnabled(true);
    panel_tables.setVisible(true);
    panel_tables.setBorder(titledBorder_tables);
  }
  
  public void disable_listPanel(){
    panel_tables.setEnabled(false);
    panel_tables.setVisible(false);
    label_function.setText(null);
    panel_tables.setBorder(emptyBorder_tables);
  }
    
  public void clearFilter(){
    for (Component panel: panel_filter.getComponents()) {
      JPanel cp_panel = (JPanel) panel;
      for (Component c: cp_panel.getComponents()) {
        if(c instanceof JTextField){
          JTextField tf = (JTextField) c;
          tf.setText(null); 
        }
        else if(c instanceof JNumberField){
          JNumberField nf = (JNumberField) c;
          nf.clear();
        }
        else if(c instanceof JComboBox){
          JComboBox cb = (JComboBox) c;
          cb.setSelectedIndex(0);
        }
        else if(c instanceof JCheckBox){
          JCheckBox cb = (JCheckBox) c;
          cb.setSelected(false);
        }
        else if(c instanceof JFormattedTextField){
          JFormattedTextField ftf = (JFormattedTextField) c;
          ftf.setText(null);
        }
      }
    }
  }
        
  
  public void openFilterPanel(int index){
    clearFilter();
    panel_filter.setBorder(titledBorder_filter);
    
    int i;
    int x;
    int p;
    int f;
    
    switch (index){
      case -1:
        cl_filter.show(panel_filter, "NULL");
        panel_filter.setBorder(emptyBorder_filter);
        panel_null.add(button_submit);
        button_submit.setBounds(1000,1000,0,0);
        break;
        
      case 0: 
            
        label_mindestbestand.setText("Mindestbestand:");
        label_auslaufartikel.setText("Auslaufartikel:");
        /*******************************************************/
        panel_artikel.add(label_artikelnr);
        panel_artikel.add(numberfield_artikelnr);
        panel_artikel.add(label_artikelname);
        panel_artikel.add(textfield_artikelname);
        panel_artikel.add(label_lieferantennr); 
        panel_artikel.add(numberfield_lieferantennr); 
        panel_artikel.add(label_kategoriennr);     
        panel_artikel.add(numberfield_kategorienr); 
        panel_artikel.add(label_liefereinheit); 
        panel_artikel.add(textfield_liefereinheit);  
        panel_artikel.add(label_einzelpreis); 
        panel_artikel.add(numberfield_einzelpreis);
        panel_artikel.add(label_lagerbestand); 
        panel_artikel.add(numberfield_lagerbestand);
        panel_artikel.add(label_bestellteEinheiten);  
        panel_artikel.add(numberfield_bestellteEinheiten);  
        panel_artikel.add(label_mindestbestand);
        panel_artikel.add(numberfield_mindestbestand);   
        panel_artikel.add(label_auslaufartikel);  
        panel_artikel.add(checkbox_auslaufartikel);
        
        i = 2;
        x = 0;
        p = 10;
        f = 0;
          
        for (Component c: panel_artikel.getComponents()) {
          if(i % 2 == 0){
            c.setBounds(p, position[x],100,20);
            p = 125;
        }
          else if(i % 2 == 1){
            if(c instanceof JNumberField){
              f = 50;
            }
            else if(c instanceof JTextField){
              f = 150;
            }
            else if(c instanceof JCheckBox){
              f = 20;
            }
            c.setBounds(p, position[x], f,20);
            x++;
            p = 10;
          }
          i++;
        }
        
        panel_artikel.add(button_submit);
        button_submit.setBounds(50, position[x],200,20);
        button_submit.setText(button_mode);
        
        cl_filter.show(panel_filter, "ARTIKEL");
        break;
        
      case 1:
        panel_bestelldetails.add(label_bestellnr); 
        panel_bestelldetails.add(numberfield_bestellnr);  
        panel_bestelldetails.add(label_artikelnr); 
        panel_bestelldetails.add(numberfield_artikelnr);   
        panel_bestelldetails.add(label_einzelpreis);   
        panel_bestelldetails.add(numberfield_einzelpreis); 
        panel_bestelldetails.add(label_anzahl); 
        panel_bestelldetails.add(numberfield_anzahl);   
        panel_bestelldetails.add(label_rabatt); 
        panel_bestelldetails.add(numberfield_rabatt);
        
        i = 2;
        x = 0;
        p = 10;
        f = 0;
          
        for (Component c: panel_bestelldetails.getComponents()) {
          if(i % 2 == 0){
            c.setBounds(p, position[x],100,20);
            p = 125;
        }
          else if(i % 2 == 1){
            if(c instanceof JNumberField){
              f = 50;
            }
            else if(c instanceof JTextField){
              f = 150;
            }
            else if(c instanceof JCheckBox){
              f = 20;
            }
            c.setBounds(p, position[x], f,20);
            x++;
            p = 10;
          }
          i++;
        }
        
        panel_bestelldetails.add(button_submit);
        button_submit.setBounds(50, position[x],200,20);
        button_submit.setText(button_mode);
        
        cl_filter.show(panel_filter, "BESTELLDETAILS");
        break;
        
      case 2:
        panel_bestellungen.add(label_bestellnr);
        panel_bestellungen.add(numberfield_bestellnr);
        panel_bestellungen.add(label_kundencode);
        panel_bestellungen.add(textfield_kundencode);
        panel_bestellungen.add(label_personalnr);
        panel_bestellungen.add(numberfield_personalnr);
        panel_bestellungen.add(label_bestelldatum);     
        panel_bestellungen.add(datefield_bestelldatum);
        panel_bestellungen.add(label_lieferdatum);
        panel_bestellungen.add(datefield_lieferdatum);
        panel_bestellungen.add(label_versanddatum);
        panel_bestellungen.add(datefield_versanddatum);
        panel_bestellungen.add(label_versandUeber);
        panel_bestellungen.add(numberfield_versandUeber);
        panel_bestellungen.add(label_frachtkosten);
        panel_bestellungen.add(numberfield_frachtkosten);
        panel_bestellungen.add(label_empfaenger);
        panel_bestellungen.add(textfield_empfaenger);
        panel_bestellungen.add(label_strasse);
        panel_bestellungen.add(textfield_strasse);
        panel_bestellungen.add(label_plz);
        panel_bestellungen.add(textfield_plz);
        panel_bestellungen.add(label_ort);
        panel_bestellungen.add(textfield_ort);
        panel_bestellungen.add(label_land);
        panel_bestellungen.add(textfield_land);
        
        i = 2;
        x = 0;
        p = 10;
        f = 0;
          
        for (Component c: panel_bestellungen.getComponents()) {
          if(i % 2 == 0){
            c.setBounds(p, position[x],100,20);
            p = 125;
        }
          else if(i % 2 == 1){
            if(c instanceof JNumberField){
              f = 50;
            }
            else if(c instanceof JTextField){
              f = 150;
            }
            else if(c instanceof JCheckBox){
              f = 20;
            }
            c.setBounds(p, position[x], f,20);
            x++;
            p = 10;
          }
          i++;
        }
        
        panel_bestellungen.add(button_submit);
        button_submit.setBounds(50, position[x],200,20);
        button_submit.setText(button_mode);
 
        cl_filter.show(panel_filter, "BESTELLUNGEN");
        break;
        
      case 3: 
        panel_kategorien.add(label_kategoriennr);
        panel_kategorien.add(numberfield_kategorienr);
        panel_kategorien.add(label_kategoriename);
        panel_kategorien.add(textfield_kategoriename);
        panel_kategorien.add(label_beschreibung);
        panel_kategorien.add(textfield_beschreibung);
        
        i = 2;
        x = 0;
        p = 10;
        f = 0;
          
        for (Component c: panel_kategorien.getComponents()) {
          if(i % 2 == 0){
            c.setBounds(p, position[x],100,20);
            p = 125;
        }
          else if(i % 2 == 1){
            if(c instanceof JNumberField){
              f = 50;
            }
            else if(c instanceof JTextField){
              f = 150;
            }
            else if(c instanceof JCheckBox){
              f = 20;
            }
            c.setBounds(p, position[x], f,20);
            x++;
            p = 10;
          }
          i++;
        }
        
        panel_kategorien.add(button_submit);
        button_submit.setBounds(50, position[x],200,20);
        button_submit.setText(button_mode);
        
        cl_filter.show(panel_filter, "KATEGORIEN");
        break;
        
      case 4:
        panel_kunden.add(label_kundencode);
        panel_kunden.add(textfield_kundencode);
        panel_kunden.add(label_firma);
        panel_kunden.add(textfield_firma);
        panel_kunden.add(label_kontaktperson);
        panel_kunden.add(textfield_kontaktperson);
        panel_kunden.add(label_position);
        panel_kunden.add(textfield_position);
        panel_kunden.add(label_strasse);
        panel_kunden.add(textfield_strasse);
        panel_kunden.add(label_plz);
        panel_kunden.add(textfield_plz);
        panel_kunden.add(label_ort);
        panel_kunden.add(textfield_ort);
        panel_kunden.add(label_land);
        panel_kunden.add(textfield_land);
        panel_kunden.add(label_telefon);
        panel_kunden.add(numberfield_telefon);
        panel_kunden.add(label_telefax);
        panel_kunden.add(numberfield_telefax);
        
        i = 2;
        x = 0;
        p = 10;
        f = 0;
          
        for (Component c: panel_kunden.getComponents()) {
          if(i % 2 == 0){
            c.setBounds(p, position[x],100,20);
            p = 125;
        }
          else if(i % 2 == 1){
            if(c instanceof JNumberField){
              f = 50;
            }
            else if(c instanceof JTextField){
              f = 150;
            }
            else if(c instanceof JCheckBox){
              f = 20;
            }
            c.setBounds(p, position[x], f,20);
            x++;
            p = 10;
          }
          i++;
        }
        
        panel_kunden.add(button_submit);
        button_submit.setBounds(50, position[x],200,20);
        button_submit.setText(button_mode);
        
        cl_filter.show(panel_filter, "KUNDEN");
        break;
        
      case 5:
        panel_lieferanten.add(label_lieferantennr);
        panel_lieferanten.add(numberfield_lieferantennr);
        panel_lieferanten.add(label_firma);
        panel_lieferanten.add(textfield_firma);
        panel_lieferanten.add(label_kontaktperson);
        panel_lieferanten.add(textfield_kontaktperson);
        panel_lieferanten.add(label_position);
        panel_lieferanten.add(textfield_position);
        panel_lieferanten.add(label_strasse);
        panel_lieferanten.add(textfield_strasse);
        panel_lieferanten.add(label_plz);
        panel_lieferanten.add(textfield_plz);
        panel_lieferanten.add(label_ort);
        panel_lieferanten.add(textfield_ort);
        panel_lieferanten.add(label_land);
        panel_lieferanten.add(textfield_land);
        panel_lieferanten.add(label_telefon);
        panel_lieferanten.add(numberfield_telefon);
        panel_lieferanten.add(label_telefax);
        panel_lieferanten.add(numberfield_telefax);
        panel_lieferanten.add(label_homepage); 
        panel_lieferanten.add(textfield_homepage);
        
        i = 2;
        x = 0;
        p = 10;
        f = 0;
          
        for (Component c: panel_lieferanten.getComponents()) {
          if(i % 2 == 0){
            c.setBounds(p, position[x],100,20);
            p = 125;
        }
          else if(i % 2 == 1){
            if(c instanceof JNumberField){
              f = 50;
            }
            else if(c instanceof JTextField){
              f = 150;
            }
            else if(c instanceof JCheckBox){
              f = 20;
            }
            c.setBounds(p, position[x], f,20);
            x++;
            p = 10;
          }
          i++;
        }
        
        panel_lieferanten.add(button_submit);
        button_submit.setBounds(50, position[x],200,20);
        button_submit.setText(button_mode); 
        
        cl_filter.show(panel_filter, "LIEFERANTEN");
        break;
        
      case 6:
        panel_personal.add(label_personalnr);  
        panel_personal.add(numberfield_personalnr);
        panel_personal.add(label_vorname); 
        panel_personal.add(textfield_vorname);    
        panel_personal.add(label_nachname);
        panel_personal.add(textfield_nachname);
        panel_personal.add(label_position);
        panel_personal.add(textfield_position);
        panel_personal.add(label_anrede);
        panel_personal.add(combobox_anrede);
        panel_personal.add(label_geburtsdatum);
        panel_personal.add(datefield_geburtsdatum);
        panel_personal.add(label_einstellung);
        panel_personal.add(datefield_einstellung);
        panel_personal.add(label_strasse);
        panel_personal.add(textfield_strasse);
        panel_personal.add(label_plz);
        panel_personal.add(textfield_plz);
        panel_personal.add(label_ort);
        panel_personal.add(textfield_ort);
        panel_personal.add(label_land);
        panel_personal.add(textfield_land);
        panel_personal.add(label_telefon);
        panel_personal.add(numberfield_telefon);
        panel_personal.add(label_durchwahl);
        panel_personal.add(numberfield_durchwahl);
      
        i = 2;
        x = 0;
        p = 10;
        f = 0;
          
        for (Component c: panel_personal.getComponents()) {
          if(i % 2 == 0){
            c.setBounds(p, position[x],100,20);
            p = 125;
        }
          else if(i % 2 == 1){
            if(c instanceof JNumberField){
              f = 50;
            }
            else if(c instanceof JTextField){
              f = 150;
            }
            else if(c instanceof JCheckBox){
              f = 20;
            }
            c.setBounds(p, position[x], f,20);
            x++;
            p = 10;
          }
          i++;
        }
        
        panel_personal.add(button_submit);
        button_submit.setBounds(50, position[x],200,20);
        button_submit.setText(button_mode); 
        
        cl_filter.show(panel_filter, "PERSONAL");
        break;
        
      case 7:
        panel_versandfirmen.add(label_firmennr);
        panel_versandfirmen.add(numberfield_firmennr);
        panel_versandfirmen.add(label_firma);
        panel_versandfirmen.add(textfield_firma);
        panel_versandfirmen.add(label_telefon);
        panel_versandfirmen.add(numberfield_telefon);
        
        i = 2;
        x = 0;
        p = 10;
        f = 0;
          
        for (Component c: panel_versandfirmen.getComponents()) {
          if(i % 2 == 0){
            c.setBounds(p, position[x],100,20);
            p = 125;
        }
          else if(i % 2 == 1){
            if(c instanceof JNumberField){
              f = 50;
            }
            else if(c instanceof JTextField){
              f = 150;
            }
            else if(c instanceof JCheckBox){
              f = 20;
            }
            c.setBounds(p, position[x], f,20);
            x++;
            p = 10;
          }
          i++;
        }
        
        panel_versandfirmen.add(button_submit);
        button_submit.setBounds(50, position[x],200,20);
        button_submit.setText(button_mode); 
                
        cl_filter.show(panel_filter, "VERSANDFIRMEN"); 
        break;
          
      default:
        System.out.println("Fataler Fehler. Bitte Admin kontaktieren"); 
    }
  }
  // Ende Methoden
}
