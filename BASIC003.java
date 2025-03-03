

import java.util.Scanner;

public class BASIC003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            while(t-->0) {
            	int n=sc.nextInt();
            	if(n%4==0&&n%100!=0||n%400==0) {
            		System.out.printf("%d : Leap-year\n",n);
            	}
            	else {
            		System.out.printf("%d : Non Leap-year\n",n);
            	}
            }
            sc.close();
	}

}
