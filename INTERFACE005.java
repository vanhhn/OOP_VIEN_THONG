
import java.util.ArrayList;
import java.util.Scanner;

interface Identifiable{
	String getId();
}
interface Birthable{
	String getBirthDate();
}
class Citizen implements Identifiable,Birthable{
	private String name,id,birthDate;
	private int age;
	public Citizen(String name, int age,String id, String birthDate ) {
		super();
		this.name = name;
		this.id = id;
		this.birthDate = birthDate;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	@Override
	public String getBirthDate() {
		return this.birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String getId() {
		return this.id;
	}
	
}
class Pet implements Birthable{
	private String name,birthDate;

	public Pet(String name, String birthDate) {
		super();
		this.name = name;
		this.birthDate = birthDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
     @Override
	public String getBirthDate() {
		return this.birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	
	
}
public class INTERFACE005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       int t=sc.nextInt();
       sc.nextLine();
       ArrayList<Citizen>citizens=new ArrayList<Citizen>();
       ArrayList<Pet>pets=new ArrayList<Pet>();
       
       while(t-->0) {
    	   String q="";
    	   citizens.clear();
    	   pets.clear();
    	   while(sc.hasNext()) {
    		   String s=sc.next();
    		   if(s.equals("Citizen")) {
    			   citizens.add(new Citizen(sc.next(),Integer.parseInt(sc.next()), sc.next(), sc.next()));
    		   }
    		   else if(s.equals("Pet")) {
    			   pets.add(new Pet(sc.next(),sc.next()));
    		   }
    		   else if(s.equals("End")) {
    			   q=sc.next();
    			   break;
    		   }
    	   }
    	   //System.out.println(q);
    	   for(int i=0;i<citizens.size();i++) {
        	   if(q.equals(citizens.get(i).getBirthDate().substring(6,10))) {
        		   System.out.println(citizens.get(i).getBirthDate());
        	   }
           }
           for(int i=0;i<pets.size();i++) {
        	   if(q.equals(pets.get(i).getBirthDate().substring(6, 10))) {
        		   System.out.println(pets.get(i).getBirthDate());
        	   }
           }
    	   
       }
       sc.close();
       
       
	}

}
