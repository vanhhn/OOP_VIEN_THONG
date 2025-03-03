import java.math.BigInteger;
import java.util.Scanner;

public class COBAN025 {
  static BigInteger[] a=new BigInteger[63];
  public static void init(){
    a[0]=new BigInteger("1");
    for(int i=1;i<63;i++){
      a[i]=a[i-1].multiply(BigInteger.valueOf(i));
    }
  }
  public static void main(String[] args) {
    init();
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0){
      int n=sc.nextInt();
      System.out.println(a[2*n].divide(a[n].multiply(a[n+1])));
    }
    sc.close();
  }
}
