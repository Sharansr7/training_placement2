import java.util.*;

class Flight {
    String dest;
    int seats;

    Flight(String dest, int seats) {
        this.dest = dest;
        this.seats = seats;
    }

    boolean book() {
        if (seats > 0) {
            seats--;
            return true;
        }
        return false;
    }
}

public class FlightBooking {
    public static void main(String[] args) {
        Map<String, Flight> flights = new HashMap<>();
        flights.put("DEL", new Flight("Delhi", 2));
        flights.put("MUM", new Flight("Mumbai", 1));

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter flight code (DEL/MUM): ");
        String code = sc.nextLine().toUpperCase();
        if (flights.containsKey(code) && flights.get(code).book()) {
            System.out.println("Booked successfully.");
        } else {
            System.out.println("Booking failed.");
        }
    }
}
