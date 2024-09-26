class Vehicle {
    void accelerate() {
        System.out.println("The vehicle accelerates.");
    }
}

class Car extends Vehicle {
    void honk() {
        System.out.println("The car honks.");
    }
}

class Truck extends Vehicle {
    void load() {
        System.out.println("The truck loads cargo.");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Car car = new Car();
        Truck truck = new Truck();

        car.accelerate(); 
        car.honk(); 

        truck.accelerate(); 
        truck.load(); 
    }
}
