import java.math.BigInteger;
import java.util.*;

public class KTGIAITHUA001{
  static BigInteger[] a=new BigInteger[10001];
  public static void init(){
    a[0] = BigInteger.valueOf(1);
    for(int i=1;i<=10000;i++){
      a[i]=a[i-1].multiply(BigInteger.valueOf(i));
    }
  }
  public static void main(String[] args) {
    init();
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt(); 
    while(t-->0){
      int n;
      n=sc.nextInt();
      System.out.println(a[n]);
    }
    sc.close();
  }
}