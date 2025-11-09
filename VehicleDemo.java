package inheritance;

class Vehicle {
    String brand;

    Vehicle(String brand) {
        this.brand = brand;
    }

    void start() {
        System.out.println("Vehicle starts");
    }
}

class Car extends Vehicle {
    Car(String brand) {
        super(brand);
    }

    @Override
    void start() {
        System.out.println(brand + " car starts with key");
    }
}

class Motorcycle extends Vehicle {
    Motorcycle(String brand) {
        super(brand);
    }

    @Override
    void start() {
        System.out.println(brand + " motorcycle starts with button");
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
            new Car("Toyota"),
            new Motorcycle("Honda"),
            new Car("BMW"),
            new Motorcycle("Yamaha")
        };

        for (Vehicle v : vehicles) {
            v.start(); 
        }
    }
}
