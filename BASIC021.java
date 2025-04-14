import java.math.BigInteger;
import java.util.Scanner;

public class BASIC021 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.printf("Factorials of numbers from 1 to %d:\n",n);
    BigInteger[] a=new BigInteger[n+1];
    BigInteger sum=new BigInteger("0");
    a[0]=new BigInteger("1");
    for(int i=1;i<=n;i++){
      a[i]=a[i-1].multiply(new BigInteger(String.valueOf(i)));
      System.out.printf("%d! = %s\n",i,a[i]);
      sum=sum.add(a[i]);
    }
    System.out.printf("The sum of these factorials is: %s",sum);
    sc.close();
  }
}