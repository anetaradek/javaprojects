package CarEngine;

public class Engine {
    public String name;
    public int horsepower;
    public int capacity;
    public Boolean isStarted;

    public Engine(String name,int horsepower,int capacity) {
        this.name = name;
        this.horsepower = horsepower;
        this.capacity = capacity;
        this.isStarted = false;
    }

    public void startEngine() {
        if (!isStarted) {
            isStarted = true;
            System.out.println("Car "+ name+ " is starting " +name+ " engine");
            System.out.println(name + " engine has been started ");
        } else {
            System.out.println(name + " engine has been started already in " + name);
        }
    }

    public void stopEngine() {
        if (!isStarted) {
            System.out.println(name + " engine has been stopped already in " + name);
        } else {
            isStarted = false;
            System.out.println("Car "+ name + " is stopping " +name+" engine");
            System.out.println(name + " engine has been stopped");
        }
    }

}
