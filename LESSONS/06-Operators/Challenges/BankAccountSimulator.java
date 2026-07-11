/*
Create a simple Bank Account Simulator.

Requirements:

Initial balance = 1,000
Deposit 500
Withdraw 300
Increment the transaction counter after each transaction
Print:
Final balance
Number of transactions

Hint: You'll use assignment operators (+=, -=) and the increment operator (++).

*/

public class BankAccountSimulator{
    public static void main(String[] args){
        int InitialBalance = 1000;
        int transactionCounter = 0;
        InitialBalance += 500;
        transactionCounter++;
        InitialBalance -=300;
        transactionCounter++;

        System.out.println("Final balance = "+InitialBalance + " And the transactions are "+ transactionCounter);

    }
}