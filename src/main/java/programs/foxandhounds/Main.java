package programs.foxandhounds;

import programs.foxandhounds.display.Display;
import programs.foxandhounds.player.Player;
import programs.foxandhounds.userinput.UserInput;
import programs.foxandhounds.database.Database;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        UserInput userInput = new UserInput();
        Display display = new Display();
        //Player jatekosok = new Player();
        //Database valami = new Database(jatekosok);
        //UserInput elsoLepes = new UserInput(); akkor kell majd amikor ki akarom iratni hogy kie az elso lepes
        userInput.starter();
        display.start();
        //valami.createTableIfNotExists();

    }

}
