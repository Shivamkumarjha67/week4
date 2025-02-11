package SmartWarehouseManagementSystem;

// Furniture class definition
public class Furniture extends WarehouseItem{
    // Attributes
    private String material;

    // Furniture class parameterized constructor
    Furniture(int id, String name, double price, String material) {
        super(id, name, price);
        this.material = material;
    }

    // Overriding the method of abstract class
    @Override
    void getDetails() {
        System.out.println("Furniture name is " + getName() + ", id is " + getId() + " and material used is  " + material + " which costs " + getPrice());
    }
}
