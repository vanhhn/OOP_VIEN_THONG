import java.util.*;

public class KTCOBAN003 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      long l = sc.nextLong();
      long r = sc.nextLong();
      long x = (long) Math.ceil(Math.sqrt(l));
      long y = (long) Math.floor(Math.sqrt(r));
      System.out.println(y - x+1);
    }
    sc.close();
  }
}
