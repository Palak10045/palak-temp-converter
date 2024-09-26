import java.util.Scanner;
public class Vehicle {
    int no_of_seats;
    int no_of_wheels;

    public Vehicle(int no_of_seats, int no_of_wheels) {
        this.no_of_seats = no_of_seats;
        this.no_of_wheels = no_of_wheels;
    }

    public void displayDetails() {
        System.out.println("Number of seats: " + no_of_seats);
        System.out.println("Number of wheels: " + no_of_wheels);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of seats for Bike: ");
        int bikeSeats = scanner.nextInt();

        System.out.print("Enter number of wheels for Bike: ");
        int bikeWheels = scanner.nextInt();

        System.out.print("Enter number of seats for Car: ");
        int carSeats = scanner.nextInt();

        System.out.print("Enter number of wheels for Car: ");
        int carWheels = scanner.nextInt();

        Vehicle Bike = new Vehicle(bikeSeats, bikeWheels);
        Vehicle Car = new Vehicle(carSeats, carWheels);

        System.out.println("\nDescription of Bike:");
        Bike.displayDetails();

        System.out.println("\nDescription of Car:");
        Car.displayDetails();
    }
}
