import java.util.ArrayList;
import java.util.Scanner;

class UsedCarException extends Exception {
  public UsedCarException(String VIN) {
    super("Invalid UsedCar: VIN " + VIN);
  }
}

class UsedCar {
  private String VIN, make;
  private int year, mileage, price;
  private int check = 0;

  public UsedCar(String VIN, String make, int year, int mileage, int price) throws UsedCarException {
    if (VIN.length() != 4 ||
        !(make.equals("Ford") || make.equals("Honda") || make.equals("Toyota") || make.equals("Chrysler")) ||
        year < 1990 || year > 2014 || mileage < 0 || price < 0) {
      check = 1;
      throw new UsedCarException(VIN);
    }
    this.VIN = VIN;
    this.make = make;
    this.year = year;
    this.mileage = mileage;
    this.price = price;
  }

  public int getCheck() {
    return check;
  }

  public String toString() {
    return String.format("UsedCar{vin='%s', make='%s', year=%d, mileage=%d, price=%.1f}", VIN, make, year, mileage,
        (float)price);
  }
}

public class EXCEPTION003 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    sc.nextLine();
    ArrayList<UsedCar> usedcars = new ArrayList<>();

    while (t-- > 0) {
      String s = sc.nextLine();
      String[] arr = s.split(",");
      try {
        UsedCar x = new UsedCar(arr[0], arr[1], Integer.parseInt(arr[2]), Integer.parseInt(arr[3]),
            Integer.parseInt(arr[4]));
        usedcars.add(x);
      } catch (UsedCarException e) {
        System.out.println(e.getMessage());
      }
    }

    System.out.println("List of successfully constructed UsedCar objects:");
    if (usedcars.isEmpty()) {
      System.out.println("No used cars");
    } else {
      for (UsedCar x : usedcars) {
        System.out.println(x);
      }
    }
    sc.close();
  }
}
