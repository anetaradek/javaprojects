package ItemsInOnlineShop;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Item> arrayList = new ArrayList<>();
        arrayList.add(new Item("item1",12));
        arrayList.add(new Item("item4",7));
        arrayList.add(new Item("item3",4));
        arrayList.add(new Item("item2",50));
        arrayList.add(new Item("item5",123));
        arrayList.add(new Item("item7",8));
        arrayList.add(new Item("item5",123));
        arrayList.add(new Item("item6",102));
        arrayList.add(new Item("item8",25));

        Catalogue catalogue = new Catalogue(arrayList);

        catalogue.sort();
        System.out.println("Sorted by name");
        System.out.println(catalogue.getItems());
        catalogue.reverseSort();
        System.out.println("Sorted by name reversed");
        System.out.println(catalogue.getItems());
        catalogue.sortByPrice();
        System.out.println("Sorted by price");
        System.out.println(catalogue.getItems());
        catalogue.sortByPriceReversed();
        System.out.println("Sorted by price reversed");
        System.out.println(catalogue.getItems());
    }
}
