

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Pokemon{
	private String name,element;
	private int health;
	public Pokemon(String name, String element, int health) {
		super();
		this.name = name;
		this.element = element;
		this.health = health;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getElement() {
		return element;
	}
	public void setElement(String element) {
		this.element = element;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	
}
class Trainer{
	private String name;
	private int numberOfBadges;
	private ArrayList<Pokemon>pokemons;
	public Trainer(String name) {
		super();
		this.name = name;
		this.numberOfBadges=0;
		pokemons=new ArrayList<Pokemon>();
	}
	public void addPokemon(Pokemon x) {
		this.pokemons.add(x);
	}
	public void changeNumberOfBadges(String element) {
		int ok=0;
		for(int i=0;i<this.pokemons.size();i++) {
			if(this.pokemons.get(i).getElement().equals(element)) {
				this.numberOfBadges++;
				ok=1;
			}
		}
		if(ok==0) {
			for(int i=0;i<this.pokemons.size();i++) {
				if(this.pokemons.get(i).getHealth()<=10) {
					this.pokemons.remove(i);
				}
				else {
				this.pokemons.get(i).setHealth(this.pokemons.get(i).getHealth()-10);
				}
				
			}
		}
	}
	
	public String getName() {
		return name;
	}
	
	public int getNumberOfBadges() {
		return numberOfBadges;
	}
	public String toString() {
		return this.name+" "+this.numberOfBadges+" "+this.pokemons.size();
	}
	
}
public class OOP015 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        ArrayList<Trainer>trainers=new ArrayList<Trainer>();
        while(sc.hasNextLine()) {
        	String s=sc.nextLine();
        	if(s.equals("Tournament")) {
        		break;
        	}
        	String[] arr=s.split("\\s+");
        	int ok=0;
        	for(int i=0;i<trainers.size();i++) {
        		if(trainers.get(i).getName().equals(arr[0])) {
        			trainers.get(i).addPokemon(new Pokemon(arr[1], arr[2], Integer.parseInt(arr[3])));
        			ok=1;
        			break;
        		}
        	}
        	if(ok==0) {
        	Trainer x=new Trainer(arr[0]);
        	x.addPokemon(new Pokemon(arr[1], arr[2], Integer.parseInt(arr[3])));
        	trainers.add(x);
        	}
        }
        while(sc.hasNextLine()) {
        	String s=sc.nextLine();
        	if(s.equals("End")) {
        		break;
        	}
        	for(int i=0;i<trainers.size();i++) {
        		trainers.get(i).changeNumberOfBadges(s);
        	}
        }
        Collections.sort(trainers,new Comparator<Trainer>() {

			@Override
			public int compare(Trainer o1, Trainer o2) {
				// TODO Auto-generated method stub
				return o2.getNumberOfBadges()-o1.getNumberOfBadges();
			}
        	
        });
        for(Trainer tr:trainers) {
        	System.out.println(tr);
        }
        sc.close();
	}

}
