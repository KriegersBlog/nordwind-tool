// Autor:Julian Krieger
// Datum: 13.11.2019

package Hauptprogramm;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.util.*;
import java.awt.*; //Font + Color
import javax.swing.border.*;

public class Liste{
  //Attribute der Klasse
  JPanel main_panel;
  JList main_list;
  TitledBorder main_titledBorder;
  EmptyBorder main_emptyBorder;

  public Liste(){
  //Erstellen der Liste + Reset Vutton
  JPanel panel_table = new JPanel(null, true);
  this.main_panel = panel_table;
  JList list_tables = new JList();
  this.main_list = list_tables;
  TitledBorder titled_border = new TitledBorder("Tabellenauswahl");
  this.main_titledBorder = titled_border;

  EmptyBorder empty_border = new EmptyBorder(0,0,0,0);
  this.main_emptyBorder = empty_border;
    
  DefaultListModel list_tablesModel = new DefaultListModel();
  JScrollPane list_tablesScrollPane = new JScrollPane(list_tables);
  JButton button_resetList = new JButton(); 
  
  //Setzen der Parameter fr die Tabelle Panels
  panel_table.setBounds(30, 100, 300, 472);
  panel_table.setOpaque(true);
  //panel_home.add(panel_table);
  
  //Setzen der Parameter fr die Objekte des Tabellenpanels
  button_resetList.setBounds(10, 420, 280, 40);
  button_resetList.setText("Auswahl zur?cksetzen");
  button_resetList.setMargin(new Insets(2, 2, 2, 2));
  button_resetList.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
  panel_table.add(button_resetList);
  
  list_tablesScrollPane.setBounds(10, 20, 280, 388);    
  list_tablesModel.addElement("artikel");
  list_tablesModel.addElement("bestelldetails");
  list_tablesModel.addElement("bestellungen");
  list_tablesModel.addElement("kategorien");
  list_tablesModel.addElement("kunden");
  list_tablesModel.addElement("lieferanten");
  list_tablesModel.addElement("personal");
  list_tablesModel.addElement("versandfirmen");  
  panel_table.add(list_tablesScrollPane);
  
  list_tables.setFont(new Font("Trebuchet MS", Font.BOLD, 36));
  list_tables.setModel(list_tablesModel);

    /***** LISTENER ERSTELLEN *****/
    list_tables.addListSelectionListener(new ListSelectionListener() {
    public void valueChanged(ListSelectionEvent evt) { 
      list_tables_ValueChanged(evt);
    }});

  button_resetList.addActionListener(new ActionListener() { 
    public void actionPerformed(ActionEvent evt) { 
      button_resetList_ActionPerformed(evt);
    }});

  } //ENDE DES KONSTRUKTORS
    
  public void button_resetList_ActionPerformed(ActionEvent evt) {
    this.main_list.clearSelection();
  }
  
  public void list_tables_ValueChanged(ListSelectionEvent evt) {
    if (!evt.getValueIsAdjusting()) {
      //Wenn Tabellenmodus Artikel -> ArtikelFilter Objekt starten, gib ihm


     /* openFilterPanel(this.main_list.getSelectedIndex()); */
    }  
  }
  
  public void enable_listPanel(){
    this.main_panel.setEnabled(true);
    this.main_panel.setVisible(true);
    this.main_panel.setBorder(this.main_titledBorder);
  }
  
  public void disable_listPanel(){
    this.main_panel.setEnabled(false);
    this.main_panel.setVisible(false);
    this.main_panel.setBorder(this.main_emptyBorder);
  }

  public JList getMain_list(){
    return this.main_list;
  }

  public void clearList(){
    this.main_list.clearSelection();
  }
}

