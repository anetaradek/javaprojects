package CarEngine;

public class Car {
    public String name;
    public Engine engine;
    public int fuelTankCapacity;
    public double remainingFuelAmount;

    public Car(String name, Engine engine, int fuelTankCapacity) {
        this.name = name;
        this.engine = engine;
        this.fuelTankCapacity = fuelTankCapacity;
        this.remainingFuelAmount = fuelTankCapacity;
    }

    public void startEngine() {
        if (!engine.isStarted) {
            engine.isStarted = true;
            System.out.println("Car "+ name+ " is starting " +engine.name+ " engine");
            System.out.println(engine.name + " engine has been started ");
        } else {
            System.out.println(engine.name + " engine has been started already in " + name);
        }
    }

    public void stopEngine() {
        if (!engine.isStarted) {
            System.out.println(engine.name + " engine has been stopped already in " + name);
        } else {
            engine.isStarted = false;
            System.out.println("Car "+ name + " is stopping " +engine.name+" engine");
            System.out.println(engine.name + " engine has been stopped");
        }
    }

    public void tank() {
        System.out.println("Car " + name + " has been tanked up");
        remainingFuelAmount = fuelTankCapacity;
    }

    public void drive(int speed, int km) {
        if(remainingFuelAmount==0){
            System.out.println("Car " +name+ " can't be driven. Tank is empty");
        }else if(!engine.isStarted){
            System.out.println("Car "+ name + " can't be driven cause engine stopped");
        }
        else {
            int maxSpeed = engine.horsepower * 2;
            if (speed > maxSpeed) {
                speed = maxSpeed;
            }
            double neededFuel = km * 0.1 * engine.capacity / 1000;
            if (remainingFuelAmount > neededFuel) {
                remainingFuelAmount = remainingFuelAmount - neededFuel;
                System.out.println("Car " + name + " has been driven for " + km + " km with speed " + speed + " km/h. Remaining fuel: " +
                        (int)remainingFuelAmount+"L");
            }else if(remainingFuelAmount==neededFuel){
                remainingFuelAmount=0;
                System.out.println("Car " + name + " has been driven for " + km + " km with speed " + speed + " km/h. Tank is empty");
            }
            else{
               double maxKm = remainingFuelAmount*10000/engine.capacity;
                System.out.println("Car " + name + " has been driven for " + (int)maxKm + " km with speed " + speed + " km/h. Tank is empty");
                remainingFuelAmount=0;
            }
        }


    }
}