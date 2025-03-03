import java.util.Scanner;

public class STRING001 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    sc.nextLine();
    while(t-->0){
      String s=sc.nextLine();
      int id=9;
      String child="";
      while(id<s.length()&&s.charAt(id)!='"'){
        child+=s.charAt(id);
        id++;
      }
      String parent="";
      id+=13;
      while(id<s.length()&&s.charAt(id)!='"'){
        parent+=s.charAt(id);
        id++;
      }
      if(child==""||parent==""){
        System.out.println(0);
      }
      else{
        System.out.println(parent.indexOf(child));
      }
    }
    sc.close();
  }
}
