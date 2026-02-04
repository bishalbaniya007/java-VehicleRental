public class Truck extends Vehicle implements Rentable{
    int loadCapacity;
    double rentCost = 100; // per day

    Truck(String brand, String model, String regNum, int loadCapacity){
        super(brand, model, regNum);
        this.loadCapacity = loadCapacity;
    }

    @Override
    void displayInfo() {
        System.out.println("Category: Truck");
        System.out.println(brand+" " + " " +model);
        System.out.println("Load capacity: " +loadCapacity+ "kilos.");
        System.out.println("Reg number: " +regNum);
        System.out.println("Rental cost per day: " +rentCost);
    }

    @Override
    public void rent(){
        System.out.println("Truck has been rented.");
    }

    @Override
    public void returnVehicle(){
        System.out.println("The Truck has been returned.");
    }

    @Override
    public double calculateRentalCost(int days){
        return days * rentCost;
    }
}


