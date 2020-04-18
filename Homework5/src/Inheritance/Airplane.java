package Inheritance;

public class Airplane extends PublicTransport {
public Airplane(String name,int numberOfPeople){
    super(name,numberOfPeople);
}

    @Override
    public void go() {
        System.out.println("Airplane is flying");
    }
}
