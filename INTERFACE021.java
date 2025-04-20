import java.util.ArrayList;
import java.util.Scanner;

interface PricedItemvaSourceableItem {
  double getPrice();
}

interface SourceableItem {
  String getSource();
}

class Dish implements PricedItemvaSourceableItem, SourceableItem {
  private String name;
  private double price;
  private String Restaurantname;

  public Dish(String name, double price, String Restaurantname) {
    this.name = name;
    this.price = price;
    this.Restaurantname = Restaurantname;
  }

  @Override
  public double getPrice() {
    return this.price;
  }

  @Override
  public String getSource() {
    return "\"" + this.Restaurantname + "\"";
  }

  public String getName() {
    return this.name;
  }

  public String toString() {
    return String.format("\"%s\" - %.2f", this.name, this.price);
  }
}

public class INTERFACE021 {
  public static String[] tachCacThanhPhanRa(String s) {
    String[] arr = s.split("\"");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = arr[i].trim();
    }
    return arr;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    sc.nextLine();
    ArrayList<Dish> dishes = new ArrayList<>();
    while (t-- > 0) {
      dishes.clear();
      String type;
      while (true) {
        type = sc.nextLine();
        if (!type.equals("Checkout")) {
          String[] ar = tachCacThanhPhanRa(type);
          String name = ar[1];
          double price = Double.parseDouble(ar[2]);
          String restaurantname = ar[3];
          Dish dish = new Dish(name, price, restaurantname);
          dishes.add(dish);
        } else {
          String query = sc.nextLine();
          for (Dish x : dishes) {
            if (x.getSource().equals(query)) {
              System.out.println(x);
            }
          }
          break;
        }
      }
    }
    sc.close();
  }
}