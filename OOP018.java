

import java.util.ArrayList;
import java.util.HashMap;

import java.util.Map.Entry;
import java.util.Scanner;

class Employee{
	private String name,department,email;
	private double salary;
	private int age;
	//name,salary,departmentlà bắt buộc trong
	public Employee(String name, String department, String email, double salary, int age) {
		super();
		this.name = name;
		this.department = department;
		this.email = email!=null?email:"n/a";
		this.salary = salary;
		this.age = age;
	}
	
	public String getDepartment() {
		return department;
	}
	public String getEmail() {
		return email;
	}
	public double getSalary() {
		return salary;
	}
	public int getAge() {
		return age;
	}
	
	public String toString() {
		return this.name+" "+String.format("%.2f",this.salary)+" "+this.email+" "+this.age;
	}
	
}
class Pair{
	public int x;
	public double y;
	public Pair(int x, double y) {
		super();
		this.x = x;
		this.y = y;
		
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
}
public class OOP018 {
    public static int checkEmail(String s) {
    	for(int i=0;i<s.length();i++) {
    		if(Character.isAlphabetic(s.charAt(i))) {
    			return 1;
    		}
    	}
    	return 0;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       int t=sc.nextInt();
       HashMap<String,Pair>hm=new HashMap<String, Pair>();
       ArrayList<Employee>ar=new ArrayList<>();
       sc.nextLine();
       while(t-->0) {
    	   String s=sc.nextLine();
    	   String[] arr=s.split("\\s+");
    	   //String name, String department, String email, double salary, int age
//    	   /name,salary,department,(email: không bắt buộc và age: khô)
    	   if(hm.containsKey(arr[2])){
    		   Pair tmp=hm.get(arr[2]);
    		   tmp.setX(tmp.getX()+1);
    		   tmp.setY(tmp.getY()+Double.parseDouble(arr[1]));
    		   hm.put(arr[2], tmp);
    	   }
    	   else {
    		   hm.put(arr[2], new Pair(1,Double.parseDouble(arr[1])));
    	   }
    	   if(arr.length==3) {
    		   ar.add(new Employee(arr[0],arr[2] ,"n/a" , Double.parseDouble(arr[1]), -1));
    	   }
    	   else if(arr.length==4) {
    		   if(checkEmail(arr[3])==1) {
    			   ar.add(new Employee(arr[0], arr[2], arr[3],Double.parseDouble(arr[1]), -1));
    		   }
    		   else {
    			   ar.add(new Employee(arr[0], arr[2], "n/a",Double.parseDouble(arr[1]), Integer.parseInt(arr[3])));   
    		   }
    	   }
    	   else if(arr.length==5) {
    		   ar.add(new Employee(arr[0], arr[2], arr[3],Double.parseDouble(arr[1]) , Integer.parseInt(arr[4])));
    	   }
    	   
    	   
       }
       double maxSalary=-1;
       String de="";
       for(Entry<String,Pair>entry:hm.entrySet()) {
    	   double avgLuong=(double)(entry.getValue().y/entry.getValue().x);
    	   //System.out.println(entry.getKey()+" "+entry.getValue().x+" "+entry.getValue().y);
    	   if(maxSalary<avgLuong) {
    		   maxSalary=avgLuong;
    		   de=entry.getKey();
    	   }
       }
       System.out.println("Highest Average Salary: "+de);
       for(Employee x:ar) {
    	   if(x.getDepartment().equals(de)){
    		   System.out.println(x);
    	   }
       }
       sc.close();
	}

}
