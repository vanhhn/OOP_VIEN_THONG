

import java.text.DecimalFormat;
import java.util.Scanner;

abstract class Car{
	public double price;
	public int year;
	abstract public double calculateSalePrice();
	public String toString() {
		double gia=calculateSalePrice();
		DecimalFormat formatter = new DecimalFormat("#,###.00");
        String formattedPrice = formatter.format(gia);
		
		return "Price: "+formattedPrice+" VND | Year: "+this.year;
	}
	
}
class SportCar extends Car{
	@Override
	public double calculateSalePrice() {
		double gia;
		if(this.year>2018) {
			gia=this.price*0.8;
		}
		else if(this.year>2010) {
			gia=this.price*0.5;
		}
		else {
			gia=this.price*0.1;
		}
		return gia;
	}
}
class ClassicCar extends Car{
	@Override
	public double calculateSalePrice() {
		double gia=this.price*1.12+20*Math.pow(10, 6);
		return gia;
	}
	
}
public class Class_Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        double giama=-1;
        while(t-->0) {
        	String s=sc.next();
        	
        	if(s.equals("SC")) {
        		SportCar x=new SportCar();
        		x.price=sc.nextDouble();
        		x.year=sc.nextInt();
        		giama=Math.max(giama, x.calculateSalePrice());
        		System.out.println(x);
        	}
        	else {
        		ClassicCar x=new ClassicCar();
        		x.price=sc.nextDouble();
        		x.year=sc.nextInt();
        		giama=Math.max(giama, x.calculateSalePrice());
        		System.out.println(x);
        	}
        }
        DecimalFormat formatter = new DecimalFormat("#,###.00");
        String formattedPrice = formatter.format(giama);
        System.out.printf("Most Expensive: %s VND",formattedPrice);
        sc.close();
	}

}
