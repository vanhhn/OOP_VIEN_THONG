import java.util.Scanner;

interface Identifiable{
  abstract String getId();
}
interface Payable{
  abstract double calculateMonthlyPay();
}
class FullTime implements Identifiable, Payable{
  private String name;
  private String id;
  private double monthSalary;
  public FullTime(String name, String id, double monthSalary){
    this.name=name;
    this.id=id;
    this.monthSalary=monthSalary;
  }
  @Override
  public String getId(){
    return this.id;
  }
  @Override
  public double calculateMonthlyPay(){
    return this.monthSalary;
  }
  public String getName() {
    return name;
  }
  public double getMonthSalary() {
    return monthSalary;
  }
  
}
class PartTime implements Identifiable,Payable{
    private String name;
    private String id;
    private double hourlyRate;
    private int hoursWorked;
    public PartTime(String name, String id, double hourlyRate, int hoursWorked){
      this.name=name;
      this.id=id;
      this.hourlyRate=hourlyRate;
      this.hoursWorked=hoursWorked;
    }
    @Override
    public String getId(){
      return this.id;
    }
    @Override
    public double calculateMonthlyPay(){
      return this.hourlyRate*this.hoursWorked;
    }
    public String getName() {
      return name;
    }
    public double getHourlyRate() {
      return hourlyRate;
    }
    public int getHoursWorked() {
      return hoursWorked;
    }
}
public class INTERFACE022{
  public static String[] tachCacThanhPhanRa(String s){
    String[] arr=s.split("\"");
    String[] arr1=arr[2].trim().split("\\s+");
    String[] arr2=new String[2+arr1.length];
    arr2[0]=arr[0].trim();
    arr2[1]=arr[1].trim();
    for(int i=0;i<arr1.length;i++){
      arr2[i+2]=arr1[i].trim();
    }
    return arr2;
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    sc.nextLine();
    while(t-->0){
      double total=0;
      String line;
      while(true){
        line=sc.nextLine();
        if(!line.equals("Calculate")){
            String[] arr=tachCacThanhPhanRa(line);
            if(arr[0].equals("FullTime")){
              String name=arr[1];
              String id=arr[2];
              double monthSalary=Double.parseDouble(arr[3]);
              FullTime ft=new FullTime(name,id,monthSalary);
              total+=ft.calculateMonthlyPay();
            }
            else if(arr[0].equals("PartTime")){
              String name=arr[1];
              String id=arr[2];
              double hourlyRate=Double.parseDouble(arr[3]);
              int hoursWorked=Integer.parseInt(arr[4]);
              PartTime pt=new PartTime(name,id,hourlyRate,hoursWorked);
              total+=pt.calculateMonthlyPay();
            }
        }
        else{
          System.out.printf("Total Monthly Payroll: %.2f\n",total);
          break;
        }
      }
    }
    sc.close();
  }
}