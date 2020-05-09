package LaptopCloning;

public class HardDrive implements Cloneable{
    private String name;
    private String type;
    private int capacity;

    public HardDrive(String name, String type, int capacity) {
        this.name = name;
        this.type = type;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        HardDrive clonedH = (HardDrive) super.clone();
        return clonedH;
    }

}
