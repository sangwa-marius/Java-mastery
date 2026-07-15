
public class StudentStatisticsEnhanced {
    public static void main(String[] args) {
        int[] marks = { 85, 62, 90, 45, 78, 95, 55 };
        int totalMarks = 0;
        int highestMark = marks[0];
        int lowestMark = marks[0];
        int numberOfPassedStudents = 0;
        int numberOfFailedStudents = 0;

        for (int i = 0; i < marks.length; i++) {
            totalMarks += marks[i];

            if (marks[i] > highestMark)
                highestMark = marks[i];

            if (marks[i] < lowestMark)
                lowestMark = marks[i];
        }

        double averageMark = (double) totalMarks / marks.length;

        for (int i = 0; i < marks.length; i++) {
            if (marks[i] >= 60)
                numberOfPassedStudents++;

            if (marks[i] < 60)
                numberOfFailedStudents++;
        }

        System.out.println("\n========================\nSTUDENT STATISTICS\n==================\n");
        System.out.println("Total Marks     : " + totalMarks);
        System.out.printf("Average         : %.2f\n", averageMark);
        System.out.println("Highest Mark    : " + highestMark);
        System.out.println("Lowest Mark     : " + lowestMark);
        System.out.println("Passed Students : " + numberOfPassedStudents);
        System.out.println("Failed Students : " + numberOfFailedStudents);

    }
}
