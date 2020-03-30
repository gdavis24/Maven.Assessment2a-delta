package rocks.zipcode.assessment2.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * Use a map to keep track of inventory in a store
 */
public class Inventory {
    /**
     * @param strings list of strings to add / remove / fetch from
     */
    List<String> myList;
    public Inventory(List<String> strings) {
        this.myList = new ArrayList<>(strings);
    }

    /**
     * nullary constructor initializes a new list
     */
    public Inventory() {
        this.myList = new ArrayList<>();
    }

    /**
     * @param item - increment the number of this item in stock by 1
     */
    public void addItemToInventory(String item) {

        myList.add(item);

    }

    /**
     * @param item - decrement the number of this item in stock by 1
     */
    public void removeItemFromInventory(String item) {
        myList.remove(item);

    }

    /**
     * @param item - Search for this item in stock
     * @return - return the number of items
     */
    public Integer getItemQuantity(String item) {

        return myList.size();
    }
}
