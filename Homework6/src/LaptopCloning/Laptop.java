package LaptopCloning;

public class Laptop implements Cloneable {
    String name;
    Processor processor;
    HardDrive hardDrive;
    int displaySize;
    int weight;
    int RAMamount;

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
    Processor clonedP = (Processor) super.clone();
    HardDrive clonedH = (HardDrive) super.clone();
    cloned.name=this.name;
    clonedP.name=this.processor.name;
    clonedP.frequency=this.processor.frequency;
    clonedP.numberOfCores=this.processor.numberOfCores;
    cloned.processor=clonedP;
    clonedH.name=this.hardDrive.name;
    clonedH.type=this.hardDrive.type;
    clonedH.capacity=this.hardDrive.capacity;
    cloned.hardDrive=clonedH;
    cloned.displaySize=this.displaySize;
    cloned.weight=this.weight;
    cloned.RAMamount=this.RAMamount;
    return cloned;
    }

    @Override
    public String toString(){
        return "Laptop: "+name+", processor: "+processor.name+processor.frequency +processor.numberOfCores+
                ", hard Drive: "+hardDrive.name+hardDrive.type+hardDrive.capacity+", dispalySize: "+displaySize+"," +
                " weight: "+weight+", RAMamount: "+RAMamount;
    }
}