package Inheritance;

public class Tram extends PublicTransport {
    public Tram(String name,int numberOfPeople){
        super(name,numberOfPeople);
    }

    @Override
    public void go() {
        System.out.println("Tram is moving on rails");
    }
}
