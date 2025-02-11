package SmartWarehouseManagementSystem;

// Groceries class definition
public class Groceries extends WarehouseItem {
    // Attributes
    private String expiry;

    // Groceries class parameterized constructor
    Groceries(int id, String name, double price, String expiry) {
        super(id, name, price);
        this.expiry = expiry;
    }

    // Overriding the method of abstract class
    @Override
    void getDetails() {
        System.out.println("Grocery name is " + getName() + ", id is " + getId() + " and it's expiry date is " + expiry + " which costs " + getPrice());
    }
}
