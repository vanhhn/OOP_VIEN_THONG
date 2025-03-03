import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class JavaBigDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();

        Arrays.sort(s, (a, b) -> {
            BigDecimal x = new BigDecimal(a);
            BigDecimal y = new BigDecimal(b);
            return y.compareTo(x); // Tăng dần. Nếu muốn giảm dần: y.compareTo(x);
        });

        for (String value : s) {
            System.out.println(value);
        }
    }
}
