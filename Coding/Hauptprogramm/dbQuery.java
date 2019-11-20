package Hauptprogramm;
import java.sql.*;

public class DBQuery{
  
  //Returns true if the username is free
  public static boolean checkName(String username){
    Statement stmt; //DK why, but its needed
    ResultSet rs; // Liefert Ergebnisse
    int counter = 0;
    
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      String url = "jdbc:mysql://localhost:3306/nordwind_tool";  
      Connection con = DriverManager.getConnection(url,"java", "java");      
      stmt = con.createStatement();                        
      rs = stmt.executeQuery("SELECT COUNT(*) from benutzer where benutzername ='"+username+"'"); 
      
      while (rs.next()){               
        counter = rs.getInt("COUNT(*)");     
      }
      con.close();
      if(counter == 0){
      return true;
      }
      else{
        return false;
        }
      
    }
    
     catch(Exception e) {
      System.out.println("Fehler bei der Datenbankabfrage");
    }
    return true;
    }
  
  //Gibt Passwort des Nutzers zur�ck
  public static String getPassword(String username){
    Statement stmt; //DK why, but its needed
    ResultSet rs; // Liefert Ergebnisse
    String password = null;
    
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      String url = "jdbc:mysql://localhost:3306/nordwind_tool";  
      Connection con = DriverManager.getConnection(url,"java", "java");      
      stmt = con.createStatement();                        
      rs = stmt.executeQuery("SELECT passwort from benutzer where benutzername ='"+username+"'"); 
      
      while (rs.next()){               
        password = rs.getString("passwort");     
      }
      con.close();
      if(password == null){
        return "Benutzer exisitiert nicht!";
        }
      return password;
    }
    
     catch(Exception e) {
      System.out.println("Fehler bei der Datenbankabfrage");
    }
    
    return "Error";
    }
  
  public static void createRecord(String table, String[] strings, int[] ints, double[] doubles, boolean[] bools){
    String command;
    try {
      if(table.equals("artikel")){
        Class.forName("com.mysql.cj.jdbc.Driver");    //Treiber einbinden
        String url = "jdbc:mysql://localhost:3306/nordwind";     //Datenbankverbindung angeben
        Connection con = DriverManager.getConnection(url,"java", "java");    // Verbindungsparameter angeben
        command = "insert into artikel(artikelnr, artikelname, lieferantennr, kategorienr, liefereinheit, einzelpreis, lagerbestand, bestellteeinheiten,mindestbestand, auslaufartikel)"
        + " values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement pStatement_artikel = con.prepareStatement(command);
        pStatement_artikel.setInt(1, ints[0]);
        pStatement_artikel.setString(2, strings[0]); 
        pStatement_artikel.setInt(3, ints[1]);
        pStatement_artikel.setInt(4, ints[2]);
        pStatement_artikel.setString(5,strings[0]);
        pStatement_artikel.setDouble(6, doubles[0]);    
        pStatement_artikel.setInt(7, ints[3]);   
        pStatement_artikel.setInt(8, ints[4]);  
        pStatement_artikel.setInt(9, ints[5]);
        if(bools[0]){
          pStatement_artikel.setInt(10, 1);
        }
        else {
          pStatement_artikel.setInt(10, 0);
        }
      pStatement_artikel.execute();
      con.close();  
      
      }
      else if(table.equals("bestelldetails")){
      }
      else if(table.equals("bestellungen")){
      }
      else if(table.equals("kategorien")){
      }
      else if(table.equals("kunden")){
      }    
      else if(table.equals("lieferanten")){
      }
      else if(table.equals("personal")){
      }
      else if(table.equals("versandfirmen")){
      }
      }
      catch(Exception e){
        System.out.println(e);  
      }
  }
    
  public static void createUser(String username, String password, String name, String surname, String email){
    try { 
      //MIT DB VERBINDEN
      Class.forName("com.mysql.cj.jdbc.Driver");    //Treiber einbinden
      String url = "jdbc:mysql://localhost:3306/nordwind_tool";     //Datenbankverbindung angeben
      Connection con = DriverManager.getConnection(url,"java", "java");    // Verbindungsparameter angeben
      
      //BEFEHL ANLEGEN
      String query = " insert into benutzer (benutzername, passwort, vorname, nachname, email)"
        + " values (?, ?, ?, ?, ?)";
      
      //PARAMETER IN BEFEHL EINF�GEN
      PreparedStatement preparedStmt = con.prepareStatement(query);
      preparedStmt.setString(1, username);
      preparedStmt.setString(2, password);
      preparedStmt.setString(3, name);
      preparedStmt.setString(4, surname);
      preparedStmt.setString(5, email);

      //BEFEHL AUSF�HREN
      preparedStmt.execute();
    
      //VERBINDUNG MIT DB TRENNEN
      con.close();
          
    } catch(Exception e) {
      System.out.println("Fehler bei der Erstellung des Benutzers!");
    }
  }
  
  public static void deleteUser(String username){
    if(!checkName(username)){ 
      try { 
        //MIT DB VERBINDEN
        Class.forName("com.mysql.cj.jdbc.Driver");    //Treiber einbinden
        String url = "jdbc:mysql://localhost:3306/nordwind_tool";     //Datenbankverbindung angeben
        Connection con = DriverManager.getConnection(url,"java", "java");    // Verbindungsparameter angeben
        
        //BEFEHL ANLEGEN
        String query = " delete from benutzer where benutzername ='"+username+"'";
        
        //PARAMETER IN BEFEHL EINF�GEN
        PreparedStatement preparedStmt = con.prepareStatement(query);
        //BEFEHL AUSF�HREN
        preparedStmt.execute();
      
        //VERBINDUNG MIT DB TRENNEN
        con.close();
            
      } catch(Exception e) {
        System.out.println("Fehler bei der L�schung des Benutzers!");
      
        }
      }
    }
}
