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
//            db.insertRecord2();
//            db.insertRecord3();
//            db.updateAngelfish();
//            db.deleteStarfish();
//            db.getDolphin();
        } catch (Exception e) {
            System.out.println("There was an error with Main Method");
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
            System.out.println("Database My DBTest has been created");
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
                        " name VARCHAR(90), " +
                        " material VARCHAR(90), " +
                        " description VARCHAR(300), " +
                        " length INTEGER, " +
                        " PRIMARY KEY (id))");
            preparedStatement.execute ();
            System.out.println("Bracelets Table has been created");
        } catch (SQLException e) {
                    System.out.println("There was an error with Creating Table");
                    e.printStackTrace();
        }
    }

    // insert Dolphin Record
    public void insertRecord1 () throws Exception {

        try {
            Class.forName("com.mysql.jdbc.Driver");

            connection = DriverManager.getConnection("jdbc:mysql://localhost/MyDBTest?" +
                    "user=Vinnie&password=Vinnie888&useSSL=false");
            statement = connection.createStatement();
            preparedStatement = connection
                    .prepareStatement("INSERT INTO MyDBTest.Bracelets (name, material, description, length)" +
                            "VALUES (?, ?, ?, ?)");
            preparedStatement.setString(1, "Dolphin");
            preparedStatement.setString(2, "Silver");
            preparedStatement.setString(3, "Chain Link with Large Dolphin Charms");
            preparedStatement.setInt(4, 6);
            preparedStatement.executeUpdate();
            System.out.println("Dolphin Record has been created");
        } catch (SQLException e) {
            System.out.println("There was an error with Creating Dolphin Record");
            e.printStackTrace();
        }
    }

    // insert Starfish Record
    public void insertRecord2 () throws Exception{

        try {
            Class.forName("com.mysql.jdbc.Driver");

            connection = DriverManager.getConnection("jdbc:mysql://localhost/MyDBTest?" +
                    "user=Vinnie&password=Vinnie888&useSSL=false");
            statement = connection.createStatement();
            preparedStatement = connection
            .prepareStatement("INSERT INTO MyDBTest.Bracelets (name, material, description, length)" +
                        "VALUES (?, ?, ?, ?)");
            preparedStatement.setString(1, "Starfish");
            preparedStatement.setString(2, "Copper");
            preparedStatement.setString(3, "Chain Link with Large Starfish Charms");
            preparedStatement.setInt(4, 5);
            preparedStatement.executeUpdate();
            System.out.println("Starfish Record has been created");
        } catch (SQLException e) {
            System.out.println("There was an error with Creating Starfish Record");
            e.printStackTrace();
        }
    }
//
//    // insert Angelfish Record
//    public void insertRecord3 () throws Exception{
//
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//
//            connection = DriverManager.getConnection("jdbc:mysql://localhost/MyDBTest?" +
//                    "user=Vinnie&password=Vinnie888&useSSL=false");
//            statement = connection.createStatement();
//            preparedStatement = connection
//                    // SQL Command to insert table values
//                    .prepareStatement("INSERT INTO IF NOT EXISTS Bracelets (name, material, description, length)" +
//                            "VALUES (Angelfish, Gold, Chain Link with Large Angelfish Charms, 7)");
//            preparedStatement.execute();
//            System.out.println("Starfish Record has been created");
//        } catch (SQLException e) {
//            System.out.println("There was an error with Creating Angelfish Record");
//            e.printStackTrace();
//        }
//    }
//
//// update Angelfish Record
//    public void updateAngelfish () throws Exception{
//
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//
//            connection = DriverManager.getConnection("jdbc:mysql://localhost/MyDBTest?/Bracelets?" +
//                    "user=Vinnie&password=Vinnie888&useSSL=false");
//            statement = connection.createStatement();
//            preparedStatement = connection
//                    // SQL Command to insert table values
//                    .prepareStatement("UPDATE MyDBTest. Bracelets SET material = Platinum WHERE name = Angelfish");
//                preparedStatement.executeUpdate();
//            System.out.println("Angelfish Record has been updated");
//        } catch (SQLException e) {
//                    System.out.println("There was an error with Updating Angelfish Record");
//                    e.printStackTrace();
//            }
//    }
//
//// delete Starfish Record
//    public void deleteStarfish ()throws Exception{
//                                    // Note: Businesses never delete data, they just update row info to Boolean "true"
//                                    // under a "deleted" column, below is example of deleting a record
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//
//            connection = DriverManager.getConnection("jdbc:mysql://localhost/MyDBTest?/Bracelets?" +
//                    "user=Vinnie&password=Vinnie888&useSSL=false");
//            statement = connection.createStatement();
//            preparedStatement = connection
//            // SQL Command to delete table values
//                    .prepareStatement("DELETE from Bracelets WHERE name = Starfish");
//            preparedStatement.executeUpdate();
//            System.out.println("Starfish Record has been deleted");
//        } catch (SQLException e) {
//            System.out.println("There was an error with Deleting Starfish Record");
//            e.printStackTrace();
//        }
//    }
//// get Dolphin Record
//    public void getDolphin ()throws Exception{
//            // Getting the Dolphin Record
//            try {
//                Class.forName("com.mysql.jdbc.Driver");
//
//                connection = DriverManager.getConnection("jdbc:mysql://localhost/MyDBTest?/Bracelets?" +
//                        "user=Vinnie&password=Vinnie888&useSSL=false");
//                statement = connection.createStatement();
//                preparedStatement = connection
//                        // SQL Command to get Dolphin Record
//                        .prepareStatement("SELECT * from Bracelets WHERE name = Dolphin");
//                System.out.println("See results for Dolphin Record below");
//                resultSet = preparedStatement.executeQuery();
//                preparedStatement.executeUpdate();
//                System.out.println("See results for Dolphin Record below");
//            } catch (SQLException e) {
//                System.out.println("There was an error with Getting Dolphin Record");
//                e.printStackTrace();
//            }
//        }
}

//                    writeResultSet(resultSet);