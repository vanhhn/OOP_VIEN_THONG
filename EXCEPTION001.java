import java.util.*;
class TienKhongCung extends Exception{
   public TienKhongCung(String message){
    super(message);
   }
}
class Amount {
     private String currency;
     private int amount;
     public Amount(String currency, int amount) {
      this.currency = currency;
      this.amount = amount;
     }
     public String getCurrency() {
       return currency;
     }
     public void setCurrency(String currency) {
       this.currency = currency;
     }
     public int getAmount() {
       return amount;
     }
     public void setAmount(int amount) {
       this.amount = amount;
     }
     public void add(Amount amount) throws TienKhongCung{
      if(!this.currency.equals(amount.getCurrency())){
        throw new TienKhongCung("Currency doesn't match");
      }
      System.out.println(this.amount+amount.getAmount());
     }
}
public class EXCEPTION001 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=Integer.parseInt(sc.nextLine());
    for(int i=0;i<n;i++){
      String s=sc.nextLine();
      String[] ar=s.split("\\s+");
      Amount amout1=new Amount(ar[0], Integer.parseInt(ar[1]));
      Amount amout2=new Amount(ar[2], Integer.parseInt(ar[3]));
      try {
        amout1.add(amout2);
      } 
      catch (Exception e) {
        System.out.println(e.getMessage());
      }
    }
   sc.close();
  }
}
// oke xong bai toan roi