import java.util.Scanner;

interface Moveable {
  void move(int dx, int dy);
}

class Organism implements Moveable {
  private int x, y;

  public Organism(int x, int y) {
    this.x = x;
    this.y = y;
  }

  @Override
  public void move(int dx, int dy) {
    this.x += dx;
    this.y += dy;
  }

  public String toString() {
    return String.format("x:%d;y:%d", this.x, this.y);
  }

}

public class INTERFACE002 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int x = sc.nextInt();
      int y = sc.nextInt();
      Organism p = new Organism(x, y);
      p.move(1, 1);
      System.out.println(p);
    }
    sc.close();
  }
}