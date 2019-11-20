// Autor: Julian Krieger
// Datum: 15.10.2019

package Hauptprogramm;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.event.*;
import java.util.*;
import java.awt.font.TextAttribute;
import java.awt.image.*;
import javax.imageio.*;
import java.io.IOException;

public class NordwindTool extends JFrame {
    //Statische Attribute
    static String modus;
    static ArtikelFilter main_artikelFilter;
    static BestelldetailsFilter main_bestellDetailsFilter;
    static BestellungenFilter main_bestellungenFilter;
    static KategorieFilter main_kategorieFilter;
    static KundenFilter main_kundenFilter;
    static LieferantenFilter main_lieferantenFilter;
    static PersonalFilter main_personalFilter;
    static VersandfirmenFilter main_versandfirmenFilter;

    //Objektabhängige Attribute
    JPanel main_panel_filter;
    String fenstername;
    String loginname;
    boolean loginstate = false;
    JPanel main_panel_table;
    Menu main_menu;


    /*--------------------OBJEKTE INSTANZIIEREN---------------------------------*/
    //Bilder und Grafiken
    BufferedImage logo = null;
    ImageIcon main_logo = new ImageIcon(getClass().getResource("images/main_logo.png"));

    //Borders
    static TitledBorder titledBorder_filter = new TitledBorder("Filterauswahl");
    static EmptyBorder emptyBorder_filter = new EmptyBorder(0, 0, 0, 0);

    //Panels
    static JPanel panel_main = new JPanel(new CardLayout());
    static JPanel panel_home = new JPanel(null, true);
    private JLabel label_function = new JLabel();
    private JLabel label_logout = new JLabel();
    static JLabel label_loginname = new JLabel();
    static JPanel panel_filter = new JPanel(null, true);
    private JPanel panel_results = new JPanel(null, true);
    static Menu hauptmenu = new Menu();

    //CardLayout
    static CardLayout cl_main = (CardLayout) panel_main.getLayout();

    //LoginScreen
    Login loginscreen = new Login();

