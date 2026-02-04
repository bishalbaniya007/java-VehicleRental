public class Bike extends Vehicle implements Rentable{
    int engCC;
    double rentCost = 20; // per day

    Bike(String brand, String model, String regNum, int engCC){
        super(brand, model, regNum);
        this.engCC = engCC;
    }

    @Override
    void displayInfo() {
        System.out.println("Category: Bike");
        System.out.println(brand+" " +engCC+ " " +model);
        System.out.println("Reg number: " +regNum);
        System.out.println("Rental cost per day: " +rentCost);
    }

    @Override
    public void rent(){
        System.out.println("Bike has been rented.");
    }

    @Override
    public void returnVehicle(){
        System.out.println("The Bike has been returned.");
    }

    @Override
    public double calculateRentalCost(int days){
        return days * rentCost;
    }
}