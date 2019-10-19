import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

// Autor: Julian Krieger
// Datum: 15.10.2019

public class menu extends JFrame {
  // Anfang Attribute
  private JMenuBar menu_bar = new JMenuBar();
  
  private JMenu menu_erstellen = new JMenu("Erstellen");
  private JMenu menu_aendern = new JMenu("Ändern");
  private JMenu menu_abfragen = new JMenu("Abfragen");
  
  private JMenuItem item_abfragen_artikel = new JMenuItem("Artikel");
  private JMenuItem item_abfragen_personal = new JMenuItem("Peronal");
  
  private JMenuItem menu_aendern_artikel = new JMenuItem("Artikel");
  private JMenuItem menu_aendern_personal = new JMenuItem("Personal");
  
  private JMenuItem menu_erstellen_artikel = new JMenuItem("Artikel");
  private JMenuItem menu_erstellen_personal = new JMenuItem("Personal");
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
    menu_aendern.add(menu_aendern_personal);
    menu_aendern.add(menu_aendern_artikel);
    menu_erstellen.add(menu_erstellen_artikel);
    menu_erstellen.add(menu_erstellen_personal);
    menu_abfragen.add(item_abfragen_artikel);
    menu_abfragen.add(item_abfragen_personal);
    
    menu_bar.add(menu_erstellen);
    menu_bar.add(menu_aendern);
    menu_bar.add(menu_abfragen);
    // jMenu1.setMnemonic(KeyEvent.VK_A);  Tastenkürzel um Menü zu öffnen
    // Ende Komponenten
     
    setJMenuBar(menu_bar);
    setVisible(true);
    
    menu_aendern_artikel.addActionListener(new ActionListener() {
            // Beim Drücken des Menüpunktes wird actionPerformed aufgerufen
            public void actionPerformed(ActionEvent e) {
                System.out.println("Sucks");
            }
    }); 
    
    menu_aendern_personal.addActionListener(new ActionListener() {
            // Beim Drücken des Menüpunktes wird actionPerformed aufgerufen
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hard");
            }
    });
    
    menu_erstellen_artikel.addActionListener(new ActionListener() {
            // Beim Drücken des Menüpunktes wird actionPerformed aufgerufen
            public void actionPerformed(ActionEvent e) {
                System.out.println("Sucks");
            }
    }); 
    
    menu_erstellen_personal.addActionListener(new ActionListener() {
            // Beim Drücken des Menüpunktes wird actionPerformed aufgerufen
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hard");
            }
    });
  }
  
  // Anfang Methoden
 
  public static void main(String[] args) {
    new menu();
  }
}

