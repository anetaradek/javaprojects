package factorial;

public class FactorialMain {
    public static void main(String[] args) {
        System.out.println("Calculation of factorial for numbers 1-10");
        Factorial f= new Factorial();
        for (int i = 1; i <=10 ; i++) {
            System.out.print(f.factorial(i)+" ");
        }
    }
}
