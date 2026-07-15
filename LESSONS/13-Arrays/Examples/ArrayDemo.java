public class ArrayDemo {
    public static void main(String[] args) {

        int[] marks = { 85, 78, 91, 66, 80 };

        System.out.println("Number of marks: " + marks.length);

        for (int i = 0; i <= marks.length; i++) {
            System.out.println("Mark " + (i + 1) + ": " + marks[i]);
        }
    }
}