

import java.util.ArrayList;
import java.util.Scanner;

interface Moveable{
	void move(int dx, int dy);
}
class Organism implements Moveable{
	private int x,y;

	public Organism(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	@Override
	public void move(int dx,int dy) {
		this.x+=dx;
		this.y+=dy;
	}
	public String toString() {
		return "x:"+this.x+";"+"y"+":"+this.y;
	}
}
class Herd{
	private ArrayList<Organism>arr;
	public Herd() {
		arr=new ArrayList<Organism>();
	}
	public void addToHerd(Organism or) {
		arr.add(or);
	}
	public void move(int dx, int dy) {
		for(int i=0;i<arr.size();i++) {
			arr.get(i).move(dx, dy);
		}
	}
	public String toString() {
		String res="";
		for(int i=0;i<arr.size();i++) {
			res+=arr.get(i).toString()+"\n";
		}
		return res;
	}
}
public class Organism_Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        Herd x=new Herd();
        while(t-->0) {
        	x.addToHerd(new Organism(sc.nextInt(), sc.nextInt()));
        }
        x.move(1, 1);
        System.out.println(x);
        sc.close();
	}

}
