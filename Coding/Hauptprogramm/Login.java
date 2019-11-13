package Hauptprogramm;
// Autor: Julian Krieger
// Datum: 13.11.2019

import java.awt.event.*;
import javax.swing.*;
import dbQuery;

public class Login{

    public Login(){
        //LOGIN - PANEL
        JPanel panel_login = new JPanel(null, true);
        JLabel label_loginname = new JLabel();
        JLabel label_login = new JLabel();
        JLabel label_loginstatus = new JLabel();
        JPasswordField passwordfield_login = new JPasswordField();
        JButton button_login = new JButton();

        /*           LOGIN PANEL            */
        panel_login.setBounds(0, 0, 1366, 680);
        panel_login.setOpaque(false);
        panel_main.add(panel_login, "LOGIN");
        //LOGIN PANEL
        passwordfield_login.setBounds(525, 270, 230, 40);
        passwordfield_login.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
        passwordfield_login.setToolTipText("Passwort eingeben");
        panel_login.add(passwordfield_login);
        textfield_loginname.setBounds(525, 220, 230, 40);
        textfield_loginname.setText("");
        textfield_loginname.setToolTipText("Anmeldename eingeben");
        textfield_loginname.setHorizontalAlignment(SwingConstants.LEFT);
        textfield_loginname.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
        panel_login.add(textfield_loginname);

        button_login.setBounds(525, 320, 230, 35);
        button_login.setText("ANMELDEN");
        button_login.setMargin(new Insets(2, 2, 2, 2));
        button_login.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
        panel_login.add(button_login);

        label_login.setBounds(525, 185, 230, 40);
        label_login.setText("Bitte melden Sie sich an");
        label_login.setHorizontalAlignment(SwingConstants.CENTER);
        label_login.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
        panel_login.add(label_login);

        label_loginstatus.setBounds(525, 360, 230, 25);
        label_loginstatus.setText("");
        label_loginstatus.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
        label_loginstatus.setOpaque(true);
        label_loginstatus.setHorizontalAlignment(SwingConstants.CENTER);
        panel_login.add(label_loginstatus);
    }
    button_login.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            login_process();
        }
    });

    public void login_process(){
        loginname = textfield_loginname.getText();

        if(loginname.length() == 0){
            label_loginstatus.setText("Bitte Benutzernamen eingeben");
        }

        else {
            if(!dbQuery.checkName(loginname)){
                char[] passwordfield_input = passwordfield_login.getPassword();
                if(passwordfield_input.length == 0){
                    label_loginstatus.setText("Bitte Passwort eingeben");
                }

                else{
                    try{
                        if(PasswordHasher.validatePassword(passwordfield_input, dbQuery.getPassword(loginname))){
                            login();
                        }

                        else{
                            label_loginstatus.setBackground(Color.RED);
                            label_loginstatus.setText("Falsches Passwort");
                            Arrays.fill(passwordfield_input, '0'); //F�LLT ARRAY MIT 0 UM PASSW�RTER ZU L�SCHEN
                            passwordfield_login.selectAll();
                            passwordfield_login.requestFocusInWindow();
                        }
                    }
                    catch(Exception e){
                        System.out.println("Schwerwiegender Passwortfehler, bitte wenden Sie sich an einen Admin");
                        label_loginstatus.setText("Fehler: Bitte an Admin wenden");
                    }
                }
            }
            else{
                label_loginstatus.setBackground(Color.RED);
                label_loginstatus.setText("Benutzer existiert nicht!");
            }
        }
    }

}