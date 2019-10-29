import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

// Autor: Julian Krieger
// Datum: 27.10.2019

public class x extends JFrame {
  // Anfang Attribute
  private JNumberField jNumberField1 = new JNumberField();
  private JButton jButton1 = new JButton();
  private JTextField jTextField1 = new JTextField();
  private JButton jButton2 = new JButton();
  // Ende Attribute
  private String[] q = {
    "", "1", "2", "3", "4"};
  public x() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 300;
    int frameHeight = 300;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("x");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    jNumberField1.setBounds(103, 23, 75, 20);
    jNumberField1.setText("");
    cp.add(jNumberField1);
    jButton1.setBounds(105, 63, 75, 25);
    jButton1.setText("jButton1");
    jButton1.setMargin(new Insets(2, 2, 2, 2));
    jButton1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton1_ActionPerformed(evt);
      }
    });
    cp.add(jButton1);
    jTextField1.setBounds(79, 132, 150, 20);
    cp.add(jTextField1);
    jButton2.setBounds(93, 164, 75, 25);
    jButton2.setText("jButton2");
    jButton2.setMargin(new Insets(2, 2, 2, 2));
    jButton2.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton2_ActionPerformed(evt);
      }
    });
    cp.add(jButton2);
    // Ende Komponenten
    
    setVisible(true);
  }
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new x();
  }
  public void jButton1_ActionPerformed(ActionEvent evt) {
    for(int i = 0 ; i<5; i++) {
    System.out.println(q[i]);
  }
      }

  public void jButton2_ActionPerformed(ActionEvent evt) {
    System.out.println("Test: " + jTextField1.getText());
    
  }

  // Ende Methoden
}

