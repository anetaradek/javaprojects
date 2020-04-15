package CarEngine;

public class Car {
    private String name;
    private Engine engine;
    private int fuelTankCapacity;
    private double remainingFuelAmount;

    public Car(String name, Engine engine, int fuelTankCapacity) {
        this.name = name;
        this.engine = engine;
        this.fuelTankCapacity = fuelTankCapacity;
        this.remainingFuelAmount = fuelTankCapacity;
    }

    public void tank() {
        System.out.println("Car " + name + " has been tanked up");
        remainingFuelAmount = fuelTankCapacity;
    }

    public void drive(int speed, int km) {
        if (remainingFuelAmount == 0) {
            System.out.println("Car " + name + " can't be driven. Tank is empty");
        } else if (!engine.getStarted()) {
            System.out.println("Car " + name + " can't be driven cause engine stopped");
        } else {
            int maxSpeed = engine.getHorsepower() * 2;
            if (speed > maxSpeed) {
                speed = maxSpeed;
            }
            double neededFuel = km * 0.1 * engine.getCapacity() / 1000;
            if (remainingFuelAmount > neededFuel) {
                remainingFuelAmount = remainingFuelAmount - neededFuel;
                System.out.println("Car " + name + " has been driven for " + km + " km with speed " + speed + " km/h. Remaining fuel: " +
                        (int) remainingFuelAmount + "L");
            } else if (remainingFuelAmount == neededFuel) {
                remainingFuelAmount = 0;
                System.out.println("Car " + name + " has been driven for " + km + " km with speed " + speed + " km/h. Tank is empty");
            } else {
                double maxKm = remainingFuelAmount * 10000 / engine.getCapacity();
                System.out.println("Car " + name + " has been driven for " + (int) maxKm + " km with speed " + speed + " km/h. Tank is empty");
                remainingFuelAmount = 0;
            }
        }
    }
        public void startEngine() {
            if (!engine.getStarted()) {
                engine.setStarted(true);
                System.out.println("Car "+ name+ " is starting " +name+ " engine");
                System.out.println(name + " engine has been started ");
            } else {
                System.out.println(name + " engine has been started already in " + name);
            }
        }

        public void stopEngine() {
            if (!engine.getStarted()) {
                System.out.println(name + " engine has been stopped already in " + name);
            } else {
                engine.setStarted(false);
                System.out.println("Car "+ name + " is stopping " +name+" engine");
                System.out.println(name + " engine has been stopped");
            }
        }



}