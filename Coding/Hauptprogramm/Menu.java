package Hauptprogramm;
// Autor: Julian Krieger
// Datum: 13.11.2019

import javax.swing.*;
import java.util.*;
import java.awt.*; //Font + Color
import javax.swing.border.TitledBorder;
import javax.swing.border.EmptyBorder;
import java.awt.font.TextAttribute;
import java.awt.event.*;

public class Menu{
    JOptionPane main_optionpane;
    JPanel main_aboutPanel;
    JMenuBar main_menuBar;

    JMenu main_menu_dml;
    JMenu main_menu_admin;
    JMenu main_menu_info;
    JMenuItem main_item_query;
    JMenuItem main_item_create;
    JMenuItem main_item_edit;
    JMenuItem main_item_home;
    //Menü Admin
    JMenuItem main_item_rightAdministration;
    JMenuItem main_item_userAdministration;

    //Menü Info
    JMenuItem main_item_about;




    public Menu(){
        /* OBJEKTE ERSTELLEN */

        //Icons für Menüitems
        ImageIcon info = new ImageIcon("images/about.png");
        ImageIcon admin = new ImageIcon("images/admin.png");
        ImageIcon create = new ImageIcon("images/create.png");
        ImageIcon edit = new ImageIcon("images/edit.png");
        ImageIcon query = new ImageIcon("images/query.png");
        ImageIcon user = new ImageIcon("images/user.png");
        ImageIcon home = new ImageIcon("images/home.png");

        //Erstellen der Menüleiste
        JMenuBar menu_bar = new JMenuBar();
        this.main_menuBar = menu_bar;

        //Menues erstellen
         JMenu menu_dml = new JMenu("Funktionen");
         this.main_menu_dml = menu_dml;
         JMenu menu_admin = new JMenu("Admin");
         this.main_menu_admin = menu_admin;
         JMenu menu_info = new JMenu("Info");
         this.main_menu_info = menu_info;

        /* Menüitems */
        //Menü DML
         JMenuItem item_query = new JMenuItem("Abfragen erstellen", query);
         this.main_item_query = item_query;
         JMenuItem item_create = new JMenuItem("Datensaetze anlegen", create);
         this.main_item_create = item_create;
         JMenuItem item_edit = new JMenuItem("Datensaetze editieren", edit);
         this.main_item_edit = item_edit;
         JMenuItem item_home = new JMenuItem("Home", home);
         this.main_item_home = item_home;
        //Menü Admin
         JMenuItem item_rightAdministration = new JMenuItem("Rechteverwaltung", admin);
         this.main_item_rightAdministration = item_rightAdministration;
         JMenuItem item_userAdministration = new JMenuItem("Benutzerverwaltung", user);
         this.main_item_userAdministration = item_userAdministration;

        //Menü Info
         JMenuItem item_about = new JMenuItem("�ber 'Nordwind - Tool'", info);
         this.main_item_about = item_about;

        //Menüitem Info -> Alle Objekte
        JLabel label_about_versionAutor =  new JLabel();
        JLabel label_githubProject = new JLabel();
        JLabel label_readMe = new JLabel();
        JLabel label_githubUser = new JLabel();

        JPanel panel_versionAutor = new JPanel(null, true);
        JPanel panel_links = new JPanel(null, true);
        JPanel panel_about = new JPanel(null, true);
        this.main_aboutPanel = panel_about;
        JOptionPane optionpane_about = new JOptionPane();
        main_optionpane = optionpane_about;
        TitledBorder titledBorder_versionAutor = new TitledBorder("Version und Autor");
        TitledBorder titledBorder_links = new TitledBorder("Links");

        /*HINZUFÜGEN DER MENÜS/MENÜITEMS*/
        //Menüs der Menüleiste hinzufügen
        menu_bar.add(menu_dml);
        menu_bar.add(menu_admin);
        menu_bar.add(menu_info);

        //Menüitems zu Menü DML hinzufügen
        menu_dml.add(item_query);
        menu_dml.add(item_create);
        menu_dml.add(item_edit);
        menu_dml.addSeparator();
        menu_dml.add(item_home);

        //Menüitems zu Menü Admin hinzufügen
        menu_admin.add(item_rightAdministration);
        menu_admin.add(item_userAdministration);

        //Menüitem zu Menü Info hinzufügen
        menu_info.add(item_about);

        /***Konfiguration der Objekte des Info Fensters***/

        //Label "label_about_versionAuthor"
        label_about_versionAutor.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
        String msg = "<html>Nordwind-Tool 0.9.3, 24.10.19<br>Made by Julian Krieger</html>";
        label_about_versionAutor.setText(msg);
        label_about_versionAutor.setHorizontalAlignment(JLabel.CENTER);

        label_about_versionAutor.setBounds(0,10,200,50);

        //Label "label_githubProject"
        label_githubProject.setBounds(0,10,200,25);
        label_githubProject.setForeground(Color.BLUE);
        label_githubProject.setText("Projekt auf Github");
        label_githubProject.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
        label_githubProject.setHorizontalAlignment(JLabel.CENTER);
        Hashtable<TextAttribute, Object> label_githubProject_map = new Hashtable<TextAttribute, Object>();
        label_githubProject_map.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        label_githubProject.setFont(new Font(label_githubProject_map));
        panel_links.add(label_githubProject);

        //Label "label_readMe"
        label_readMe.setBounds(0,50,200,25);
        label_readMe.setForeground(Color.BLUE);
        label_readMe.setText("ReadMe lesen");
        label_readMe.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
        label_readMe.setHorizontalAlignment(JLabel.CENTER);
        Hashtable<TextAttribute, Object> label_readMe_map = new Hashtable<TextAttribute, Object>();
        label_readMe_map.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        label_readMe.setFont(new Font(label_readMe_map));
        panel_links.add(label_readMe);

        //Label "label_githubUser"
        label_githubUser.setBounds(0,30,200,25);
        label_githubUser.setForeground(Color.BLUE);
        label_githubUser.setText("Autor auf Github");
        label_githubUser.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
        label_githubUser.setHorizontalAlignment(JLabel.CENTER);
        Hashtable<TextAttribute, Object> label_githubUser_map = new Hashtable<TextAttribute, Object>();
        label_githubUser_map.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        label_githubUser.setFont(new Font(label_githubUser_map));
        panel_links.add(label_githubUser);
        //Panels
        panel_versionAutor.setBorder(titledBorder_versionAutor);
        panel_versionAutor.setBounds(20,0,200,60);
        panel_versionAutor.add(label_about_versionAutor);

        panel_links.setBorder(titledBorder_links);
        panel_links.setBounds(20,60,200,80);

        panel_about.add(panel_versionAutor);
        panel_about.add(panel_links);
        panel_about.setPreferredSize(new Dimension(0,140));
        panel_about.setSize(0,140);

        //Konfiguration des OptionPanes
        optionpane_about.setPreferredSize(new Dimension(0,140));
        optionpane_about.setSize(0,140);


        /* ALLE ACTIONLISTENER */
        item_query.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("HIER ENSTEHT DAS MODUL 'RECHTEVERWALTUNG'");
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


        item_about.addActionListener(new ActionListener() {;
            public void actionPerformed(ActionEvent e) {
                optionpane_about_ShowDialog();
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


        label_readMe.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                try {
                    String url = "https://github.com/KriegersBlog/nordwind-tool/blob/master/README.md";
                    java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
                }
                catch (java.io.IOException ex) {
                    System.out.println("Bitte Admin kontaktieren:" + ex.getMessage());
                }
            }
        });
    }

    public JMenuBar getMenuBar(){
        return this.main_menuBar;
    }

    public void menu_control(boolean loginstate){
        boolean insert;
        String text;
        if(loginstate == true){
            insert = true;
            text = null;
        }

        else{
            insert = false;
            text = "Diese Funktion ist nur fuer angemeldete Benutzer verf�gbar";
            //label_loginname.setText(null); //LEEREN - DATENSCHUTZ
        }

        this.main_menu_dml.setEnabled(insert);
        this.main_menu_admin.setEnabled(insert);

        this.main_item_query.setEnabled(insert);
        this.main_item_create.setEnabled(insert);
        this.main_item_edit.setEnabled(insert);
        this.main_item_home.setEnabled(insert);

        this.main_menu_dml.setToolTipText(text);
        this.main_menu_admin.setToolTipText(text);

        //cl_main.show(panel_main, "LOGIN");
    }

    public void optionpane_about_ShowDialog() {
        this.main_optionpane.showMessageDialog(null, main_aboutPanel,"Ueber 'Nordwind-Tool'", this.main_optionpane.PLAIN_MESSAGE, null);
    }

}
