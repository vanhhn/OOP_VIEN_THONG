import java.util.Scanner;

public class STRING009 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    sc.nextLine();
    while (t-- > 0) {
      String s = sc.nextLine();
      for (int i = 0; i < s.length(); i++) {
        for (int j = 0; j <=i; j++) {
          System.out.print(s.charAt(j));
        }
      }
      System.out.println();
    }
    sc.close();
  }
}