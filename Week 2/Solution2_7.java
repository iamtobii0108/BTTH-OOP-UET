package Bai2_7;
class Product {
    private String id;
    private String name;
    private double price;
    public Product(String id, String name, double price) {
        this.id = id; this.name = name; this.price = price;
    }
    public Product(Product other) {
        this.id = other.id; this.name = other.name; this.price = other.price;
    }
    public void setPrice(double price) { this.price = price; }
    @Override
    public String toString() { return name + ": " + price; }
}
class Inventory {
    private Product[] items;
    public Inventory(Product[] initialItems) {
        this.items = new Product[initialItems.length];
        for (int i = 0; i < initialItems.length; i++) {
            this.items[i] = new Product(initialItems[i]);
        }
    }
    public void printInventory() {
        for (Product p : items) System.out.println(p);
    }
    public static void main(String[] args) {
        Product[] arr = { new Product("P1", "Laptop", 1000) };
        Inventory kho = new Inventory(arr);
        arr[0].setPrice(5000);
        kho.printInventory();
    }
}