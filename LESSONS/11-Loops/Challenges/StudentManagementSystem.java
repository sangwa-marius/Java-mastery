import java.util.Scanner;

public class StudentManagementSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String studentName = "";
        int studentAge = 0;
        double averageMark = 0;
        int option;

        System.out.println("\n====STUDENT MANAGEMENT SYSTEM====\n");

        do {
            System.out.println("\n1. Register Student");
            System.out.println("2. View Student");
            System.out.println("3. Update Marks");
            System.out.println("4. Check Grade");
            System.out.println("5. Exit\n");

            System.out.print("Choose an option: ");
            option = input.nextInt();
            input.nextLine();

            if (option == 1) {
                System.out.print("Student Name: ");
                studentName = input.nextLine();

                System.out.print("Student Age: ");
                studentAge = input.nextInt();

                System.out.print("Average Mark: ");
                averageMark = input.nextDouble();

                System.out.println("Student registered successfully!");
            } else if (option == 2) {
                if (studentName.isBlank() && studentAge == 0 && averageMark == 0) {
                    System.out.println("No studetn registered");
                    break;
                }

                System.out.println("========== STUDENT =========");
                System.out.println("Name: " + studentName);
                System.out.println("Age: " + studentAge);
                System.out.println("Mark: " + averageMark);
            } else if (option == 3) {
                if (studentName.isBlank() && studentAge == 0 && averageMark == 0) {
                    System.out.println("No studetn registered");
                    break;
                }
                System.out.print("New Average Mark: ");
                averageMark = input.nextDouble();

                if (averageMark >= 0 && averageMark <= 100) {
                    System.out.println("Marks updated successfully");
                } else {
                    System.out.println("Invalid mark");
                    break;
                }
            } else if (option == 4) {
                if (studentName.isBlank() && studentAge == 0 && averageMark == 0) {
                    System.out.println("Register a student First");
                    break;
                }
                char grade = switch ((int) averageMark / 10) {
                    case 9, 10 -> 'A';
                    case 8 -> 'B';
                    case 7 -> 'C';
                    case 6 -> 'D';
                    default -> 'F';
                };

                System.out.println("Student: " + studentName);
                System.out.println("Average: " + averageMark);
                System.out.println("Grade " + grade);
            } else if (option == 5) {
                System.out.println("Thank you for using the Student Management System.");
                break;
            } else {
                System.out.println("Invalid option");
                break;
            }

        } while (option != 5);
        input.close();
    }
}
