import java.math.BigInteger;
import java.util.Scanner;

public class A {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    BigInteger[] a=new BigInteger[n+1];
    a[1]=BigInteger.valueOf(1);
    a[2]=BigInteger.valueOf(1);
    for(int i=3;i<=n;i++){
      a[i]=a[i-1].add(a[i-2]);
    }
    System.out.printf("So fibonaci thu %d la: %s.",n,a[n]);
    sc.close();
  }
}
