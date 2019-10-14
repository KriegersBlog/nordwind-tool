// Autor: Julian Krieger
// Datum: 14.10.2019

//IMPORT IST WICHTIG
import java.sql.*;




public class datenbank {
  Statement stmt;
  ResultSet rs;
 
  String url     = "jdbc:mysql://localhost:3306/meinDatenbankSchema";       
  Connection con = DriverManager.getConnection(url,"benutzername", "benutzerpasswort");        
  
  
  public static void main(String[] args) {
   stmt = con.createStatement(); 
  }

}

