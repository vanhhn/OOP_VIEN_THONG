
public class BASIC008 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int sum=0;
       System.out.println("Numbers between 100 and 200, divisible by 9:");
       for(int i=100;i<=200;i++) {
    	   if(i%9==0) {
    		   sum+=i;
    		   System.out.println(i);
    	   }
       }
       System.out.println(sum);
	}

}
