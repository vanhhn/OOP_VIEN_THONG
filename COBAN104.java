import java.util.Scanner;

public class COBAN104 {
  public static int bienDoiNho(String n){
    int res=0;
    for(int i=0;i<n.length();i++){
      if(n.charAt(i)=='5'){
        res=res*10+3;
      }
      else{
        res=res*10+n.charAt(i)-'0';
      }
    }
    return res;
  }
  public static int bienDoiLon(String n){
    int res=0;
    for(int i=0;i<n.length();i++){
      if(n.charAt(i)=='3'){
        res=res*10+5;
      }
      else{
        res=res*10+n.charAt(i)-'0';
      }
    }
    return res;
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0){
     String a=sc.next();
     String b=sc.next();
     System.out.println((bienDoiNho(a)+bienDoiNho(b))+" "+(bienDoiLon(b)+bienDoiLon(a)));
    }
    sc.close();
  }
}
