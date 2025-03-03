

import java.util.Scanner;

class Song{
	private String name,author;
	private int duration;
	public Song(String name, String author, int duration) {
		super();
		this.name = name;
		this.author = author;
		this.duration = duration;
	}
	public boolean equals(Song song) {
		if(this.name.compareTo(song.name)==0&&this.author.compareTo(song.author)==0&&this.duration==song.duration) {
			return true;
		}
		return false;
	}
}
public class OBJECT_REFERENCES002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
       
        while(t-->0) {
        	Song song1=new Song(sc.next(),sc.next(),sc.nextInt());
        	Song song2=new Song(sc.next(),sc.next(),sc.nextInt());
        	System.out.println(song1.equals(song2));
        }
        sc.close();
	}

}
