

import java.util.Scanner;

class Person1{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Person1(String name, int age) {
		this.name = name;
		this.age = age;
		if(name==null||name.trim().equals("")||name.length()>40) {
			this.name="n/a";
		}
		if(age>120||age<0) {
			this.age=-1;
		}
	}
	@Override
	public String toString() {
		if(this.age==-1) {
			return "Age is not valid";
		}
		if(this.name.equals("n/a")) {
			return "Name is not valid";
		}
		return "Name: "+ this.name+"--Age:"+this.age;
	}
	
}
public class EXCEPTION004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       int t=sc.nextInt();
       sc.nextLine();
       while(t-->0) {
    	   String s=sc.nextLine();
    	   int x=sc.nextInt();
    	   sc.nextLine();
    	   Person1 person=new Person1(s, x);
    	   System.out.println(person);
    	   
       }
       sc.close();
	}

}
