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
  private JNumberField jNumberField1 = new JNumberField();
  private JButton jButton1 = new JButton();
  private JComboBox<String> jComboBox1 = new JComboBox<String>();
    private DefaultComboBoxModel<String> jComboBox1Model = new DefaultComboBoxModel<String>();
  
  DateFormat normalDateFormat = new SimpleDateFormat("dd.MM.yyyy");
  JFormattedTextField dateField = new JFormattedTextField(normalDateFormat);
  // Ende Attribute
  
  public testt() { 
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
    setTitle("testt");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    dateField.setBounds(10,10,150,20);
    cp.add(dateField);
    
    
    jNumberField1.setBounds(93, 91, 75, 20);
    jNumberField1.setText("");
    cp.add(jNumberField1);
    jButton1.setBounds(61, 176, 75, 25);
    jButton1.setText("jButton1");
    jButton1.setMargin(new Insets(2, 2, 2, 2));
    jButton1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton1_ActionPerformed(evt);
      }
    });
    cp.add(jButton1);
    jComboBox1.setModel(jComboBox1Model);
    jComboBox1Model.addElement("Herr");
    jComboBox1Model.addElement("Frau");
    jComboBox1Model.addElement("Dr.");
    jComboBox1.setBounds(25, 125, 150, 20);
    
    cp.add(jComboBox1);
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
    System.out.println(test);
    }
    catch(Exception e){
      System.out.println("test");
      }      
    if(jNumberField1.isNumeric()){
      
  System.out.println(jNumberField1.getInt());
    }

  }

  // Ende Methoden
}

