import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.Hashtable;
import java.awt.font.TextAttribute;

import javax.swing.border.TitledBorder;


// Autor: Julian Krieger
// Datum: 24.10.2019

public class abf extends JFrame {
  // Anfang Attribute
  private JOptionPane jOptionPane1 = new JOptionPane();
  private JPanel jPanel1 = new JPanel(null, true);
    private JLabel jLabel1 = new JLabel();
    private JLabel jLabel2 = new JLabel();
  private JButton jButton2 = new JButton();    
  TitledBorder titledBorder_test= new TitledBorder("Version und Autor");
  private JLabel jLabel3 = new JLabel();
  private JMenuItem testItem = new JMenuItem("bla");
  // Ende Attribute
  
  public abf() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 541; 
    int frameHeight = 404;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("abf");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    jPanel1.setBounds(231, 129, 100, 220);
    jPanel1.setOpaque(false);
    jButton2.setBounds(83, 241, 75, 25);
    jButton2.setText("jButton2");
    jButton2.setMargin(new Insets(2, 2, 2, 2));
    jButton2.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton2_ActionPerformed(evt);
      }
    });
    cp.add(jButton2);
    jLabel1.setBounds(15, 14, 110, 20);
    jLabel1.setText("text");
    jPanel1.add(jLabel1);
    jLabel2.setBounds(46, 152, 110, 20);
    jLabel2.setText("text");
    jPanel1.add(jLabel2);
    jLabel3.setBounds(136, 41, 110, 20);
    jLabel3.setText("text");
    Hashtable<TextAttribute, Object> jLabel3_map = new Hashtable<TextAttribute, Object>();
    jLabel3_map.put(TextAttribute.FAMILY, "Dialog");
    jLabel3_map.put(TextAttribute.SIZE, new Integer(12));
    jLabel3_map.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
    jLabel3.setFont(new Font(jLabel3_map));
    jLabel3.setForeground(Color.BLUE);
    cp.add(jLabel3);
    // Ende Komponenten
    jOptionPane1.setPreferredSize(new Dimension(1100, 1100));
    jPanel1.setBorder(titledBorder_test);
    setVisible(true);
    jOptionPane1.setSize(5100, 2010);
    jPanel1.setPreferredSize(new Dimension(1100, 1100));
    jPanel1.setSize(5100, 2010);
  }
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new abf();
  }
  public void jOptionPane1_ShowDialog() {
    JOptionPane.showMessageDialog(this, jPanel1, "", JOptionPane.ERROR_MESSAGE);
  }

  public void jButton2_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    jOptionPane1_ShowDialog();
    System.out.println(testItem.getSize());
  }

  // Ende Methoden
}

