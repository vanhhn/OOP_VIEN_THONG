package vanh.com.vn;

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
        return  this.name;
    }
    public int getPrice(){
        return this.price;
    }
   
}
class Warehouse{
    private ArrayList<Product>products;
    public Warehouse(){
        products=new ArrayList<>();
    }
    public void addProduct(String product, int price, int stock){
       products.add(new Product(product,price,stock));
    }
    public int price(String product){
        for(Product p:products){
            if(p.getName().equals(product)){
                return p.getPrice();
            }
        }
        return -99;
    }
}
public class COLLECTION001 {
    public static void main(String[] args) {
       Warehouse x=new Warehouse();
       x.addProduct("milk",3,10);
       x.addProduct("coffee",5,7);
        System.out.println("prices:");
        System.out.println("milk: "+x.price("milk"));
        System.out.println("coffee: "+x.price("coffee"));
        System.out.println("sugar: "+x.price("sugar"));
    }
}
