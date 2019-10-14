import java.sql.*;
public class db_test {
  
  public static void main(String[] args) {
    Statement stmt; //DK why, but its needed
    ResultSet rs; // Liefert Ergebnisse
    try {
      Class.forName("com.mysql.jdbc.Driver");             // Treiber einbinden
      String url = "jdbc:mysql://localhost:3306/testdb";  //Datenbankverbindung wird definiert
      Connection con = DriverManager.getConnection(url,"test", "1234"); // Verbindung wird definiert: "DB, Name, PW"     
      stmt = con.createStatement(); // Statement, was auch immer, wird erstellt                          
      
      
      /*
        executeQuery gibt ein ResultSet zurück
        executeUpdate gibt INT zurück (Betroffene Datensätze)      
      */
      
      rs = stmt.executeQuery("SELECT vorname, nachname FROM users"); // Ergebnisse = AusführenVonBefehl
      int testUpdate = stmt.executeUpdate("UPDATE users SET vorname = 'Harry' WHERE vorname='Larry' "); // Ergebnisse = Update
      while (rs.next()){        
        String  name = rs.getString("name");        
        String  surname = rs.getString("surname");        
        System.out.println("Surname: "+surname+" | Name: "+name);        
      }
      con.close();

    } catch(Exception e) {
      System.out.println("Error");
    } finally {
      System.out.println("Finally");
      
    }
  }
}

