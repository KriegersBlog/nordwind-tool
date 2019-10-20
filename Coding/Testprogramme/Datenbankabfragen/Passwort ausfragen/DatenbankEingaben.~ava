// Autor: Julian Krieger
// Datum: 20.10.2019
import java.sql.*;

public class DatenbankEingaben {
  
  public static void main(String[] args) {
    Statement stmt; //DK why, but its needed
    ResultSet rs; // Liefert Ergebnisse
    try {
      Class.forName("com.mysql.jdbc.Driver");             // Treiber einbinden
      String url = "jdbc:mysql://localhost:3306/nordwind_tool";  //Datenbankverbindung wird definiert
      Connection con = DriverManager.getConnection(url,"java", "java"); // Verbindung wird definiert: "DB, Name, PW"     
                           
      String name = "kartoffel55";
      String query = " insert into benutzer (benutzername, passwort, vorname, nachname, email)"
        + " values (?, ?, ?, ?, ?)";
    
      PreparedStatement preparedStmt = con.prepareStatement(query);
      preparedStmt.setString(1, name);
      preparedStmt.setString(2, "abc");
      preparedStmt.setString(3, "Herbert");
      preparedStmt.setString(4, "chef");
      preparedStmt.setString(5, "bla");

      // execute the preparedstatement
      preparedStmt.execute();
      
      con.close();

    } catch(Exception e) {
      System.out.println("Fehler bei der Datenbankabfrage");
    }
  }

}

