package factorial;

public class Factorial {
    public long factorial(int number){
        long ret = 0;
        if(number<2) {
            ret = 1;
        }
        if(number>=2) {
            ret = number*factorial(number-1);
        }
        return ret;
    }
}
