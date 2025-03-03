

import java.util.Scanner;

public class BASIC009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) {
        	double x=sc.nextDouble();
        	double y=sc.nextDouble();
        	int res=0;
        	if(x>0&&y>0) {
        		res=1;
        	}
        	else if(x<0&&y>0) {
        		res=2;
        	}
        	else if(x<0&&y<0) {
        		res=3;
        	}
        	else if(x>0&&y<0) {
        		res=4;
        	}
        	System.out.println(res);
        }
        sc.close();
        
	}

}
