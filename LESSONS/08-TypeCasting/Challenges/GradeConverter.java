import java.util.Scanner;
public class GradeConverter{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("====== Student Grade Converter ======\n");
        
        System.out.print("Enter student name: ");
        String name = input.nextLine();

        System.out.print("Enter exam score: ");
        double score = input.nextDouble();

        int wholeScore = (int) score;
        long longScore = wholeScore;
        char matchingChar = (char) wholeScore;

        System.out.println("\n---------- RESULT ---------- \n");
        System.out.println("Student name: " + name);
        System.out.println("Original Score (double) : " + score);
        System.out.println("Whole Score (int) : " + wholeScore);
        System.out.println("Long Score (long) : " + longScore);
        System.out.println("Character Value : " + matchingChar);

    }
}