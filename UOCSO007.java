import java.util.Scanner;

public class UOCSO007 {
  public static long gcd(long a, long b) {
    if (b == 0)
      return a;
    return gcd(b, a % b);
  }

  public static long tinhTongUoc(long n) {
    long s = 1;
    for (long i = 2; i * i <= n; i += (i < 3) ? 1 : 2) {
      if (n % i == 0) {
        int d = 0;
        while (n % i == 0) {
          d++;
          n /= i;
        }
        s *= (long) (Math.pow(i, d + 1) - 1) / (i - 1);
      }
    }
    if (n != 1)
      s *= (n + 1);
    return s;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      long n = sc.nextLong();
      long m = sc.nextLong();
      long uc = gcd(n, m);
      System.out.println(tinhTongUoc(n) - tinhTongUoc(uc));
    }
    sc.close();
  }
}
