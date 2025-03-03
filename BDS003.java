import java.math.BigInteger;
import java.util.Scanner;

public class BDS003{
  static BigInteger[] a=new BigInteger[51];
  public static void init(){
    a[0]=new BigInteger("1");
    for(int i=1;i<51;i++){
      a[i]=a[i-1].multiply(BigInteger.valueOf(i));
    }
  }
  public static void main(String[] args) {
    init();
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0){
      int n=sc.nextInt();
      int m=sc.nextInt();
      if(n<m){
        System.out.println(0);
      }
      else{
        //(n-1)C(m-1)
        n-=1;
        m-=1;
        System.out.println(a[n].divide(a[n-m].multiply(a[m])));
        
      }
    }
    sc.close();
  }
}