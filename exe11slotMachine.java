// ------SLOT MACHINE GAME------
import java.util.Random;
import java.util.Scanner;

public class exe11slotMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // declare variables---------
        int balance = 100;
        int bet;
        int payout;
        String[] row;
        String playAgain;

        // welcome message-------
        System.out.println("-----------------------------");
        System.out.println("Welcome to Java Slot Machine!");
        System.out.println("Symbols: 🍒 🍉 🍋 🔔 ⭐");
        System.out.println("-----------------------------");

        // play if balance > 0
        while(balance > 0) {
            System.out.println("Current balance: $" + balance);
            // enter bet amount
            System.out.print("Place your bet amount: ");
            bet = scanner.nextInt();
            scanner.nextLine();     // clear the new line character in output!

            //verify if bet > balance
            if (bet > balance) {
                System.out.println("Insufficient funds!😖");
                continue;
            }
            //verify if bet <= 0
            else if (bet <= 0) {
                System.out.println("Bet must be greater than zero!!");
                continue;
            }
            //subtract bet from balance
            else {
                balance -= bet;
            }
            System.out.println("Spinning.....");

            row = spinRow();
            printRow(row);

            payout = getPayout(row, bet);

            if (payout > 0) {
                System.out.println("YOU WON $" + payout);
                balance += payout;
            } else {
                System.out.println("Sorry you lost this round!😣");
            }

            //ask to play again?
            System.out.print("Do you want to play again? (Y/N): ");
            playAgain = scanner.nextLine().toUpperCase();

            if (!playAgain.equals("Y"))
                break;

        }

        // display exit message-----
        System.out.println("GAME OVER!");
        System.out.println("Your final balance is $" + balance);

        scanner.close();
    }

    // spin row
    static String[] spinRow(){

        String[] symbols = {"🍒", "🍉", "🍋", "🔔", "⭐"};
        String[] row = new String[3];
        Random random = new Random();

        for(int i = 0; i < 3; i++){
            row[i] = symbols[random.nextInt(symbols.length)];
        }
        return row;
    }
    // print row
    static void printRow(String[] row){
        System.out.println("**************");
        System.out.println(" " + String.join(" | ", row));
        System.out.println("**************");
    }
    // get payout
    static int getPayout(String[] row, int bet){
        if(row[0].equals(row[1]) && row[1].equals(row[2]) ) {
            return switch(row[0]){
                case "🍒" -> bet * 3;
                case "🍉" -> bet * 4;
                case "🍋" -> bet * 5;
                case "🔔" -> bet * 10;
                case "⭐" -> bet * 20;
                default -> 0;
            };
        }
        else if(row[0].equals(row[1]) ) {
            return switch (row[0]) {
                case "🍒" -> bet * 2;
                case "🍉" -> bet * 3;
                case "🍋" -> bet * 4;
                case "🔔" -> bet * 5;
                case "⭐" -> bet * 10;
                default -> 0;
            };
        }
        else if(row[1].equals(row[2]) ) {
            return switch (row[1]) {
                case "🍒" -> bet * 2;
                case "🍉" -> bet * 3;
                case "🍋" -> bet * 4;
                case "🔔" -> bet * 5;
                case "⭐" -> bet * 10;
                default -> 0;
            };
        }

        return 0;
    }
}
