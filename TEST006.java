import java.util.ArrayList;
import java.util.Scanner;

public class TEST006 {
  static ArrayList<Integer>arr=new ArrayList<>();
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0){
      arr.clear();
      int n=sc.nextInt();
      int m=sc.nextInt();
      int id=0;
      while(Math.pow(m,id)<=n){
        arr.add((int)Math.pow(m,id++));
      }
      int[] dp=new int[n+1];
      for(int i=0;i<n+1;i++)dp[i]=0;
      dp[0]=1;
      for(int x:arr){
        for(int i=1;i<=n;i++){
          if(i>=x)dp[i]+=dp[i-x];
        }
      }
      System.out.println(dp[n]);
    }
    sc.close();
  }
}
