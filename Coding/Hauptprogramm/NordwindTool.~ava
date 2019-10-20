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
  private JPanel panel_login = new JPanel(null, true);
  private JPanel panel_home = new JPanel(null, true);
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
    
    //PANELS DEM MAIN-PANEL (CL) HINZUFÜGEN
    panel_main.add(panel_login, "LOGIN");
    panel_main.add(panel_home, "HOME");
    
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
    label_loginstatus.setBounds(427, 314, 150, 20);
    label_loginstatus.setText("");
    label_loginstatus.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
    panel_login.add(label_loginstatus);
    label_loginstatus.setBackground(null);
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
    
    menu_control();

    panel_home.add(label_logout);
    // Ende Komponenten
    
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
      if(dbQuery.checkName(loginname)){
        char[] passwordfield_input = passwordfield_login.getPassword();
        if(passwordfield_input.length == 0){
          label_loginstatus.setBackground(null);
          label_loginstatus.setText("Bitte Passwort eingeben");
        }
        
        else{
          if(PasswordHasher.validatePassword(passwordfield_input, dbQuery.getPassword(loginname))){     
            login();
            
          }
          else{
            label_loginstatus.setText("Falsches Passwort");
            Arrays.fill(passwordfield_input, '0'); //FÜLLT ARRAY MIT 0 UM PASSWÖRTER ZU LÖSCHEN      
            passwordfield_login.selectAll();
            passwordfield_login.requestFocusInWindow();
          }
        }         
      }
      else{
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
  
 
  // Ende Methoden
}

