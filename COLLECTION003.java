import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

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
    public Set<String> products(){
      Set<String>ans=new HashSet<String>();
      for(int i=0;i<products.size();i++){
        if(products.get(i).getStock()>0){
          ans.add(products.get(i).getName());
        }
      }
      return ans;
    }
}
public class COLLECTION003 {
  public static void main(String[] args) {
    Warehouse x=new Warehouse();
    x.addProduct("milk",3,10);
    x.addProduct("coffee", 5, 6);
    x.addProduct("buttermilk", 20, 2);
    x.addProduct("yogurt", 2, 20);
    x.take("buttermilk");
    x.take("milk");
    x.take("buttermilk");
    Set<String>res=x.products();
    for(String a:res){
      System.out.println(a);
    }
  }
}
