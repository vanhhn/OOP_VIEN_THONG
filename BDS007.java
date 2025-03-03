import java.util.*;
public class BDS007{
  public static void main(String[] args){
    ArrayList<Integer>arr=new ArrayList<>();
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0){
      arr.clear();
     int n=sc.nextInt();
     int id=0;
     while(Math.pow(2,id)<=n){
      arr.add((int)Math.pow(2,id++));
     }
     int[] dp=new int[n+1];
     for(int i=0;i<=n;i++)dp[i]=0;
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