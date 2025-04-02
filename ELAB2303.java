class MyStuff {
  private String name;

  MyStuff(String name) {
      this.name = name;
      //System.out.println("My Stuff is: " + name);
  }
  public boolean equals(MyStuff x){
    if(this.name.equals(x.name)){
      return true;
    }
    return false;
  }
}
public class ELAB2303 {
  public static void main(String[] args) {
      MyStuff m1 = new MyStuff("PC");
      MyStuff m2 = new MyStuff("PC");
      
      // a.
      System.out.print("value compared: ");
      if (m2.equals(m1))
          System.out.println("same");
      else
          System.out.println("different");
      System.out.print("reference compared: ");
      if(m1==m2){
        System.out.println("same");
      }
      else{
        System.out.println("different");
      }
     
  }
}