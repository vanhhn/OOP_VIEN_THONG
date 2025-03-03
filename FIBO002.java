import java.util.Scanner;

public class FIBO002 {
  static int[] arrFibo=new int[48];
  public static void init(){
    arrFibo[0]=0;
    arrFibo[1]=1;
    for(int i=2;i<48;i++){
      arrFibo[i]=arrFibo[i-1]+arrFibo[i-2];
    }
  }
  public static void main(String[] args) {
    init();
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0){
       int n=sc.nextInt();
       long sum=0;
       for(int x:arrFibo){
        if(x<=n&&x%2==0){
          sum+=x;
        }
       }
       System.out.println(sum);
    }
    sc.close();
  }
}
