public class PrimeNumbers {
    public static void main(String[] args) {
        //Print out all prime numbers in range from 1 to 100.
        //Prime number - is a number, which can be divided without reminder only on 1 or on itself. For example 1, 2, 3, 5, 7, 11...
        //Hint: using one while loop inside of another can help you with solution.

        for (int i = 1; i <= 100; i++){
            int a = 0;
            for(int j = 1;j <= i; j++)
            {
                if(i%j==0)
                    a++;
            }
            if(a==2)
                System.out.println(i);
        }

    }
}
