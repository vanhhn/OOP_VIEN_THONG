

import java.util.Scanner;

public class StringBuffer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc=new Scanner(System.in);
          int t=sc.nextInt();
          sc.nextLine();
          while(t-->0) {
        	  StringBuffer sb=new StringBuffer(15);
              sb.append(sc.nextLine());
              System.out.println(sb.length());
          }
          
          sc.close();
          
          
	}

}
