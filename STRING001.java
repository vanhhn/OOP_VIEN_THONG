import java.util.Scanner;
public class STRING001{
  
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
      sc.nextLine();
    while(t-->0){
      String s=sc.next();
      int index=sc.nextInt();
      System.out.printf("The character at position %d is %c\n",index,s.charAt(index));
    }
    sc.close();
  }
}