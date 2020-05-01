package ItemsInOnlineShop;

import java.util.Comparator;

public class Item implements Comparable<Item>, Comparator<Item> {
    private String name;
    private int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public Item() {
    }

    @Override
    public int compareTo(Item item) {
    return this.getName().compareTo(item.getName());
    }

    @Override
    public int compare(Item item, Item item2) {
        return item.getPrice()-item2.getPrice();
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                "}\n";
    }
}
