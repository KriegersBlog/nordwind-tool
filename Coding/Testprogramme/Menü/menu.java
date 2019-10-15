import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

// Autor: Julian Krieger
// Datum: 15.10.2019

public class menu extends JFrame {
  // Anfang Attribute
  private JMenuBar jMenuBar1 = new JMenuBar();
  private JMenu jMenu1 = new JMenu("Java");
  private JMenuItem jMenuItem1 = new JMenuItem("Sucks");
  private JMenuItem jMenuItem2 = new JMenuItem("Hard");
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
    jMenu1.add(jMenuItem1);
    setJMenuBar(jMenuBar1);
    jMenuBar1.add(jMenu1);
    // jMenu1.setMnemonic(KeyEvent.VK_A);  Tastenkürzel um Menü zu öffnen
    // Ende Komponenten
    setJMenuBar(jMenuBar1);
    jMenu1.add(jMenuItem2); 
    setVisible(true);
    
    jMenuItem1.addActionListener(new ActionListener() {
            // Beim Drücken des Menüpunktes wird actionPerformed aufgerufen
            public void actionPerformed(ActionEvent e) {
                System.out.println("Sucks");
            }
    }); 
    
    jMenuItem2.addActionListener(new ActionListener() {
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

