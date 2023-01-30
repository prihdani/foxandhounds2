package programs.foxandhounds.userinput;

import java.util.Scanner;
import java.util.StringJoiner;

public class UserInput {

    public UserInput() {

    }


    private String nev;

    public void starter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Üdvözlöm, kérem adja meg a nevét: ");
        String nev= scanner.nextLine();
        setName(scanner.nextLine());
        System.out.println("Kedves "+nev +", kezdődik a játék!");
        System.out.println("Tiéd az első lépés!");

    }

    private void setName(String nextLine) {
    }

    /*
    public void steps(){
        System.out.println(nev +", tiéd az első lépés!");
    }*/



}
