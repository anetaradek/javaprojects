package LaptopCloning;

public class Processor implements Cloneable{
    private String name;
    private int frequency;
    private int numberOfCores;

    public String getName() {
        return name;
    }

    public int getFrequency() {
        return frequency;
    }

    public int getNumberOfCores() {
        return numberOfCores;
    }

    public Processor(String name, int frequency, int numberOfCores) {
        this.name = name;
        this.frequency = frequency;
        this.numberOfCores = numberOfCores;
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        Processor clonedP = (Processor) super.clone();
        return clonedP;
    }

}
