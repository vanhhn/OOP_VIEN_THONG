import java.util.Scanner;

public class NGUYENTO004{
  public static long solve(long n){
    long res=-1;
    for(long i=2;i*i<=n;i+=(i<3?1:2)){
      if(n%i==0){
         res=Math.max(res,i);
         while(n%i==0){
          n/=i;
         }
      }
    }
    if(n!=1) res=Math.max(res,n);
    return res;
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0){
      long n=sc.nextLong();
      System.out.println(solve(n));
    }
    sc.close();
  }
}