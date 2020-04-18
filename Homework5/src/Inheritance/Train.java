package Inheritance;

public class Train extends PublicTransport {
    public Train(String name,int numberOfPeople){
        super(name,numberOfPeople);
    }
    @Override
    public void go() {
        System.out.println("Train is moving on rails");
    }
}
