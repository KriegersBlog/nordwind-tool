package Hauptprogramm;
// Autor: Julian Krieger
// Datum: 13.11.2019

import java.awt.event.*;
import javax.swing.*;
import java.awt.font.TextAttribute;
import java.awt.*;
import java.util.Arrays;

public class Login {
    JPanel main_panel;
    String loginname;
    JTextField main_textfield_loginname;
    JLabel main_label_loginstatus;
    JPasswordField main_passwordfield_login;

    public Login() {
        //LOGIN - PANEL
        JPanel panel_login = new JPanel(null, true);
        this.main_panel = panel_login;
        JLabel label_login = new JLabel();
        JLabel label_loginstatus = new JLabel();
        this.main_label_loginstatus = label_loginstatus;
        JPasswordField passwordfield_login = new JPasswordField();
        this.main_passwordfield_login = passwordfield_login;
        JButton button_login = new JButton();
        ImageIcon main_logo = new ImageIcon(getClass().getResource("images/main_logo.png"));
        JTextField textfield_loginname = new JTextField();
        this.main_textfield_loginname = textfield_loginname;
        /*           LOGIN PANEL            */
        panel_login.setBounds(0, 0, 1366, 680);
        panel_login.setOpaque(false);
        //LOGIN PANEL
        passwordfield_login.setBounds(525, 270, 230, 40);
        passwordfield_login.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
        passwordfield_login.setToolTipText("Passwort eingeben");
        panel_login.add(passwordfield_login);
        panel_login.add(textfield_loginname);
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

        JLabel label_logo = new JLabel();
        label_logo.setBounds(390, 25, 500, 66);
        label_logo.setIcon(main_logo);
        panel_login.add(label_logo);


        label_loginstatus.setBounds(525, 360, 230, 25);
        label_loginstatus.setText("");
        label_loginstatus.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
        label_loginstatus.setOpaque(true);
        label_loginstatus.setHorizontalAlignment(SwingConstants.CENTER);
        panel_login.add(label_loginstatus);
        label_loginstatus.setBackground(null);

        passwordfield_login.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                login_process();
            }
        });
        button_login.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                login_process();
            }
        });


    }

    public JPanel getPanel() {
        return this.main_panel;
    }

    public void login_process() {
        loginname = this.main_textfield_loginname.getText();

        if (loginname.length() == 0) {
            this.main_label_loginstatus.setText("Bitte Benutzernamen eingeben");
        } else {
            if (!DBQuery.checkName(loginname)) {
                char[] passwordfield_input = this.main_passwordfield_login.getPassword();
                if (passwordfield_input.length == 0) {
                    this.main_label_loginstatus.setText("Bitte Passwort eingeben");
                } else {
                    try {
                        if (PasswordHasher.validatePassword(passwordfield_input, DBQuery.getPassword(loginname))) {
                            login();
                        } else {
                            this.main_label_loginstatus.setBackground(Color.RED);
                            this.main_label_loginstatus.setText("Falsches Passwort");
                            Arrays.fill(passwordfield_input, '0'); //F�LLT ARRAY MIT 0 UM PASSW�RTER ZU L�SCHEN
                            this.main_passwordfield_login.selectAll();
                            this.main_passwordfield_login.requestFocusInWindow();
                        }
                    } catch (Exception e) {
                        System.out.println("Schwerwiegender Passwortfehler, bitte wenden Sie sich an einen Admin");
                        this.main_label_loginstatus.setText("Fehler: Bitte an Admin wenden");
                    }
                }
            } else {
                this.main_label_loginstatus.setBackground(Color.RED);
                this.main_label_loginstatus.setText("Benutzer existiert nicht!");
            }
        }
    }

    public void login() {
        NordwindTool.getMenuObject().menu_control(true);
        String text = "Angemeldet als '" + this.main_textfield_loginname.getText() + "'";
        NordwindTool.setLoginName(text);
        this.main_textfield_loginname.setText("");
        this.main_passwordfield_login.setText("");
        this.main_label_loginstatus.setText("");
        this.main_label_loginstatus.setBackground(null);

        NordwindTool.activateHome();

        //disable_listPanel();
        //list_tables.clearSelection();
    }

}
