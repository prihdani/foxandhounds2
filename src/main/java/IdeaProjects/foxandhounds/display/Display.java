package IdeaProjects.foxandhounds.display;

import java.util.StringJoiner;

public class Display {

    public Display() {
        fox =1;
        hounds0 =2;
        hounds1 =2;
        hounds2 =2;
        hounds3 =2;
    }


    private int fox ;
    private int hounds0 ;
    private int hounds1 ;
    private int hounds2 ;
    private int hounds3 ;

    public int[][] palya = new int[8][8];
    @Override
    public String toString() {
        return new StringJoiner(", ", Display.class.getSimpleName() + "[", "]")
                .toString();
    }

    public void start()
    {



        //for (int i = 0; i < palya.length; i++) {
        //for (int j = 0; j < palya.length; j++) palya[i][j] = 0;

        palya[7][0] = fox ;
        palya[0][1] = hounds0 ;
        palya[0][3] = hounds1 ;
        palya[0][5] =hounds2;
        palya[0][7] =hounds3;


        // }
        for (int i = 0; i < palya.length; i++) {
            System.out.println();
            for (int j = 0; j < palya.length; j++) {
                System.out.print(palya[i][j] + " ");

            }

        }

    }
}
