import java.util.Scanner;

public class AverageValue {
    public static void main(String[] args) {
        int a=args.length;
        double sum = 0;
        for(int i=0;i<a;i++) {
            double number = Double.parseDouble(args[i]);
            sum+=number;
        }
        double averageValue= sum/a;
        System.out.println("Average value equals = "+averageValue);


    }
}