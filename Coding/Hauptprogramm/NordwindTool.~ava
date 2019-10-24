import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;
import java.awt.font.TextAttribute;  
import java.text.DateFormat;
import java.text.SimpleDateFormat;

// Autor: Julian Krieger
// Datum: 15.10.2019

public class NordwindTool extends JFrame {
  
  /*--------------------OBJEKTE INSTANZIIEREN---------------------------------*/
  
  DateFormat normalDateFormat = new SimpleDateFormat("dd.MM.yyyy");
  //Main - Panel
  private JPanel panel_main = new JPanel(new CardLayout());
  private JLabel label_filter = new JLabel();
  private JLabel label_tablesList = new JLabel(); 
  private JPanel panel_home = new JPanel(null, true);
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
  
  private JLabel label_plzOrt = new JLabel();
  private JTextField textfield_ort = new JTextField();
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
  
  private JLabel label_vorgesetzte = new JLabel();  
  private JTextField textfield_vorgesetzte = new JTextField(); 
  
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
  
  
  /*-----------------MENÜ-KOMPONENTEN ERSTELLEN-------------------------------*/
  //Menüleiste erstellen
  private JMenuBar menu_bar = new JMenuBar();
  
  //Menüs erstellen
  private JMenu menu_dml = new JMenu("Funktionen");
  private JMenu menu_admin = new JMenu("Admin");
  private JMenu menu_info = new JMenu("Info");
  
  //Menüitems erstellen
  //Für menu_dml
  private JMenuItem item_query = new JMenuItem("Abfrage erstellen");
  private JMenuItem item_create = new JMenuItem("Datensätze anlegen");
  private JMenuItem item_edit = new JMenuItem("Datensätze editieren");
  private JMenuItem item_home = new JMenuItem("Home");
  //Für menu_admin
  private JMenuItem item_rightAdministration = new JMenuItem("Rechteverwaltung");
  private JMenuItem item_userAdministration = new JMenuItem("Benutzerverwaltung");
  
  //Für menu_info  
  private JMenuItem item_about = new JMenuItem("Über 'Nordwind - Tool'");
  private JMenuItem item_help = new JMenuItem("Hilfe");
  
  
  /*------------------------VARIABLEN-----------------------------------------*/
  String loginname;
  boolean loginstate = false;
  
