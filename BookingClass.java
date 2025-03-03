import java.util.Scanner;

class FlightBooking {
  public String flightId="OOP24";
  private static int seatAvailable=180;
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    sc.nextLine();
    while(t-->0){
      String s=sc.nextLine();
      String[] arr=s.split("\\s+");
      for(int i=0;i<arr.length;i+=2){
        if(arr[i+1].equals("Booking")){
          System.out.println();
        }
      }
    }
  }
}

