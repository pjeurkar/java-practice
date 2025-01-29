import java.util.ArrayList;
import java.util.Scanner;

public class arrayListExercise {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> foods = new ArrayList<>();

        System.out.print("Enter the # of food you would like? : ");
        int numOfFood = scanner.nextInt();
        scanner.nextLine();     // to clear the input buffer.

        for(int i = 1; i <= numOfFood; i++){
            System.out.print("Enter food #" + i +": ");
            String food = scanner.nextLine();
            foods.add(food);
        }

        System.out.println(foods);

        scanner.close();
    }
}
