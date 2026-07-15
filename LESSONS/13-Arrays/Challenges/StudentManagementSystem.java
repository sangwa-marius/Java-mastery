import java.util.Scanner;

public class StudentManagementSystem {
    public static void displayHeader(String header) {
        System.out.println(
                "\n======================================\n" + header + "\n======================================\n");
    }

    public static void readStudents(Scanner input, double[] studentMarks, String[] studentNames, int numberOfStudents) {

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Enter name for student " + (i + 1) + ": ");
            studentNames[i] = input.nextLine();

            while (true) {
                System.out.print("Enter marks for student " + (i + 1) + ": ");
                double mark = input.nextDouble();
                input.nextLine();

                if (mark >= 0 && mark <= 100) {
                    studentMarks[i] = mark;
                    break;
                }
                System.out.println("Enter marks between 0 and 100");
            }
            System.out.println();
        }
    }

    public static double calculateAverage(double[] studentMarks) {
        if (studentMarks.length == 0)
            return 0;

        double sum = 0;
        for (int i = 0; i < studentMarks.length; i++) {
            sum += studentMarks[i];
        }
        double average = sum / studentMarks.length;
        return average;
    }

    public static double findHighest(double[] studentMarks) {
        if (studentMarks.length == 0) {
            return 0;
        }
        double highestMark = studentMarks[0];
        for (int i = 1; i < studentMarks.length; i++) {
            if (studentMarks[i] > highestMark) {
                highestMark = studentMarks[i];
            }
        }
        return highestMark;
    }

    public static double findLowest(double[] studentMarks) {
        if (studentMarks.length == 0)
            return 0;

        double lowestMark = studentMarks[0];
        for (int i = 1; i < studentMarks.length; i++) {
            if (studentMarks[i] < lowestMark) {
                lowestMark = studentMarks[i];
            }
        }

        return lowestMark;
    }

    public static int countPassed(double[] studentMarks) {
        if (studentMarks.length == 0)
            return 0;

        int passed = 0;

        for (int i = 0; i < studentMarks.length; i++) {
            if (studentMarks[i] >= 60)
                passed++;
        }

        return passed;
    }

    public static int countFailed(double[] studentMarks) {
        if (studentMarks.length == 0) {
            return 0;
        }

        int failed = 0;

        for (int i = 0; i < studentMarks.length; i++) {
            if (studentMarks[i] < 60)
                failed++;

        }
        return failed;
    }

    public static char[] calculateGrade(double[] studentMarks) {
        char[] grades = new char[studentMarks.length];
        for (int i = 0; i < studentMarks.length; i++) {
            switch ((int) studentMarks[i] / 10) {
                case 10, 9:
                    grades[i] = 'A';
                    break;

                case 8:
                    grades[i] = 'B';
                    break;

                case 7:
                    grades[i] = 'C';
                    break;

                case 6:
                    grades[i] = 'D';
                    break;

                default:
                    grades[i] = 'F';
            }
        }
        return grades;

    }

    public static void searchStudent(Scanner input, double[] studentMarks, String[] studentNames,
            char[] grades) {
        System.out.print("Enter student name to search: ");
        String target = input.nextLine();
        int position = -1;

        for (int i = 0; i < studentNames.length; i++) {
            if (studentNames[i].equals(target)) {
                position = i;
                break;
            }
        }

        if (position == -1) {
            System.out.println("\nStudent not found");
        } else {
            System.out.println("\nStudent Found\n");
            System.out.println("Name     : " + target);
            System.out.println("Mark     : " + studentMarks[position]);
            System.out.println("Grade    : " + grades[position]);
            System.out.println("Position : #" + (position + 1));
        }

    }

    public static void displayClassReport(double[] studentMarks, String[] studentNames, char[] grades, double average,
            double lowestMark, double highestMark, int passed, int failed) {
        displayHeader("CLASS REPORT");
        System.out.println("Student Name\t\tMark\t\tGrade\n");
        for (int i = 0; i < studentMarks.length; i++) {
            System.out.println(studentNames[i] + "\t\t" + studentMarks[i] + "\t\t" + grades[i]);
        }

        System.out.println("\n------------------------------------------\n");
        System.out.println("Class Average : " + average);
        System.out.println("Highest Mark  : " + highestMark);
        System.out.println("Lowest Mark   : " + lowestMark);
        System.out.println();
        System.out.println("Passed        : " + passed);
        System.out.println("Failed        : " + failed);

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        displayHeader("STUDENT MANAGEMENT SYSTEM");

        int numberOfStudents;
        while (true) {
            System.out.print("How many students? ");
            numberOfStudents = input.nextInt();
            input.nextLine();

            if (numberOfStudents > 0)
                break;

            System.out.println("Enter a number greater than 0");
        }

        System.out.println();

        String[] studentNames = new String[numberOfStudents];
        double[] studentMarks = new double[numberOfStudents];

        readStudents(input, studentMarks, studentNames, numberOfStudents);
        double average = calculateAverage(studentMarks);
        double highestMark = findHighest(studentMarks);
        double lowestMark = findLowest(studentMarks);
        int passed = countPassed(studentMarks);
        int failed = countFailed(studentMarks);
        char[] grades = calculateGrade(studentMarks);

        displayClassReport(studentMarks, studentNames, grades, average, lowestMark, highestMark, passed, failed);
        searchStudent(input, studentMarks, studentNames, grades);

        input.close();
    }
}
