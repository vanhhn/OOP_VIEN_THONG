class Product {
  private String name, position;
  private int weight;

  public Product(String name) {
    this.name = name;
    this.position = "shelf";
    this.weight = 1;
  }

  public Product(String name, String location) {
    this.name = name;
    this.position = location;
    this.weight = 1;
  }

  public Product(String name, int weight) {
    this.name = name;
    this.position = "shelf";
    this.weight = weight;
  }

  public String toString() {
    return String.format("%s (%dkg) can be found from the %s", this.name, this.weight, this.position);
  }
}

public class OOP010 {
  public static void main(String[] args) {
    Product p1 = new Product("Tape measure");
    Product p2 = new Product("Plaster", "home improvement section");
    Product p3 = new Product("Tyre", 5);
    System.out.println(p1 + "\n" + p2 + "\n" + p3);
  }
}