import java.util.ArrayList;
import java.util.Scanner;

interface Identifiable{
  String getId();
}
class Human implements Identifiable{
  private String name;
  private int age;
  private String id;
  public Human(String name, int age, String id) {
    this.name = name;
    this.age = age;
    this.id = id;
  }
  @Override
  public String getId() {
    return this.id;
  }
  public String getName() {
    return name;
  }
  public int getAge() {
    return age;
  }
  
}
class Robot implements Identifiable{
  private String model;
  private String id;
  public Robot(String model, String id) {
    this.model = model;
    this.id = id;
  }
  @Override
  public String getId() {
    return this.id;
  }
  public String getModel() {
    return model;
  }

}
public class INTERFACE020{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    sc.nextLine();
    ArrayList<String>ids=new ArrayList<>();
    while(t-->0){
      ids.clear();
      String type;
      while(true){
      type=sc.nextLine();
      if(!type.equals("End")){
         String[] ar=type.split("\\s+");
         ids.add(ar[ar.length-1]);
       }
      else{
        String s=sc.nextLine();
        for(String x:ids){
          if(x.endsWith(s)){
            System.out.println(x);
          }
        }
        break;
      }
    }
    }
    sc.close();
  }
}