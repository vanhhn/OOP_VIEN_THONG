import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class COLLECTION006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String[] s = sc.nextLine().split(" ");
            Map<String, Integer> map = new HashMap<>();
            for (int i = 0; i < s.length; i += 2) {
                map.put(s[i], Integer.parseInt(s[i + 1]));
            }
            System.out.println(rarest(map));
        }
        sc.close();
    }

    public static int rarest(Map<String, Integer> map) {
        int[] a = new int[1000];
        for (int value : map.values()) {
            a[value]++;
        }
        int mn = map.size(), ans = 1000;
        for (int value : map.values()) {
            mn = Math.min(mn, a[value]);
        }
        for (int value : map.values()) {
            if (mn == a[value])
                ans = Math.min(ans, value);

        }
        return ans;
    }
}