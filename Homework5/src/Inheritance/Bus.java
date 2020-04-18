package Inheritance;

public class Bus extends PublicTransport {
    public Bus(String name,int numberOfPeople){
        super(name,numberOfPeople);
    }

    @Override
    public void go() {
        System.out.println("Bus is riding");
    }
}
