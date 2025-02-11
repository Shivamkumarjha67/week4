package SmartWarehouseManagementSystem;

import java.util.ArrayList;

// Storage class definitions
public class Storage<T extends WarehouseItem> {
    // List of items
    ArrayList<T> listItem;

    // Storage class constructor
    public Storage() {
        listItem = new ArrayList<>();
    }

    // Adding the item tot the list
    public void addItem(T items) {
        listItem.add(items);
    }

    // Getting details of this class
    public ArrayList<T> getItems() {
        return listItem;
    }

    // Displaying the details of all items
    public static void displayAllItems(ArrayList<? extends WarehouseItem> listItem) {
        for(WarehouseItem item : listItem) {
            item.getDetails();
        }
    }
}
