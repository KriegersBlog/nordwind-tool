import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

// Autor: Julian Krieger
// Datum: 15.10.2019

public class menu extends JFrame {
  // Anfang Attribute
  private JMenuBar menu_bar = new JMenuBar();
  private JMenuBar menu_barA = new JMenuBar();
  
  private JMenu menu_abfragen = new JMenu("Abfragen");
  private JMenu menu_anlegen = new JMenu("Anlegen");
  private JMenu menu_editieren = new JMenu("Editieren");
  private JMenu menu_admin = new JMenu("Admin");
  private JMenu menu_info = new JMenu("Info");
  private JMenu menu_dml = new JMenu("Funktionen");
  
  
  private JMenuItem item_abfragen = new JMenuItem("Abfrage erstellen");

  private JMenuItem item_anlegen = new JMenuItem("Datensätze anlegen");
  
  private JMenuItem item_editieren = new JMenuItem("Datensätze editieren");
  
  private JMenuItem item_admin_rechteverwaltung = new JMenuItem("Rechteverwaltung");
  private JMenuItem item_admin_benutzerverwaltung = new JMenuItem("Benutzerverwaltung");
  
  private JMenuItem item_info_info = new JMenuItem("Über 'Nordwind - Tool'");
  private JMenuItem item_info_hilfe = new JMenuItem("Hilfe");
  
  private JButton jButton1 = new JButton();
  // Ende Attribute
  public int test = 0;
  public menu() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 601; 
    int frameHeight = 436;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("menu");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    menu_admin.add(item_admin_rechteverwaltung);
    menu_admin.add(item_admin_benutzerverwaltung);
    menu_info.add(item_info_info);
    menu_info.add(item_info_hilfe);
    menu_info.setMnemonic(KeyEvent.VK_1);  //Tastenkürzel um Menü zu öffnen
    jButton1.setBounds(199, 133, 75, 25);
    jButton1.setText("jButton1");
    jButton1.setMargin(new Insets(2, 2, 2, 2));
    jButton1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton1_ActionPerformed(evt);
      }
    });
    cp.add(jButton1);
    // Ende Komponenten
     
    setVisible(true);
    
    item_abfragen.addActionListener(new ActionListener() {
            // Beim Drücken des Menüpunktes wird actionPerformed aufgerufen
            public void actionPerformed(ActionEvent e) {
                System.out.println("Item von 'Abfragen'");
            }
    }); 
    
    item_anlegen.addActionListener(new ActionListener() {
            // Beim Drücken des Menüpunktes wird actionPerformed aufgerufen
            public void actionPerformed(ActionEvent e) {
                System.out.println("Item von 'Anlegen'");
            }
    });
    
    item_editieren.addActionListener(new ActionListener() {
            // Beim Drücken des Menüpunktes wird actionPerformed aufgerufen
            public void actionPerformed(ActionEvent e) {
                System.out.println("Item von 'Editieren'");
            }
    }); 
  }
   public void jButton1_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    if(test == 0){
      altes_menu(); 
      test = 1;   
  }
    else {
      neues_menu();
      test = 0;
    }
    }
    
  // Anfang Methoden
 
  public static void main(String[] args) {
    new menu();
  

  // Ende Methoden
  }
  public void altes_menu(){
    menu_abfragen.add(item_abfragen);
    menu_anlegen.add(item_anlegen);
    menu_editieren.add(item_editieren);
    
    
    menu_bar.add(menu_abfragen);
    menu_bar.add(menu_anlegen);
    menu_bar.add(menu_editieren);
    menu_bar.add(menu_admin);
    menu_bar.add(menu_info);
    
    setJMenuBar(menu_bar);
    validate();
    }
  public void neues_menu(){
    menu_dml.add(item_abfragen);
    menu_dml.add(item_anlegen);
    menu_dml.add(item_editieren);
    
    menu_barA.add(menu_dml);
    menu_barA.add(menu_admin);
    menu_barA.add(menu_info);
    //item_abfragen.setEnabled(false);
    this.setJMenuBar(menu_barA);
    validate();
    
    
    
    }
}

