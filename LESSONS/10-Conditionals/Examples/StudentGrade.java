import java.util.Scanner;

public class StudentGrade {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter marks (0 - 100): ");
        int marks = input.nextInt();

        if (marks < 0 || marks > 100) {
            System.out.println("Invalid Marks.");
        } else if (marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 80) {
            System.out.println("Grade: B");
        } else if (marks >= 70) {
            System.out.println("Grade: C");
        } else if (marks >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }

        char grade = switch (marks / 10) {
            case 10, 9 -> 'A';
            case 8 -> 'B';
            case 7 -> 'C';
            case 6 -> 'D';
            default -> 'F';
        };

        System.out.println(grade);

        input.close();
    }
}