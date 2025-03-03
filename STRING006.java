import java.util.Scanner;

public class STRING006 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    sc.nextLine();
    while (t-- > 0) {
      String s = sc.nextLine();
      System.out.print("My initials are: ");
      String ans = "";
      String[] arr = s.split("\\s+");
      for (int i = 0; i < arr.length; i++) {
        if (Character.isAlphabetic(arr[i].charAt(0))) {
          ans += Character.toUpperCase(arr[i].charAt(0));
        }
      }
      System.out.println(ans);
    }
    sc.close();
  }
}