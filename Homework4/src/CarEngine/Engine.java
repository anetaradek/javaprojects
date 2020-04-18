package CarEngine;

public class Engine {
    private String name;
    private int horsepower;
    private int capacity;
    private Boolean isStarted = false;

    public Engine(String name, int horsepower, int capacity) {
        this.name = name;
        this.horsepower = horsepower;
        this.capacity = capacity;
    }

    public int getHorsepower() {
        return horsepower;
    }
    public int getCapacity() {
        return capacity;
    }
    public String getName() { return name; }

    public Boolean getStarted() {
        return isStarted;
    }

    public void startEngine() {
        if (!isStarted) {
            isStarted = true;
            System.out.println("Car "+ name+ " is starting " +getName()+ " engine");
            System.out.println(getName() + " engine has been started ");
        } else {
            System.out.println(getName() + " engine has been started already in " + name);
        }
    }

    public void stopEngine() {
        if (!isStarted) {
            System.out.println(getName() + " engine has been stopped already in " + name);
        } else {
            isStarted = false;
            System.out.println("Car "+ name + " is stopping " +getName()+" engine");
            System.out.println(getName() + " engine has been stopped");
        }
    }
}
