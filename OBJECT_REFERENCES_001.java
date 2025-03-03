import java.util.Scanner;
public class OBJECT_REFERENCES_001{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String num1=sc.nextLine();
    String s=sc.nextLine();
    String num2=s.substring(12,s.length());
    System.out.println(num1.equals(num2));
    sc.close();
  }
}