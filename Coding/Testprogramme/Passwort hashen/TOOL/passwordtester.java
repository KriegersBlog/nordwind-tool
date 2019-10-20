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

public class passwordtester extends JFrame {
  // Anfang Attribute
  private JPasswordField jPasswordField1 = new JPasswordField();
  private JLabel jLabel1 = new JLabel();
  private JButton jButton1 = new JButton();
  String lol = "1000:5b42403638343635636630:0a4130785c13a4dc10b41eadfe9e652aa610d6a2d2a4ea9bca59348e2856512c891791f7008409ae7bc866fb17e7f7da1985e019912fbadddc0e5459f12b3a33";
  // Ende Attribute
  
  
  public passwordtester() { 
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
    setTitle("passwordtester");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    jPasswordField1.setBounds(61, 17, 150, 20);
    cp.add(jPasswordField1);
    jLabel1.setBounds(87, 122, 110, 20);
    jLabel1.setText("text");
    cp.add(jLabel1);
    jButton1.setBounds(92, 60, 75, 25);
    jButton1.setText("jButton1");
    jButton1.setMargin(new Insets(2, 2, 2, 2));
    jButton1.addActionListener(new ActionListener(){ 
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
    new passwordtester();
  }
  public void jButton1_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    try {
      /*char[] passwort = jPasswordField1.getPassword();
      String generatedHash = PasswordHasher.generateStrongPasswordHash(passwort);
      System.out.println(generatedHash);   */
      
      
      char[] passwort = jPasswordField1.getPassword();
      boolean quark = PasswordHasher.validatePassword(passwort, lol);
      System.out.println(quark);              
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

