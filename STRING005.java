import java.util.Scanner;

public class STRING005 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    sc.nextLine();
    while (t-- > 0) {
      String s = sc.nextLine();
      String[] arr = s.split("\\s+");
      String ans = "";
      for (String x : arr) {
        if (x.length() >= ans.length()) {
          ans = x;
        }
      }
      System.out.println(ans);
    }
    sc.close();
  }
}
