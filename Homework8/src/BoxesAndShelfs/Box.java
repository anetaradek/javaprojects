package BoxesAndShelfs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Box<T> {
    List<T> box = new LinkedList<>();

    public void add(T item) {
        if (!box.contains(item)) {
            box.add(item);
        }
    }

    public Collection<T> getAllItems() {
        return new ArrayList<>(box);
    }
}
