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
  private String confirm = "Confirm";
  private JButton button_login = new JButton();
  private JPasswordField field_password = new JPasswordField();
  
  
  
  public test() { 
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 639; 
    int frameHeight = 416;
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
    button_login.setBounds(337, 3, 75, 25);
    button_login.setText("LOGIN");
    button_login.setMargin(new Insets(2, 2, 2, 2));
    field_password.setBounds(154, 6, 150, 20);
    cp.add(field_password);
    cp.add(button_login);
    button_login.setActionCommand(confirm);
    field_password.setActionCommand(confirm);
    button_login.addActionListener(this);
    field_password.addActionListener(this);
  }
  
  
  public static void main(String[] args) {
    new test();
  } 
  
  public void actionPerformed(ActionEvent e){
     String actionCommand = e.getActionCommand();
     
    if(confirm.equals(actionCommand)){
      char[] input = field_password.getPassword();
      if(input.length == 0){
        System.out.println("Bitte geben Sie ein Passwort ein");
        }
      else if(password_check(input)){
        System.out.println("Korrektes Passwort"); 
      }
      else {
        
      System.out.println("Falsches Passwort");    
      }
  
    Arrays.fill(input, '0'); //FÜLLT ARRAY MIT 0 UM PASSWÖRTER ZU LÖSCHEN      
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
  
  
}



