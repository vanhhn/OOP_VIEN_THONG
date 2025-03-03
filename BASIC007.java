

import java.util.Scanner;

public class BASIC007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         int t=sc.nextInt();
         while(t-->0) {
        	 int l=sc.nextInt();
        	 int r=sc.nextInt();
        	 long sum=0;
        	 for(int i=l;i<=r;i++)sum+=i;
        	 System.out.println(sum);
         }
         sc.close();
	}

}
