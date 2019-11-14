import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.math.BigInteger;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;

import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

// Autor: Julian Krieger
// Datum: 20.10.2019

public class PasswortTool extends JFrame {
  // Anfang Attribute
  private JPasswordField passwordfield_erzeugen = new JPasswordField();
  private JButton button_erzeugen = new JButton();
  private JTextField textfield_erzeugen = new JTextField();
  private JLabel label_hashErzeugen = new JLabel();
  private JLabel label_hashTesten = new JLabel();
  private JPasswordField passwordfield_testen = new JPasswordField();
  private JTextField textfield_testen = new JTextField();
  private JButton button_testen = new JButton();
  private JLabel label_testen = new JLabel();
  // Ende Attribute
  
  
  public PasswortTool() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 300; 
    int frameHeight = 319;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("passwordtester");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    passwordfield_erzeugen.setBounds(61, 33, 150, 20);
    cp.add(passwordfield_erzeugen);
    button_erzeugen.setBounds(100, 84, 75, 25);
    button_erzeugen.setText("Erzeugen");
    button_erzeugen.setMargin(new Insets(2, 2, 2, 2));
    button_erzeugen.addActionListener(new ActionListener(){ 
      public void actionPerformed(ActionEvent evt) { 
        button_erzeugen_ActionPerformed(evt);
      }
    });
    cp.add(button_erzeugen);
    textfield_erzeugen.setBounds(61, 60, 150, 20);
    textfield_erzeugen.setEditable(false);
    textfield_erzeugen.setText("");
    cp.add(textfield_erzeugen);
    label_hashErzeugen.setBounds(76, 7, 115, 26);
    label_hashErzeugen.setText("Hash erzeugen");
    label_hashErzeugen.setHorizontalAlignment(SwingConstants.CENTER);
    label_hashErzeugen.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
    cp.add(label_hashErzeugen);
    label_hashTesten.setBounds(84, 132, 110, 26);
    label_hashTesten.setText("Hash testen");
    label_hashTesten.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
    label_hashTesten.setHorizontalAlignment(SwingConstants.CENTER);
    cp.add(label_hashTesten);
    passwordfield_testen.setBounds(61, 164, 150, 20);
    cp.add(passwordfield_testen);
    textfield_testen.setBounds(61, 191, 150, 20);
    cp.add(textfield_testen);
    button_testen.setBounds(103, 216, 75, 25);
    button_testen.setText("Testen");
    button_testen.setMargin(new Insets(2, 2, 2, 2));
    button_testen.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        button_testen_ActionPerformed(evt);
      }
    });
    cp.add(button_testen);
    label_testen.setBounds(85, 245, 110, 20);
    label_testen.setText("");
    label_testen.setHorizontalAlignment(SwingConstants.CENTER);
    cp.add(label_testen);
    // Ende Komponenten
    
    setVisible(true);
  }
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new PasswortTool();
  }
  public void button_erzeugen_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    try {
      char[] passwort = passwordfield_erzeugen.getPassword();
      String generatedHash = PasswordHasher.generateStrongPasswordHash(passwort);
      textfield_erzeugen.setText(generatedHash);
    }
    catch(NoSuchAlgorithmException x) {
      System.out.println("NoSuchAlgorithmExpcetion catched!");
    }
    catch(InvalidKeySpecException x){
      System.out.println("InvalidKeySpecException catched!");  
    }
     
  }

  public void button_testen_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    try {
      char[] passwort = passwordfield_testen.getPassword();
      String vergleich = textfield_testen.getText();
      boolean wert = PasswordHasher.validatePassword(passwort, vergleich);
      label_testen.setText(""+ wert); 
    }
    catch(NoSuchAlgorithmException x) {
      System.out.println("NoSuchAlgorithmExpcetion catched!");
    }
    catch(InvalidKeySpecException x){
      System.out.println("InvalidKeySpecException catched!");  
    }
    
    
    
     
  }

  // Ende Methoden
}

