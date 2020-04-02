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

}
