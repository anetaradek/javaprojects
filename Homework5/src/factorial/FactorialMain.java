package factorial;

public class FactorialMain {
    public static void main(String[] args) {
        System.out.println("Calculation of factorial for numbers 1-10");
        Factorial f= new Factorial();
        long[]array =new long[10];
        for (int i = 1; i <=10 ; i++) {
            array[i-1]=f.factorial(i);
            System.out.print(array[i-1]+" ");
        }
    }
}
