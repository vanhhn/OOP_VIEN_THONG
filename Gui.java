import java.util.ArrayList;
import java.util.Scanner;

public class Gui{
  public static boolean isAnagram(String a, String b) {
    // Complete the function
    int[] x=new int[256];
    int[] y=new int[256];
    for(int i=0;i<256;i++){
      x[i]=0;
      y[i]=0;
    }
    for(int i=0;i<a.length();i++){
      x[Character.toLowerCase(a.charAt(i))]++;
    }
    for(int i=0;i<b.length();i++){
      y[Character.toLowerCase(b.charAt(i))]++;
    }
    for(int i=0;i<256;i++){
       if(x[i]!=y[i]) return false;
    }
    return true;
    }
  public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      String a=sc.nextLine();
      String b=sc.nextLine();
  }

  

}