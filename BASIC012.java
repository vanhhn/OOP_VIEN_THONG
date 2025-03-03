import java.util.ArrayList;
import java.util.Scanner;

public class BASIC012 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    sc.nextLine();
    while (t-- > 0) {
      String s = sc.nextLine();
      if (s.trim().isEmpty()) {
        System.out.println("0");
        continue;
      }
      String[] s1 = s.split("\\s+");
      ArrayList<Integer> arr = new ArrayList<>();
      for (String x : s1) {
        arr.add(Integer.parseInt(x));
      }
      int ans = 1, cnt = 1;
      for (int i = 0; i < arr.size() - 1; i++) {
        if (arr.get(i) <= arr.get(i + 1)) {
          cnt++;
          ans = Math.max(ans, cnt);
        } else {
          cnt = 1;
        }
      }
      System.out.println(ans);
    }
    sc.close();
  }
}
