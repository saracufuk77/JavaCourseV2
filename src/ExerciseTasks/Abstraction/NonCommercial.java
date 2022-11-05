package ExerciseTasks.Abstraction;

public abstract class NonCommercial extends Vehicle {
    String plateNumber;
    int insuranceNumber;

    public NonCommercial(String brand, String model, int speed) {
        super(brand, model, speed);
    }

    public NonCommercial(String brand, String model, int speed, String plateNumber, int insuranceNumber) {
        super(brand, model, speed);
        this.plateNumber = plateNumber;
        this.insuranceNumber = insuranceNumber;
    }

    public abstract String getPlateNumber();

    public abstract void setPlateNumber(String plateNumber);

    public abstract int getInsuranceNumber();

    public abstract void setInsuranceNumber(int insuranceNumber);
}
