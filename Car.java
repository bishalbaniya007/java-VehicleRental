public class Car extends Vehicle implements Rentable{
    int noOfSeats;
    double rentCost = 50; // per day

    Car(String brand, String model, String regNum, int noOfSeats){
        super(brand, model, regNum);
        this.noOfSeats = noOfSeats;
    }

    @Override
    void displayInfo() {
        System.out.println("Category: Car");
        System.out.println(brand+" " + " " +model);
        System.out.println("No. of seats: " +noOfSeats);
        System.out.println("Reg number: " +regNum);
        System.out.println("Rental cost per day: " +rentCost);
    }

    @Override
    public void rent(){
        System.out.println("Car has been rented.");
    }

    @Override
    public void returnVehicle(){
        System.out.println("The Car has been returned.");
    }

    @Override
    public double calculateRentalCost(int days){
        return days * rentCost;
    }
}