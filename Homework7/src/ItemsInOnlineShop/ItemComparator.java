package ItemsInOnlineShop;

import java.util.Comparator;

public class ItemComparator implements Comparator<Item> {

    @Override
    public int compare(Item item, Item item2) {
        return item.getPrice()-item2.getPrice();
    }
}
