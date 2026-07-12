
import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String correctUsername = "marius_sangwa";
        String correctPassword = "san@Mariento1";

        System.out.print("Enter username: ");
        String username = input.nextLine();

        System.out.print("Enter the  password: ");
        String password = input.nextLine();

        if (username.equals(correctUsername) && password.equals(correctPassword)) {
            System.out.println("Login successful");
        } else {
            System.out.println("Incorrect credentials");
        }

        input.close();
    }
}
