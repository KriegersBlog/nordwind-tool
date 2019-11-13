// Autor: Julian Krieger
// Datum: 13.11.2019

import javax.swing.*;
import java.awt.event.*;

public class Menu{
    public Menu(){
        ImageIcon info = new ImageIcon("images/about.png");
        ImageIcon admin = new ImageIcon("images/admin.png");
        ImageIcon create = new ImageIcon("images/create.png");
        ImageIcon edit = new ImageIcon("images/edit.png");
        ImageIcon query = new ImageIcon("images/query.png");
        ImageIcon user = new ImageIcon("images/user.png");
        ImageIcon home = new ImageIcon("images/home.png");
         JMenuBar menu_bar = new JMenuBar();

        //Menues erstellen
         JMenu menu_dml = new JMenu("Funktionen");
         JMenu menu_admin = new JMenu("Admin");
         JMenu menu_info = new JMenu("Info");

        //Menueitems erstellen
        //Fuer menu_dml
         JMenuItem item_query = new JMenuItem("Abfragen erstellen", query);
         JMenuItem item_create = new JMenuItem("Datens�tze anlegen", create);
         JMenuItem item_edit = new JMenuItem("Datens�tze editieren", edit);
         JMenuItem item_home = new JMenuItem("Home", home);
        //Fuer menu_admin
         JMenuItem item_rightAdministration = new JMenuItem("Rechteverwaltung", admin);
         JMenuItem item_userAdministration = new JMenuItem("Benutzerverwaltung", user);

        //Fuer menu_info
         JMenuItem item_about = new JMenuItem("�ber 'Nordwind - Tool'", info);

        menu_dml.add(item_query);
        menu_dml.add(item_create);
        menu_dml.add(item_edit);
        menu_dml.addSeparator();
        menu_dml.add(item_home);

        //Items zu "menu_admin" hinzuf�gen
        menu_admin.add(item_rightAdministration);
        menu_admin.add(item_userAdministration);

        //Items zu "menu_info" hinzuf�gen
        menu_info.add(item_about);

        //Men�s zur Men�leiste hinzuf�gen
        menu_bar.add(menu_dml);
        menu_bar.add(menu_admin);
        menu_bar.add(menu_info);

        item_query.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label_function.setText("Abfragen erstellen");
                mode = "abfragen";
                button_mode = "Datens�tze abfragen";

                reset_filter();
                enable_listPanel();
            }
        });

        item_create.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label_function.setText("Datens�tze anlegen");
                mode = "erstellen";
                button_mode = "Datensatz anlegen";

                reset_filter();
                enable_listPanel();
            }
        });

        item_edit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label_function.setText("Datens�tze editieren");
                mode = "editieren";
                button_mode = "Datens�tze suchen";

                reset_filter();
                enable_listPanel();
            }
        });

        item_home.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                reset_filter();
                disable_listPanel();
            }
        });

        //Men�: "menu_admin"
        item_rightAdministration.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("HIER ENSTEHT DAS MODUL 'RECHTEVERWALTUNG'");
            }
        });

        item_userAdministration.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("HIER ENSTEHT DAS MODUL 'BENUTZERVERWALTUNG'");
            }
        });

        //Men�: "menu_info"
        item_about.addActionListener(new ActionListener() {;
            public void actionPerformed(ActionEvent e) {
                optionpane_about_ShowDialog();
            }
        });

        //Sonstige Actionlistener
        //Panel: "panel_login"


        passwordfield_login.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                login_process();
            }
        });

        label_logout.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                logout();
            }
        });

        label_githubProject.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                try {
                    String url = "https://github.com/KriegersBlog/nordwind-tool";
                    java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
                }
                catch (java.io.IOException ex) {
                    System.out.println("Bitte Admin kontaktieren:" + ex.getMessage());
                }
            }
        });

        label_githubUser.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                try {
                    String url = "https://github.com/KriegersBlog";
                    java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
                }
                catch (java.io.IOException ex) {
                    System.out.println("Bitte Admin kontaktieren:" + ex.getMessage());
                }
            }
        });
    }

}