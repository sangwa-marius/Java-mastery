import java.util.Scanner;
import java.util.InputMismatchException;

public class SafeCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            double firstNum = input.nextDouble();
            System.out.print("Enter second number: ");
            double secondNum = input.nextDouble();
            System.out.println("1.Add\n2.Subtract\n3.Multiply\n4.Divide");
            System.out.print("Choose operation [1,2,3,4]: ");
            int choice = input.nextInt();
            double answer = 0;
            switch (choice) {
                case 1:
                    answer = firstNum + secondNum;
                    break;

                case 2:
                    answer = firstNum - secondNum;
                    break;

                case 3:
                    answer = firstNum * secondNum;
                    break;

                case 4:
                    answer = firstNum / secondNum;
                    break;

                default:
                    break;
            }

            System.out.println("Answer: " + answer);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input");

        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed");
        } finally {
            System.out.println("Program finished");
        }

        input.close();
    }
}