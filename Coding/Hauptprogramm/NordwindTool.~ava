import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*; //ARRAYS
import java.util.Hashtable;
import java.awt.font.TextAttribute;

// Autor: Julian Krieger
// Datum: 15.10.2019

public class NordwindTool extends JFrame {
  // Anfang Attribute
  private JPanel panel_main = new JPanel(new CardLayout());
  private JPanel panel_filter = new JPanel(new CardLayout());
          private JPanel panel_artikel = new JPanel(null, true);
            private JNumberField numberfield_artikelnr = new JNumberField();
            private JTextField textfield_artikelname = new JTextField();
            private JNumberField numberfield_lieferantennr = new JNumberField();
            private JNumberField numberfield_kategorienr = new JNumberField();
            private JTextField textfield_liefereinheit = new JTextField();
            private JNumberField numberfield_einzelpreis = new JNumberField();
            private JNumberField numberfield_lagerbestand = new JNumberField();
            private JNumberField numberfield_bestellteEinheiten = new JNumberField();
            private JNumberField numberfield_mindestbestand = new JNumberField();
            private JCheckBox checkbox_auslaufartikel = new JCheckBox();
          private JPanel panel_bestelldetails = new JPanel(null, true);
            private JNumberField numberfield_anzahl = new JNumberField();
            private JNumberField numberfield_rabatt = new JNumberField();
  private JPanel panel_login = new JPanel(null, true);
  private JPanel panel_home = new JPanel(null, true);
  private JList list_tables = new JList();
  private DefaultListModel list_tablesModel = new DefaultListModel();
  private JScrollPane list_tablesScrollPane = new JScrollPane(list_tables);
  private JLabel label_tableList = new JLabel();
  private JButton button_resetList = new JButton();
  private JLabel label_logout = new JLabel();
  private JLabel label_loginname = new JLabel();
  private JPasswordField passwordfield_login = new JPasswordField();
  private JTextField textfield_loginname = new JTextField();
  private JButton button_login = new JButton();
  private JLabel label_login = new JLabel();
  private JLabel label_loginstatus = new JLabel();
  
  //MENÜ DEKLARIEREN
  
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
  
  //Für menu_admin
  private JMenuItem item_rightAdministration = new JMenuItem("Rechteverwaltung");
  private JMenuItem item_userAdministration = new JMenuItem("Benutzerverwaltung");
  
  //Für menu_info  
  private JMenuItem item_about = new JMenuItem("Über 'Nordwind - Tool'");
  private JMenuItem item_help = new JMenuItem("Hilfe");
  
  String loginname;
  boolean loginstate = false;
  
  CardLayout cl_main = (CardLayout) panel_main.getLayout();
  CardLayout cl_filter = (CardLayout) panel_filter.getLayout();
  // Ende Attribute
  
  public NordwindTool() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 1024; 
    int frameHeight = 576;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("Nordwind Tool - Made by Julian Krieger");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    panel_main.setBounds(0, 0, 1012, 540);
    panel_main.setOpaque(false);
    cp.add(panel_main);
    panel_login.setBounds(0, 0, 1012, 532);
    panel_login.setOpaque(false);
    
    //PANELS DEM MAIN-PANEL (cl_main) HINZUFÜGEN
    panel_main.add(panel_login, "LOGIN");
    panel_main.add(panel_home, "HOME");
    
    //PANELS DEM FILTER-PANEL (cl_filter) HINZUFÜGEN  
    //panel_filter.add(panel_null, "NULL");
    panel_filter.add(panel_artikel, "ARTIKEL");
    panel_filter.add(panel_bestelldetails, "BESTELLDETAILS");
    /*panel_filter.add(panel_bestellungen, "BESTELLUNGEN");
    panel_filter.add(panel_kategorien, "KATEGORIEN");
    panel_filter.add(panel_kunden, "KUNDEN");
    panel_filter.add(panel_lieferanten, "LIEFERANTEN");
    panel_filter.add(panel_personal, "PERSONAL");
    panel_filter.add(panel_versandfirmen, "VERSANDFIRMEN");    */
    
    
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
    label_loginstatus.setBackground(Color.WHITE);
    label_loginstatus.setHorizontalAlignment(SwingConstants.CENTER);
    panel_login.add(label_loginstatus);
    panel_home.setBounds(0, 0, 1024, 540);
    panel_home.setOpaque(false);
    
