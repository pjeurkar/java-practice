import java.util.Scanner;

public class exe2CompInterestCalcu {
    public static void main(String[] args) {

        // Compound Interest Calculator exercise
        // A = P ([1 + (r/n)] raised to (nt))

        Scanner scanner = new Scanner(System.in);

        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        System.out.print("Enter the principal amount: ");
        principal = scanner.nextDouble();

        System.out.print("Enter the interest rate (in %): ");
        rate = scanner.nextDouble() / 100;

        System.out.print("Enter the no. of times compounded per year: ");
        timesCompounded = scanner.nextInt();

        System.out.print("Enter the no. of years: ");
        years = scanner.nextInt();

        amount = principal * Math.pow(1 + rate / timesCompounded, timesCompounded * years);
        System.out.printf("The amount after %d years is: $%.2f", years, amount);


        scanner.close();




    }
}
