package CarEngine;

public class Engine {
    private String name;
    private int horsepower;
    private int capacity;

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
}
