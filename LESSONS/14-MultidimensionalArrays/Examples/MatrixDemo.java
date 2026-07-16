public class MatrixDemo {
    public static void main(String[] args) {
        int[][] marks = {
                { 80, 90, 75 },
                { 65, 88, 70 },
                { 95, 91, 89 }
        };

        for (int row = 0; row < marks.length; row++) {
            for (int column = 0; column < marks[row].length; column++) {
                System.out.print(marks[row][column] + " ");
            }
            System.out.println();
        }
    }

}