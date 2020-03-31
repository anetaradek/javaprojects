public class FindMinElement {
    public static void main(String[] args) {
        //For given application parameters print out minimum number
        //> java FindMinElement 1 2 -3 10 -5 0
        //Minimum number: -5
        int minNumber=Integer.parseInt(args[0]);
        for(String num: args){

            if(minNumber>=Integer.parseInt(num)) {
                minNumber = Integer.parseInt(num);
            }

        }
        System.out.println("Minimum element = "+minNumber);
    }
}
