import java.util.*;
class Product{
  private String name;
  private int price,stock;
  public Product(String name, int price, int stock) {
    this.name = name;
    this.price = price;
    this.stock = stock;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public int getPrice() {
    return price;
  }
  public void setPrice(int price) {
    this.price = price;
  }
  public int getStock() {
    return stock;
  }
  public void setStok(int stock) {
    this.stock = stock;
  }
  public String toString(){
    return String.format("%s: %d",this.name,this.price);
  }
  
}
class Warehouse{
   ArrayList<Product>products;
   public Warehouse(){
       products=new ArrayList<>();
   }
   public void addProduct(String product,int price,int stock){
      products.add(new Product(product, price, stock));
   }
   public String price(String product){
    for(int i=0;i<products.size();i++){
      if(this.products.get(i).getName().equals(product)){
        return this.products.get(i).toString();
      }
    }
    return String.format("%s: %d",product,-99);
   }
}
public class COLLECTION001 {
  public static void main(String[] args) {
    
    Warehouse x=new Warehouse();
    x.addProduct("milk", 3, 10);
    x.addProduct("coffee", 5, 7);
    System.out.println("prices:");
    System.out.println(x.price("milk"));
    System.out.println(x.price("coffee"));
    System.out.println(x.price("sugar"));
  }
}