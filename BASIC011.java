import java.util.ArrayList;
import java.util.Scanner;

public class BASIC011 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    sc.nextLine();
    while (t-- > 0) {
      String s = sc.nextLine();
      ArrayList<Integer> arr = new ArrayList<>();
      String[] s1 = s.split("\\s+");
      for (int i = 0; i < s1.length; i++) {
        arr.add(Integer.parseInt(s1[i]));
      }
      if (arr.size() < 2) {
        System.out.println("0");
        continue;
      }
      int ans = (int) 1e9;
      for (int i = 0; i < arr.size() - 1; i++) {
        ans = Math.min(ans, arr.get(i + 1) - arr.get(i));
      }
      System.out.println(ans);
    }
    sc.close();
  }
}
