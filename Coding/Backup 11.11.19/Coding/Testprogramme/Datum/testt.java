import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
// Autor: Julian Krieger
// Datum: 23.10.2019

public class testt extends JFrame {
  // Anfang Attribute
  private JButton jButton1 = new JButton();
  
  DateFormat normalDateFormat = new SimpleDateFormat("dd.MM.yyyy");
  JFormattedTextField dateField = new JFormattedTextField(normalDateFormat);
  private JOptionPane jOptionPane1 = new JOptionPane();
  // Ende Attribute
  
  public testt() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 190; 
    int frameHeight = 194;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("testt");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    dateField.setBounds(10,10,150,20);
    cp.add(dateField);
    
    
    jButton1.setBounds(29, 56, 75, 25);
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
  }
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new testt();
  }
  public void jButton1_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    try{
      Date sens = normalDateFormat.parse(dateField.getText()); 
      String test = normalDateFormat.format(sens);
      System.out.println(sens);  
      System.out.println(test);
    }
    catch(Exception e){
      System.out.println("test");
      }
      jOptionPane1_ShowDialog();  
  }

  public void jOptionPane1_ShowDialog() {
    JOptionPane.showMessageDialog(this, "test: \n" + "'Green eggs and ham'", "", JOptionPane.INFORMATION_MESSAGE);
  }

  // Ende Methoden
}

