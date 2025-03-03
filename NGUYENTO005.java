import java.util.Scanner;

public class NGUYENTO005 {
  static final int ma=1000005;
  static int[] a=new int[ma];
  public static void init(){
    for(int i=0;i<ma;i++){
      a[i]=i;
    }
    a[1]=0;
    for(int i=2;i<ma;i++){
      if(a[i]==i){
        for(int j=i;j<ma;j+=i){
          a[j]=i;
        }
      }
    }
  }
  public static void main(String[] args) {
    init();
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0){
      int n=sc.nextInt();
      long sum=0;
      for(int i=2;i<=n;i++){
         sum+=a[i];
      }
      System.out.println(sum);
    }
    sc.close();
  }
}
