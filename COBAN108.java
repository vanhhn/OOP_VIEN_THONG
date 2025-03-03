import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class COBAN108{
  static Queue<String>q=new LinkedList<>();
  static ArrayList<String>a=new ArrayList<>();
  static ArrayList<String>res=new ArrayList<>();
  public static int check(String s,int x){
    int ans=0;
    for(int i=0;i<s.length();i++){
      ans=ans*10+(s.charAt(i)-'0');
      ans%=x;
    }
    if(ans==0) return 1;
    return 0;
  }
  public static void init(){
    q.add("6");
    q.add("8");
    while(true){
      String top=q.poll();
      if(top.length()>20){
        break;
      }
      a.add(top);
      q.add(top+"6");
      q.add(top+"8");
    }
   for(int i=2;i<10000;i++){
      int ok=0;
     for(String x:a){
      if(check(x,i)==1){
        res.add(x);
        ok=1;
        break;
      }
     }
     if(ok==0)res.add("-1");
   }
  }
  
  
  public static void main(String[] args) {
    init();
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0){
      int x=sc.nextInt();
      System.out.println(res.get(x));
    }
    sc.close();
  }
}