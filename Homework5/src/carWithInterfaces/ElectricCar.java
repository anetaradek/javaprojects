package carWithInterfaces;

public class ElectricCar extends Car implements Chargeable {

    public ElectricCar(String manufacturer, String model) {
        super(manufacturer, model);
    }

    @Override
    public void charge() {
        System.out.println("Charging Electric Car...");
    }
}
