import java.util.List;
import java.util.Scanner;

interface Callable{
   String call();
}
interface Browsable{
  String browse();
}
class Smartphone implements Callable,Browsable{
  private List<String>numbers;
  private List<String>urls;
  public Smartphone(List<String> numbers, List<String> urls) {
    this.numbers = numbers;
    this.urls = urls;
  }
  public boolean checkSoDienThoai(String s){
    for(int i=0;i<s.length();i++){
      if(!Character.isDigit(s.charAt(i))){
        return false;
      }
    }
    return true;
  }
  public boolean checkDuongDanWeb(String s){
    for(int i=0;i<s.length();i++){
      if(Character.isDigit(s.charAt(i))){
        return false;
      }
    }
    return true;
  }
  @Override
  public String call(){
    String ans="";
    for(int i=0;i<this.numbers.size();i++){
      if(checkSoDienThoai(this.numbers.get(i)))ans+=String.format("Calling... %s", numbers.get(i));
      else ans+="Invalid number!";
      ans+="\n";
    }
    return ans;
  }
  @Override
  public String browse(){
    String ans="";
    for(int i=0;i<this.urls.size();i++){
      if(checkDuongDanWeb(this.urls.get(i)))ans+=String.format("Browsing: %s", urls.get(i));
      else ans+="Invalid URL!";
      ans+="\n";
    }
    return ans;
  }
}
public class OOP016 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    sc.nextLine();
    while(t-->0){
      List<String>numbers=List.of(sc.nextLine().split("\\s+"));
      List<String>urls=List.of(sc.nextLine().split("\\s+"));
      Smartphone phone=new Smartphone(numbers, urls);
      System.out.println(phone.call());
      System.out.println(phone.browse());
    }
    sc.close();
  }
}