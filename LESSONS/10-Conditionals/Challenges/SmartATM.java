/*
Create a Smart ATM system.

The ATM has

Username : marius
PIN : 2026
Balance : 750000 RWF

Step 1
Ask for username.

Step 2
Ask for PIN.

If username OR PIN is incorrect
display
Access Denied
and stop.

Step 3
Display

======== SMART ATM ========

1. Check Balance
2. Deposit Money
3. Withdraw Money
4. Exit

Read the user's choice.
Option 1

Display
Current Balance: RWF 750000

Option 2

Ask
Deposit Amount:

Rules
Amount must be > 0

Otherwise

Invalid Amount

If valid
Update balance.

Display
Deposit Successful

New Balance: ...

Option 3

Ask
Withdrawal Amount:

Rules
Amount must be greater than 0 AND less than or equal to balance

If not

Display
Invalid Withdrawal

Otherwise
Subtract it.

Display
Withdrawal Successful

Remaining Balance...

Option 4
Display

Thank you for using Smart ATM.

Any other menu choice
Invalid Option
*/


import java.util.Scanner;
public class SmartATM{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String correctUsername = "marius";
        String correctPIN = "2026";
        double balance = 750000;

        System.out.print("Username: ");
        String username = input.next();

        System.out.print("PIN: ");
        String PIN = input.next();

        if ( !username.equals(correctUsername) || !PIN.equals(correctPIN)){
            System.out.println("Access Denied");
            input.close();
            return;
        }

        System.out.println("\n======== SMART ATM ========\n");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Exit");
        System.out.println();

        System.out.print("Enter your choice: ");
        String choice = input.next();

        if(choice.equals("1")){
            System.out.println("Current Balance: RWF "+balance);
        }else if(choice.equals("2")){

            System.out.print("Deposit Amount: ");
            double depositAmount = input.nextDouble();

            if (depositAmount > 0){

                balance += depositAmount;
                System.out.println("Deposit Successful");
                System.out.println("New Balance: RWF " +balance);

            }else{
                System.out.println("Invalid Amount");
            }
        }else if(choice.equals("3")){

            System.out.print("Withdrawal Amount: ");
            double withdrawalAmount = input.nextDouble();

            if (withdrawalAmount > 0 && withdrawalAmount < balance){

                balance -=withdrawalAmount;
                System.out.println("Withdrawal Successful");
                System.out.println("Remaining Balance: RWF "+balance);

            }else{
                System.out.println("Invalid Withdrawal");
            }

        }else if (choice.equals("4")){
            System.out.println("Thank you for using Smart ATM");
        }else{
            System.out.println("Invalid Option");
        }

        input.close();

        System.out.println("\n------------------------------");
    }
}