import java.sql.*;

public class dbQuery extends test {
  
  //Returns true if the username is free
  public static boolean checkName(String username){
    Statement stmt; //DK why, but its needed
    ResultSet rs; // Liefert Ergebnisse
    int counter = 0;
    
    try {
      Class.forName("com.mysql.jdbc.Driver");
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
      Class.forName("com.mysql.jdbc.Driver");
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
  
  public static void createUser(String username, String password, String name, String surname, String email){
    try { 
      //MIT DB VERBINDEN
      Class.forName("com.mysql.jdbc.Driver");    //Treiber einbinden
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
        Class.forName("com.mysql.jdbc.Driver");    //Treiber einbinden
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