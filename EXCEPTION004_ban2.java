import java.util.Scanner;
class NgoaiLeTen extends Exception{
  public NgoaiLeTen(){
      super("Name is not valid");
  }
}
class NgoaiLeTuoi extends Exception{
  public NgoaiLeTuoi(){
    super("Age is not valid");
  }
}
class Person{
  private String name;
  private int age;
  public Person(String name,int age) throws NgoaiLeTuoi,NgoaiLeTen{
    if(name==null||name.trim().isEmpty()||name.length()>40){
      throw new NgoaiLeTen();
    }
    if(age<0||age>120){
      throw new NgoaiLeTuoi();
    }
    this.name=name;
    this.age=age;
  }
  public String toString(){
    return String.format("Name: %s--Age:%d",this.name,this.age);
  }
}
public class EXCEPTION004_ban2 {
  public static void main(String[] args) throws NgoaiLeTuoi ,NgoaiLeTen{
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    sc.nextLine();
    while(t-->0){
      try{
          Person x=new Person(sc.nextLine(), Integer.parseInt(sc.nextLine()));
          System.out.println(x);
      }
      catch(NgoaiLeTen e){
        System.out.println(e.getMessage());
      }
      catch(NgoaiLeTuoi e){
        System.out.println(e.getMessage());
      }
    }
  }
}
