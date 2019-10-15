import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*; //ARRAYS


/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 13.10.2019
 * @author 
 */

public class test extends JFrame implements ActionListener {
  // Anfang Attribute
  private String confirm = "Confirm";
  private JButton button_login = new JButton();
  private JPasswordField field_password = new JPasswordField();
  private JLabel label_meldung = new JLabel();
  // Ende Attribute
  
  
  
  public test() { 
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 512; 
    int frameHeight = 93;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("test");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    setVisible(true);
    button_login.setBounds(313, 3, 75, 25);
    button_login.setText("LOGIN");
    button_login.setMargin(new Insets(2, 2, 2, 2));
    field_password.setBounds(106, 6, 198, 20);
    cp.add(field_password);
    cp.add(button_login);
    button_login.setActionCommand(confirm);
    field_password.setActionCommand(confirm);
    button_login.addActionListener(this);
    field_password.addActionListener(this);
    label_meldung.setBounds(105, 27, 198, 20);
    label_meldung.setText("");
    label_meldung.setHorizontalAlignment(SwingConstants.CENTER);
    label_meldung.setOpaque(true);
    cp.add(label_meldung);
  }
    // Anfang Komponenten
    
    // Ende Komponenten
  // Anfang Methoden
  
  
  public static void main(String[] args) {
    new test();
  } 
  
  public void actionPerformed(ActionEvent e){
     String actionCommand = e.getActionCommand();
     
    if(confirm.equals(actionCommand)){
      char[] input = field_password.getPassword();
      if(input.length == 0){
        label_meldung.setBackground(null);
        label_meldung.setText("Bitte Passwort eingeben");
        System.out.println("Bitte geben Sie ein Passwort ein");
        }
      else if(password_check(input)){
        label_meldung.setBackground(Color.GREEN);
        label_meldung.setText("Korrektes Passwort");
        System.out.println("Korrektes Passwort"); 
      }
      else {   
      label_meldung.setBackground(Color.RED);                                  
      label_meldung.setText("Falsches Passwort");
      System.out.println("Falsches Passwort");    
      }
  
    Arrays.fill(input, '0'); //F�LLT ARRAY MIT 0 UM PASSW�RTER ZU L�SCHEN      
    field_password.selectAll();
    field_password.requestFocusInWindow();;
    }
  }
  
  private static boolean password_check(char[] input){
    boolean return_variable = true;
    char[] password = {'A', 'B', 'C'};
    if(input.length != password.length){
      return_variable = false;
    }
    else {
      return_variable = Arrays.equals(input, password);    
      }
    Arrays.fill(password, '0');
    return return_variable;
  }
  // Ende Methoden
  
  
}



