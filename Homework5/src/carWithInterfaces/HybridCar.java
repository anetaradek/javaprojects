package carWithInterfaces;

public class HybridCar extends Car implements Tankable, Chargable {

    public HybridCar(String manufacturer, String model) {
        super(manufacturer, model);
    }

    @Override
    public void charge() {
    }

    @Override
    public void tank() {

    }
}
