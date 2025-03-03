

abstract class Product{
	private String name;
	private double price;
	private int quantity;
	public Product(String name, double price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	abstract double calculateCost(int quantity);
	public void displayDetails() {
		System.out.println("Name: "+this.name+"\nPrice: $"+this.price+"\nAvailable Quantity: "+this.quantity);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
}
class Book extends Product{
	private String author;

	public Book(String name, double price, int quantity, String author) {
		super(name, price, quantity);
		this.author = author;
	}
	@Override
	public double calculateCost(int quantity) {
		return this.getPrice()*quantity;
	}
	public void displayDetails() {
		System.out.println("Name: "+this.getName()+"\nPrice: "+this.getPrice()+"\nAvailable Quantity: "+this.getQuantity()+"\nAuthor: "+this.author);
	}
}
class Electronics extends Product{
	private String brand;

	public Electronics(String name, double price, int quantity, String brand) {
		super(name, price, quantity);
		this.brand = brand;
	}
	@Override
	public double calculateCost(int quantity) {
		return this.getPrice()*quantity*1.1;
	}
	public void displayDetails() {
		System.out.println("Name: "+this.getName()+"\nPrice: "+this.getPrice()+"\nAvailable Quantity: "+this.getQuantity()+"\nBrand: "+this.brand);
	}
}
class User{
	private String user;
	private double totalSpent;
	public User(String user, double totalSpent) {
		super();
		this.user = user;
		this.totalSpent = totalSpent;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public double getTotalSpent() {
		return totalSpent;
	}
	public void setTotalSpent(double totalSpent) {
		this.totalSpent = totalSpent;
	}
	public void buyProduct(Product product,int quantity) {
		if(quantity<=product.getQuantity()) {
			System.out.printf("User: %s bought %d %s for $%.1f\n",this.user,quantity,product.getName(),product.calculateCost(quantity));
			product.setQuantity(product.getQuantity()-quantity);
			this.totalSpent+=this.getTotalSpent()+product.calculateCost(quantity);
			
		}
		else {
			System.out.printf("Insufficient quantity of %s available.",product.getName());
		}
	}
}
public class OOP017 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Electronics el=new Electronics("laptop", 20, 10, "Dell");
       Book book=new Book("Harry Potter",20.12, 12, "camnh");
       User user1=new User("Alice", 0);
       User user2=new User("Bob", 0);
       User user3=new User("Charlie", 0);
       user1.buyProduct(el, 3);
       user1.buyProduct(book, 10);
       user2.buyProduct(el, 1);
       user3.buyProduct(book, 5);
       
       
	}

}
