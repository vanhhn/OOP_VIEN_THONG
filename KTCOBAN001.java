import java.util.Scanner;

public class KTCOBAN001 {
  public static int countDigits(long n){
    int ans=0;
    if(n==0) return 1;
    while(n!=0){
      ans++;
      n=(long)n/10;
    }
    return ans;
  }
  public static boolean check(long n){
   int d=countDigits(n);
   long s=0,tmp=n;
   while(n!=0){
    s+=(long)Math.pow(n%10,d);
    n=(long)n/10;
   }

   return tmp==s;
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0){
      long n=sc.nextLong();
      if(check(n))System.out.println(1);
      else System.out.println(0);
    }
    sc.close();
  }
}
