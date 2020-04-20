package Beer;

public class BeerTester {
    public static void main(String[] args) {
        Beer beer1=new Beer("KSIĄŻĘCE","IPA",5.4,500);
        Beer beer2=new Beer("KSIĄŻĘCE","IPA",5.4,500);
        Beer beer3=new Beer("KSIĄŻĘCE","IRISH ALE",4.8,500);
        Beer beer4=new Beer("KSIĄŻĘCE","WEIZEN",5.3,500);
        Beer beer5=new Beer("KSIĄŻĘCE","PORTER",8,500);
        System.out.println(beer1.equals(beer2));
        System.out.println(beer2.equals(beer3));
    }
}
