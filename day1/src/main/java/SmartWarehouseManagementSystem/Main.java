package SmartWarehouseManagementSystem;

public class Main {
    public static void main(String[] args) {
        // Defining the list of the electronics, furniture and groceries
        Storage<Electronics> listOfElectronic = new Storage<>();
        Storage<Furniture> listOfFurniture = new Storage<>();
        Storage<Groceries> listOfGroceries = new Storage<>();

        // Adding the electronic item
        listOfElectronic.addItem(new Electronics(102, "Charger", 340.45, "Boat"));
        listOfElectronic.addItem(new Electronics(103, "Cable", 140.78, "Boat"));
        listOfElectronic.addItem(new Electronics(104, "Phone", 12700.50, "LAVA"));

        // Adding the furniture item
        listOfFurniture.addItem(new Furniture(304, "Bed", 30000.0, "Oak"));
        listOfFurniture.addItem(new Furniture(305, "Desk", 4800.0, "Oak"));
        listOfFurniture.addItem(new Furniture(306, "Almirah", 8000.0, "Oak"));

        // Adding the groceries item
        listOfGroceries.addItem(new Groceries(502, "Paste", 450, "04/2025"));
        listOfGroceries.addItem(new Groceries(503, "Brush", 25, "04/2028"));
        listOfGroceries.addItem(new Groceries(504, "Soap", 45, "08/2026"));

        // Displaying the details of all storage objects one by one
        Storage.displayAllItems(listOfElectronic.getItems());
        Storage.displayAllItems(listOfFurniture.getItems());
        Storage.displayAllItems(listOfGroceries.getItems());
    }
}