    //MENÜ KONFIGURIEREN
    //Items zu "menu_dml" hinzufügen
    menu_dml.add(item_query);
    menu_dml.add(item_create);
    menu_dml.add(item_edit);
    
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
    
    
    setJMenuBar(menu_bar);
    setVisible(true);
    
    
    
    label_loginname.setBounds(752, 2, 182, 20);
    label_loginname.setHorizontalAlignment(SwingConstants.RIGHT);
    panel_home.add(label_loginname);
    label_logout.setBounds(940, 0, 70, 22);
    label_logout.setText("ABMELDEN");
    Hashtable<TextAttribute, Object> label_abmelden_map = new Hashtable<TextAttribute, Object>();
    label_abmelden_map.put(TextAttribute.FAMILY, "Trebuchet MS");
    label_abmelden_map.put(TextAttribute.SIZE, new Integer(12));
    label_abmelden_map.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
    label_logout.setForeground(Color.BLUE);
    label_logout.setHorizontalAlignment(SwingConstants.CENTER);
    Hashtable<TextAttribute, Object> label_logout_map = new Hashtable<TextAttribute, Object>();
    label_logout_map.put(TextAttribute.FAMILY, "Trebuchet MS");
    label_logout_map.put(TextAttribute.SIZE, new Integer(12));
    label_logout_map.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
    label_logout.setFont(new Font(label_logout_map));
    label_loginstatus.setBackground(null);
    menu_control();

