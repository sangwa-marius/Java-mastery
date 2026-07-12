/*
Input

A
B
C

Output

Largest Number: ...

Restrictions

Do not

use arrays
use Math.max()
*/

import java.util.Scanner; 

public class LargestOfTheThree{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double number1 = input.nextDouble();

        System.out.print("Enter second number: ");
        double number2 = input.nextDouble();

        System.out.print("Enter third number: ");
        double number3 = input.nextDouble();

        if (number1 > number2 && number1 > number3){
            System.out.println("The largest of the three is " + number1);
        }else if( number2 > number1  && number2 > number3){
            System.out.println("The largest of the three is " + number2);
        }else if(number3 > number1 && number3 >number2){
            System.out.println("The largest of the three is " + number3);
        }else{
            System.out.println("All the numbers are equal");
        }

        input.close();

    }
}