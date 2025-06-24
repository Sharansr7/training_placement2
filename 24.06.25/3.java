import java.util.*;

class ParkingLot {
    private final Set<Integer> occupied = new HashSet<>();
    private final int capacity = 5;

    void park(int slot) {
        if (occupied.contains(slot)) {
            System.out.println("Slot already occupied.");
        } else if (occupied.size() < capacity) {
            occupied.add(slot);
            System.out.println("Car parked in slot: " + slot);
        } else {
            System.out.println("Parking full.");
        }
    }

    void leave(int slot) {
        if (occupied.remove(slot)) {
            System.out.println("Slot " + slot + " is now free.");
        } else {
            System.out.println("Slot was not occupied.");
        }
    }

    void status() {
        System.out.println("Occupied slots: " + occupied);
    }
}

public class ParkingApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ParkingLot lot = new ParkingLot();

        int choice;
        do {
            System.out.println("\n1. Park\n2. Leave\n3. Status\n4. Exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter slot: ");
                    lot.park(sc.nextInt());
                }
                case 2 -> {
                    System.out.print("Enter slot: ");
                    lot.leave(sc.nextInt());
                }
                case 3 -> lot.status();
            }
        } while (choice != 4);
    }
}
