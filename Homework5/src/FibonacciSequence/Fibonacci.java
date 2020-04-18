package FibonacciSequence;

public class Fibonacci {
    public int fib(int number){
        int ret=0;

        if(number==1) {
            ret = 1;
        }
        if(number>1) {
            ret = fib((number-1))+fib((number-2));
        }
        return ret;
    }
}
