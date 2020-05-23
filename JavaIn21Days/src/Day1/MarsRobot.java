package Day1;

public class MarsRobot {
    String status;
    int speed;
    float temperature;

    void checkTemperature(){
        if (temperature< -62){
            status="Powrot do domu";
            speed=5;
        }
    }
    void showAtributes(){
        System.out.println("Status: "+ status);
        System.out.println("Prędkość: "+speed);
        System.out.println("Temperatura: "+temperature);
    }
}
