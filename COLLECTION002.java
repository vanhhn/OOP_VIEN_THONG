import java.util.ArrayList;

class Product{
  private String name;
  private int price;
  private int stock;
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
  public void setStock(int stock) {
    this.stock = stock;
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
    public int price(String product){
      for(Product x:products){
        if(x.getName().equals(product)){
          return x.getPrice();
        }
      }
      return -99;
    }
    public int stock(String product){
      for(Product x:products){
        if(x.getName().equals(product)){
          return x.getStock();
        }
      }
      return 0;
    }
    public boolean take(String product){
      for(Product x:products){
        if(x.getName().equals(product)&&x.getStock()>=1){
         x.setStock(x.getStock()-1);
         return true;
        }
      }
      return false;
    }
}
public class COLLECTION002 {
  public static void main(String[] args) {
    Warehouse x=new Warehouse();
    x.addProduct("coffee", 5, 1);
    System.out.println("stock:");
    System.out.println("coffee:  "+x.stock("coffee"));
    System.out.println("sugar: "+x.stock("sugar"));
    System.out.printf("taking coffee %s\n",x.take("coffee"));
    System.out.printf("taking coffee %s\n",x.take("coffee"));
    System.out.printf("taking sugar %s\n",x.take("coffee"));
    System.out.println("stock:");
    System.out.println("coffee:  "+x.stock("coffee"));
    System.out.println("sugar: "+x.stock("sugar"));
  }
}
