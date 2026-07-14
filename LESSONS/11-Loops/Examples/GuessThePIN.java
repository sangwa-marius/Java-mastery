import java.util.Scanner;

public class GuessThePIN {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final int CORRECT_PIN = 2026;
        int pin;

        System.out.println("===== ATM Login =====");

        do {

            System.out.print("Enter PIN: ");
            pin = input.nextInt();

            if (pin != CORRECT_PIN) {
                System.out.println("Incorrect PIN. Try again.\n");
            }

        } while (pin != CORRECT_PIN);

        System.out.println("\nAccess Granted.");

        input.close();
    }
}