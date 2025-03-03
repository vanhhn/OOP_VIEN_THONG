import java.util.Scanner;

public class Pangram {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    sc.nextLine();
    while (t-- > 0) {
      int[] a = new int[256];
      for (int i = 0; i < 256; i++) {
        a[i] = 0;
      }
      String s = sc.nextLine();
      for (int i = 0; i < s.length(); i++) {
        char tmp = s.charAt(i);
        a[tmp]++;
      }
      int ok = 0;
      for (int i = 97; i < 123; i++) {
        if (a[i] == 0) {
          ok = 1;
          break;
        }
      }
      if (ok == 0) {
        System.out.println("true");
      } else {
        System.out.println("false");
      }

    }
    sc.close();
  }
}
