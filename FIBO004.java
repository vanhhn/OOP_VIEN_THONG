import java.util.Scanner;

public class FIBO004{
  static int[] fibo=new int[39];
  public static void init(){
    fibo[0]=0;
    fibo[1]=1;
    for(int i=2;i<39;i++){
      fibo[i]=fibo[i-1]+fibo[i-2];
    }

  }
  public static void main(String[] args) {
    init();
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0){
      int n=sc.nextInt();
      int ok=0;
      for(int i=0;i<39;i++){
        for(int j=i+1;j<39;j++){
          if(fibo[i]+fibo[j]==n){
            System.out.println(Math.min(fibo[i],fibo[j])+" "+Math.max(fibo[i],fibo[j]));
            ok=1;
            break;
          }
        }
        if(ok==1){
          break;
        }
      }
      if(ok==0) System.out.println(-1);
    }
    sc.close();
  }
}