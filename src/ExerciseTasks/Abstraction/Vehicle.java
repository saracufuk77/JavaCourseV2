package ExerciseTasks.Abstraction;

public abstract class Vehicle {
    private String brand;
    private String model;
    private int speed;
    private int numOfPassenger;
    private double gasConsumption;

    public Vehicle(String brand, String model, int speed) {
        this.brand = brand;
        this.model = model;
        this.speed = speed;
    }

    public abstract void getNumberOfPassengers();
    public abstract void setNumOfPassenger(int numOfPassenger);

    public abstract void getGasConsumption();
    public abstract void getSpeed();

    public abstract String getBrand();

    public abstract String getModel();

    public abstract void print();
}
