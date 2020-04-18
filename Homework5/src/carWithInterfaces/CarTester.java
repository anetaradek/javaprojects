package carWithInterfaces;

public class CarTester {

    public static void main(String[] args) {

        Car fuelCar = new FuelCar("Honda", "Civic");
        Car electricCar = new ElectricCar("Tesla", "X");
        Car hybridCar = new HybridCar("Toyota", "Auris");
        Car hybridCar2 = new HybridCar("Honda", "Clarify");
        Car[] cars = {fuelCar, electricCar, hybridCar, hybridCar2};

        for(Car car :cars) {
            tankOrCharge(car);
        }
    }
    private static void tankOrCharge(Car car){
        if(car instanceof Tankable){
            ((Tankable) car).tank();
            System.out.println(car.getManufacturer()+" "+car.getModel()+" is tanked");
        }
        if(car instanceof Chargeable){
            ((Chargeable) car).charge();
            System.out.println(car.getManufacturer()+" "+car.getModel()+" is charged");
        }
    }
}
