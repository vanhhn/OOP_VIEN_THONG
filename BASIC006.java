import java.util.Scanner;

public class BASIC006{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(sc.hasNext()){
            String  s1 = sc.nextLine();
            int cnt=0;
            for(int i = 0; i < s1.length(); ++i){
                if(s1.charAt(i) >= '0' && s1.charAt(i) <= '9') cnt++;
            }
            System.out.println(cnt);
        }

        sc.close();
    }
}