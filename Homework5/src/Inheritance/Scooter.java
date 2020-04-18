package Inheritance;

public class Scooter extends Transport {
    public Scooter(String name){
        super(name);
    }
    @Override
    public void go() {
        System.out.println("Someone is riding on the scooter");
    }
}
