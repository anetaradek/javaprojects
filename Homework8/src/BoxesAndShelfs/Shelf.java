package BoxesAndShelfs;

import java.util.ArrayList;
import java.util.List;

public class Shelf<T> {
    List<T> shelf = new ArrayList<>();

    public void add(T box) {
        if (!shelf.contains(box)) {
            shelf.add(box);
        }
    }

}
