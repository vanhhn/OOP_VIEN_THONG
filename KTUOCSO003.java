import java.util.Scanner;

public class KTUOCSO003 {
  public static int check(long n) {
    long s = 1, tmp = n;
    for (long i = 2; i * i <= n; i += (i < 3 ? 1 : 2)) {
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
    if (s == 2 * tmp)
      return 1;
    return 0;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      long n = sc.nextInt();
      System.out.println(check(n));
    }
    sc.close();
  }
}