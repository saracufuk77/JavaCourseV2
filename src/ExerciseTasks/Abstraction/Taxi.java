package ExerciseTasks.Abstraction;

public class Taxi extends Commercial{
    private String medallionNumber;
    private String driverName;

    public Taxi(String brand, String model, int speed, String medallionNumber, String driverName) {
        super(brand, model, speed);
        this.medallionNumber = medallionNumber;
        this.driverName = driverName;
    }

    public String getMedallionNumber() {
        return medallionNumber;
    }

    public String getDriverName() {
        return driverName;
    }

    public Taxi(String brand, String model, int speed) {
        super(brand, model, speed);
    }

    public Taxi(String brand, String model, int speed, double pricePerMile, double insurancePrice) {
        super(brand, model, speed, pricePerMile, insurancePrice);
    }

    @Override
    public double getPricePerMile() {
        return super.pricePerMile;
    }

    @Override
    public void setPricePerMile(double pricePerMile) {
        super.pricePerMile=pricePerMile;
    }

    @Override
    public double getInsurancePrice() {
        return super.insurancePrice;
    }

    @Override
    public void setInsurancePrice(double insurancePrice) {
        super.insurancePrice=insurancePrice;
    }

    @Override
    public void getNumberOfPassengers() {
    }

    @Override
    public void setNumOfPassenger(int numOfPassenger) {

    }

    @Override
    public void getGasConsumption() {

    }

    @Override
    public void getSpeed() {

    }

    @Override
    public String getBrand() {
        return null;
    }

    @Override
    public String getModel() {
        return null;
    }

    @Override
    public void print() {

    }
}
