
public class ArrayUtilities {

    public static double calculateSum(double[] numbers) {
        if (numbers.length == 0) {
            return 0;
        }

        double sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        return sum;
    }

    public static double calculateAverage(double[] numbers) {
        if (numbers.length == 0) {
            return 0;
        }

        double average = 0;
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        average = sum / numbers.length;
        return average;
    }

    public static int findLargest(int[] numbers) {
        if (numbers.length == 0) {
            return 0;
        }
        
        int largest = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        return largest;

    }

    public static int findSmallest(int[] numbers) {
        if (numbers.length == 0) {
            return 0;
        }

        int smallest = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < smallest)
                smallest = numbers[i];
        }

        return smallest;
    }

    public static void printArray(int[] numbers){
        if (numbers.length == 0){
            System.out.println("This array is empty!");
        }

        for (int i =0; i< numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
    }

    public static void main(String[] args) {

        int[] numbers = {22,34,53,532,4};
        double[] ages = {32,33,5,6,7,3};

        double totalAges = calculateSum(ages);
        double averageAges = calculateAverage(ages);
        int smallest = findSmallest(numbers);
        int largest = findLargest(numbers);
        printArray(numbers);

        System.out.printf("\n%f %f %d %d\n",totalAges, averageAges, smallest, largest);


    }
}
