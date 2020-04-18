package carWithInterfaces;

public class HybridCar extends Car implements Tankable, Chargable {

    public HybridCar(String manufacturer, String model) {
        super(manufacturer, model);
    }

    @Override
    public void charge() {
        System.out.println("Charging...");
    }

    @Override
    public void tank() {
        System.out.println("Refueling...");

    }
}
