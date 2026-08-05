import java.util.InputMismatchException;
import java.util.Scanner;
public class MovieTicketBooking {


    public static void bookTickets(int numberOfTickets){
        if(numberOfTickets <=0){
            throw new IllegalArgumentException("The number of tickets must be greater than 0");
        }

        if(numberOfTickets >10){
            throw new IllegalArgumentException("The number of tickets must not exceed 10");
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        try{
            System.out.print("Enter the number of tickets: ");
            int numberOfTickets = input.nextInt();
            bookTickets(numberOfTickets);
            System.out.println("Booking confirmed");

        }catch(InputMismatchException e){
            System.out.println("Invalid input");

        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        input.close();


    }
}
