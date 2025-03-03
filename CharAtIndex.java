import java.util.Scanner;

public class CharAtIndex {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0){
      String s=sc.next();
      int id=sc.nextInt();
      System.out.printf("The character at position %d is %s\n",id,s.charAt(id));
    }
    sc.close();
  }
}
