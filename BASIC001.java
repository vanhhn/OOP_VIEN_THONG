

import java.util.Scanner;

public class BASIC001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0) {
        	String s=sc.nextLine();
        	System.out.println(s);
        }
        sc.close();
	}

}
