import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

// Autor: Julian Krieger
// Datum: 21.10.2019

public class ObjekteTeilen extends JFrame {
  // Anfang Attribute
  private JPanel jPanel1 = new JPanel(null, true);
    private JLabel jLabel1 = new JLabel();
  private JPanel jPanel2 = new JPanel(null, true);
  private JButton jButton2 = new JButton();
  // Ende Attribute
  
  public ObjekteTeilen() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 1219; 
    int frameHeight = 613;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("ObjekteTeilen");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    jPanel1.setBounds(171, 103, 100, 100);
    jPanel1.setOpaque(false);
    cp.add(jPanel1);
    jPanel2.setBounds(341, 106, 100, 100);
    jPanel2.setOpaque(false);
    cp.add(jPanel2);
    jButton2.setBounds(236, 258, 75, 25);
    jButton2.setText("jButton2");
    jButton2.setMargin(new Insets(2, 2, 2, 2));
    jButton2.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton2_ActionPerformed(evt);
      }
    });
    cp.add(jButton2);
    jLabel1.setBounds(20, 34, 54, 20);
    jLabel1.setText("text");
    jPanel1.add(jLabel1);
    // Ende Komponenten
    
    setVisible(true);
  }
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new ObjekteTeilen();
  }
  public void jButton2_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einf�gen
    //WICHTIG:
    jPanel2.add(jLabel1); 
    jPanel1.remove(jLabel1);
    jLabel1.setBounds(0, 0, 54, 20);
    
    jPanel1.revalidate();
    jPanel1.repaint();
  }

  // Ende Methoden
}

