import java.util.PriorityQueue;
import java.util.Scanner;

public class COBAN105 {
  static final long mod=1000000007;
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0){
      int n=sc.nextInt();
      long[] a=new long[n];
      PriorityQueue<Long>q=new PriorityQueue<>();
      for(int i=0;i<n;i++){
        a[i]=sc.nextLong();
        q.add(a[i]);
      }
      long ans=0;
      while(q.size()>1){
        long x=q.poll();
        long y=q.poll();
        long k=x+y;
        ans=((ans%mod)+(k%mod))%mod;
        q.add(k);
      }
      System.out.println(ans);
    }
    sc.close();
  }
}
