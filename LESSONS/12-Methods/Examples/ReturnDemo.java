public class ReturnDemo {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double calculateCircleArea(double radius) {
        return 3.14 * radius * radius;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static String getFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    public static void main(String[] args) {

        int sum = add(3, 5);
        int prod = multiply(4, 9);
        double area = calculateCircleArea(100);
        boolean isEven = isEven(9);
        String fullName = getFullName("Sangwa", "Marius");

        System.out.println(sum);
        System.out.println(prod);
        System.out.println(area);
        System.out.println(isEven);
        System.out.println(fullName);
    }
}