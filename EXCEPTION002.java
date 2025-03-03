import java.util.Scanner;

public class EXCEPTION002 {
  public static String CheckFileExtension(String s) {
    if (s == null || s.trim().isEmpty()) {
      return "Not java file exception.Mark is -1";
    } else if (s.length() <= 5) {
      return "0";
    } else {
      String sub = s.substring(s.length() - 5, s.length());
      if (sub.equals(".java")) {
        return "1";
      }
    }
    return "0";

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    sc.nextLine();
    while (t-- > 0) {
      String s = sc.nextLine();
      System.out.println(CheckFileExtension(s));
    }
    sc.close();
  }
}