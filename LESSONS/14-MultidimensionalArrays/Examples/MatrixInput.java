import java.util.Scanner;

public class MatrixInput {

    public static int[] readStudentSubjectNumber(Scanner input) {
        int numberOfStudents, numberOfSubjects;

        while (true) {

            System.out.print("Enter number of students: ");
            numberOfStudents = input.nextInt();
            if (numberOfStudents > 0) {
                break;
            }
            System.out.println("Enter a number greater than 0");
        }
        input.nextLine();

        while (true) {
            System.out.print("Enter number of subjects: ");
            numberOfSubjects = input.nextInt();
            if (numberOfSubjects > 0) {
                break;
            }
            System.out.println("Enter a number greater than 0");
        }

        input.nextLine();

        int[] studentSubjectNumber = { numberOfStudents, numberOfSubjects };
        return studentSubjectNumber;

    }

    public static void readToStringArray(Scanner input, String[] arrayName, String contentName) {

        System.out.println();
        for (int i = 0; i < arrayName.length; i++) {
            while (true) {
                System.out.printf("Enter the name of %s %d: ", contentName, (i + 1));
                arrayName[i] = input.nextLine();

                if (!arrayName[i].isBlank())
                    break;
                System.out.printf("The name of %s %d should not be empty", contentName, (i + 1));
            }
        }

    }

    public static void readMarksToMatrix(Scanner input, double[][] studentMarks, String[] studentNames,
            String[] subjectNames) {

        for (int row = 0; row < studentMarks.length; row++) {
            System.out.println("\nMarks for " + studentNames[row]);

            for (int column = 0; column < studentMarks[row].length; column++) {

                while (true) {
                    System.out.printf("Enter marks for %s: ", subjectNames[column]);

                    double answer = input.nextDouble();

                    if (answer >= 0 && answer <= 100) {
                        studentMarks[row][column] = answer;
                        break;
                    }

                    System.out.println("Enter valid marks (0-100)");

                }

            }
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] studentSubjectNumber = readStudentSubjectNumber(input);
        int numberOfStudents = studentSubjectNumber[0];
        int numberOfSubjects = studentSubjectNumber[1];
        String[] studentNames = new String[numberOfStudents];
        String[] subjectNames = new String[numberOfSubjects];
        double[][] studentMarks = new double[numberOfStudents][numberOfSubjects];
        readToStringArray(input, studentNames, "student");
        readToStringArray(input, subjectNames, "subject");
        readMarksToMatrix(input, studentMarks, studentNames, subjectNames);

        System.out.println("\n==========CLASS MARKS==========\n");

        for (int row = 0; row < studentMarks.length; row++) {

            System.out.printf("%-25s", studentNames[row] + ": ");

            for (int column = 0; column < studentMarks[row].length; column++) {

                System.out.print(studentMarks[row][column] + "\t");
            }
            System.out.println();
        }

        for (int row = 0; row < studentMarks.length; row++) {
            double total = 0;
            for (int column = 0; column < studentMarks[row].length; column++) {
                total += studentMarks[row][column];
            }

            double average = total / numberOfSubjects;
            System.out.println();
            System.out.println(studentNames[row] + " Total: " + total);
            System.out.printf("%s Average: %.2f\n", studentNames[row], average);
        }

        System.out.println();

        for (int column = 0; column < studentMarks[0].length; column++) {
            double total = 0;
            for (int row = 0; row < studentMarks.length; row++) {
                total += studentMarks[row][column];
            }

            double average = total / numberOfStudents;
            System.out.println();
            System.out.printf("%s Average: %.2f ", subjectNames[column], average);

        }

        input.close();

    }
}