  //Card Layouts
  CardLayout cl_main = (CardLayout) panel_main.getLayout();
  CardLayout cl_filter = (CardLayout) panel_filter.getLayout();
  
  
  public NordwindTool() { 
    /*-----------------FRAME-INITIALISIERUNG----------------------------------*/
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 1280; 
    int frameHeight = 719;
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
    panel_filter.setBackground(Color.YELLOW);
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
    panel_tables.setBounds(30, 100, 300, 480);
    panel_tables.setOpaque(true);
    panel_home.add(panel_tables);
    
    /*      ALLE FILTER PANELS       */
    panel_artikel.setBounds(328, 576, 300, 400);
    panel_artikel.setOpaque(true);
    panel_artikel.setBackground(Color.CYAN);
    
    panel_bestelldetails.setBounds(360, 576, 300, 532);
    panel_bestelldetails.setOpaque(true);
    panel_bestelldetails.setBackground(Color.GREEN);
    
    panel_bestellungen.setBounds(336, 584, 300, 400);
    panel_bestellungen.setOpaque(true);
    panel_bestellungen.setBackground(new Color(0xFFC800));
    
    panel_kategorien.setBounds(352, 576, 300, 400);
    panel_kategorien.setOpaque(true);
    panel_kategorien.setBackground(new Color(0xFFAFAF));
    
    panel_kunden.setBounds(362, 577, 300, 400);
    panel_kunden.setOpaque(true);
    panel_kunden.setBackground(Color.MAGENTA);
    
    panel_lieferanten.setBounds(355, 576, 300, 400);
    panel_lieferanten.setOpaque(true);
    panel_lieferanten.setBackground(Color.RED);
    
    panel_personal.setBounds(0, 32, 300, 400);
    panel_personal.setOpaque(true);
    panel_personal.setBackground(Color.BLUE);
    
    panel_versandfirmen.setBounds(368, 571, 300, 400);
    panel_versandfirmen.setOpaque(true);
    panel_versandfirmen.setBackground(new Color(0x404040));
    
    panel_null.setBounds(376, 576, 300, 400);
    panel_null.setOpaque(true);
    panel_null.setBackground(new Color(0xEEEEEE));
    
    
    /*-----------------SWING-ELEMENTE KONFIGURIEREN---------------------------*/
    //LOGIN PANEL
    passwordfield_login.setBounds(380, 218, 230, 40);
    passwordfield_login.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
    passwordfield_login.setToolTipText("Passwort eingeben");
    panel_login.add(passwordfield_login);
    
    textfield_loginname.setBounds(380, 160, 230, 40);
    textfield_loginname.setText("");
    textfield_loginname.setToolTipText("Anmeldename eingeben");
    textfield_loginname.setHorizontalAlignment(SwingConstants.LEFT);
    textfield_loginname.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
    panel_login.add(textfield_loginname);
     
    button_login.setBounds(405, 264, 179, 41);
    button_login.setText("Anmelden");
    button_login.setMargin(new Insets(2, 2, 2, 2)); 
    button_login.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
    panel_login.add(button_login);
    
    label_login.setBounds(374, 118, 233, 36);
    label_login.setText("Bitte melden Sie sich an");
    label_login.setHorizontalAlignment(SwingConstants.CENTER);
    label_login.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
    panel_login.add(label_login);
    
    label_loginstatus.setBounds(405, 314, 179, 20);
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
    
    label_filter.setBounds(392, 76, 250, 20);
    label_filter.setText("FILTERAUSWAHL");
    label_filter.setFont(new Font("Trebuchet MS", Font.BOLD, 24));
    label_filter.setHorizontalAlignment(SwingConstants.CENTER);
    panel_home.add(label_filter);
    
    label_tablesList.setBounds(44, 68, 250, 33);
    label_tablesList.setText("TABELLENAUSWAHL");
    label_tablesList.setFont(new Font("Trebuchet MS", Font.BOLD, 24));
    label_tablesList.setHorizontalAlignment(SwingConstants.CENTER); 
    panel_home.add(label_tablesList);
    
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
    button_resetList.setBounds(9, 416, 278, 41);
    button_resetList.setText("Auswahl zurücksetzen");
    button_resetList.setMargin(new Insets(2, 2, 2, 2));
    button_resetList.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
    panel_tables.add(button_resetList);
    
    list_tablesScrollPane.setBounds(6, 11, 286, 388);
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
    label_plzOrt.setText("PLZ & Ort:");    
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
    label_vorgesetzte.setText("Vorgesetzte:");  
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
    textfield_vorgesetzte.setToolTipText("Vorgesetzte angeben");
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
    panel_personal.add(combobox_anrede);
    
    /*-------------------MENÜ KONFIGURIEREN-----------------------------------*/
    //Items zu "menu_dml" hinzufügen
    menu_dml.add(item_query);
    menu_dml.add(item_create);
    menu_dml.add(item_edit);
    menu_dml.add(item_home);
    
    //Items zu "menu_admin" hinzufügen
    menu_admin.add(item_rightAdministration);
    menu_admin.add(item_userAdministration);
    
    //Items zu "menu_info" hinzufügen
    menu_info.add(item_about);
    menu_info.add(item_help);
    
    //Menüs zur Menüleiste hinzufügen
    menu_bar.add(menu_dml);
    menu_bar.add(menu_admin);
    menu_bar.add(menu_info);
    
    
    /*---------------------STARTBEDINGUNGEN-----------------------------------*/
    cl_filter.show(panel_filter, "NULL");
    label_filter.setVisible(false);
    setJMenuBar(menu_bar);
    setVisible(true);
    label_loginstatus.setBackground(null);
    menu_control();
    
    
    /*--------------------------LISTENER--------------------------------------*/ 
     
    //ACTIONLISTENER
    
    //Actionlistener für Menüitems
    //Menü: "menu_dml"
    item_query.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        reset_filter();     
        enable_listPanel();
        //VARIABLE STRING REINBRINGEN MODUS
        System.out.println("ABFRAGEN");
      }
    }); 
    
    item_create.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        reset_filter();     
        enable_listPanel();
        //VARIABLE STRING REINBRINGEN MODUS
        System.out.println("ANLEGEN");
      }
    });
    
    item_edit.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        reset_filter();     
        enable_listPanel();
        //VARIABLE STRING REINBRINGEN MODUS
        System.out.println("EDITIEREN");
      }
    });
    
    item_home.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        reset_filter();     
        disable_listPanel();
        //VARIABLE STRING REINBRINGEN MODUS
        System.out.println("HOME");
      }
    });
    
    //Menü: "menu_admin"
    item_rightAdministration.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        System.out.println("RECHTEVERWALTUNG");
      }
    }); 
    
    item_userAdministration.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        System.out.println("BENUTZERVERWALTUNG");
      }
    });
    
    //Menü: "menu_info"
    item_about.addActionListener(new ActionListener() {;
      public void actionPerformed(ActionEvent e) {
        System.out.println("UEBER NORDWIND - TOOL");
      }
    });
    
    item_help.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        System.out.println("HILFE");
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
  }
  
  /*------------------------MAIN METHODE--------------------------------------*/
  
  public static void main(String[] args) {
    new NordwindTool();
  }
  
  /*------------------LISTENER METHODEN---------------------------------------*/
  
  public void button_resetList_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    list_tables.clearSelection();
  }

  public void list_tables_ValueChanged(ListSelectionEvent evt) {
    // TODO hier Quelltext einfügen
    if (!evt.getValueIsAdjusting()) {
      openFilterPanel(list_tables.getSelectedIndex());
    }  
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
    item_query.setEnabled(insert);  
    item_create.setEnabled(insert);
    item_edit.setEnabled(insert);
    item_home.setEnabled(insert);
    menu_admin.setEnabled(insert);
    
    item_create.setToolTipText(text);
    item_edit.setToolTipText(text);
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
    label_tablesList.setVisible(true);
    label_tablesList.setEnabled(true);
  }
  
  public void disable_listPanel(){
    panel_tables.setEnabled(false);
    panel_tables.setVisible(false);
    label_tablesList.setVisible(false);
    label_tablesList.setEnabled(false);
  }
    
      
  
  public void openFilterPanel(int index){
    switch (index){
      case -1: 
        cl_filter.show(panel_filter, "NULL");
        label_filter.setVisible(false);
        break;
        
      case 0:
        label_filter.setVisible(true);
          
        label_artikelnr.setBounds(10, 25, 100, 20);
            
        label_mindestbestand.setText("Mindestbestand:");
        label_auslaufartikel.setText("Auslaufartikel:");
        
        panel_artikel.add(label_artikelnr);
        
        numberfield_artikelnr.setBounds(125,25,50,20);
        panel_artikel.add(numberfield_artikelnr);
        
        label_artikelname.setBounds(10, 60, 100, 20);
        
        panel_artikel.add(label_artikelname);
        
        textfield_artikelname.setBounds(125,60,150,20);
        panel_artikel.add(textfield_artikelname);
        
        
        label_lieferantennr.setBounds(10, 95, 100, 20);
        panel_artikel.add(label_lieferantennr);
        
        numberfield_lieferantennr.setBounds(125,95,50,20);
        panel_artikel.add(numberfield_lieferantennr);
        
        label_kategoriennr.setBounds(10, 130, 100, 20);
        panel_artikel.add(label_kategoriennr);
        
        numberfield_kategorienr.setBounds(125,130,50,20);
        panel_artikel.add(numberfield_kategorienr);
        
        label_liefereinheit.setBounds(10, 165, 100, 20);
        panel_artikel.add(label_liefereinheit);
        
        textfield_liefereinheit.setBounds(125,165,150,20);
        panel_artikel.add(textfield_liefereinheit);
        
        label_einzelpreis.setBounds(10, 200, 100, 20);
        panel_artikel.add(label_einzelpreis);
        
        numberfield_einzelpreis.setBounds(125,200,50,20);
        panel_artikel.add(numberfield_einzelpreis);
        
        label_lagerbestand.setBounds(10, 235, 100, 20);
        panel_artikel.add(label_lagerbestand);
        
        numberfield_lagerbestand.setBounds(125,235,50,20);
        panel_artikel.add(numberfield_lagerbestand);
        
        label_bestellteEinheiten.setBounds(10, 270, 100, 20);
        panel_artikel.add(label_bestellteEinheiten);
        
        numberfield_bestellteEinheiten.setBounds(125,270,50,20);
        panel_artikel.add(numberfield_bestellteEinheiten);
        
        label_mindestbestand.setBounds(10, 305, 100, 20);
        panel_artikel.add(label_mindestbestand);
        
        numberfield_mindestbestand.setBounds(125,305,50,20);
        panel_artikel.add(numberfield_mindestbestand);
        
        label_auslaufartikel.setBounds(10, 340, 100, 20);
        panel_artikel.add(label_auslaufartikel);
        
        checkbox_auslaufartikel.setBounds(125, 340, 20, 20);
        panel_artikel.add(checkbox_auslaufartikel);
        
        cl_filter.show(panel_filter, "ARTIKEL");
        System.out.println("CASE 0");
        break;
        
      case 1:
        label_filter.setVisible(true);
        label_bestellnr.setBounds(10, 25, 100, 20);
        panel_bestelldetails.add(label_bestellnr);
        
        numberfield_bestellnr.setBounds(125,25,50,20);
        panel_bestelldetails.add(numberfield_bestellnr);
        
        label_artikelnr.setBounds(10, 60, 100, 20);
        panel_bestelldetails.add(label_artikelnr);
        
        numberfield_artikelnr.setBounds(125,60,50,20);
        panel_bestelldetails.add(numberfield_artikelnr);
        
        label_einzelpreis.setBounds(10, 95, 100, 20);
        panel_bestelldetails.add(label_einzelpreis);  
        
        numberfield_einzelpreis.setBounds(125,95,50,20);
        panel_bestelldetails.add(numberfield_einzelpreis);
        
        label_anzahl.setBounds(10, 130, 100, 20);
        panel_bestelldetails.add(label_anzahl);
        
        numberfield_anzahl.setBounds(125,130,50,20);
        panel_bestelldetails.add(numberfield_anzahl);
        
        label_rabatt.setBounds(10, 165, 100, 20);
        panel_bestelldetails.add(label_rabatt);
        
        numberfield_rabatt.setBounds(125,165,50,20);
        panel_bestelldetails.add(numberfield_rabatt);
        
        cl_filter.show(panel_filter, "BESTELLDETAILS");
        System.out.println("CASE 1");
        break;
        
      case 2: 
        label_filter.setVisible(true);
        label_bestellnr.setBounds(10, 25,100,20);
        panel_bestellungen.add(label_bestellnr);
        
        numberfield_bestellnr.setBounds(125,25,50,20);
        panel_bestellungen.add(numberfield_bestellnr);
        
        label_kundencode.setBounds(10, 60, 100, 20);
        panel_bestellungen.add(label_kundencode);
        
        textfield_kundencode.setBounds(125,60,150,20);
        panel_bestellungen.add(textfield_kundencode);
        
        label_personalnr.setBounds(10, 95, 100, 20);
        panel_bestellungen.add(label_personalnr);
        
        numberfield_personalnr.setBounds(125,95,50,20);
        panel_bestellungen.add(numberfield_personalnr);
        
        label_bestelldatum.setBounds(10, 130, 100, 20);
        panel_bestellungen.add(label_bestelldatum);     
        
        datefield_bestelldatum.setBounds(125,130,100,20);
        panel_bestellungen.add(datefield_bestelldatum);
            
        label_lieferdatum.setBounds(10, 165, 100, 20);
        panel_bestellungen.add(label_lieferdatum);
        
        datefield_lieferdatum.setBounds(125,165,100,20);
        panel_bestellungen.add(datefield_lieferdatum);
        
        label_versanddatum.setBounds(10, 200, 100, 20);
        panel_bestellungen.add(label_versanddatum);
        
        datefield_versanddatum.setBounds(125,200,100,20);
        panel_bestellungen.add(datefield_versanddatum);
        
        label_versandUeber.setBounds(10, 235, 100, 20);
        panel_bestellungen.add(label_versandUeber);
        
        numberfield_versandUeber.setBounds(125,235,50,20);
        panel_bestellungen.add(numberfield_versandUeber);
        
        label_frachtkosten.setBounds(10, 270, 100, 20);
        panel_bestellungen.add(label_frachtkosten);
        
        numberfield_frachtkosten.setBounds(125,270,50,20);
        panel_bestellungen.add(numberfield_frachtkosten);
        
        label_empfaenger.setBounds(10, 305, 100, 20);
        panel_bestellungen.add(label_empfaenger);
        
        textfield_empfaenger.setBounds(125,305,150,20);
        panel_bestellungen.add(textfield_empfaenger);
        
        label_strasse.setBounds(10, 340, 100, 20);
        panel_bestellungen.add(label_strasse);
        
        textfield_strasse.setBounds(125,340,150,20);
        panel_bestellungen.add(textfield_strasse);
        
        label_plzOrt.setBounds(10, 375, 100, 20);
        panel_bestellungen.add(label_plzOrt);
        
        textfield_plz.setBounds(125,375,50,20);
        panel_bestellungen.add(textfield_plz);
        
        textfield_ort.setBounds(185,375,90,20);
        panel_bestellungen.add(textfield_ort);
        
        label_land.setBounds(10, 410, 100, 20);
        panel_bestellungen.add(label_land);
        
        textfield_land.setBounds(125,410,150,20);
        panel_bestellungen.add(textfield_land);
 
        cl_filter.show(panel_filter, "BESTELLUNGEN");
        break;
      case 3: 
        
        label_filter.setVisible(true);
        label_kategoriennr.setBounds(10, 25, 100, 20);
        panel_kategorien.add(label_kategoriennr);
        
        numberfield_kategorienr.setBounds(125,25,50,20);
        panel_kategorien.add(numberfield_kategorienr);
        
        label_kategoriename.setBounds(10, 60, 100, 20);
        panel_kategorien.add(label_kategoriename);
        
        textfield_kategoriename.setBounds(125,60,150,20);
        panel_kategorien.add(textfield_kategoriename);
        
        label_beschreibung.setBounds(10, 95, 100, 20);
        panel_kategorien.add(label_beschreibung);
        
        textfield_beschreibung.setBounds(125,95,150,20);
        panel_kategorien.add(textfield_beschreibung);
        
        cl_filter.show(panel_filter, "KATEGORIEN");
        break;
        
      case 4: 
        label_filter.setVisible(true);
        label_kundencode.setBounds(10, 25, 100, 20);
        panel_kunden.add(label_kundencode);
        
        textfield_kundencode.setBounds(125,25,150,20);
        panel_kunden.add(textfield_kundencode);
        
        label_firma.setBounds(10, 60, 100, 20);
        panel_kunden.add(label_firma);
        
        textfield_firma.setBounds(125,60,150,20);
        panel_kunden.add(textfield_firma);
        
        label_kontaktperson.setBounds(10, 95, 100, 20);
        panel_kunden.add(label_kontaktperson);
        
        textfield_kontaktperson.setBounds(125,95,150,20);
        panel_kunden.add(textfield_kontaktperson);
        
        label_position.setBounds(10, 130, 100, 20);
        panel_kunden.add(label_position);
        
        textfield_position.setBounds(125,130,150,20);
        panel_kunden.add(textfield_position);
        
        label_strasse.setBounds(10, 165, 100, 20);
        panel_kunden.add(label_strasse);
        
        textfield_strasse.setBounds(125,165,150,20);
        panel_kunden.add(textfield_strasse);
        
        label_plzOrt.setBounds(10, 200, 100, 20);
        panel_kunden.add(label_plzOrt);
        
        textfield_plz.setBounds(125,200,50,20);
        panel_kunden.add(textfield_plz);
        
        textfield_ort.setBounds(185,200,90,20);
        panel_kunden.add(textfield_ort);
        
        label_land.setBounds(10, 235, 100, 20);
        panel_kunden.add(label_land);
        
        textfield_land.setBounds(125,235,150,20);
        panel_kunden.add(textfield_land);
        
        label_telefon.setBounds(10, 270, 100, 20);
        panel_kunden.add(label_telefon);
        
        numberfield_telefon.setBounds(125,270,100,20);
        panel_kunden.add(numberfield_telefon);
        
        label_telefax.setBounds(10, 305, 100, 20);
        panel_kunden.add(label_telefax);
        
        numberfield_telefax.setBounds(125,305,100,20);
        panel_kunden.add(numberfield_telefax);
        
        cl_filter.show(panel_filter, "KUNDEN");
        break;
        
      case 5:
        label_filter.setVisible(true);
        label_lieferantennr.setBounds(10, 25, 100, 20);
        panel_lieferanten.add(label_lieferantennr);
        
        numberfield_lieferantennr.setBounds(125,25,50,20);
        panel_lieferanten.add(numberfield_lieferantennr);
        
        label_firma.setBounds(10, 60, 100, 20);
        panel_lieferanten.add(label_firma);
        
        textfield_firma.setBounds(125,60,150,20);
        panel_lieferanten.add(textfield_firma);
        
        label_kontaktperson.setBounds(10, 95, 100, 20);
        panel_lieferanten.add(label_kontaktperson);
        
        textfield_kontaktperson.setBounds(125,95,150,20);
        panel_lieferanten.add(textfield_kontaktperson);
        
        label_position.setBounds(10, 130, 100, 20);
        panel_lieferanten.add(label_position);
        
        textfield_position.setBounds(125,130,150,20);
        panel_lieferanten.add(textfield_position);
        
        label_strasse.setBounds(10, 165, 100, 20);
        panel_lieferanten.add(label_strasse);
        
        textfield_strasse.setBounds(125,165,150,20);
        panel_lieferanten.add(textfield_strasse);
        
        label_plzOrt.setBounds(10, 200, 100, 20);
        panel_lieferanten.add(label_plzOrt);
        
        textfield_plz.setBounds(125,200,50,20);
        panel_lieferanten.add(textfield_plz);
        
        textfield_ort.setBounds(185,200,90,20);
        panel_lieferanten.add(textfield_ort);
        
        label_land.setBounds(10, 235, 100, 20);
        panel_lieferanten.add(label_land);
        
        textfield_land.setBounds(125,235,150,20);
        panel_lieferanten.add(textfield_land);
        
        label_telefon.setBounds(10, 270, 100, 20);
        panel_lieferanten.add(label_telefon);
        
        numberfield_telefon.setBounds(125,270,100,20);
        panel_lieferanten.add(numberfield_telefon);
        
        label_telefax.setBounds(10, 305, 100, 20);
        panel_lieferanten.add(label_telefax);
        
        numberfield_telefax.setBounds(125,305,100,20);
        panel_lieferanten.add(numberfield_telefax);
        
        label_homepage.setBounds(10, 340, 100, 20);
        panel_lieferanten.add(label_homepage); 
        
        textfield_homepage.setBounds(125,340,150,20);
        panel_lieferanten.add(textfield_homepage);
        
        cl_filter.show(panel_filter, "LIEFERANTEN");
        break;
        
      case 6: 
        label_filter.setVisible(true);
        label_personalnr.setBounds(10, 25, 100, 20);
        panel_personal.add(label_personalnr);  
        
        numberfield_personalnr.setBounds(125, 25, 50,  20);
        panel_personal.add(numberfield_personalnr);
        
        label_vorname.setBounds(10, 60, 100, 20);
        panel_personal.add(label_vorname); 
        
        textfield_vorname.setBounds(125,60,150,20);
        panel_personal.add(textfield_vorname);    
        
        label_nachname.setBounds(10, 95, 100, 20);
        panel_personal.add(label_nachname);
        
        textfield_nachname.setBounds(125,95,150,20);
        panel_personal.add(textfield_nachname);
        
        label_position.setBounds(10, 130, 100, 20);
        panel_personal.add(label_position);
        
        textfield_position.setBounds(125,130,150,20);
        panel_personal.add(textfield_position);
    
        label_anrede.setBounds(10, 165, 100, 20);
        panel_personal.add(label_anrede);
        
        combobox_anrede.setBounds(125, 165, 150, 20);
        
        label_geburtsdatum.setBounds(10, 200, 100, 20);
        panel_personal.add(label_geburtsdatum);
        
        datefield_geburtsdatum.setBounds(125,200,100,20);
        panel_personal.add(datefield_geburtsdatum);
        
        label_einstellung.setBounds(10, 235, 100, 20);
        panel_personal.add(label_einstellung);
        
        datefield_einstellung.setBounds(125,235,100,20);
        panel_personal.add(datefield_einstellung);
        
        label_strasse.setBounds(10, 270, 100, 20);
        panel_personal.add(label_strasse);
        
        textfield_strasse.setBounds(125,270,150,20);
        panel_personal.add(textfield_strasse);
        
        label_plzOrt.setBounds(10, 305, 100, 20);
        panel_personal.add(label_plzOrt);
        
        textfield_plz.setBounds(125,305,50,20);
        panel_personal.add(textfield_plz);
        
        textfield_ort.setBounds(185,305,90,20);
        panel_personal.add(textfield_ort);
        
        label_land.setBounds(10, 340, 100, 20);
        panel_personal.add(label_land);
        
        textfield_land.setBounds(125,340,150,20);
        panel_personal.add(textfield_land);
        
        label_telefon.setBounds(10, 375, 100, 20);
        panel_personal.add(label_telefon);
        
        numberfield_telefon.setBounds(125,375,100,20);
        panel_personal.add(numberfield_telefon);
        
        label_durchwahl.setBounds(10, 410, 100, 20);
        panel_personal.add(label_durchwahl);
        
        numberfield_durchwahl.setBounds(125,410,100,20);
        panel_personal.add(numberfield_durchwahl);
        
        label_bemerkungen.setBounds(10, 445, 100, 20);
        panel_personal.add(label_bemerkungen);
        
        textfield_bemerkungen.setBounds(125,445,150,20);
        panel_personal.add(textfield_bemerkungen);
        
        label_vorgesetzte.setBounds(10, 480, 100, 20);
        panel_personal.add(label_vorgesetzte);
        
        textfield_vorgesetzte.setBounds(125,480,150,20);
        panel_personal.add(textfield_vorgesetzte);
        
      
        cl_filter.show(panel_filter, "PERSONAL");
        break;
        
      case 7: 
        label_filter.setVisible(true);
        label_firmennr.setBounds(10, 25, 100, 20);
        panel_versandfirmen.add(label_firmennr);
        
        numberfield_firmennr.setBounds(125,25,50,20);
        panel_versandfirmen.add(numberfield_firmennr);
        
        label_firma.setBounds(10, 60, 100, 20);
        panel_versandfirmen.add(label_firma);
        
        textfield_firma.setBounds(125,60,150,20);
        panel_versandfirmen.add(textfield_firma);
        
        label_telefon.setBounds(10, 95, 100, 20);
        panel_versandfirmen.add(label_telefon);
        
        numberfield_telefon.setBounds(125,95,100,20);
        panel_versandfirmen.add(numberfield_telefon);
                
        cl_filter.show(panel_filter, "VERSANDFIRMEN"); 
        break;
          
      default:
        System.out.println("Fataler Fehler. Bitte Admin kontaktieren"); 
    }
  }
}
