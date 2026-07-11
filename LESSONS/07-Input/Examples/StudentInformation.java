import java.util.Scanner;


public class StudentInformation{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);

        System.out.print("Name: ");
        String name = input.nextLine();

        System.out.print("Age: ");
        int age = input.nextInt();

        System.out.print("Height: ");
        double Height = input.nextDouble();

        System.out.print("Gender: ");
        char gender = input.next().charAt(0);

         System.out.println();

        System.out.println("----- STUDENT -----");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + Height);
        System.out.println("Gender: " + gender);

    }
}