/*
A bank has these rules:

A customer qualifies for a loan if:

age is at least 21
monthly salary is at least 300000 RWF

Input

Age:
Monthly Salary:

Possible outputs

Loan Approved

or

Loan Rejected
*/

import java.util.Scanner;
public class LoanEligibilityChecker{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println();
        System.out.println("========= LOAN ELIGIBILITY CHECKER ===========");
        System.out.println();

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        System.out.print("Enter your monthly salary (RWF): ");
        double salary = input.nextDouble();

        if (age >= 21 && salary >= 300000){
            System.out.println("Loan Approved");
        }else{
            System.out.println("Loan Rejected");
        }

        input.close();
        

    }
}