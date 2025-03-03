import java.util.Scanner;

public class COBAN023 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0){
      long n=sc.nextLong();
      long p=sc.nextLong();
      long ans=0;
      for(long i=p;i<=n;i*=p){
        ans+=(long)n/i;
      }
      System.out.println(ans);
    }
    sc.close();
  }
}
