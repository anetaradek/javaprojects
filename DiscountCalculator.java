import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        double discountedPrice= 0;
        System.out.println("Please, input item price");
        Scanner scanner = new Scanner(System.in);

        double itemPrice;
        itemPrice = scanner.nextDouble();
        System.out.println("Please, input customer age");
        int customerAge = scanner.nextInt();
        if(customerAge < 6){
            discountedPrice = 0.2*itemPrice;
        }
        else if((customerAge>=6)&&(customerAge<18)){
            discountedPrice = 0.75*itemPrice;
        }
        else if(customerAge>65){
            discountedPrice=0.7*itemPrice;
        }
        else{
            discountedPrice= itemPrice;
        }

        System.out.printf(String.format("Discounted price is %.2f\n",discountedPrice));
    }
}