    panel_home.add(label_logout);
    panel_filter.setBounds(344, 0, 316, 532);
    panel_filter.setOpaque(true);
    panel_filter.setBackground(Color.YELLOW);
    panel_home.add(panel_filter);
    list_tables.setModel(list_tablesModel);
    list_tablesScrollPane.setBounds(33, 163, 198, 268);
    list_tables.setLayoutOrientation(JList.VERTICAL);
    list_tables.setFont(new Font("Trebuchet MS", Font.BOLD, 24));
    list_tables.addListSelectionListener(new ListSelectionListener() { 
      public void valueChanged(ListSelectionEvent evt) { 
        list_tables_ValueChanged(evt);
      }
    });
    list_tablesModel.addElement("artikel");
    list_tablesModel.addElement("bestelldetails");
    list_tablesModel.addElement("bestellungen");
    list_tablesModel.addElement("kategorien");
    list_tablesModel.addElement("kunden");
    list_tablesModel.addElement("lieferanten");
    list_tablesModel.addElement("personal");
    list_tablesModel.addElement("versandfirmen");
    panel_home.add(list_tablesScrollPane);
    label_tableList.setBounds(13, 124, 248, 33);
    label_tableList.setText("Bitte Tabelle wählen!");
    label_tableList.setHorizontalAlignment(SwingConstants.CENTER);
    label_tableList.setFont(new Font("Trebuchet MS", Font.BOLD, 24));
    panel_home.add(label_tableList);
    button_resetList.setBounds(33, 432, 198, 25);
    button_resetList.setText("Auswahl zurücksetzen");
    button_resetList.setMargin(new Insets(2, 2, 2, 2));
    button_resetList.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        button_resetList_ActionPerformed(evt);
      }
    });
    button_resetList.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
    panel_home.add(button_resetList);
    panel_artikel.setBounds(168, 400, 316, 532);
    panel_artikel.setOpaque(true);
    panel_artikel.setBackground(Color.CYAN);
    numberfield_artikelnr.setBounds(111, 10, 75, 20);
    numberfield_artikelnr.setText("");
    panel_artikel.add(numberfield_artikelnr);
    textfield_artikelname.setBounds(74, 40, 150, 20);
    panel_artikel.add(textfield_artikelname);
    numberfield_lieferantennr.setBounds(110, 66, 75, 20);
    numberfield_lieferantennr.setText("");
    panel_artikel.add(numberfield_lieferantennr);
    numberfield_kategorienr.setBounds(110, 101, 75, 20);
    numberfield_kategorienr.setText("");
    panel_artikel.add(numberfield_kategorienr);
    textfield_liefereinheit.setBounds(72, 136, 150, 20);
    panel_artikel.add(textfield_liefereinheit);
    numberfield_einzelpreis.setBounds(109, 164, 75, 20);
    numberfield_einzelpreis.setText("");
    panel_artikel.add(numberfield_einzelpreis);
    numberfield_lagerbestand.setBounds(111, 191, 75, 20);
    numberfield_lagerbestand.setText("");
    panel_artikel.add(numberfield_lagerbestand);
    numberfield_bestellteEinheiten.setBounds(109, 217, 75, 20);
    numberfield_bestellteEinheiten.setText("");
    panel_artikel.add(numberfield_bestellteEinheiten);
    numberfield_mindestbestand.setBounds(108, 242, 75, 20);
    numberfield_mindestbestand.setText("");
    panel_artikel.add(numberfield_mindestbestand);
    checkbox_auslaufartikel.setBounds(128, 267, 20, 20);
    checkbox_auslaufartikel.setOpaque(false);
    panel_artikel.add(checkbox_auslaufartikel);
    panel_bestelldetails.setBounds(24, 408, 316, 532);
    panel_bestelldetails.setOpaque(true);
    panel_bestelldetails.setBackground(Color.GREEN);
    numberfield_anzahl.setBounds(113, 413, 75, 20);
    numberfield_anzahl.setText("");
    panel_bestelldetails.add(numberfield_anzahl);
    numberfield_rabatt.setBounds(114, 441, 75, 20);
    numberfield_rabatt.setText("");
    panel_bestelldetails.add(numberfield_rabatt);
    // Ende Komponenten
    
    /*------------------------------------------------------------------------*/ 
    //LISTENER ERSTELLEN
  
    //ACTIONLISTENER
    
    //Actionlistener für Menüitems
    //Menü: "menu_dml"
    item_query.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        System.out.println("ABFRAGEN");
      }
    }); 
    
    item_create.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        System.out.println("ANLEGEN");
      }
    });
    
    item_edit.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        System.out.println("EDITIEREN");
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
    
    
  }
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new NordwindTool();
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
      
    item_create.setEnabled(insert);
    item_edit.setEnabled(insert);
    menu_admin.setEnabled(insert);
    
    item_create.setToolTipText(text);
    item_edit.setToolTipText(text);
    menu_admin.setToolTipText(text);
    
    cl_main.show(panel_main, "LOGIN");
    }
  
  public void openFilterPanel(int index){
    switch (index){
      case -1: 
        cl_filter.show(panel_filter, "NULL");
        break;
      case 0: 
        cl_filter.show(panel_filter, "ARTIKEL");
        System.out.println("CASE 0");
        break;
      case 1: 
        cl_filter.show(panel_filter, "BESTELLDETAILS");
        System.out.println("CASE 1");
        validate();
        break;
      case 2: 
        cl_filter.show(panel_filter, "BESTELLUNGEN");
        break;
      case 3: 
        cl_filter.show(panel_filter, "KATEGORIEN");
        break;
      case 4: 
        cl_filter.show(panel_filter, "KUNDEN");
        break;
      case 5: 
        cl_filter.show(panel_filter, "LIEFERANTEN");
        break;
      case 6: 
        cl_filter.show(panel_filter, "PERSONAL");
        break;
      case 7: 
        cl_filter.show(panel_filter, "VERSANDFIRMEN");
        break;  
      default:
        System.out.println("Fataler Fehler. Bitte Admin kontaktieren"); 
      }
    }
  
  public void button_resetList_ActionPerformed(ActionEvent evt) {
    list_tables.clearSelection();
  }

  public void list_tables_ValueChanged(ListSelectionEvent evt) {
    if (!evt.getValueIsAdjusting()) { //Sorgt dafür, dass bei Mausklick die Methode nicht 2x aufgerufen wird
      openFilterPanel(list_tables.getSelectedIndex());
    }
    
  }
}
