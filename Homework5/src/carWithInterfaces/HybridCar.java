package carWithInterfaces;

public class HybridCar extends Car implements Tankable, Chargeable {

    public HybridCar(String manufacturer, String model) {
        super(manufacturer, model);
    }

    @Override
    public void charge() {
        System.out.println("Charging Hybrid Car...");
    }

    @Override
    public void tank() {
        System.out.println("Refueling Hybrid Car...");

    }
}
