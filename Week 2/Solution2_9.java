package Bai2_9;
import java.util.Scanner;
class ProductStore {
    private String name;
    private double price;
    private int quantity;
    private double discount;
    private static double taxRate = 0.1;
    private static double totalRevenue = 0.0;
    public ProductStore(String name, double price, int quantity, double discount) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.discount = discount;
    }
    public static void updateTaxRate(double newRate) {
        taxRate = newRate;
    }
    public double calculateFinalPrice() {
        return (price - discount) * (1 + taxRate);
    }
    public void updateDiscount(double newDiscount) {
        this.discount = newDiscount;
    }
    public void sell(int amount) {
        if (amount <= quantity) {
            quantity -= amount;
            double revenue = amount * calculateFinalPrice();
            totalRevenue += revenue;
            System.out.println("Bán thành công " + amount + " sản phẩm " + name + ". Thu về: " + revenue);
        } else {
            System.err.println("Không đủ hàng trong kho cho sản phẩm " + name);
        }
    }
    public static double getTotalRevenue() { return totalRevenue; }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập thông tin sản phẩm 1 (name price quantity discount):");
        ProductStore p1 = new ProductStore(scanner.next(), scanner.nextDouble(), scanner.nextInt(), scanner.nextDouble());
        System.out.println("Nhập thông tin sản phẩm 2 (name price quantity discount):");
        ProductStore p2 = new ProductStore(scanner.next(), scanner.nextDouble(), scanner.nextInt(), scanner.nextDouble());
        System.out.println("Nhập số lượng mua cho p1:");
        p1.sell(scanner.nextInt());
        System.out.println("Nhập số lượng mua cho p2:");
        p2.sell(scanner.nextInt());
        System.out.println("Giá cuối p1 ban đầu: " + p1.calculateFinalPrice());
        System.out.println("Giá cuối p2 ban đầu: " + p2.calculateFinalPrice());
        ProductStore.updateTaxRate(0.08);
        System.out.println("Giá cuối p1 sau khi giảm thuế: " + p1.calculateFinalPrice());
        System.out.println("Giá cuối p2 sau khi giảm thuế: " + p2.calculateFinalPrice());
        p1.updateDiscount(10.0);
        System.out.println("Giá cuối p1 sau khi đổi discount: " + p1.calculateFinalPrice());
        System.out.println("Giá cuối p2 (không đổi discount): " + p2.calculateFinalPrice());
        System.out.println("Tổng doanh thu toàn hệ thống: " + ProductStore.getTotalRevenue());
        scanner.close();
    }
}
