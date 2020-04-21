package LaptopCloning;

public class LaptopCloningTester {
    public static void main(String[] args) throws CloneNotSupportedException  {
        HardDrive hardDrive1= new HardDrive("aaa","bbb",200);
        Processor processor1 = new Processor("aaaa",1000,4);
        Laptop asus= new Laptop("Asus",processor1,hardDrive1,20,2000,10);
        Laptop clonedLaptop= (Laptop) asus.clone();
        System.out.println(asus.toString());
        System.out.println(clonedLaptop.toString());
    }
}
//Create class Processor with properties: name, frequency, number of cores.
//Create class HardDrive with properties: name, type, capacity.
//Create class Laptop with properties: name, Processor, HardDrive, display size, weight, RAM amount.
//
//Create another class with main method.
//Create Laptop instance with HardDrive and Processor inside.
//
//Perform deep cloning for Laptop.
//Deep cloning - means, clone not only laptop itself, but also everything what was inside.
///20