import java.util.Scanner;

class Employee{
  private String name;
  private double salary;
  public Employee(String name, double salary) {
    this.name = name;
    this.salary = salary;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public double getSalary() {
    return salary;
  }
  public void setSalary(double salary) {
    this.salary = salary;
  }
  public String getInfor(){
    return "Name: "+name+" Salary: "+salary;
  }
  public double calculateSalary(){
    return this.salary;
  }
}
class FullTimeEmployee extends Employee{
  private double bonus;

  public FullTimeEmployee(String name, double salary, double bonus) {
    super(name, salary);
    this.bonus = bonus;
  }
  @Override
  public double calculateSalary() {
    return super.calculateSalary() + this.bonus;
  }
  @Override
  public String getInfor(){
    String ans="Loại: FullTime\n"+String.format("Họ tên: %s\n",super.getName())+String.format("Lương cơ bản: %.1f\n",super.getSalary())+String.format("Thưởng: %.1f\n",this.bonus)+String.format("=> Lương thực nhận: %.1f",this.calculateSalary());
    return ans;
  }
}
class PartTimeEmployee extends Employee{
  private int hoursWorked;
  private double hourlyRate;
  public PartTimeEmployee(String name, int hoursWorked, double hourlyRate) {
    super(name, 0);
    this.hoursWorked = hoursWorked;
    this.hourlyRate = hourlyRate;
  }
  @Override
  public double calculateSalary() {
    return this.hoursWorked * this.hourlyRate;
  }
  @Override
  public String getInfor(){
    String ans="Loại: PartTime\n"+String.format("Họ tên: %s\n",super.getName())+String.format("Số giờ làm việc: %d giờ\n",this.hoursWorked)+String.format("Tiền công mỗi giờ: %.1f\n",this.hourlyRate)+String.format("=> Lương thực nhận: %.1f",this.calculateSalary());
    return ans;
  }
  
}
public class INHERITANCE012 {
  public static void main(String[] args) {
    System.out.println("--- Thông tin nhân viên ---");
    Scanner sc=new Scanner(System.in);
    String type1=sc.nextLine();
    if(type1.equals("FullTime")){
      String name=sc.nextLine();
      double salary=sc.nextDouble();
      double bonus=sc.nextDouble();
      FullTimeEmployee emp=new FullTimeEmployee(name,salary,bonus);
      System.out.println(emp.getInfor());
    }else if(type1.equals("PartTime")){
      String name=sc.nextLine();
      int hoursWorked=sc.nextInt();
      double hourlyRate=sc.nextDouble();
      PartTimeEmployee emp=new PartTimeEmployee(name,hoursWorked,hourlyRate);
      System.out.println(emp.getInfor());
    }
    System.out.println();
    sc.nextLine();
    String type2=sc.nextLine();
    if(type2.equals("FullTime")){
      String name=sc.nextLine();
      double salary=sc.nextDouble();
      double bonus=sc.nextDouble();
      FullTimeEmployee emp=new FullTimeEmployee(name,salary,bonus);
      System.out.println(emp.getInfor());
    }else if(type2.equals("PartTime")){
      String name=sc.nextLine();
      int hoursWorked=sc.nextInt();
      double hourlyRate=sc.nextDouble();
      PartTimeEmployee emp=new PartTimeEmployee(name,hoursWorked,hourlyRate);
      System.out.println(emp.getInfor());
    }
    sc.close();
  }
}
