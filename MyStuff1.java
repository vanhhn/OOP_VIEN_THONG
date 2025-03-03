

class MyStuff {
    private String name;

    MyStuff(String name) {
        this.name = name;
        //System.out.println("My Stuff is: " + name);
    }

	public String getName() {
		return name;
	}
    
}
public class MyStuff1{
    public static void main(String[] args) {
        MyStuff m1 = new MyStuff("PC");
        MyStuff m2 = new MyStuff("PC");
        
        // a.
        System.out.print("value compared: ");
        if(m1.getName()==m2.getName()) {
        	System.out.println("same");
        }
        else {
        	System.out.println("different");
        }
        System.out.print("reference compared: ");
        if (m2.equals(m1))
            System.out.println("same");
        else
            System.out.println("different");

        // b. Viết thêm code vào dấu ...
       
    }
}

