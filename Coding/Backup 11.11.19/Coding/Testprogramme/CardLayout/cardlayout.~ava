import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

// Autor: Julian Krieger
// Datum: 18.10.2019

public class cardlayout extends JFrame{
  // Anfang Attribute
  private JPanel panel_layout = new JPanel(new CardLayout());
  private JPanel panel_home = new JPanel(null, true);
    private JLabel label_home = new JLabel();
  private JPanel panel_login = new JPanel(null, true);
    private JLabel label_login = new JLabel();
  private JButton jButton1 = new JButton();
  private JList jList1 = new JList();
    private DefaultListModel jList1Model = new DefaultListModel();
    private JScrollPane jList1ScrollPane = new JScrollPane(jList1);

  // Ende Attribute
  CardLayout cardLayout = (CardLayout) panel_layout.getLayout();
  public cardlayout() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 789; 
    int frameHeight = 631;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("cardlayout");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    
    // Anfang Komponenten
    
    panel_layout.setBounds(248, 117, 460, 324);
    panel_layout.setOpaque(false);
    panel_home.setBounds(296, 144, 324, 180);
    panel_home.setOpaque(true);
    label_home.setBounds(38, 24, 110, 20);
    label_home.setText("HOME");
    panel_home.add(label_home);
    panel_login.setBounds(360, 224, 180, 172);
    panel_login.setOpaque(true);
    label_login.setBounds(30, 72, 110, 28);
    label_login.setText("LOGIN");
    panel_login.add(label_login);
    panel_layout.add(panel_home, "HOME");
    panel_layout.add(panel_login, "LOGIN");
    cp.add(panel_layout);
    
    panel_login.setBackground(Color.WHITE);
    panel_home.setBackground(Color.GREEN);
    jButton1.setBounds(463, 86, 75, 25);
    jButton1.setText("jButton1");
    jButton1.setMargin(new Insets(2, 2, 2, 2));
    jButton1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton1_ActionPerformed(evt);
      }
    });
    cp.add(jButton1);
    jList1.setModel(jList1Model);
    jList1ScrollPane.setBounds(18, 212, 150, 100);
    jList1Model.addElement("T1");
    jList1Model.addElement("T2");
    jList1Model.addElement("T3");
    jList1Model.addElement("T4");
    jList1Model.addElement("T5");
    jList1.addListSelectionListener(new ListSelectionListener() { 
      public void valueChanged(ListSelectionEvent evt) { 
        jList1_ValueChanged(evt);
      }
    });
    cp.add(jList1ScrollPane);
    // Ende Komponenten
    
    setVisible(true);
  }
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new cardlayout();
    
    
  }
  public void jButton1_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen   
    
    cardLayout.show(panel_layout, "LOGIN");
  }

  public void jList1_ValueChanged(ListSelectionEvent evt) {
    // TODO hier Quelltext einfügen
      if (!evt.getValueIsAdjusting()){
      if(jList1.getSelectedIndex() == 0){
        cardLayout.show(panel_layout, "LOGIN"); 
        }
      if(jList1.getSelectedIndex() == 1){
        cardLayout.show(panel_layout, "HOME"); 
        }
        
   
  }
  }

  // Ende Methoden
}

