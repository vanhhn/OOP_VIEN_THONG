import java.util.Scanner;

class Point{
  private int x,y;

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int getX() {
    return x;
  }

  public void setX(int x) {
    this.x = x;
  }

  public int getY() {
    return y;
  }

  public void setY(int y) {
    this.y = y;
  }
  public void move(int dx,int dy){
    this.x=x+dx;
    this.y=y+dy;
  }
  public void tinhKhoangCach(Point B){
    this.move(1, 1);
    float kc=(float) Math.sqrt((this.x-B.x)*(this.x-B.x)+(this.y-B.y)*(this.y-B.y));
    System.out.printf("%.2f\n",kc);
  }
}
public class Point_class {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0){
      Point A=new Point(sc.nextInt(),sc.nextInt());
      Point B=new Point(sc.nextInt(),sc.nextInt());
      A.tinhKhoangCach(B);
    }
    sc.close();
  }
}
