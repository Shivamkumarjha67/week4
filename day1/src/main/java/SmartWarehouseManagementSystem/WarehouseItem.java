package SmartWarehouseManagementSystem;

// Abstract WarehouseItem class definition
public abstract class WarehouseItem {
    // Attributes declaration
    private int id;
    private String name;
    private double price;

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Parameterized constructor
    WarehouseItem(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Abstract method declaration
    abstract void getDetails();
}
