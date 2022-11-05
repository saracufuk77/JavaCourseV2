package Day43.Practice.Car_Class;

public class Dealer {
    public static void main(String[] args) {

        Car car=new Car();
        Car car1 = car.setVal("Toyota","Siena",2019,30000);
        Car car2 = car.setVal("Kia","Sedona",2022,45000);
        Car car3= car.setVal("Ford","Focus",2018,20000);

        System.out.println("car3 = " + car3);
        System.out.println("car2 = " + car2);
        System.out.println("car1 = " + car1);

    }
}
