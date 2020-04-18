package Inheritance;

 public class PublicTransport extends Transport {
    private int numberOfPeople;
    public PublicTransport(String name, int numberOfPeople) {
        super(name);
        this.numberOfPeople=numberOfPeople;
    }

    @Override
    public void go() {
        super.go();
    }
}
