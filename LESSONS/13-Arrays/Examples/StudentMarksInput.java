import java.util.Scanner;

public class StudentMarksInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberOfStudents;
        while (true) {
            System.out.print("How many students? ");
            numberOfStudents = input.nextInt();

            if (numberOfStudents > 0) {
                break;
            }

            System.out.println("Please enter a number greater than 0");
        }

        System.out.println();

        double[] marks = new double[numberOfStudents];

        for (int i = 0; i < marks.length; i++) {
            while (true) {
                System.out.print("Enter marks " + (i + 1) + ": ");
                marks[i] = input.nextDouble();

                if (marks[i] >= 0 && marks[i] <= 100) {
                    break;
                }
                System.out.println("Enter valid marks between 0 and 100");
            }
        }

        double sumOfMarks = 0;
        double highestMark = marks[0];
        double lowestMark = marks[0];
        double averageMark = 0;

        for (int i = 0; i < marks.length; i++) {
            sumOfMarks += marks[i];
            if (marks[i] < lowestMark)
                lowestMark = marks[i];

            if (marks[i] > highestMark)
                highestMark = marks[i];

        }

        averageMark = sumOfMarks / numberOfStudents;

        int scoresAboveAverage = 0;

        for (int i =0; i < marks.length; i++){

            if(marks[i] > averageMark){
                scoresAboveAverage +=1;
            }
        }

        System.out.println("\n-------------\nStudent Marks\n-------------\n");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        System.out.println();
        System.out.println("Sum of Marks : " + sumOfMarks);
        System.out.println("Average Mark : " + averageMark);
        System.out.println("Highest Mark : " + highestMark);
        System.out.println("Lowest Mark  : " + lowestMark);
        System.out.println("Students Above Average: " + scoresAboveAverage);

        input.close();

    }

}
