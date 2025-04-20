public class A {
  public static void main(String[] args) {
    String s="Dish \"Spaghetti Carbonara\" 120000.0 \"Al Fresco's\"";
    String[] arr=s.split("\"");
    for(String x:arr){
       System.out.println(x.trim());
    }
   // System.out.println(s);
  }
}
