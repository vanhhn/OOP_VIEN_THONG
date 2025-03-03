


class Dog{
	private String name,breed;
	private int age;
	
	public Dog(String name, String breed, int age) {
		this.name = name;
		this.breed = breed;
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void printDogDetail() {
		System.out.printf("Name:%s--Breed:%s--Age:%d",this.name,this.breed,this.age);
	}
}
public class OOP001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Dog Phong=new Dog("Micky","Husky",12);
       Phong.printDogDetail();
	}

}
