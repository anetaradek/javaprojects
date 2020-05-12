package Bank;

public class NegativeValueException extends Exception {
    public NegativeValueException(String s) {
        System.out.println(s);
    }
}
