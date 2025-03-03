import java.math.BigInteger;
import java.util.Scanner;

public class LUYTHUA001 {
  public static BigInteger pow(BigInteger a, int n) {
    if(n==0) return BigInteger.valueOf(1);
    BigInteger res=pow(a,(int)n/2);
    if(n%2==0) return res.multiply(res);
    return a.multiply(res).multiply(res);
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0){
      int a=sc.nextInt();
      int n=sc.nextInt();
      System.out.println(pow(BigInteger.valueOf(a),n));
    }
    sc.close();
  }
}
