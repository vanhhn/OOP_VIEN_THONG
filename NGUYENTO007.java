import java.util.Scanner;

public class NGUYENTO007 {
  public static boolean checkNguyenTo(int n){
    if(n<2) return false;
    if(n==2||n==3) return true;
    if(n%2==0||n%3==0) return false;
    for(int i=5;i*i<=n;i+=6){
      if(n%i==0||n%(i+2)==0) return false;
    }
    return true;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int l = sc.nextInt();
      int r = sc.nextInt();
      if (r % 2 == 0)
        r -= 1;
      if (l % 2 == 0)
        l += 1;
      for (int i = r; i >= Math.max(2, l); i -= 2) {
        if (checkNguyenTo(i)) {
          System.out.println(i);
          break;
        }
      }
    }
    sc.close();
  }
}
