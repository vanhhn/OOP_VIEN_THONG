

class Person{
	private String name,address;

	public Person(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}
	public String toString() {
		return this.name+" - "+this.address;
	}
}
class Student extends Person{
	private int credits;
	private String studentID;
	public Student(String name, String address, String studentID) {
		super(name, address);
		this.studentID = studentID;
		this.credits=0;
	}
	public void study() {
		this.credits++;
	}
	public int getCredits() {
		return credits;
	}
	public String getStudentID() {
		return studentID;
	}
	
}
public class INHERITANCE003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Student st=new Student("Ollie", "6381 Hollywood Blvd. Los Angeles", "90028");
      System.out.println(st+" "+st.getStudentID());
      System.out.println("Study credits "+st.getCredits());
      st.study();
      System.out.println("Study credits "+st.getCredits());
      
	}

}
