package ExerciseTasks.Abstraction;

import java.util.EnumMap;

public abstract class PublicTransportation extends Vehicle {
    private Enum Lane;
    private Enum workingShift;
    private double pricePerRide;

    public PublicTransportation(String brand, String model, int speed) {
        super(brand, model, speed);
    }

    public PublicTransportation(String brand, String model, int speed, Enum lane, Enum workingShift, double pricePerRide) {
        super(brand, model, speed);
        Lane = lane;
        this.workingShift = workingShift;
        this.pricePerRide = pricePerRide;
    }

    public abstract String getLane();

    public abstract void setLane(String lane);

    public abstract int getWorkingHours();

    public abstract void setWorkingHours(int workingHours);

    public abstract double getPricePerRide();

    public abstract void setPricePerRide(double pricePerRide);
}
