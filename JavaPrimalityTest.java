import java.math.BigInteger;

import java.util.Scanner;

public class JavaPrimalityTest {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String n=sc.nextLine();
    BigInteger x=new BigInteger(n);
    
    if(x.isProbablePrime(100)){
      System.out.println("prime");
    }
    else{
      System.out.println("not prime");
    }
    sc.close();
  }
}
