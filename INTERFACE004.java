
class Item {
  private String name;
  private double price, discount;

  public Item(String name, double price, double discount) {
    this.name = name;
    this.price = price;
    this.discount = discount;
  }

  public double getPrice() {
    return price;
  }

  public double getDiscount() {
    return discount;
  }

  public String toString() {
    return this.name + " $" + String.format("%.2f", this.price) + " (-$" + String.format("%.2f", this.discount) + ")";
  }
}

class Employee {
  private String name;

  public Employee(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}

class GroceryBill {
  private Employee clerk;
  private Item[] receipt;
  private double total;
  private int id = 0;

  public GroceryBill(Employee clerk) {
    this.clerk = clerk;
    receipt = new Item[100];
  }

  public void add(Item i) {
    receipt[id++] = i;
    this.total += i.getPrice();
  }

  public double getTotal() {
    return this.total;
  }

  public Employee getClerk() {
    return this.clerk;
  }

  public Item[] getReceipt() {
    return receipt;
  }

  public int getId() {
    return id;
  }

  public String toString() {
    String res = "";
    res += "items:\n";
    double sum = 0;
    for (int i = 0; i < this.id; i++) {
      res += "   " + receipt[i].toString() + "\n";
      sum += receipt[i].getPrice();
    }
    res += "total: $" + String.format("%.2f", sum);
    res += "\nClerk: " + this.clerk.getName();
    return res;

  }

}

class DiscountBill extends GroceryBill {
  private double discountAmount;

  public DiscountBill(Employee clerk) {
    super(clerk);
  }

  public void add(Item i) {
    super.add(i);
    this.discountAmount += i.getDiscount();
  }

  public String toString() {
    String res = "";
    res += "items:\n";
    double total = 0, sub_total = 0;
    for (int i = 0; i < super.getId(); i++) {
      res += "   " + super.getReceipt()[i].toString() + "\n";
      total += super.getReceipt()[i].getPrice();
      sub_total += super.getReceipt()[i].getDiscount();
    }
    res += "sub-total: $" + String.format("%.2f", total) + "\ndiscount: $"
        + String.format("%.2f", this.discountAmount) + " " + String.format("\ntotal: $%.2f", total - sub_total);
    res += "\nClerk: " + super.getClerk().getName();
    return res;
  }
}

public class INTERFACE004 {
  public static void main(String[] args) {
    Employee clerk1 = new Employee("Grocery Bill");
    GroceryBill gb = new GroceryBill(clerk1);
    gb.add(new Item("item 1", 2.3, 0));
    gb.add(new Item("item 2", 3.45, 0));
    System.out.println(gb);
    System.out.println("");
    Employee clerk2 = new Employee("Discount Bill");
    DiscountBill db = new DiscountBill(clerk2);
    db.add(new Item("item 3", 20, 15));
    db.add(new Item("item 4", 40, 35));
    db.add(new Item("item 5", 50, 35));
    System.out.println(db);
  }
}
