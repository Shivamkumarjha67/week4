package SmartWarehouseManagementSystem;

// Electronics class definition
public class Electronics extends WarehouseItem{
    // Attributes
    public final String brand;

    // Electronics class parameterized constructor
    public Electronics(int id, String name, double price, String brand) {
        // Passing the values to super class constructor
        super(id, name, price);
        this.brand = brand;
    }

    // Overriding the method of abstract class
    @Override
    void getDetails() {
        System.out.println("Electronics name is " + getName() + ", id is " + getId() + " and it's brand name is " + brand + " which costs " + getPrice());
    }
}
