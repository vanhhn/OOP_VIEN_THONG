

import java.util.Scanner;

public class BASIC006 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc=new Scanner(System.in);
          int t=sc.nextInt();
          sc.nextLine();
          while(t-->0) {
        	  String s=sc.nextLine();
        	  int cnt=0;
        	  for(int i=0;i<s.length();i++) {
        		  if(s.charAt(i)>='0'&&s.charAt(i)<='9') {
        			  cnt++;
        		  }
        	  }
        	  System.out.println(cnt);
          }
          sc.close();
	}

}
