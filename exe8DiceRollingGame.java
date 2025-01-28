import java.util.Random;
import java.util.Scanner;

public class exe8DiceRollingGame {
    public static void main(String[] args) {
        // DICE ROLLING GAME

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numOfDice;
        int total = 0;

        //get # of dice from the user
        System.out.print("Enter the # of dice to roll: ");
        numOfDice = scanner.nextInt();


        if(numOfDice > 0){                          //check if # of dice > 0

            for(int i=0; i < numOfDice; i++){       //roll the dice
                int roll = random.nextInt(1, 7);
                printDice(roll);                    //display Ascii of dice part2
                System.out.println("You rolled: " + roll);
                total += roll;                      //get the total
            }
            System.out.println("=================");
            System.out.println("Total: " + total);
        }
        else{
            System.out.println("# of dice must be greater than 0!");
        }

        scanner.close();
    }
    //display Ascii of dice part1
    static void printDice(int roll){
        String dice1 = """
                 -------
                |       |
                |   ●   |
                |       |
                 -------
                """;

        String dice2 = """
                 -------
                | ●     |
                |       |
                |     ● |
                 -------
                """;

        String dice3 = """
                 -------
                | ●     |
                |   ●   |
                |     ● |
                 -------
                """;

        String dice4 = """
                 -------
                | ●   ● |
                |       |
                | ●   ● |
                 -------
                """;

        String dice5 = """
                 -------
                | ●   ● |
                |   ●   |
                | ●   ● |
                 -------
                """;

        String dice6 = """
                 -------
                | ●   ● |
                | ●   ● |
                | ●   ● |
                 -------
                """;

        switch(roll){
            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);
            default -> System.out.print("Invalid roll!!");
        }
    }
}
