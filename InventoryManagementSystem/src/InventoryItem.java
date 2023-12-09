import java.util.Scanner;
public class InventoryItem {
    private String productName;
    private String manufacturerName;
    private double costPrice;
    private double sellingPrice;
    double profit;

    InventoryItem(){
        Scanner keyboard = new Scanner(System.in);
        this.setProductName(productName);
        this.setManufacturerName(manufacturerName);
        this.setCostPrice(costPrice);
        this.setSellingPrice(sellingPrice);

        System.out.println("Please enter the 'Product Name': ");
        setProductName(keyboard.nextLine());
        System.out.println("Please enter the 'Manufacterer Name': ");
        setManufacturerName(keyboard.nextLine());
        System.out.println("Please enter the 'Cost price': ");
        setCostPrice(keyboard.nextDouble());
        System.out.println("Please enter the 'Selling price': ");
        setSellingPrice(keyboard.nextDouble());
    }
    double calculateProfit(){
        profit = sellingPrice - costPrice;
        return profit;
    }

    void sayTheValues(){
        System.out.println("Product name is: " + productName);
        System.out.println("Manufacterer name is: " + manufacturerName);
        System.out.println("Cost price is: " + costPrice);
        System.out.println("Selling price is: " + sellingPrice);
        System.out.println("Profit is: " + calculateProfit());
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public double getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(double costPrice) {
        this.costPrice = costPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }
}
