package carWithInterfaces;

public class Car {
    private String manufacturer;
    private String model;

    public Car(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }
    public String getModel() {
        return model;
    }

}