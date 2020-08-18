import java.io.IOException;
import java.util.Scanner;

public class Game {
    public static void clrscr(){

        //Clears Screen in java

        try {

            if (System.getProperty("os.name").contains("Windows"))

                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

            else

                Runtime.getRuntime().exec("clear");

        } catch (IOException | InterruptedException ex) {}

    }
    public static void main(String[] args){
        System.out.println("------THIS IS NUMBER GUESSING GAME-------");
        System.out.println("-----------------------------------------\n\n\n");
        Scanner input = new Scanner(System.in);
        int yournumber = 0;
        System.out.println("Guess a number in your mind between 1-50-----------");
        System.out.println("HOW TO PLAY:");
        System.out.println("Check for your number in the shown 8 calenders and press y if your number is in that calender and n if not: \n\n");
        System.out.println("Are you ready? press y");
        char ready = input.nextLine().charAt(0);
        int[][][] cals ={
                {
                        {1,4,6,9},
                        {12,14,17,22},
                        {25,27,30,33},
                        {25,38,40,43},
                        {46,48}
                },
                {
                        {3,4,11,12},
                        {16,17,24,25},
                        {32,33,37,38},
                        {45,46,50}
                },
                {
                        {8,9,10,11},
                        {12,29,30,31},
                        {32,33,42,43},
                        {44,45,46}
                },
                {
                        {34,35,36,37},
                        {38,39,40,41},
                        {42,43,44,45},
                        {46,47,48,49},
                        {50}
                },
                {
                        {5,6,7,18},
                        {19,20,26,27},
                        {28,39,40,41}
                },
                {
                        {13,14,15,16},
                        {17,18,19,20},
                        {47,48,49,50}
                },
                {
                        {2,7,10,15},
                        {20,23,28,31},
                        {36,41,44,49}
                },
                {
                        {21,22,23,24},
                        {25,26,27,28},
                        {29,30,31,32},
                        {33}
                }
        };
        for (int i= 0; i<8; i++){
            clrscr();
            System.out.println("Calender No. " + (i + 1) + "\n\n");
            for (int j = 0; j< cals[i].length; j++){
                for (int k = 0; k<cals[i][j].length; k++){
                    System.out.print(cals[i][j][k]+"\t");
                }
                System.out.println();
            }
            System.out.println("\n\n");
            System.out.print("is your number in the above calender y: ");
            char check = input.nextLine().charAt(0);
            if (check == 'y' || check== 'Y'){
                yournumber= yournumber+cals[i][0][0];
            }
        }
        clrscr();
        System.out.println("The number in your mind is: " + yournumber + "\n\n\n");
        System.out.println("Thanks for playing!\n\n");
        input.close();
    }
}
