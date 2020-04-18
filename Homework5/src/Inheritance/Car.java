package Inheritance;

public class Car extends Transport {
    public Car(String name){
        super(name);
    }
    @Override
    public void go() {
        System.out.println("Car is riding");
    }
}

