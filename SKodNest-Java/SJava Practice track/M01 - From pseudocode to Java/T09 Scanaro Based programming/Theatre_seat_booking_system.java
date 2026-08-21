import java.util.Scanner;

class TheatreBooking {

    int[] seats;
    int bookedCount;

    TheatreBooking(int totalSeats) {
        this.seats = new int[totalSeats];
        this.bookedCount = 0;
    }

    String bookSeat(int seatNumber) {
        if (seatNumber < 1 || seatNumber > seats.length) {
            return "Invalid Seat";
        }
        int seatIndex = seatNumber - 1;
        if (seats[seatIndex] == 1) {
            return "Already Booked";
        }
        seats[seatIndex] = 1;
        bookedCount++;
        return "Booked";
    }

    int getAvailableCount() {
        int availableCount = seats.length - bookedCount;
        return availableCount;
    }

    void displaySeatStatus() {
        System.out.println("Seat Status");
        for (int i = 0; i < seats.length; i++) {
            String status;
            if (seats[i] == 1) {
                status = "Booked";
            } else {
                status = "Available";

                System.out.println("Seat " + (i + 1) + ": " + status);

            }
        }
    }
}

public class Theatre_seat_booking_system {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalSeats = scanner.nextInt();
        int requestCount = scanner.nextInt();

        TheatreBooking theatre = new TheatreBooking(totalSeats);

        for (int i = 1; i <= requestCount; i++) {
            int seatNumber = scanner.nextInt();

            String result = theatre.bookSeat(seatNumber);

            System.out.println("Request " + i + " - Seat " + seatNumber + ": " + result);

            theatre.displaySeatStatus();

            System.out.println("Booked Seats: " + theatre.bookedCount);
            System.out.println("Available Seats: " + theatre.getAvailableCount());

            scanner.close();
        }

    }
}
