

import java.util.Scanner;

class Student{
	private String name;
	private int age;
	public static int numberOfStudent;

	public Student(String name,int age) {
		this.name = name;
		this.age=age;
	}

	public void display() {
		if(age>=18) {
			System.out.println(this.name);
		}
		else {
			return;
		}
	}
}
public class ELAB2302 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s;
		int age;
		while(sc.hasNextLine()) {
			s=sc.nextLine();
			age=Integer.parseInt(sc.nextLine());
			Student.numberOfStudent++;
			Student x=new Student(s,age);
			x.display();
		}
		System.out.println(Student.numberOfStudent);
		sc.close();
	}

}
