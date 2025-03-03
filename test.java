import java.util.Scanner;

public class test{
  public static int myMethod(int x){
    int sum=0;
    for(int i=0;i<x;i++){
      for(int j=i;j<x;j++){
        sum++;
        if(j==1) continue;
        if(j==2) continue;
        if(i==3) break;
        if(j==4) break;
      }
    }
    return sum;
  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println(myMethod(sc.nextInt()));
    sc.close();
  }
}