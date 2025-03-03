

import java.util.ArrayList;

class Item{
	private String name;
	private int weight;
	public Item(String name) {
		super();
		this.name = name;
	}
	public Item(String name, int weight) {
		super();
		this.name = name;
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public int getWeight() {
		return weight;
	}
	
}
abstract class Box {
	abstract public  void addItem(Item item);
	abstract public boolean isInBox(Item item);
}
class BoxWithMaxWeight extends Box{
	private static int maxWeight;
	public ArrayList<Item>items;
	public BoxWithMaxWeight(int maxWeight) {
		this.setMaxWeight(maxWeight);
		items=new ArrayList<Item>();
	}
	@Override
	public void addItem(Item item) {
		if(item.getWeight()<=this.maxWeight) {
		 items.add(item);
		 this.maxWeight-=item.getWeight();
		}else {
			return;
		}
	}
	@Override
	 public boolean isInBox(Item item) {
		for(Item x:items) {
			if(item.getName()==x.getName()) {
				return true;
			}
		}
		return false;
	}
	public int getMaxWeight() {
		return maxWeight;
	}
	public void setMaxWeight(int maxWeight) {
		this.maxWeight = maxWeight;
	}
}
public class INHERITANCE002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         BoxWithMaxWeight x=new BoxWithMaxWeight(10);
         x.addItem(new Item("Saludo",5));
         x.addItem(new Item("Pirkka",5));
         x.addItem(new Item("Kopi Luwak",5));
         System.out.println(x.isInBox(new Item("Saludo")));
         System.out.println(x.isInBox(new Item("Pirkka")));
         System.out.println(x.isInBox(new Item("Kopi Luwak")));
	}

}
