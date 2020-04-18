package FibonacciSequence;

public class FibonacciMain {
    public static void main(String[] args) {
        System.out.println("Print first 10 numbers of Fibonacci Sequence");
        Fibonacci f= new Fibonacci();
        for (int i = 0; i <10 ; i++) {
            System.out.print(f.fib(i)+" ");
        }
    }
}
