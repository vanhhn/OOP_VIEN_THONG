import java.util.Scanner;

class NotContainVowelException extends Exception {
  public NotContainVowelException(String message) {
    super(message);
  }
}

public class EXCEPTION006 {
  public static int check(String s) throws NotContainVowelException {
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U') {
        return 1;
      }
    }
    throw new NotContainVowelException("String not contain vowels");
  }

  public static void main(String[] args) throws NotContainVowelException {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    sc.nextLine();
    while (t-- > 0) {
      String s = sc.nextLine();
      try {
        if (check(s) == 1) {
          System.out.println("String has vowels");
        }
      } catch (Exception e) {
        // TODO: handle exception
        System.out.println(e.getMessage());
      }

    }
    sc.close();
  }
}
