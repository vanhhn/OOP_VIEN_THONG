import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Item{
  private String product;
  private int quantity,unitPrice;

  public Item(String product, int quantity, int unitPrice) {
    this.product = product;
    this.quantity = quantity;
    this.unitPrice = unitPrice;
  }

  public String getProduct() {
    return product;
  }

  public void setProduct(String product) {
    this.product = product;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public int getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(int unitPrice) {
    this.unitPrice = unitPrice;
  }
  public String toString(){
    return String.format("Product: %s has quantity %d with price: %d",this.product,this.quantity,this.quantity*this.unitPrice);
  }
  
}
class Warehouse{
   private HashMap<String,Integer>warehouseStock;
   private ArrayList<Item>arr;
   public Warehouse(){
    warehouseStock=new HashMap<>();
    arr=new ArrayList<>();
   }
   public void addProduct(String product,int quantity){
    if(warehouseStock.containsKey(product)){
    warehouseStock.put(product,quantity);
    }
   }
   public void increaseItemInWarehouseByOne(){
      for(Map.Entry<String,Integer>entry:warehouseStock.entrySet()){
        warehouseStock.put(entry.getKey(),entry.getValue()+1);
      }
   }
   public void takeToItem(String product,int quantity){
        if(warehouseStock.containsKey(product)){
          if(warehouseStock.get(product) <quantity){
                  warehouseStock.put(product,0);
          }
          else{
            warehouseStock.put(product,warehouseStock.get(product)-quantity);
          }
        }
   }
   public void Import(Item item){
    warehouseStock.put(item.getProduct(),item.getQuantity());
   }
  
}
public class COLLECTION004 {
  public static void main(String[] args) {
    Item milk=new Item("milk", 4, 2);
    Item buttermilk=new Item("buttermilk", 10, 2);
    Warehouse x=new Warehouse();
    x.Import(milk);
   System.out.println(milk);
    x.Import(buttermilk);
   System.out.println(buttermilk);
    x.addProduct("milk", 1);
    milk.setQuantity(milk.getQuantity()-1);
    System.out.println(milk);
    x.addProduct("buttermilk", 3);
    buttermilk.setQuantity(buttermilk.getQuantity()-3);
    System.out.println(buttermilk);
    x.increaseItemInWarehouseByOne();
    milk.setQuantity(milk.getQuantity()-1);
    buttermilk.setQuantity(buttermilk.getQuantity()-1);
    System.out.println(milk);
    System.out.println(buttermilk);
    x.takeToItem("milk",5);
    x.takeToItem("buttermilk", 1);
    milk.setQuantity(milk.getQuantity()+2);
    buttermilk.setQuantity(buttermilk.getQuantity()+1);
    System.out.println(milk);
    System.out.println(buttermilk);
  }
}
