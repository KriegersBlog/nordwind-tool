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
    //Attribute der Klasse
    JPanel main_panel_filter;
    String loginname;
    boolean loginstate = false;
    String button_mode = null;
    String mode = null;
    JPanel main_panel_table;

    /*--------------------OBJEKTE INSTANZIIEREN---------------------------------*/
    //Bilder und Grafiken
    BufferedImage logo = null;
    ImageIcon main_logo = new ImageIcon(getClass().getResource("images/main_logo.png"));

    //Borders
    TitledBorder titledBorder_filter = new TitledBorder("Filterauswahl");
    EmptyBorder emptyBorder_filter = new EmptyBorder(0, 0, 0, 0);

    //Panels
    static JPanel panel_main = new JPanel(new CardLayout());
    static JPanel panel_home = new JPanel(null, true);
    private JLabel label_function = new JLabel();
    private JLabel label_logout = new JLabel();
    static JLabel label_loginname = new JLabel();
    static JPanel panel_filter = new JPanel(); //Haupt-Panel, auf dem alle Panels angzeigt werden
    private JPanel panel_results = new JPanel(null, true);

    //OptionPanes
    private JOptionPane optionpane_error = new JOptionPane();

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
      panel_main.add(loginscreen.getPanel(), "LOGIN");
      /*           MAIN PANEL            */
      panel_main.setBounds(0, 0, 1366, 680);
      panel_main.setOpaque(false);
      cp.add(panel_main);

      /*           HOME PANEL            */
      panel_home.setBounds(0, 0, 1366, 680);
      panel_home.setOpaque(false);
      panel_main.add(panel_home, "HOME");

      /*           FILTER PANEL          */
      panel_filter.setBounds(360, 576, 300, 532);
      panel_filter.setOpaque(true);
      panel_home.add(panel_filter);


      //HOME PANEL
      label_loginname.setBounds(1008, 2, 182, 20);
      label_loginname.setHorizontalAlignment(SwingConstants.RIGHT);
      panel_home.add(label_loginname);

      panel_results.setBounds(721, 104, 500, 536);
      panel_results.setOpaque(true);
      panel_results.setBackground(new Color(0xFFAFAF));
      panel_home.add(panel_results);

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

      /***** Startbedingungen *****/
      Menu hauptmenu = new Menu();
      setJMenuBar(hauptmenu.getMenuBar());
      setVisible(true);
    } // ENDE DES KONSTRUKTORS

    /*------------------------MAIN METHODE--------------------------------------*/

    public static void main(String[] args) {
        NordwindTool mainFrame = new NordwindTool();
    }

    /*------------------LISTENER METHODEN---------------------------------------*/

    public int filterTesten(Component panel) {
        JPanel usedPanel = (JPanel) panel;
        int error_counter = 0;
        for (Component cp : usedPanel.getComponents()) {
            if (cp instanceof JNumberField) {
                JNumberField nf = (JNumberField) cp;
                if (nf.getText().equals("")) {
                    nf.setInt(-1);
                } else if (!nf.isNumeric()) {
                    error_counter++;
                }
            } else if (cp instanceof JTextField) {
                JTextField tf = (JTextField) cp;
                if (tf.getText().equals("")) {
                    tf.setText(null);
                }
            }
        }
        return (error_counter);
    }

    public void filterLeeren(Component panel) {
        JPanel usedPanel = (JPanel) panel;
        for (Component cp : usedPanel.getComponents()) {
            if (cp instanceof JNumberField) {
                JNumberField nf = (JNumberField) cp;
                if (!nf.isNumeric()) {
                    nf.setInt(-1);
                }
                if (nf.getInt() == -1) {
                    nf.clear();
                }
            }
        }
    }

    public JPanel getMain_panel_filter() {
        return main_panel_filter;
    }
    public static void setTablePanel(JPanel panel){
        panel_home.add(panel);
    }

    public void optionpane_error_ShowDialog() {
        // *OBJEKTVONFILTER*.main_optionpane.showMessageDialog(null, "Bitte gueltige Zahlenwerte eingeben!", "Fehler!", JOptionPane.ERROR_MESSAGE);
    }


    public void logout() {
        cl_main.show(panel_main, "LOGIN");
        //menu_control();
    }

    public void clearFilter() {
        for (Component c : panel_filter.getComponents()) {
            if (c instanceof JTextField) {
                JTextField tf = (JTextField) c;
                tf.setText(null);
            } else if (c instanceof JNumberField) {
                JNumberField nf = (JNumberField) c;
                nf.clear();
            } else if (c instanceof JComboBox) {
                JComboBox cb = (JComboBox) c;
                cb.setSelectedIndex(0);
            } else if (c instanceof JCheckBox) {
                JCheckBox cb = (JCheckBox) c;
                cb.setSelected(false);
            } else if (c instanceof JFormattedTextField) {
                JFormattedTextField ftf = (JFormattedTextField) c;
                ftf.setText(null);
            }
        }
    }

    public static void reset_filter() {
        for (Component c : panel_filter.getComponents()) {
            c.setEnabled(false);
            c.setVisible(false);
            c = null;
        }
    }

    public void openFilterPanel(int index) {
        clearFilter();
        panel_filter.setBorder(titledBorder_filter);

        switch (index) {
            case -1:
                panel_filter.setBorder(emptyBorder_filter);
                break;

            case 0:
                ArtikelFilter artikel = new ArtikelFilter(panel_filter);
                break;

            case 1:
                BestelldetailsFilter bestelldetails = new BestelldetailsFilter(panel_filter);
                break;

            case 2:
                BestellungenFilter bestellungen = new BestellungenFilter(panel_filter);
                break;

            case 3:
                KategorieFilter kategorie = new KategorieFilter(panel_filter);
                break;

            case 4:
                KundenFilter kunden = new KundenFilter(panel_filter);
                break;

            case 5:
                LieferantenFilter lieferanten = new LieferantenFilter(panel_filter);
                break;

            case 6:
                PersonalFilter personal = new PersonalFilter(panel_filter);
                break;

            case 7:
                VersandfirmenFilter versandfirmen = new VersandfirmenFilter(panel_filter);
                break;

            default:
                System.out.println("Fataler Fehler. Bitte Admin kontaktieren");
        }
    }

    // Ende Methoden
    public static void activateHome() {
        cl_main.show(panel_main, "HOME");


    }

    public static void setLoginName(String logintext) {
        label_loginname.setText(logintext);
    }


}
  /*
  public void filterAbfrage(int index){
    switch (index) {
      case 0:
        if(filterTesten(panel_artikel) > 0){
          optionpane_error_ShowDialog();
        }
        else {
          FilterValueContainer artikel = new FilterValueContainer("artikel", numberfield_artikelnr.getInt(), textfield_artikelname.getText(), numberfield_lieferantennr.getInt(),
          numberfield_kategorienr.getInt(), textfield_liefereinheit.getText(), numberfield_einzelpreis.getDouble(), numberfield_lagerbestand.getInt(),
          numberfield_bestellteEinheiten.getInt(), numberfield_mindestbestand.getInt(), checkbox_auslaufartikel.isSelected());
          }
        filterLeeren(panel_artikel);
        break;
      case 1:
        if(filterTesten(panel_bestelldetails) > 0){
          optionpane_error_ShowDialog();
        }
        else {
          FilterValueContainer bestelldetails = new FilterValueContainer("bestelldetails", numberfield_bestellnr.getInt(), numberfield_artikelnr.getInt(),
          numberfield_einzelpreis.getDouble(), numberfield_rabatt.getDouble());
        }
        filterLeeren(panel_bestelldetails);
        break;
      case 2:

        break;
      case 3:

        break;
      case 4:

        break;
      case 5:

        break;
      case 6:

        break;
      case 7:

        break;
      default:

    }
  } */
