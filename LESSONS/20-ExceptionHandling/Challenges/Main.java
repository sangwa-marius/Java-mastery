
public class Main {
    public static void main(String[] args) {
        Reservation reservation = new Reservation(10);
        try {
            reservation.book(0);
        } catch (ReservationException e) {
            System.out.println(e.getMessage());
        }
    }

}
