public abstract class Vehicle{
    String brand;
    String model;
    String regNum;

    Vehicle(String brand, String model, String regNum){
        this.brand = brand;
        this.model = model;
        this.regNum = regNum;
    }

    abstract void displayInfo();
}