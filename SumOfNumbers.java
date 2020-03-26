public class SumOfNumbers {
    public static void main(String[] args) {
        double sum = 0;
        for(String num: args){
            sum += Double.parseDouble(num);
        }
        System.out.println("Sum of numbers = "+sum);
    }
}
