package IdeaProjects.foxandhounds.UserInput;


import java.util.Scanner;
import java.util.StringJoiner;

public class UserInput {

    public UserInput() {

    }

    @Override
    public String toString() {
        return new StringJoiner(", ", UserInput.class.getSimpleName() + "[", "]")
                .add("nev='" + nev + "'")
                .toString();
    }

    private String nev;

    public void starter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Üdvözlöm, kérem adja meg a nevét: ");
        String nev= scanner.nextLine();
        System.out.println("Kedves "+nev +", kezdődik a játék!");

    }

    /*
    public void steps(){
        System.out.println(nev +", tiéd az első lépés!");
    }*/



}
