package ItemsInOnlineShop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Catalogue {
    ArrayList<Item> items;

    public List<Item> getItems() {
        return items;
    }

    public Catalogue(ArrayList<Item> items) {
        this.items = items;
    }

    public void sort(){
        Collections.sort(items);
    }

    public void reverseSort(){
        Collections.sort(items,Collections.reverseOrder());
    }

    public void sortByPrice(){
        Collections.sort(items,new Item());
    }
    public void sortByPriceReversed(){
        Collections.sort(items,Collections.reverseOrder(new Item()));
    }
}
