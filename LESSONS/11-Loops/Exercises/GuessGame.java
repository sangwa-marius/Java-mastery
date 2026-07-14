import java.util.Scanner;
import java.util.random.RandomGenerator;

public class GuessGame {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int secret = 19;
        int attempts = 1;

        System.out.println("\n=====WELCOME TO GUESS THE SECRET NUMBER =====\n");
        System.out.print("Enter the number: ");

        int value = input.nextInt();
        while (value != secret) {
            if (value > secret) {
                System.out.println("Too high");
            } else {
                System.out.println("Too low");

            }
            attempts++;

            System.out.print("Enter the number: ");
            value = input.nextInt();

        }
        ;

        System.out.println("Congraturations! You guessed the numbers in " + attempts + " attempts");

        input.close();

    }
}