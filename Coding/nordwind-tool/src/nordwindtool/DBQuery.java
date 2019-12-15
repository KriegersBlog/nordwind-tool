package nordwindtool;

import java.sql.*;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class DBQuery {
    static DateFormat normalDateFormat = new SimpleDateFormat("dd.MM.yyyy");

    //Returns true if the username is free
    public static boolean checkName(String username) {
        Statement stmt; //DK why, but its needed
        ResultSet rs; // Liefert Ergebnisse
        int counter = 0;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/nordwind_tool";
            Connection con = DriverManager.getConnection(url, "java", "java");
            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT COUNT(*) from benutzer where benutzername ='" + username + "'");

            while (rs.next()) {
                counter = rs.getInt("COUNT(*)");
            }
            con.close();
            if (counter == 0) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            System.out.println("Fehler bei Datenbankabfrage. Bitte Admin kontaktieren. | Error Code: 2");
        }
        return true;
    }

    //Gibt Passwort des Nutzers zur�ck
    public static String getPassword(String username) {
        Statement stmt; //DK why, but its needed
        ResultSet rs; // Liefert Ergebnisse
        String password = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/nordwind_tool";
            Connection con = DriverManager.getConnection(url, "java", "java");
            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT passwort from benutzer where benutzername ='" + username + "'");

            while (rs.next()) {
                password = rs.getString("passwort");
            }
            con.close();
            if (password == null) {
                return "Benutzer exisitiert nicht!";
            }
            return password;
        } catch (Exception e) {
            System.out.println("Fehler bei Datenbankabfrage. Bitte Admin kontaktieren. | Error Code: 3");
        }

        return "Error";
    }

    public static void createRecord(String table, int[] ints, String[] strings, double[] doubles, boolean[] bools) {
        String command;
        try {
            if (table.equals("artikel")) {
                Class.forName("com.mysql.cj.jdbc.Driver");    //Treiber einbinden
                String url = "jdbc:mysql://localhost:3306/nordwind";     //Datenbankverbindung angeben
                Connection con = DriverManager.getConnection(url, "java", "java");    // Verbindungsparameter angeben

                command = "insert into artikel(artikelnr, artikelname, lieferantennr, kategorienr, liefereinheit, einzelpreis, lagerbestand, bestellteeinheiten,mindestbestand, auslaufartikel)"
                        + " values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

                PreparedStatement pStatement_artikel = con.prepareStatement(command);
                if (ints[0] == -1) {
                    pStatement_artikel.setNull(1, Types.INTEGER);
                } else pStatement_artikel.setInt(1, ints[0]);

                if (ints[1] == -1) {
                    pStatement_artikel.setNull(3, Types.INTEGER);
                } else pStatement_artikel.setInt(3, ints[1]);

                if (ints[2] == -1) {
                    pStatement_artikel.setNull(4, Types.INTEGER);
                } else pStatement_artikel.setInt(4, ints[2]);

                if (ints[3] == -1) {
                    pStatement_artikel.setNull(7, Types.INTEGER);
                } else pStatement_artikel.setInt(7, ints[3]);

                if (ints[4] == -1) {
                    pStatement_artikel.setNull(8, Types.INTEGER);
                } else pStatement_artikel.setInt(8, ints[4]);

                if (ints[5] == -1) {
                    pStatement_artikel.setNull(9, Types.INTEGER);
                } else pStatement_artikel.setInt(9, ints[5]);

                if (strings[0].equals(null)) {
                    pStatement_artikel.setNull(2, Types.VARCHAR);
                } else pStatement_artikel.setString(2, strings[0]);

                if (strings[1].equals(null)) {
                    pStatement_artikel.setNull(5, Types.VARCHAR);
                } else pStatement_artikel.setString(5, strings[1]);

                if (doubles[0] == -1) {
                    pStatement_artikel.setNull(6, Types.DOUBLE);
                } else pStatement_artikel.setDouble(6, doubles[0]);

                if (bools[0]) {
                    pStatement_artikel.setInt(10, 1);
                } else {
                    pStatement_artikel.setInt(10, 0);
                }
                pStatement_artikel.execute();

                con.close();

            } else if (table.equals("bestelldetails")) {
                Class.forName("com.mysql.cj.jdbc.Driver");    //Treiber einbinden
                String url = "jdbc:mysql://localhost:3306/nordwind";     //Datenbankverbindung angeben
                Connection con = DriverManager.getConnection(url, "java", "java");    // Verbindungsparameter angeben

                command = "insert into bestelldetails(bestellnr, artikelnr, einzelpreis, anzahl, rabatt)"
                        + " values (?, ?, ?, ?, ?)";

                PreparedStatement pStatement_bestelldetails = con.prepareStatement(command);

                if (ints[0] == -1) {
                    pStatement_bestelldetails.setNull(1, Types.INTEGER);
                } else pStatement_bestelldetails.setInt(1, ints[0]);

                if (ints[1] == -1) {
                    pStatement_bestelldetails.setNull(2, Types.INTEGER);
                } else pStatement_bestelldetails.setInt(2, ints[1]);

                if (ints[2] == -1) {
                    pStatement_bestelldetails.setNull(4, Types.INTEGER);
                } else pStatement_bestelldetails.setInt(4, ints[2]);

                if (doubles[0] == -1) {
                    pStatement_bestelldetails.setNull(3, Types.INTEGER);
                } else pStatement_bestelldetails.setDouble(3, doubles[0]);

                if (doubles[1] == -1) {
                    pStatement_bestelldetails.setNull(5, Types.INTEGER);
                } else pStatement_bestelldetails.setDouble(5, doubles[1]);

                pStatement_bestelldetails.execute();
                con.close();

            } else if (table.equals("bestellungen")) {
                Class.forName("com.mysql.cj.jdbc.Driver");    //Treiber einbinden
                String url = "jdbc:mysql://localhost:3306/nordwind";     //Datenbankverbindung angeben
                Connection con = DriverManager.getConnection(url, "java", "java");    // Verbindungsparameter angeben

                command = "insert into bestellungen(bestellnr, kundencode, personalnr, bestelldatum, lieferdatum, versanddatum, versandueber, frachtkosten, empfaenger, strasse, ort, plz, bestimmungsland)"
                        + " values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

                PreparedStatement pStatement_bestellungen = con.prepareStatement(command);
                System.out.println("TEST");
                if (ints[0] == -1) {
                    pStatement_bestellungen.setNull(1, Types.INTEGER);
                } else pStatement_bestellungen.setInt(1, ints[0]);

                if (ints[1] == -1) {
                    pStatement_bestellungen.setNull(3, Types.INTEGER);
                } else pStatement_bestellungen.setInt(3, ints[1]);

                if (ints[2] == -1) {
                    pStatement_bestellungen.setNull(7, Types.INTEGER);
                } else pStatement_bestellungen.setInt(7, ints[2]);

                if (doubles[0] == -1) {
                    pStatement_bestellungen.setNull(8, Types.DOUBLE);
                } else pStatement_bestellungen.setDouble(8, doubles[0]);

                if (strings[0].equals(null)) {
                    pStatement_bestellungen.setNull(2, Types.VARCHAR);
                } else pStatement_bestellungen.setString(2, strings[0]);

                if (strings[1].equals("")) {
                    pStatement_bestellungen.setNull(4, Types.DATE);
                } else {
                    Date bestelldatum = Date.valueOf(strings[1]);
                    pStatement_bestellungen.setDate(4, bestelldatum);
                }

                if (strings[1].equals("")) {
                    pStatement_bestellungen.setNull(5, Types.DATE);
                } else {
                    Date lieferdatum = Date.valueOf(strings[2]);
                    pStatement_bestellungen.setDate(5, lieferdatum);
                }

                if (strings[1].equals("")) {
                    pStatement_bestellungen.setNull(6, Types.DATE);
                } else {
                    Date versanddatum = Date.valueOf(strings[3]);
                    pStatement_bestellungen.setDate(6, versanddatum);
                }

                if (strings[4].equals(null)) {
                    pStatement_bestellungen.setNull(9, Types.VARCHAR);
                } else pStatement_bestellungen.setString(9, strings[4]);

                if (strings[5].equals(null)) {
                    pStatement_bestellungen.setNull(10, Types.VARCHAR);
                } else pStatement_bestellungen.setString(10, strings[5]);

                if (strings[6].equals(null)) {
                    pStatement_bestellungen.setNull(11, Types.VARCHAR);
                } else pStatement_bestellungen.setString(11, strings[6]);

                if (strings[7].equals(null)) {
                    pStatement_bestellungen.setNull(12, Types.VARCHAR);
                } else pStatement_bestellungen.setString(12, strings[7]);

                if (strings[8].equals(null)) {
                    pStatement_bestellungen.setNull(13, Types.VARCHAR);
                } else pStatement_bestellungen.setString(13, strings[8]);


                pStatement_bestellungen.execute();
                con.close();

            } else if (table.equals("kategorien")) {
                Class.forName("com.mysql.cj.jdbc.Driver");    //Treiber einbinden
                String url = "jdbc:mysql://localhost:3306/nordwind";     //Datenbankverbindung angeben
                Connection con = DriverManager.getConnection(url, "java", "java");    // Verbindungsparameter angeben

                command = "insert into kategorien(kategorienr, kategoriename, beschreibung)"
                        + " values (?, ?, ?)";

                PreparedStatement pStatement_kategorien = con.prepareStatement(command);

                if (ints[0] == -1) {
                    pStatement_kategorien.setNull(1, Types.INTEGER);
                } else pStatement_kategorien.setInt(1, ints[0]);

                if (strings[0].equals(null)) {
                    pStatement_kategorien.setNull(2, Types.VARCHAR);
                } else pStatement_kategorien.setString(2, strings[0]);

                if (strings[1].equals(null)) {
                    pStatement_kategorien.setNull(3, Types.VARCHAR);
                } else pStatement_kategorien.setString(3, strings[1]);

                pStatement_kategorien.execute();
                con.close();

            } else if (table.equals("kunden")) {

                Class.forName("com.mysql.cj.jdbc.Driver");    //Treiber einbinden
                String url = "jdbc:mysql://localhost:3306/nordwind";     //Datenbankverbindung angeben
                Connection con = DriverManager.getConnection(url, "java", "java");    // Verbindungsparameter angeben

                command = "insert into kunden(kundencode, firma, kontaktperson, position, strasse, ort, plz, land, telefon, telefax)"
                        + " values (?, ?, ?,?, ?, ?,?, ?, ?,?)";

                PreparedStatement pStatement_kunden = con.prepareStatement(command);

                if (strings[0].equals(null)) {
                    pStatement_kunden.setNull(1, Types.VARCHAR);
                } else pStatement_kunden.setString(1, strings[0]);

                if (strings[1].equals(null)) {
                    pStatement_kunden.setNull(2, Types.VARCHAR);
                } else pStatement_kunden.setString(2, strings[1]);

                if (strings[2].equals(null)) {
                    pStatement_kunden.setNull(3, Types.VARCHAR);
                } else pStatement_kunden.setString(3, strings[2]);

                if (strings[3].equals(null)) {
                    pStatement_kunden.setNull(4, Types.VARCHAR);
                } else pStatement_kunden.setString(4, strings[3]);

                if (strings[4].equals(null)) {
                    pStatement_kunden.setNull(5, Types.VARCHAR);
                } else pStatement_kunden.setString(5, strings[4]);

                if (strings[5].equals(null)) {
                    pStatement_kunden.setNull(6, Types.VARCHAR);
                } else pStatement_kunden.setString(6, strings[5]);

                if (strings[6].equals(null)) {
                    pStatement_kunden.setNull(7, Types.VARCHAR);
                } else pStatement_kunden.setString(7, strings[6]);

                if (strings[7].equals(null)) {
                    pStatement_kunden.setNull(8, Types.VARCHAR);
                } else pStatement_kunden.setString(8, strings[7]);

                if (strings[8].equals(null)) {
                    pStatement_kunden.setNull(9, Types.VARCHAR);
                } else pStatement_kunden.setString(9, strings[8]);

                if (strings[9].equals(null)) {
                    pStatement_kunden.setNull(10, Types.VARCHAR);
                } else pStatement_kunden.setString(10, strings[9]);

                pStatement_kunden.execute();
                con.close();


            } else if (table.equals("lieferanten")) {
                Class.forName("com.mysql.cj.jdbc.Driver");    //Treiber einbinden
                String url = "jdbc:mysql://localhost:3306/nordwind";     //Datenbankverbindung angeben
                Connection con = DriverManager.getConnection(url, "java", "java");    // Verbindungsparameter angeben

                command = "insert into lieferanten(lieferantennr, firma, kontaktperson, position, strasse, ort, plz, land, telefon, telefax, homepage)"
                        + " values (?, ?, ?,?, ?, ?,?, ?, ?,?, ?)";

                PreparedStatement pStatement_lieferanten = con.prepareStatement(command);
                if (ints[0] == 0) {
                    pStatement_lieferanten.setNull(1, Types.INTEGER);
                } else pStatement_lieferanten.setInt(1, ints[0]);

                if (strings[0].equals(null)) {
                    pStatement_lieferanten.setNull(2, Types.VARCHAR);
                } else pStatement_lieferanten.setString(2, strings[0]);

                if (strings[1].equals(null)) {
                    pStatement_lieferanten.setNull(3, Types.VARCHAR);
                } else pStatement_lieferanten.setString(3, strings[1]);

                if (strings[2].equals(null)) {
                    pStatement_lieferanten.setNull(4, Types.VARCHAR);
                } else pStatement_lieferanten.setString(4, strings[2]);

                if (strings[3].equals(null)) {
                    pStatement_lieferanten.setNull(5, Types.VARCHAR);
                } else pStatement_lieferanten.setString(5, strings[3]);

                if (strings[4].equals(null)) {
                    pStatement_lieferanten.setNull(6, Types.VARCHAR);
                } else pStatement_lieferanten.setString(6, strings[4]);

                if (strings[5].equals(null)) {
                    pStatement_lieferanten.setNull(7, Types.VARCHAR);
                } else pStatement_lieferanten.setString(7, strings[5]);

                if (strings[6].equals(null)) {
                    pStatement_lieferanten.setNull(8, Types.VARCHAR);
                } else pStatement_lieferanten.setString(8, strings[6]);

                if (strings[7].equals(null)) {
                    pStatement_lieferanten.setNull(9, Types.VARCHAR);
                } else pStatement_lieferanten.setString(9, strings[7]);

                if (strings[8].equals(null)) {
                    pStatement_lieferanten.setNull(10, Types.VARCHAR);
                } else pStatement_lieferanten.setString(10, strings[8]);

                if (strings[9].equals(null)) {
                    pStatement_lieferanten.setNull(11, Types.VARCHAR);
                } else pStatement_lieferanten.setString(11, strings[9]);

                pStatement_lieferanten.execute();
                con.close();


            } else if (table.equals("personal")) {
                Class.forName("com.mysql.cj.jdbc.Driver");    //Treiber einbinden
                String url = "jdbc:mysql://localhost:3306/nordwind";     //Datenbankverbindung angeben
                Connection con = DriverManager.getConnection(url, "java", "java");    // Verbindungsparameter angeben

                command = "insert into personal(personalnr, nachname, vorname, position, anrede, geburtsdatum, einstellung, strasse, ort, plz, land, telefonprivat, durchwahlbuero)"
                        + " values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

                PreparedStatement pStatement_personal = con.prepareStatement(command);


                if (ints[0] == -1) {
                    pStatement_personal.setNull(1, Types.INTEGER);
                } else pStatement_personal.setInt(1, ints[0]);

                if (strings[0].equals(null)) {
                    pStatement_personal.setNull(2, Types.VARCHAR);
                } else pStatement_personal.setString(2, strings[0]);

                if (strings[1].equals(null)) {
                    pStatement_personal.setNull(3, Types.VARCHAR);
                } else pStatement_personal.setString(3, strings[1]);

                if (strings[2].equals(null)) {
                    pStatement_personal.setNull(4, Types.VARCHAR);
                } else pStatement_personal.setString(4, strings[2]);

                if (strings[3].equals(null)) {
                    pStatement_personal.setNull(5, Types.VARCHAR);
                } else pStatement_personal.setString(5, strings[3]);

                if (strings[4].equals("")) {
                    pStatement_personal.setNull(6, Types.DATE);
                } else {
                    Date bestelldatum = Date.valueOf(strings[4]);
                    pStatement_personal.setDate(6, bestelldatum);
                }
                if (strings[5].equals("")) {
                    pStatement_personal.setNull(7, Types.DATE);
                } else {
                    Date bestelldatum = Date.valueOf(strings[5]);
                    pStatement_personal.setDate(7, bestelldatum);
                }

                if (strings[6].equals(null)) {
                    pStatement_personal.setNull(8, Types.VARCHAR);
                } else pStatement_personal.setString(8, strings[6]);

                if (strings[7].equals(null)) {
                    pStatement_personal.setNull(9, Types.VARCHAR);
                } else pStatement_personal.setString(9, strings[7]);

                if (strings[8].equals(null)) {
                    pStatement_personal.setNull(10, Types.VARCHAR);
                } else pStatement_personal.setString(10, strings[8]);

                if (strings[9].equals(null)) {
                    pStatement_personal.setNull(11, Types.VARCHAR);
                } else pStatement_personal.setString(11, strings[9]);

                if (strings[10].equals(null)) {
                    pStatement_personal.setNull(12, Types.VARCHAR);
                } else pStatement_personal.setString(12, strings[10]);

                if (strings[11].equals(null)) {
                    pStatement_personal.setNull(13, Types.VARCHAR);
                } else pStatement_personal.setString(13, strings[11]);

                pStatement_personal.execute();
                con.close();

            } else if (table.equals("versandfirmen")) {
                Class.forName("com.mysql.cj.jdbc.Driver");    //Treiber einbinden
                String url = "jdbc:mysql://localhost:3306/nordwind";     //Datenbankverbindung angeben
                Connection con = DriverManager.getConnection(url, "java", "java");    // Verbindungsparameter angeben

                command = "insert into versandfirmen(firmennr, firma, telefon)"
                        + " values (?, ?, ?)";

                PreparedStatement pStatement_versandfirmen = con.prepareStatement(command);
                if (ints[0] == 0) {
                    pStatement_versandfirmen.setNull(1, Types.INTEGER);
                } else pStatement_versandfirmen.setInt(1, ints[0]);

                if (strings[0].equals(null)) {
                    pStatement_versandfirmen.setNull(2, Types.VARCHAR);
                } else pStatement_versandfirmen.setString(2, strings[0]);

                if (strings[1].equals(null)) {
                    pStatement_versandfirmen.setNull(3, Types.VARCHAR);
                } else pStatement_versandfirmen.setString(3, strings[1]);

                pStatement_versandfirmen.execute();
                con.close();
            }
            System.out.println("Datensatz angelegt");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void createUser(String username, String password, String name, String surname, String email) {
        try {
            //MIT DB VERBINDEN
            Class.forName("com.mysql.cj.jdbc.Driver");    //Treiber einbinden
            String url = "jdbc:mysql://localhost:3306/nordwind_tool";     //Datenbankverbindung angeben
            Connection con = DriverManager.getConnection(url, "java", "java");    // Verbindungsparameter angeben

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

        } catch (Exception e) {
            System.out.println("Fehler bei der Erstellung des Benutzers. Bitte Admin kontaktieren. | Error Code: 4");
        }
    }

    public static void deleteUser(String username) {
        if (!checkName(username)) {
            try {
                //MIT DB VERBINDEN
                Class.forName("com.mysql.cj.jdbc.Driver");    //Treiber einbinden
                String url = "jdbc:mysql://localhost:3306/nordwind_tool";     //Datenbankverbindung angeben
                Connection con = DriverManager.getConnection(url, "java", "java");    // Verbindungsparameter angeben

                //BEFEHL ANLEGEN
                String query = " delete from benutzer where benutzername ='" + username + "'";

                //PARAMETER IN BEFEHL EINF�GEN
                PreparedStatement preparedStmt = con.prepareStatement(query);
                //BEFEHL AUSF�HREN
                preparedStmt.execute();

                //VERBINDUNG MIT DB TRENNEN
                con.close();

            } catch (Exception e) {
                System.out.println("Fehler bei der Löschung des Nutzers. Bitte Admin kontakieren. | Error Code: 5");

            }
        }
    }
}
