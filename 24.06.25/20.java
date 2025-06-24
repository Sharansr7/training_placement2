import java.util.*;

class Car {
    String model;
    boolean isAvailable = true;

    Car(String model) { this.model = model; }
}

public class CarRental {
    public static void main(String[] args) {
        List<Car> cars = List.of(new Car("Innova"), new Car("Swift"), new Car("Brezza"));
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Available Cars:");
            for (Car c : cars)
                if (c.isAvailable) System.out.println("- " + c.model);

            System.out.print("Choose a car to rent: ");
            String choice = sc.nextLine();
            for (Car c : cars) {
                if (c.model.equalsIgnoreCase(choice) && c.isAvailable) {
                    c.isAvailable = false;
                    System.out.println("Booked " + c.model);
                }
            }
        }
    }
}
