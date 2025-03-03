
import java.util.Scanner;
class Amount {
	//currency(String) vàamount(int) và bổ sung hàmadd(Amount amount)
	private String currency;
	private int amount;
	public void add(Amount amount) {
	    try {
	        if (this.currency.compareTo(amount.currency) == 0) {
	            this.amount += amount.amount;
	            System.out.println(this.amount);
	        } else {
	            throw new IllegalArgumentException("Currency doesn't match");
	        }
	    } catch (Exception e) {
	        System.out.println("Currency doesn't match");
	    }
	}
	public Amount(String currency, int amount) {
		super();
		this.currency = currency;
		this.amount = amount;
	}
	

}
public class EXCEPTION001_Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      sc.nextLine();
      while(t-->0) {
    	  Amount x=new Amount(sc.next(), sc.nextInt());
    	  Amount y=new Amount(sc.next(), sc.nextInt());
    	  x.add(y);
      }
      sc.close();
	}

}
