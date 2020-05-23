package Day1;

public class MarsApplication {
    public static void main(String[] args) {
        MarsRobot spirit = new MarsRobot();
        spirit.status="eksploracja";
        spirit.speed=2;
        spirit.temperature= -60;

        spirit.showAtributes();
        System.out.println("Zwiększenie prędkości do 3.");
        spirit.speed=3;
        spirit.showAtributes();
        System.out.println("Zmiana temperatury na -90");
        spirit.temperature=-90;
        spirit.showAtributes();
        System.out.println("Sprawdzenie temperatury");
        spirit.checkTemperature();
        spirit.showAtributes();

    }
}
