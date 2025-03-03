import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class COLLECTION006 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    sc.nextLine();
    while (t-- > 0) {
      HashMap<String, Integer> hm = new HashMap<>();
      String s = sc.nextLine();
      String[] ar = s.split("\\s+");
      for (int i = 1; i < ar.length; i += 2) {
        if (hm.containsKey(ar[i])) {
          hm.put(ar[i], hm.get(ar[i]) + 1);
        } else {
          hm.put(ar[i], 1);
        }
      }
      // for (String x : hm.keySet()) {
      //   System.out.println(x + " " + hm.get(x));
      // }
      int ans = 1000;
      int cnt=1000;
      for (Map.Entry<String, Integer> x : hm.entrySet()) {
        if (cnt >x.getValue()) {
          cnt=x.getValue();
          ans=Integer.parseInt(x.getKey());
        }
        else if(cnt==x.getValue()){
          ans=Math.min(ans, Integer.parseInt(x.getKey()));
        }
      }
      System.out.println(ans);
    }
    sc.close();
  }
}