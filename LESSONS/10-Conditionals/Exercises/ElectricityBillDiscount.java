/*
Exercise 3 — Electricity Bill Discount

Input

Total Bill

Rules

If bill is

Above 100000

Customer gets

15% discount

Otherwise

No discount.

Display

Original bill
Discount
Final bill
*/

import java.util.Scanner;

public class ElectricityBillDiscount{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("\n===== ELECTRICITY BILL DISCOUNT =====\n");

        System.out.print("Enter total bill: ");
        double totalBill = input.nextDouble();

        double discount =0, finalBill = totalBill;

        if (totalBill > 100000){
            discount = 0.15*totalBill;
            finalBill = totalBill - discount;
        }


        System.out.println("Original bill: " + totalBill);
        System.out.println("Discount: " + discount);
        System.out.println("Final bill: " + finalBill);

        input.close();

    }
}