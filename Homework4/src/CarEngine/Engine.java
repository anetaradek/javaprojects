package CarEngine;

public class Engine {
    private String name;
    private int horsepower;
    private int capacity;
    private Boolean isStarted;

    public Engine(String name, int horsepower, int capacity) {
        this.name = name;
        this.horsepower = horsepower;
        this.capacity = capacity;
        this.isStarted = false;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public int getCapacity() {
        return capacity;
    }

    public Boolean getStarted() {
        return isStarted;
    }

    public void setStarted(Boolean started) {
        isStarted = started;
    }
}
