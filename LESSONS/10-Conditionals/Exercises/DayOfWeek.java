/*
User enters

1

Output

Monday

...

7

Output

Sunday

Any other value

Invalid Day
*/

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\n==== DAY OF THE WEEL =====\n");
        System.out.print("Enter a number: ");
        int day = input.nextInt();

        String dayName = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid day";
        };

        System.out.println(dayName);

        input.close();
    }
}