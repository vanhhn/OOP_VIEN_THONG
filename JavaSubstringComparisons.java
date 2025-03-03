import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class JavaSubstringComparisons {
  public static String getSmallestAndLargest(String s, int k) {
    String smallest = "";
    String largest = "";
    ArrayList<String>arr=new ArrayList<>();
    for(int i=0;i<s.length()-k+1;i++){
      arr.add(s.substring(i,i+k));
    }
    Collections.sort(arr,new Comparator<String>() {

      @Override
      public int compare(String o1, String o2) {
        // TODO Auto-generated method stub
        return o1.compareTo(o2);
      }
      
    });
    // Complete the function
    // 'smallest' must be the lexicographically smallest substring of length 'k'
    // 'largest' must be the lexicographically largest substring of length 'k'
    smallest=arr.get(0);
    largest=arr.get(arr.size()-1);
    return smallest + "\n" + largest;
}
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    int k=sc.nextInt();
    System.out.println(getSmallestAndLargest(s, k));
    sc.close();
  }
}
