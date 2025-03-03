import java.util.*;
public class BASIC007_1 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0){
      long l=sc.nextLong();
      long r=sc.nextLong();
      long ssh=r-l+1;
      long sum=(long)(ssh*(l+r)/2);
      System.out.println(sum);
    }
    sc.close();
  }
}
