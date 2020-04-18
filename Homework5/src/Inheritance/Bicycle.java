package Inheritance;

public class Bicycle extends Transport {
    public Bicycle(String name){
        super(name);
    }
    @Override
    public void go() {
        System.out.println("Bike is riding");
    }
}
