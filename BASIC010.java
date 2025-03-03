import java.util.Scanner;

public class BASIC010 {
  public static long swapDigitPairs(long n){
    long ans=0;
    while(n!=0){
      ans=ans*10+n%10;
      n=(long)n/10;
    }
    return ans;
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0){
      long n=sc.nextLong();
      System.out.println(swapDigitPairs(n));
    }
    sc.close();
  }
}