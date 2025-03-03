import java.util.*;

public class LUYTHUA002 {
  static final long mod = 1000000007;

  public static long powerMod(long a, long n) {
    if (n == 0) {
      return 1;
    }
    long res = powerMod(a, (long) n / 2);
    if (n % 2 == 0) {
      return (res % mod) * (res % mod) % mod;
    }
    return (((res%mod)*(res%mod))%mod*a%mod)%mod;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      long a = sc.nextLong();
      long n = sc.nextLong();
      System.out.println(powerMod(a, n));
    }
    sc.close();
  }
}