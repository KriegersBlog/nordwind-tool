package Hauptprogramm;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.event.*;
import java.util.*;
import java.awt.font.TextAttribute;  


// Autor: Julian Krieger
// Datum: 15.10.2019

public class NordwindTool extends JFrame {
  
  /*--------------------OBJEKTE INSTANZIIEREN---------------------------------*/
  // Anfang Attribute

  Image logo = new ImageIcon("images/logo_32.png").getImage();
  ImageIcon main_logo = new ImageIcon(getClass().getResource("images/main_logo.png"));


  TitledBorder titledBorder_filter = new TitledBorder("Filterauswahl");
  TitledBorder titledBorder_tables = new TitledBorder("Tabellenauswahl");
  EmptyBorder emptyBorder_filter = new EmptyBorder(0,0,0,0);
  EmptyBorder emptyBorder_tables = new EmptyBorder(0,0,0,0);
    
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

  

  
  /*------------------------VARIABLEN-----------------------------------------*/
  String loginname;
  boolean loginstate = false;

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
    
    /*           FILTER PANEL          */ 
    panel_filter.setBounds(370, 100, 300, 512);
    panel_filter.setOpaque(true);
    panel_home.add(panel_filter);
    //Objekte zum Panel hinzuf�gen
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

    
    label_logo.setBounds(390,25,500,66);
    label_logo.setIcon(main_logo);
    panel_login.add(label_logo);
    

    
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
    button_resetList.setText("Auswahl zur�cksetzen");
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

    
    //Alle ToolTipTexte setzen


    //Feste Objekte konfigurieren
    combobox_anrede.setModel(combobox_anredeModel);
    combobox_anredeModel.addElement("Herr");
    combobox_anredeModel.addElement("Frau");
    combobox_anredeModel.addElement("Dr."); 



    /*---------------------STARTBEDINGUNGEN-----------------------------------*/
    cl_filter.show(panel_filter, "NULL");
    setJMenuBar(menu_bar);
    setVisible(true);
    label_loginstatus.setBackground(null);
    menu_control();
    

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
  public int filterTesten(Component panel){
    JPanel usedPanel = (JPanel) panel;
    int error_counter = 0;
    for (Component cp: usedPanel.getComponents()) {
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
    return(error_counter);
      } 
  
  public void filterLeeren(Component panel){
    JPanel usedPanel = (JPanel) panel;
    for (Component cp: usedPanel.getComponents()){
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
  }
  
  public void filterAbfrage(int index){
    switch (index) {
      case 0:
        if(filterTesten(panel_artikel) > 0){
          optionpane_error_ShowDialog();
        }
        else {
          FilterValueContainer artikel = new FilterValueContainer("artikel", numberfield_artikelnr.getInt(), textfield_artikelname.getText(), numberfield_lieferantennr.getInt(),
          numberfield_kategorienr.getInt(), textfield_liefereinheit.getText(), numberfield_einzelpreis.getDouble(), numberfield_lagerbestand.getInt(), 
          numberfield_bestellteEinheiten.getInt(), numberfield_mindestbestand.getInt(), checkbox_auslaufartikel.isSelected());
          }
        filterLeeren(panel_artikel);  
        break;
      case 1:
        if(filterTesten(panel_bestelldetails) > 0){
          optionpane_error_ShowDialog();
        }
        else {
          FilterValueContainer bestelldetails = new FilterValueContainer("bestelldetails", numberfield_bestellnr.getInt(), numberfield_artikelnr.getInt(),
          numberfield_einzelpreis.getDouble(), numberfield_rabatt.getDouble());
        }
        filterLeeren(panel_bestelldetails);
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
    }   
  public void button_submit_ActionPerformed(ActionEvent evt) {
    filterAbfrage(list_tables.getSelectedIndex());
    
    //AKTIVE TABELLE ABFRAGEN
    //AM ENDE DAS OBJEKT EINER BESTIMMTEN Methode �BERGEBEN*
  }
      
    
  public void list_tables_ValueChanged(ListSelectionEvent evt) {
    if (!evt.getValueIsAdjusting()) {
      openFilterPanel(list_tables.getSelectedIndex());
    }  
  }
  
  public void optionpane_about_ShowDialog() {
    optionpane_about.showMessageDialog(this, panel_about, "�ber 'Nordwind-Tool'", optionpane_about.PLAIN_MESSAGE, null);
  }
  public void optionpane_error_ShowDialog() {
    optionpane_about.showMessageDialog(null, "Bitte g�ltige Zahlenwerte eingeben!", "Fehler!", JOptionPane.ERROR_MESSAGE);
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
        text = "Diese Funktion ist nur f�r angemeldete Benutzer verf�gbar";
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
    
    switch (index){
      case -1:
        cl_filter.show(panel_filter, "NULL");
        panel_filter.setBorder(emptyBorder_filter);
        panel_null.add(button_submit);
        button_submit.setBounds(1000,1000,0,0);
        break;

      case 0:
        ArtikelFilter artikel = new ArtikelFilter(panel_artikel);
        cl_filter.show(panel_filter, "ARTIKEL");
        break;

      case 1:
        BestelldetailsFilter bestelldetails = new BestelldetailsFilter(panel_bestelldetails);
        cl_filter.show(panel_filter, "BESTELLDETAILS");
        break;

      case 2:
        BestellungenFilter bestellungen = new BestellungenFilter(panel_bestellungen);
        cl_filter.show(panel_filter, "BESTELLUNGEN");
        break;

      case 3:
       KategorienFilter bestellungen = new KategorienFilter(panel_kategorien);
        cl_filter.show(panel_filter, "KATEGORIEN");
        break;

      case 4:
        KundenFilter kunden = new KundenFilter(panel_kunden);
        cl_filter.show(panel_filter, "KUNDEN");
        break;
        
      case 5:
        LieferantenFilter lieferanten = new LieferantenFilter(panel_lieferanten);
        panel_lieferanten.add(button_submit);
        cl_filter.show(panel_filter, "LIEFERANTEN");
        break;
        
      case 6:
        PersonalFilter personal = new PersonalFilter(panel_personal);
        cl_filter.show(panel_filter, "PERSONAL");
        break;
        
      case 7:
        VersandfirmenFilter versandfirmen = new VersandfirmenFilter(panel_versandfirmen);
        cl_filter.show(panel_filter, "VERSANDFIRMEN");
        break;
          
      default:
        System.out.println("Fataler Fehler. Bitte Admin kontaktieren"); 
    }
  }
  // Ende Methoden
}
