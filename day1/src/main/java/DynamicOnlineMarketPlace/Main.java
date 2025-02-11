package DynamicOnlineMarketplace;

public class Main {
    public static void main(String[] args) {
        // Defining the product catalog object
        ProductCatalog catalog = new ProductCatalog();

        // Create products of different categories
        Product<BookCategory> book1 = new Product<>("Rich dad, poor dad", 205.0, new BookCategory() {});
        Product<ClothingCategory> pant1 = new Product<>("Pajama", 999.0, new ClothingCategory() {});
        Product<GadgetCategory> laptop1 = new Product<>("Laptop", 59800.0, new GadgetCategory() {});

        // Adding products to the catalog
        catalog.addProduct(book1);
        catalog.addProduct(pant1);
        catalog.addProduct(laptop1);

        // Display products
        System.out.println("Products in the catalog:");
        catalog.displayProducts();

        // Apply a discount to a book
        catalog.applyDiscount(book1, 10);

        //Apply discount to a pant
        catalog.applyDiscount(pant1, 20);

        //Apply discount to a pant
        catalog.applyDiscount(laptop1, 9.9);

        // Display products after discount
        System.out.println("\nProducts in the catalog after discount:");
        //Price not updated in the object itself, only in the discount message.
        catalog.displayProducts();

    }
}
