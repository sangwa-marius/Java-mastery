import java.util.Scanner;

public class AgeInput {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        input.nextLine();

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your salary: ");
        double salary = input.nextDouble();
        
        System.out.println("Hello " + name + " Your age is "+age + " and your salary is " + salary);
    }
    
}