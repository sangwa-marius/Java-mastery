
public class Reservation {

    private int numberOfSeats;

    public Reservation(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public void book(int numberOfTickets) throws ReservationException {
        if (numberOfTickets <= 0) {
            throw new InvalidReservationException("The number of tickets must be greater than 0");
        }
        if (numberOfTickets > numberOfSeats) {
            throw new SeatsUnavailableException("Only " + numberOfSeats + " seats are available");
        }

        this.numberOfSeats -= numberOfTickets;
    }

    public void setNumberOfSeats(int newNumberOfSeats) {
        this.numberOfSeats = newNumberOfSeats;
    }

    public int getNumberOfSeats() {
        return this.numberOfSeats;
    }
}
