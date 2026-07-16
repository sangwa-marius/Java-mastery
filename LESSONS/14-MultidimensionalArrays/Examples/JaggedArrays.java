import java.util.Scanner;

public class JaggedArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number  of students: ");
        int students = input.nextInt();

        double[][] marks = new double[students][];

        System.out.print("\n");

        for (int row = 0; row < marks.length; row++) {
            System.out.print("Subjects of student " + (row + 1) + ": ");
            int answer = input.nextInt();
            marks[row] = new double[answer];
        }

        System.out.print("\n");
        for (int row = 0; row < marks.length; row++) {
            System.out.printf("Marks for Student %d: \n", (row + 1));
            for (int column = 0; column < marks[row].length; column++) {
                System.out.printf("Marks for subject %d: ", (column + 1));
                marks[row][column] = input.nextDouble();

            }
            System.out.println();
        }
    

      for (int row = 0; row < marks.length; row++) {
          System.out.printf("Marks for Student %d: ", (row + 1));
            for (int column = 0; column < marks[row].length; column++) {
                System.out.print(marks[row][column]+" ");
            
            }
            System.out.println();
         
        }
    }

    
}
