import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class LAB01_BigDec {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    sc.nextLine(); // Consume the newline character after the integer input
    while (t-- > 0) {
      String line = sc.nextLine();
      String[] arr = line.split("\\s+");
      BigDecimal a = new BigDecimal("0");
      for (int i = 0; i < arr.length; i++) {
        BigDecimal x = new BigDecimal(arr[i]);
        BigInteger y = x.toBigInteger();
        x = x.subtract(new BigDecimal(y));
        a = a.add(x);
      }
      if (a.compareTo(new BigDecimal("0")) == 0) {
        System.out.println("0");
      } else {
        System.out.println(a);
      }
    }
    sc.close();
  }
}