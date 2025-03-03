

interface Packable {
    double weight();
}
class Book implements Packable{
	//author(String), name(String), weight(double)
	private String author,name;
	private double weight;
	public Book(String author, String name, double weight) {
		super();
		this.author = author;
		this.name = name;
		this.weight = weight;
	}
	@Override
	public double weight() {
		return this.weight;
	}
	public String toString() {
		return this.author+": "+this.name;
	}
	
}
class CD implements Packable{
	//artist(String), name(String), publicationYear(int)
	private String artist,name;
	private int publicationYear;
	public CD(String artist, String name, int publicationYear) {
		super();
		this.artist = artist;
		this.name = name;
		this.publicationYear = publicationYear;
	}
	@Override
	public double weight() {
		return 0.1;
	}
	public String toString() {
		return this.artist+": "+this.name+" ("+this.publicationYear+")";
	}
}
public class INTERFACE001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println(new Book("Fyodor Dostoevsky","Crime and Punishment",2));
       System.out.println(new Book("Robert Martin","Clean Code",1));
       System.out.println(new Book("Kent Beck","Test Driven Development",0.5));
       System.out.println(new CD("Pink Floyd","Dark Side of the Moon",1973));
       System.out.println(new CD("Wigwam","Nuclear Nightclub",1975));
       System.out.println(new CD("Rendezvous Park","Closer to Being Here",2012));
	}

}
