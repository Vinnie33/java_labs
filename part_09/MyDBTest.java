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
        try {
            db.createDatabase();
            db.createTable();
            db.insertRecord1();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void createDatabase () throws Exception {
        // Defines the JDBC URL. Since we are creating a database, we do not specify database name in the URL.
        Class.forName("com.mysql.jdbc.Driver");
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/",
                "Vinnie", "Vinnie888");
             PreparedStatement stmt = conn.prepareStatement("CREATE DATABASE IF NOT EXISTS MyDBTest")) {
            stmt.execute();
            System.out.println("Creating Database...");
        } catch (SQLException e) {
            System.out.println("There was an error with creating Database");
            e.printStackTrace();
        }
    }

    // createTable()
    public void createTable () throws Exception {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            connection = DriverManager.getConnection("jdbc:mysql://localhost/MyDBTest?" +
                "user=Vinnie&password=Vinnie888&useSSL=false");
            statement = connection.createStatement();
            preparedStatement = connection
                    // SQL command to create a table in MySQL.
                .prepareStatement("CREATE TABLE IF NOT EXISTS Bracelets (id INTEGER not NULL auto_increment, " +
                " material VARCHAR(90), " +
                " description VARCHAR(300), " +
                " length INTEGER, " +
                " PRIMARY KEY (id))");
            preparedStatement.execute ();
            System.out.println("Creating Table...");
        } catch (SQLException e) {
                    System.out.println("There was an error with Creating Table");
                    e.printStackTrace();
        }
    }

    // insertRecord1()
    public void insertRecord1 () throws Exception {

        try {
            Class.forName("com.mysql.jdbc.Driver");

            connection = DriverManager.getConnection("jdbc:mysql://localhost/MyDBTest?" +
                    "user=Vinnie&password=Vinnie888&useSSL=false");
            statement = connection.createStatement();
            preparedStatement = connection
                    // SQL Command to insert table values
                    .prepareStatement("INSERT INTO Bracelets (name, material, description, length)" +
                            "VALUES (Dolphin, Silver, Chain Link with Large Dolphin Charms, 6)");
            preparedStatement.execute();
            System.out.println("Dolphin Record has been created");
        } catch (SQLException e) {
            System.out.println("There was an error with Creating Dolphin Record");
            e.printStackTrace();
        }
    }

    // insertRecord2()
    public void insertRecord2 () throws Exception{

        try {
            Class.forName("com.mysql.jdbc.Driver");

            connection = DriverManager.getConnection("jdbc:mysql://localhost/MyDBTest?" +
                    "user=Vinnie&password=Vinnie888&useSSL=false");
            statement = connection.createStatement();
            preparedStatement = connection
                    // SQL Command to insert table values
                    .prepareStatement("INSERT INTO Bracelets (name, material, description, length)" +
                "VALUES (Starfish, Copper, Chain Link with Large Starfish Charms, 5)");
            preparedStatement.execute();
        } catch (SQLException e) {
            System.out.println("There was an error with Creating Table");
            e.printStackTrace();
        }
    }

    // insertRecord3()
    public void insertRecord3 () throws Exception{

        try {
            Class.forName("com.mysql.jdbc.Driver");

            connection = DriverManager.getConnection("jdbc:mysql://localhost/MyDBTest?" +
                    "user=Vinnie&password=Vinnie888&useSSL=false");
            statement = connection.createStatement();
            preparedStatement = connection
                    // SQL Command to insert table values
                    .prepareStatement("INSERT INTO Bracelets (name, material, description, length)" +
                            "VALUES (Angelfish, Gold, Chain Link with Large Angelfish Charms, 7)");
            preparedStatement.execute();
        } catch (SQLException e) {
            System.out.println("There was an error with Creating Table");
            e.printStackTrace();
        }
    }

// updateRecord Angelfish()
    public void updateAngelfish () throws Exception{

        try {
            Class.forName("com.mysql.jdbc.Driver");

            connection = DriverManager.getConnection("jdbc:mysql://localhost/MyDBTest?/Bracelets?" +
                    "user=Vinnie&password=Vinnie888&useSSL=false");
            statement = connection.createStatement();
            preparedStatement = connection
                    // SQL Command to insert table values
                    .prepareStatement("UPDATE MyDBTest. Bracelets SET material = Platinum WHERE name = Angelfish";
                preparedStatement.executeUpdate();
                } catch (SQLException e) {
                    System.out.println("There was an error with Updating Record");
                    e.printStackTrace();
            }
    }

// deleteRecord Starfish()
    public void deleteStarfish ()throws Exception{
                                    // Note: Businesses never delete data, they just update row info to Boolean "true"
                                    // under a "deleted" column
        String sql = "DELETE from Bracelets WHERE name = Starfish";
        try (Connection conn = DriverManager.getConnection ("jdbc:mysql://localhost/Bracelets?" +
                "user=Vinnie&password=Vinnie890&useSSL=false");
             PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.execute();
                preparedStatement.execute();
            } catch (SQLException e) {
                System.out.println("There was an error 7");
                e.printStackTrace();
        }
    }
// getRecord()
    public void getDolphin ()throws Exception{
        String sql = "SELECT * from Bracelets WHERE name = Dolphin";
        try (Connection conn = DriverManager.getConnection ("jdbc:mysql://localhost/Bracelets?" +
                "user=Vinnie&password=Vinnie890&useSSL=false");
             PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.execute();
                preparedStatement.execute();
            } catch (SQLException e) {
                System.out.println("There was an error 8");
                e.printStackTrace();
        }
    }

}
