package Day43.Practice.Car_Class;

public class Car {
    String brand;
    String model;
    int year;
    double price;

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }

    public Car setVal(String brand, String model, int year, int price){
        Car car =new Car();
        car.brand=brand;
        car.model=model;
        car.year=year;
        car.price=price;
        return car;



    }
}
