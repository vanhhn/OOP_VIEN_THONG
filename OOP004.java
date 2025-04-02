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
    this.setX(this.x+dx);
    this.setY(this.y+dy);
  }
  public double distanceTo(Point p){
    return Math.sqrt((this.x-p.x)*(this.x-p.x)+(this.y-p.y)*(this.y-p.y));
  }
  
}
public class OOP004 {
  public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int t=sc.nextInt();
     while(t-->0){
      Point A=new Point(sc.nextInt(), sc.nextInt());
      Point B=new Point(sc.nextInt(), sc.nextInt());
      A.move(1,1);
      System.out.printf("%.2f\n",A.distanceTo(B));
     }
     sc.close();
  }
}
