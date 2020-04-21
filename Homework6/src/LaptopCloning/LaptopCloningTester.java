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
