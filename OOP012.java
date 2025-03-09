import java.util.Scanner;

class Author {
  private String name, email, gender;

  public Author(String name, String email, String gender) {
    this.name = name;
    this.email = email;
    this.gender = gender;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public String toString() {
    return String.format("Author[name=%s, email=%s, gender=%s]", this.name, this.email, this.gender);
  }
}

class Book {
  private String name;
  private Author author;
  private double price; // Chuyển sang String
  private int qty = 0;

  public Book(String name, Author author, double price) {
    this.name = name;
    this.author = author;
    this.price = price;
  }

  public Book(String name, Author author, double price, int qty) {
    this.name = name;
    this.author = author;
    this.price = price;
    this.qty = qty;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Author getAuthor() {
    return author;
  }

  public void setAuthor(Author author) {
    this.author = author;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public int getQty() {
    return qty;
  }

  public void setQty(int qty) {
    this.qty = qty;
  }

  public String toString() {
    return String.format("Book[name=%s, %s, price=%.2f, qty=%d]", this.name, this.author.toString(), this.price, this.qty);
  }
}

public class OOP012 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    sc.nextLine();
    while (t-- > 0) {
      String s = sc.nextLine();
      if (s.equals("Book")) {
        String name_book = sc.nextLine();
        double price = Double.parseDouble(sc.nextLine());
        int so_luong = Integer.parseInt(sc.nextLine());
        sc.nextLine(); // bỏ qua dòng Author
        String name_author = sc.nextLine();
        String email = sc.nextLine();
        String gender = sc.nextLine();
        Author author = new Author(name_author, email, gender);
        Book book = new Book(name_book, author, price, so_luong);
        sc.nextLine(); // bỏ qua dòng End
        System.out.println(book);
      } 
      else if (s.equals("Author")) {
        String name_author = sc.nextLine();
        String email = sc.nextLine();
        String gender = sc.nextLine();
        sc.nextLine(); // bỏ qua dòng Book
        Author author = new Author(name_author, email, gender);
        String name_book = sc.nextLine();
       double price = Double.parseDouble(sc.nextLine()); // đổi từ double sang String
        int so_luong = Integer.parseInt(sc.nextLine());
        Book book = new Book(name_book, author, price, so_luong);
        sc.nextLine(); // bỏ qua dòng End
        System.out.println(book);   
      } 
    }
    sc.close();
  }
}
