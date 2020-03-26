import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class RandomNumbers {
    public static void main(String[] args) {
        //Write application which create int array of 10 elements.
        //Fill this array with random numbers from 0 to 100.
        //Print array to console.
        //
        //Hint:
        //The easiest way to print array is using method Arrays.toString(...)
        //To generate a random number use ThreadLocalRandom.current()
        //Left it for you for self-learning.

        int[] randomArray = new int[10];
        for(int i=0; i<10;i++){
            randomArray[i]= ThreadLocalRandom.current().nextInt(0,100);
        }
        String answer = Arrays.toString(randomArray);
        System.out.println(" This is how this array looks like "+ answer);
    }
}
