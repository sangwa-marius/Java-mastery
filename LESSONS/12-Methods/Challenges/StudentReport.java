import java.util.Scanner;

public class StudentReport {

    public static double readMarks(Scanner input ,String name){

        while (true){
            System.out.printf("Enter %s marks: ", name);
            double answer = input.nextDouble();

            if (answer >= 0 && answer <= 100){
                return answer;
            }
            System.out.println("Invalid mark. Enter a value between 0 and 100");

        }
    
    }

    public static double calculateAverage(double mark1, double mark2, double mark3) {
        return (mark1 + mark2 + mark3) / 3;
    }

    public static char calculateGrade(double average) {

        char grade = switch ((int) average / 10) {
            case 10, 9 -> 'A';
            case 8 -> 'B';
            case 7 -> 'C';
            case 6 -> 'D';
            default -> 'F';
        };

        return grade;
    }

    public static boolean studentPassed(double average){
        return average >=60;
    }


    public static String getRemark(char grade){
        String remark = switch(grade){
            case 'A' -> "Excellent";
            case 'B' -> "Very Good";
            case 'C' -> "Good";
            case 'D' -> "Fair";
            default -> "Needs Improvement";
        };

        return remark;
    }
    public static void formattedReport(String name, double average, char grade, boolean passed, String remark){
        System.out.println("\n=========================\n     STUDENT REPORT\n=========================\n");
        System.out.println("Student : " + name);
        System.out.printf("Average : %.2f\n", average);
        System.out.println("Grade   : " + grade);
        System.out.println("Passed  : " + (passed?"Yes":"No"));
        System.out.println("Remark  : " + remark);
        System.out.println("=========================");

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = input.nextLine();
        
        double englishMarks = readMarks(input,"English");
        double mathMarks = readMarks(input,"Mathematics");
        double scienceMarks = readMarks(input,"Science");
        double average = calculateAverage(englishMarks, mathMarks, scienceMarks);
        char grade = calculateGrade(average);
        String remark = getRemark(grade);
        boolean passed = studentPassed(average);
        formattedReport(name, average, grade, passed,remark);
        input.close();

    }
}