    public NordwindTool() {

        /*-----------------FRAME-INITIALISIERUNG----------------------------------*/
        super();
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        int frameWidth = 1280;
        int frameHeight = 720;
        setSize(frameWidth, frameHeight);
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (d.width - getSize().width) / 2;
        int y = (d.height - getSize().height) / 2;
        setLocation(x, y);
        setTitle("Nordwind Tool - Made by Julian Krieger");
        setResizable(false);
        Container cp = getContentPane();
        cp.setLayout(null);
        //Icon setzen
        try {
            logo = ImageIO.read(getClass().getResource("images/logo_32.png"));
            this.setIconImage(logo);
        } catch (IOException e) {
            System.out.println(e);
        }

        /***** Panels konfigurieren *****/

        /*           MAIN PANEL            */
        panel_main.setBounds(0, 0, 1366, 680);
        panel_main.setOpaque(false);
        cp.add(panel_main);
        panel_main.add(loginscreen.getPanel(), "LOGIN");

        /*           HOME PANEL            */
        panel_home.setBounds(0, 0, 1366, 680);
        panel_home.setOpaque(false);
        panel_main.add(panel_home, "HOME");

        /*           FILTER PANEL          */
        panel_filter.setBounds(370, 100, 300, 512);
        panel_filter.setOpaque(true);
        panel_home.add(panel_filter);

        /*           ERGEBNIS PANEL          */
        panel_results.setBounds(721, 104, 500, 536);
        panel_results.setOpaque(true);
        panel_results.setBackground(new Color(0xFFAFAF));
        panel_home.add(panel_results);

        /***** Objekte instanziieren *****/
        /*           HOME PANEL          */
        label_loginname.setBounds(1008, 2, 182, 20);
        label_loginname.setHorizontalAlignment(SwingConstants.RIGHT);
        panel_home.add(label_loginname);

        label_logout.setBounds(1196, 0, 70, 22);
        label_logout.setText("ABMELDEN");
        label_logout.setForeground(Color.BLUE);
        label_logout.setHorizontalAlignment(SwingConstants.CENTER);
        Hashtable<TextAttribute, Object> label_logout_map = new Hashtable<TextAttribute, Object>();
        label_logout_map.put(TextAttribute.FAMILY, "Trebuchet MS");
        label_logout_map.put(TextAttribute.SIZE, new Integer(12));
        label_logout_map.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        label_logout.setFont(new Font(label_logout_map));
        panel_home.add(label_logout);

        label_function.setFont(new Font("Trebuchet MS", Font.BOLD, 36));
        label_function.setText(null);
        label_function.setHorizontalAlignment(SwingConstants.CENTER);
        panel_home.add(label_function);
        label_function.setBounds(438, 4, 358, 48);


        /***** Hinzufügen von Listenern *****/
        label_logout.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                logout();
            }
        });
        this.fenstername = "mainFenster";

        /***** Startbedingungen *****/

        setJMenuBar(hauptmenu.getMenuBar());
        hauptmenu.menu_control(false);
        setVisible(true);
    } // ENDE DES KONSTRUKTORS

    /*------------------------MAIN METHODE--------------------------------------*/

    public static void main(String[] args) {
        NordwindTool mainFrame = new NordwindTool();
    }

    /*-----------------------ANDERE METHODEN-----------------------------------*/

    public static JPanel getMain_panel_filter() {
        return panel_filter;
    }

    public static void setTablePanel(JPanel panel) {
        panel_home.add(panel);
    }

    public static Menu getMenuObject() {
        return hauptmenu;
    }

    public void logout() {
        cl_main.show(panel_main, "LOGIN");
        Menu.disableList();
        hauptmenu.menu_control(false);
    }
    public static ArtikelFilter getMain_artikelFilter(){
       return main_artikelFilter;
    }

    public static BestelldetailsFilter getMain_bestelldetailsFilter(){
        return main_bestellDetailsFilter;
    }

    public static BestellungenFilter getMain_bestellungenFilter(){
        return main_bestellungenFilter;
    }

    public static KategorieFilter getMain_kategorieFilter(){
        return main_kategorieFilter;
    }

    public static KundenFilter getMain_kundenFilter(){
        return main_kundenFilter;
    }

    public static LieferantenFilter getMain_lieferantenFilter(){
        return main_lieferantenFilter;
    }

    public static PersonalFilter getMain_personalFilter(){
        return main_personalFilter;
    }

    public static VersandfirmenFilter getMain_versandfirmenFilter(){
        return main_versandfirmenFilter;
    }

    public static void openFilterPanel(int index) {
        Filter.clearFilter();
        panel_filter.setBorder(titledBorder_filter);

        switch (index) {
            case -1:
                panel_filter.setBorder(emptyBorder_filter);
                break;

            case 0:
                ArtikelFilter artikel = new ArtikelFilter(panel_filter);
                main_artikelFilter = artikel;
                break;

            case 1:
                BestelldetailsFilter bestelldetails = new BestelldetailsFilter(panel_filter);
                main_bestellDetailsFilter = bestelldetails;
                break;

            case 2:
                BestellungenFilter bestellungen = new BestellungenFilter(panel_filter);
                main_bestellungenFilter = bestellungen;
                break;

            case 3:
                KategorieFilter kategorie = new KategorieFilter(panel_filter);
                main_kategorieFilter =  kategorie;
                break;

            case 4:
                KundenFilter kunden = new KundenFilter(panel_filter);
                main_kundenFilter = kunden;
                break;

            case 5:
                LieferantenFilter lieferanten = new LieferantenFilter(panel_filter);
                main_lieferantenFilter = lieferanten;
                break;

            case 6:
                PersonalFilter personal = new PersonalFilter(panel_filter);
                main_personalFilter = personal;
                break;

            case 7:
                VersandfirmenFilter versandfirmen = new VersandfirmenFilter(panel_filter);
                main_versandfirmenFilter = versandfirmen;
                break;

            default:
                System.out.println("Fataler Fehler. Bitte Admin kontaktieren");
        }
    }

    public static void activateHome() {
        cl_main.show(panel_main, "HOME");
    }

    public static void setLoginName(String logintext) {
        label_loginname.setText(logintext);
    }
}
