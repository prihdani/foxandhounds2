import programs.foxandhounds.display.Display;
import programs.foxandhounds.userinput.UserInput;

public class Main {
    public static void main(String[] args) {
        UserInput userInput = new UserInput();
        Display display = new Display();
        //UserInput elsoLepes = new UserInput(); akkor kell majd amikor ki akarom iratni hogy kie az elso lepes
        userInput.starter();
        display.start();

    }

}
