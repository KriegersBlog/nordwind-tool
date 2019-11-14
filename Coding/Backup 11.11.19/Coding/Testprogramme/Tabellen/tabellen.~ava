import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.*;

// Autor: Julian Krieger
// Datum: 17.10.2019

public class tabellen extends JFrame {
  // Anfang Attribute 
  private JButton jButton1 = new JButton();
  private JPanel panel_tabelle = new JPanel(null, true);
  // Ende Attribute
  
  public tabellen() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 496; 
    int frameHeight = 300;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("tabellen");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    Object[][] data = {
    {
      "Hans", "Zimmer", "Irgendwo", "45355", "Hollywood"},{
    "Hans", "Zimmer", "Irgendwo", "45355", "Hollywood"}} ;
    jButton1.setBounds(180, 17, 75, 25);
    jButton1.setText("jButton1");
    jButton1.setMargin(new Insets(2, 2, 2, 2));
    jButton1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton1_ActionPerformed(evt);
      }
    });
    cp.add(jButton1);
    panel_tabelle.setBounds(60, 56, 300, 150);
    panel_tabelle.setOpaque(false);
    cp.add(panel_tabelle);
    // Ende Komponenten
    
    setVisible(true);
  }
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new tabellen();
  }
  public void jButton1_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    //DATENSÄTZE ABFRAGEN();
    //DATENSÄTZE ZÄHLEN();
    //SPALTEN ABFRAGEN(); + ANZAHL SPALTEN
    //datensätze und spalten bei konstruktor benutzen | Object[], Object[]
    JTable tabelle = new JTable(5, 5);
    DefaultTableModel jTable1Model = (DefaultTableModel) tabelle.getModel();
    JScrollPane jTable1ScrollPane = new JScrollPane(tabelle);
    jTable1ScrollPane.setBounds(0, 0, 300, 150);
    tabelle.getColumnModel().getColumn(0).setHeaderValue("Title 1");
    tabelle.getColumnModel().getColumn(1).setHeaderValue("Title 2");
    tabelle.getColumnModel().getColumn(2).setHeaderValue("Title 3");
    tabelle.getColumnModel().getColumn(3).setHeaderValue("Title 4");
    tabelle.getColumnModel().getColumn(4).setHeaderValue("Title 5");
    this.panel_tabelle.add(jTable1ScrollPane);
  }

  // Ende Methoden
}

