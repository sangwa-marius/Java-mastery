public class ArrayBasics {
    public static void main(String[] args) {
        int[] integers = { 1, 2, 3, 4, 5 };
        System.out.println("First element: " + integers[0]);
        System.out.println("Last element: " + integers[integers.length - 1]);
        integers[1] = 45;
        for (int i = 0; i < integers.length; i++) {
            System.out.println("Integer " + (i + 1) + ": " + integers[i]);
        }

        System.out.println("Array size : " + integers.length);

    }
}