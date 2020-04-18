package Inheritance;

public class Motorbike extends Transport {
    public Motorbike(String name){
        super(name);
    }
    @Override
    public void go() {
        System.out.println("Someone is riding on the motorbike");
    }
}
