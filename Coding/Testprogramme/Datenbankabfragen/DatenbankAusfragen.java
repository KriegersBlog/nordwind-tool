// Autor: Julian Krieger
// Datum: 20.10.2019
import java.sql.*;

public class DatenbankAusfragen {
  
  public static void main(String[] args) {
    Statement stmt; //DK why, but its needed
    ResultSet rs; // Liefert Ergebnisse
    try {
      Class.forName("com.mysql.jdbc.Driver");             // Treiber einbinden
      String url = "jdbc:mysql://localhost:3306/nordwind_tool";  //Datenbankverbindung wird definiert
      Connection con = DriverManager.getConnection(url,"java", "java"); // Verbindung wird definiert: "DB, Name, PW"     
      stmt = con.createStatement(); // Statement, was auch immer, wird erstellt                          
      
      
      /*
        executeQuery gibt ein ResultSet zurück
        executeUpdate gibt INT zurück (Betroffene Datensätze)      
      */
      
      rs = stmt.executeQuery("SELECT * from benutzer"); // Ergebnisse = AusführenVonBefehl
      //int testUpdate = stmt.executeUpdate("UPDATE users SET vorname = 'Harry' WHERE vorname='Larry' "); // Ergebnisse = Update
      while (rs.next()){        
        String benutzername = rs.getString("benutzername");        
        String password = rs.getString("passwort");
        String vorname = rs.getString("vorname");
        String nachname = rs.getString("nachname");
        String email = rs.getString("email");        
        System.out.println("Username: "+benutzername+" | Password: "+password);        
      }
      con.close();

    } catch(Exception e) {
      System.out.println("Fehler bei der Datenbankabfrage");
    }
  }

}

