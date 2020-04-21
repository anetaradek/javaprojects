package LaptopCloning;

public class Laptop implements Cloneable {
    private String name;
    private Processor processor;
    private HardDrive hardDrive;
    private int displaySize;
    private int weight;
    private int RAMamount;

    public Laptop(String name, Processor processor, HardDrive hardDrive, int displaySize, int weight, int RAMamount) {
        this.name = name;
        this.processor = processor;
        this.hardDrive = hardDrive;
        this.displaySize = displaySize;
        this.weight = weight;
        this.RAMamount = RAMamount;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Laptop cloned = (Laptop) super.clone();
        cloned.name = this.name;
        cloned.processor = (Processor) this.processor.clone();
        cloned.hardDrive = (HardDrive) this.hardDrive.clone();
        cloned.displaySize = this.displaySize;
        cloned.weight = this.weight;
        cloned.RAMamount = this.RAMamount;
        return cloned;
    }

    @Override
    public String toString() {
        return "Laptop: " + name + ", processor: " + processor.getName() + " " + processor.getFrequency() + " " +
                processor.getNumberOfCores() + ", hard Drive: " + hardDrive.getName() + " " + hardDrive.getType() + " "
                + hardDrive.getCapacity() + ", dispalySize: " + displaySize + "," +
                " weight: " + weight + ", RAMamount: " + RAMamount;
    }
}