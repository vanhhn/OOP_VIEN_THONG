

import java.util.Scanner;

public class BASIC005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         int t=sc.nextInt();
         while(t-->0) {
         int sum=0;
         for(int i=0;i<5;i++) {
        	 int x=sc.nextInt();
        	 sum+=x;
         }
         System.out.println(sum);
         }
         sc.close();
	}

}
