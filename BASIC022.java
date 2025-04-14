import java.util.Scanner;

public class BASIC022 {
  public static boolean checkPrime(int n){
    if(n<=1) return false;
    if(n==2||n==3) return true;
    if(n%2==0||n%3==0) return false;
    for(int i=5;i*i<=n;i+=6){
      if(n%i==0||n%(i+2)==0) return false;
    }
    return true;
  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int cnt=0;
    int[] p=new int[n+1];
    for(int i=0;i<=n;i++){
      p[i]=1;
    }
    p[0]=p[1]=0;
    for(int i=2;i*i<=n;i++){
      if(p[i]==1){
        for(int j=i*i;j<=n;j+=i){
          p[j]=0;
        }
      }
    }
    System.out.printf("Primes in the range 2 to %d:\n",n);
    for(int i=2;i<=n;i++){
      if(p[i]==1){
        System.out.println(i);
        cnt++;
      }
    }
    System.out.printf("Total number of primes in the range: %d\n",cnt);
    if(checkPrime(cnt)){
      System.out.printf("The prime count %d is a prime number.",cnt);
    }
    else{
      System.out.printf("The prime count %d is not a prime number.",cnt);
    }
    sc.close();
  }
}
