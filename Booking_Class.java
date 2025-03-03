import java.util.Scanner;

class FlightBooking {
  public String flightId = "OOP24";
  private static int seatAvailable = 180;

  public static int getSeatAvailable() {
    return seatAvailable;
  }

  public static void setSeatAvailable(int seatAvailable) {
    FlightBooking.seatAvailable = seatAvailable;
  }

}

public class Booking_Class {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    sc.nextLine();
    while (t-- > 0) {
      FlightBooking.setSeatAvailable(180);
      String s = sc.nextLine();
      String[] arr = s.split("\\s+");
      for (int i = 0; i < arr.length; i += 2) {
        if (arr[i + 1].equals("Booking")) {
          FlightBooking.setSeatAvailable(FlightBooking.getSeatAvailable() - 1);
          System.out.printf("[Seat Available: %d]", FlightBooking.getSeatAvailable());

        } else if (arr[i + 1].equals("Confirmed")) {
          System.out.printf("--User %s Confirmed--[Seat Available: %d]", arr[i], FlightBooking.getSeatAvailable());
        } else {
          FlightBooking.setSeatAvailable(FlightBooking.getSeatAvailable() + 1);
          System.out.printf("[Seat Available: %d]", FlightBooking.getSeatAvailable());
         
        }
      }
      System.out.println("");

    }
    sc.close();
  }
}
