import java.util.Scanner;

public class STRING002 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    sc.nextLine();
    while(t-->0){
      String s1=sc.nextLine();
      String s2=sc.nextLine();
      System.out.println(s1.contains(s2));
    }
    sc.close();
  }
}
