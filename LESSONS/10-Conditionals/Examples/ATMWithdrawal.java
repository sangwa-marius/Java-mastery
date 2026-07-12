import java.util.Scanner;

public class ATMWithdrawal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double balance = 250000;
        System.out.println("==== ATM ====\n");
        System.out.println("Current Balance: RWF " + balance);

        System.out.print("Enter withdrawa amount: ");
        double amount = input.nextDouble();

        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount");
        } else if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance -= amount;
            System.out.println("Withdrawal Successful.");
            System.out.println("Remaining Balance: RWF " + balance);
        }

        input.close();

    }
}