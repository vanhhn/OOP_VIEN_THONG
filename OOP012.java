
import java.util.*;

class Book {
    private String name;
    private Author author;
    private double price;
    private int qty;

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
        return this.name;
    }

    public Author getAuthor() {
        return this.author;
    }

    public double getPrice() {
        return this.price;
    }

    public int getQty() {
        return this.qty;
    }

    public int setQty(int qty) {
        if (qty >= 0) {
            this.qty = qty;
            return qty;
        } else {
            return -1;
        }
    }

    public String toString() {
        return "Book[name=" + this.name + "," + " " + author.toString() + "," + " "  + "price=" + 
        this.price + ","+ " "  +  "qty=" + this.qty + "]";
    }
}

class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String toString() {
        return "Author[name=" + this.name + "," + " " + "email=" + this.email + "," + " " + "gender=" + this.gender + "]";
    }
}

public class OOP012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String type = sc.nextLine();
            
                String bookName = sc.nextLine();
                double price = sc.nextDouble();
                int qty = sc.nextInt();
                sc.nextLine();
                String authorType = sc.nextLine(); 
                String authorName = sc.nextLine();
                String authorEmail = sc.nextLine();
                char authorGender = sc.nextLine().charAt(0);

                Author author = new Author(authorName, authorEmail, authorGender);
                Book book = new Book(bookName, author, price, qty);
                
            
            String endInput = sc.nextLine();
            System.out.println(book);
        }
          
        
    }
}
