import java.math.BigInteger;
import java.util.Scanner;

public class BDS002 {
  static BigInteger[] a = new BigInteger[41];

  public static void init() {
    a[0] = new BigInteger("1");
    for (int i = 1; i < 41; i++) {
      a[i] = a[i - 1].multiply(BigInteger.valueOf(i));
    }
  }

  public static void main(String[] args) {
    init();
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int m = sc.nextInt();
      m -= 1;
      n += m;
      if (n < m) {
        System.out.println(0);
      } else {
        System.out.println(a[n].divide(a[n - m].multiply(a[m])));
      }

    }
    sc.close();
  }
}
