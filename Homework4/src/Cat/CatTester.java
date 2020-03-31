package Cat;

public class CatTester {
    public static void main(String[] args) {
        Cat tom = new Cat("Tom");
        tom.eat("mouse");
        tom.eat("sausage");
        tom.isHungry();
        tom.sleep(5);
        tom.isHungry();
        tom.eat("mouse");
        tom.play("ball");

    }
}