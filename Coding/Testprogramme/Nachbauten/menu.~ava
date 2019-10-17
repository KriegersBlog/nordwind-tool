import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

// Autor: Julian Krieger
// Datum: 15.10.2019

public class menu extends JFrame {
  // Anfang Attribute
  private JMenuBar menu_bar = new JMenuBar();
  
  private JMenu menu_abfragen = new JMenu("Abfragen");
  private JMenu menu_anlegen = new JMenu("Anlegen");
  private JMenu menu_editieren = new JMenu("Editieren");
  private JMenu menu_admin = new JMenu("Admin");
  private JMenu menu_info = new JMenu("Info");
  
  
  private JMenuItem item_abfragen = new JMenuItem("Neue Abfrage");

  private JMenuItem item_anlegen = new JMenuItem("Datensatz anlegen");
  
  private JMenuItem item_editieren = new JMenuItem("Datensätze editieren");
  
  private JMenuItem item_admin_rechteverwaltung = new JMenuItem("Rechteverwaltung");
  private JMenuItem item_admin_benutzerverwaltung = new JMenuItem("Benutzerverwaltung");
  
  private JMenuItem item_info_info = new JMenuItem("Info");
  private JMenuItem item_info_hilfe = new JMenuItem("Hilfe");
  
  // Ende Attribute
  
  public menu() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 601; 
    int frameHeight = 458;
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
    menu_abfragen.add(item_abfragen);
    menu_anlegen.add(item_anlegen);
    menu_editieren.add(item_editieren);
    menu_admin.add(item_admin_rechteverwaltung);
    menu_admin.add(item_admin_benutzerverwaltung);
    menu_info.add(item_info_info);
    menu_info.add(item_info_hilfe);
    
    menu_bar.add(menu_abfragen);
    menu_bar.add(menu_anlegen);
    menu_bar.add(menu_editieren);
    menu_bar.add(menu_admin);
    menu_bar.add(menu_info);
    // jMenu1.setMnemonic(KeyEvent.VK_A);  Tastenkürzel um Menü zu öffnen
    // Ende Komponenten
     
    setJMenuBar(menu_bar);
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
  
  // Anfang Methoden
 
  public static void main(String[] args) {
    new menu();
  }
}

