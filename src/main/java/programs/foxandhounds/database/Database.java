package programs.foxandhounds.database;

import programs.foxandhounds.player.Player;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;


public class Database {
    Player players;


    Connection connection = DriverManager.getConnection("jdbc:h2:C://h2_helyettes/~/newtest", "sa", "asd32");


    private int id;

    public Database(Player players) throws SQLException {
        this.players = players;

    }

    /**
     * Létrehozza az adatbázist ha még nem létezik.
     */
    public void createTableIfNotExists() throws SQLException {

        String command = "CREATE TABLE IF NOT EXISTS Nevek " +
                "(ID INTEGER NOT NULL AUTO_INCREMENT PRIMARY KEY, " +
                "NAME VARCHAR(255))";

        Statement st = connection.createStatement();
        st.executeUpdate(command);
    }



    /**
     * Frissíti az adatbázist.
     */
    public void statupdate() throws SQLException {
        String command = "INSERT INTO Nevek (NAME) VALUES (?) ";

        PreparedStatement st = connection.prepareStatement(command);
        st.setString(1, players.getName());
        st.executeUpdate();
    }
}