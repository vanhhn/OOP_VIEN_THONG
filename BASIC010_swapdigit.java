import java.util.Scanner;

public class BASIC010_swapdigit {
  public static void swap(int[] a, int i, int j) {
    int tmp = a[i];
    a[i] = a[j];
    a[j] = tmp;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    sc.nextLine();
    while (t-- > 0) {
      String s = sc.nextLine();
      int[] a = new int[s.length()];
      for (int i = 0; i < s.length(); i++) {
        a[i] = s.charAt(i) - '0';
      }
      if (s.length() % 2 == 0) {
        for (int i = 0; i <=a.length - 2; i += 2) {
          swap(a, i, i + 1);
        }
      } else {
        for (int i = 1; i <= a.length - 2; i += 2) {
          swap(a, i, i + 1);
        }
      }
      for (int i = 0; i < a.length; i++) {
        System.out.print(a[i]);
      }
      System.out.println("");
    }
    sc.close();
  }
}
