import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter password: ");
        String password = input.next();

        while (!password.equals("java")) {
            System.out.print("Try again: ");
            password = input.next();

        }
        input.close();

    }
}
