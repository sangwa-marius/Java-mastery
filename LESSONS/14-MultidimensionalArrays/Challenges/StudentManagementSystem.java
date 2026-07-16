import java.util.Scanner;

public class StudentManagementSystem {

    public static void displayHeader(String header) {
        System.out.println("\n" + header + "\n");
    }

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

    public static double[] calculateStudentTotals(double[][] marksArray) {
        double[] studentTotals = new double[marksArray.length];

        for (int row = 0; row < marksArray.length; row++) {
            double total = 0;
            for (int column = 0; column < marksArray[row].length; column++) {
                total += marksArray[row][column];
            }
            studentTotals[row] = total;
        }

        return studentTotals;
    }

    public static double[] calculateStudentAverages(double[] studentTotals, int numberOfSubjects) {
        double[] studentAverages = new double[studentTotals.length];

        for (int i = 0; i < studentAverages.length; i++) {
            studentAverages[i] = studentTotals[i] / numberOfSubjects;
        }
        return studentAverages;
    }

    public static char[] calculateStudentGrades(double[] studentAverages) {
        char[] studentGrades = new char[studentAverages.length];
        for (int i = 0; i < studentAverages.length; i++) {
            studentGrades[i] = switch ((int) studentAverages[i] / 10) {
                case 10, 9 -> 'A';
                case 8 -> 'B';
                case 7 -> 'C';
                case 6 -> 'D';
                default -> 'F';
            };
        }

        return studentGrades;
    }

    public static String[] passOrFail(double[] studentAverages) {
        String[] passOrFailArray = new String[studentAverages.length];

        for (int i = 0; i < studentAverages.length; i++) {
            passOrFailArray[i] = (studentAverages[i] >= 60 ? "Pass" : "Fail");
        }
        return passOrFailArray;
    }

    public static void displayReportTable(String[] studentNames, double[] studentAverages, char[] studentGrades,
            String[] passOrFailArray) {
        displayHeader("STUDENT REPORT");

        System.out.printf("%-25s %-15s %-8s %-8s\n\n", "Name", "Average", "Grade", "Status");
        for (int i = 0; i < studentAverages.length; i++) {
            System.out.printf("%-25s %-15.2f %-8s %-8s\n", studentNames[i], studentAverages[i], studentGrades[i],
                    passOrFailArray[i]);
        }
    }

    public static double[] findHighestLowestMarkArray(double[][] marks) {
        double highestMark = marks[0][0];
        double lowestMark = marks[0][0];
        for (int row = 0; row < marks.length; row++) {
            for (int column = 0; column < marks[row].length; column++) {
                if (marks[row][column] > highestMark)
                    highestMark = marks[row][column];
                if (marks[row][column] < lowestMark)
                    lowestMark = marks[row][column];
            }
        }
        double[] highestLowestMarkArray = { highestMark, lowestMark };
        return highestLowestMarkArray;
    }

    public static double findOverallAverage(double[] studentTotals, int numberOfStudents, int numberOfSubjects) {

        double total = 0;
        for (int i = 0; i < studentTotals.length; i++) {
            total += studentTotals[i];
        }
        double overallAverage = total / (numberOfStudents * numberOfSubjects);
        return overallAverage;
    }

    public static String findBestStudent(double[] studentAverages, String[] studentNames) {
        int maxAverageIndex = 0;
        double maxAverage = studentAverages[0];
        for (int i = 0; i < studentAverages.length; i++) {
            if (studentAverages[i] > maxAverage)
                maxAverage = studentAverages[i];
                maxAverageIndex = i;
        }
        String bestStudent = studentNames[maxAverageIndex];
        return bestStudent;
    }

    public static void displayClassStats(double[] highestLowestMarkArray, double overallAverage, String bestStudent) {
        displayHeader("CLASS STATISTICS");

        System.out.printf("%-25s : %.2f\n", "Highest Mark", highestLowestMarkArray[0]);
        System.out.printf("%-25s : %.2f\n", "Lowest Mark", highestLowestMarkArray[1]);
        System.out.printf("%-25s : %.2f\n", "Overall Average", overallAverage);
        System.out.printf("%-25s : %s\n", "Best Student", bestStudent);
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
        double[] studentTotals = calculateStudentTotals(studentMarks);
        double[] studentAverages = calculateStudentAverages(studentTotals, numberOfSubjects);
        char[] studentGrades = calculateStudentGrades(studentAverages);
        String[] passOrFailArray = passOrFail(studentAverages);
        double[] highestLowestMarkArray = findHighestLowestMarkArray(studentMarks);
        double overallAverage = findOverallAverage(studentTotals, numberOfStudents, numberOfSubjects);
        String bestStudent = findBestStudent(studentAverages, studentNames);
        displayReportTable(studentNames, studentAverages, studentGrades, passOrFailArray);
        displayClassStats(highestLowestMarkArray, overallAverage, bestStudent);

        input.close();

    }
}
