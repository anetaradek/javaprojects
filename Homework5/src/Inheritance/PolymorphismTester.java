package Inheritance;

public class PolymorphismTester {
    public static void main(String[] args) {
        newMethod(new Motorbike("Ericson"));
        newMethod(new Bicycle("Romet"));
        newMethod(new Bus("Solaris",18));
        newMethod(new Airplane("Tupolew",120));
        newMethod(new Train("Pendolino",80));
        newMethod(new Tram("Pesa",80));
        newMethod(new Car("Ford"));
        newMethod(new Scooter("Suzuki Burgman"));
    }
    public static void newMethod(Transport vehicle){
        vehicle.go();
    }
}
