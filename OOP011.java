import java.util.Scanner;

class Product{
  private String productId;
  private String name;
  private double price;
  public Product(String productId, String name, double price) {
    this.productId = productId;
    this.name = name;
    this.price = price;
  }
  
  public String getProductId() {
    return productId;
  }

  public String getName() {
    return name;
  }

  public double getPrice() {
    return price;
  }

  public void display(){
    System.out.printf("Sản phẩm: %s (Mã: %s)\n",this.name,this.productId);
    System.out.printf("Giá: %.1f\n",this.price);
  }
}
class Order{
  private String orderId;
  private Product product;
  private int quantity;
  public Order(String orderId, Product product, int quantity) {
    this.orderId = orderId;
    this.product = product;
    this.quantity = quantity;
  }
  public double calculateTotal(){
    return this.quantity*this.product.getPrice();
  }
  public void display(){
    System.out.println("--- Thông tin đơn hàng ---");
    System.out.printf("Đơn hàng: %s\n",this.orderId);
    this.product.display();
    System.out.printf("Số lượng: %d\n",this.quantity);
    System.out.printf("Tổng tiền: %.1f\n",this.calculateTotal());
  }
}
public class OOP011{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String productId=sc.nextLine();
    String name=sc.nextLine();
    double price=sc.nextDouble();
    sc.nextLine(); // consume the newline character
    String orderId=sc.nextLine();
    int quantity=sc.nextInt();
    Product product=new Product(productId,name,price);
    Order order=new Order(orderId,product,quantity);
    order.display();
    sc.close();
  }
}