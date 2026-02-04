public class Main {
    public static void main(String[] args){

        // Vehicle Rental System

        // Build an interface Rentable with methods rent(), returnVehicle(), and calculateRentalCost(int days).
        // Create an abstract class Vehicle with common properties, then create concrete classes Car, Bike, and Truck
        // that extend Vehicle and implement Rentable.
        // Each vehicle type should calculate rental costs differently.

        Bike v1 = new Bike("Royal enfield", "Bullet", "Ga Pa 2315", 350);
        Car v2 = new Car("Ford", "Mustang", "Ga Ba 4432", 4);
        Truck v3 = new Truck("Tata", "Hellraiser", "Ba Ga 3342", 2000);

        Rentable[] rentals = {v1, v2, v3};

        System.out.println("******************************");

        for(Rentable rental : rentals){

            ((Vehicle)rental).displayInfo();    // Casting: (TargetType)objectName

            System.out.println("******************************");
            System.out.println("******************************");

            rental.rent();
            rental.returnVehicle();
            System.out.println("Total rental cost: $"+rental.calculateRentalCost(7));
            System.out.println("******************************");
        }

    }
}