package CarEngine;

public class CarEngineTester {
    public static void main(String[] args) {

        Engine diesel = new Engine("Diesel", 130, 2000);
        Car vw = new Car("VW Golf", diesel, 50);
        vw.drive(100, 50);
        //Car VW Golf cant be driven cause engine stopped
        vw.startEngine();
        //Car VW Golf is starting Diesel engine
        //Diesel engine has been started
        vw.startEngine();
        //Diesel engine has been started already in VW Golf
        vw.stopEngine();
        //Car VW Golf is stopping Diesel engine
        //Diesel engine has been stopped
        vw.startEngine();
        //Car VW Golf is starting Diesel engine
        //Diesel engine has been started
        vw.drive(100, 50);
        //Car VW Golf has been driven for 50 km with speed 100km/h. Remaining fuel: 40L
        vw.drive(500, 50);
        //Car VW Golf has been driven for 50 km with speed 260km/h. Remaining fuel: 30L
        vw.drive(100, 200);
        //Car VW Golf has been driven for 150 km with speed 100km/h. Tank is empty
        vw.drive(100, 50);
        //Car VW Golf can't be driven. Tank is empty
        vw.tank();
        //Car VW Golf has been tanked up
        vw.drive(100, 50);
        //Car VW Golf has been driven for 50 km with speed 100km/h. Remaining fuel: 40L
    }
}