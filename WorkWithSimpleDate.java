

class SimpleDate{
	private String day,month,year;

	public SimpleDate(String day, String month, String year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public boolean equals(SimpleDate x) {
		if(this.day==x.day&&this.month==x.month&&this.year==x.year) {
			return true;
		}
		return false;
	}
}
public class WorkWithSimpleDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         SimpleDate x=new SimpleDate("1", "2", "2000");
         System.out.println(x.equals(new SimpleDate(null, null, null)));
         System.out.println(x.equals(new SimpleDate("5", "2", "2012")));
         System.out.println(x.equals(new SimpleDate("1", "2", "2000")));
	}

}
