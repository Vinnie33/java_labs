package part_09;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyDBTest {

    private Connection connection = null;
    private DriverManager driver = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;
    private Statement statement = null;

    public static void main(String[] args) {

        MyDBTest db = new MyDBTest();
        String url = "jdbc:mysql://localhost";  // Defines the JDBC URL. Since we are creating a database,
                                                // we are not specifying
                                                // the database name in the URL.

        String username = "Vinnie";     // Defines username and password to connect to database server.
        String password = "Vinnie890";  // Do you need to define the password? Could you not declare it? ();
        String sql = "CREATE DATABASE IF NOT EXISTS MyDBTest";    // SQL command to create a database in MySQL.

        db.createTable ();
        db.insertRecord1 ();
        db.insertRecord2 ();
        db.insertRecord3 ();
        db.updateAngelfish();
        db.deleteStarfish();
        db.getDolphin();

        try (Connection conn = DriverManager.getConnection (url, username, password);
            PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.execute();
                } catch (SQLException e) {
                    System.out.println("There was an error 1");
                    e.printStackTrace();
        }
    }

    // createTable()
    public void createTable (){

        String sql = "CREATE TABLE Bracelets " +    // SQL command to create a table in MySQL.
                " id INTEGER not NULL Auto Increment, " +
                " material VARCHAR(90), " +
                " description VARCHAR(300), " +
                " length INTEGER, " +
                " PRIMARY KEY (id)";
        try (Connection conn = DriverManager.getConnection ("jdbc:mysql://localhost/" +
                "user=Vinnie&password=Vinnie890&useSSL=false");
             PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.execute();
                } catch (SQLException e) {
                    System.out.println("There was an error 2");
                    e.printStackTrace();
        }
    }

    // insertRecord1()
    public void insertRecord1 () {

        String sql = "INSERT INTO Bracelets (name, material, description, length)" + //command to insert table values
                "VALUES (Dolphin, Silver, Chain Link with Large Dolphin Charms, 6)";
        try (Connection conn = DriverManager.getConnection ("jdbc:mysql://localhost/Bracelets?" +
                    "user=Vinnie&password=Vinnie890&useSSL=false");
            PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.execute();
                } catch (SQLException e) {
                    System.out.println("There was an error 3");
                    e.printStackTrace();
            }
        }

    // insertRecord2()
    public void insertRecord2 (){

        String sql = "INSERT INTO Bracelets (name, material, description, length)" + //command to insert table values
                "VALUES (Starfish, Copper, Chain Link with Large Starfish Charms, 5)";
        try (Connection conn = DriverManager.getConnection ("jdbc:mysql://localhost/Bracelets?" +
                "user=Vinnie&password=Vinnie890&useSSL=false");
            PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.execute();
                } catch (SQLException e) {
                    System.out.println("There was an error 4");
                    e.printStackTrace();
        }
    }

    // insertRecord3()
    public void insertRecord3 (){

        String sql = "INSERT INTO Bracelets (name, material, description, length)" + //command to insert table values
                "VALUES (Angelfish, Gold, Chain Link with Large Angelfish Charms, 7)";
        try (Connection conn = DriverManager.getConnection ("jdbc:mysql://localhost/Bracelets?" +
                "user=Vinnie&password=Vinnie890&useSSL=false");
            PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.execute();
                } catch (SQLException e) {
                    System.out.println("There was an error 5");
                    e.printStackTrace();
        }
    }

// updateRecord Angelfish()
    public void updateAngelfish () {
        String sql = "UPDATE MyDBTest. Bracelets SET material = Platinum WHERE name = Angelfish";
        try (Connection conn = DriverManager.getConnection ("jdbc:mysql://localhost/Bracelets?" +
                "user=Vinnie&password=Vinnie890&useSSL=false");
            PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.execute();
                preparedStatement.executeUpdate();
                } catch (SQLException e) {
                    System.out.println("There was an error 6");
                    e.printStackTrace();
            }
    }

// deleteRecord Starfish()
    public void deleteStarfish (){ // Note: Businesses never delete data, they just update row info to Boolean "true"
                                    // under a "deleted" column
        String sql = "DELETE from Bracelets WHERE name = Starfish";
        try (Connection conn = DriverManager.getConnection ("jdbc:mysql://localhost/Bracelets?" +
                "user=Vinnie&password=Vinnie890&useSSL=false");
             PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.execute();
                preparedStatement.executeUpdate();
            } catch (SQLException e) {
                System.out.println("There was an error 7");
                e.printStackTrace();
        }
    }
// getRecord()
    public void getDolphin (){
        String sql = "SELECT * from Bracelets WHERE name = Dolphin";
        try (Connection conn = DriverManager.getConnection ("jdbc:mysql://localhost/Bracelets?" +
                "user=Vinnie&password=Vinnie890&useSSL=false");
             PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.execute();
                preparedStatement.executeUpdate();
            } catch (SQLException e) {
                System.out.println("There was an error 8");
                e.printStackTrace();
        }
    }

}
