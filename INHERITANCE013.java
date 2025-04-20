import java.util.Scanner;

class Teacher {
  private String name;
  private double baseSalary;

  public Teacher(String name, double baseSalary) {
    this.name = name;
    this.baseSalary = baseSalary;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getBaseSalary() {
    return baseSalary;
  }

  public void setBaseSalary(double baseSalary) {
    this.baseSalary = baseSalary;
  }

  public String getInfor() {
    return "Name: " + name + " Base Salary: " + baseSalary;
  }

  public double calculateSalary() {
    return baseSalary;
  }

}

class PermanentLecturer extends Teacher {
  private double researchAllowance;

  public PermanentLecturer(String name, double baseSalary, double researchAllowance) {
    super(name, baseSalary);
    this.researchAllowance = researchAllowance;
  }

  @Override
  public double calculateSalary() {
    return super.calculateSalary() + this.researchAllowance;
  }

  @Override
  public String getInfor() {
    String ans = "Loại giảng viên: Permanent\n" + String.format("Họ tên: %s\n", super.getName())
        + String.format("Lương thực nhận: %.1f", this.calculateSalary());
    return ans;
  }
}

class VisitingLecturer extends Teacher {
  private int teachingHours;
  private double paymentPerHour;

  public VisitingLecturer(String name, int teachingHours, double paymentPerHour) {
    super(name, 0);
    this.teachingHours = teachingHours;
    this.paymentPerHour = paymentPerHour;
  }

  @Override
  public double calculateSalary() {
    return this.teachingHours * this.paymentPerHour;
  }

  @Override
  public String getInfor() {
    String ans = "Loại giảng viên: Visiting\n" + String.format("Họ tên: %s\n", super.getName())
        + String.format("Lương thực nhận: %.1f", this.calculateSalary());
    return ans;
  }
}

public class INHERITANCE013 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("--- Thông tin giảng viên ---");
    String type1 = sc.nextLine();
    if (type1.equals("PermanentLecturer")) {
      String name = sc.nextLine();
      double baseSalary = sc.nextDouble();
      double researchAllowance = sc.nextDouble();
      PermanentLecturer pl = new PermanentLecturer(name, baseSalary, researchAllowance);
      System.out.println(pl.getInfor());
    } else {
      String name = sc.nextLine();
      int teachingHours = sc.nextInt();
      double paymentPerHour = sc.nextDouble();
      VisitingLecturer vl = new VisitingLecturer(name, teachingHours, paymentPerHour);
      System.out.println(vl.getInfor());
    }
    sc.nextLine();
    String type2 = sc.nextLine();
    if (type2.equals("PermanentLecturer")) {
      String name = sc.nextLine();
      double baseSalary = sc.nextDouble();
      double researchAllowance = sc.nextDouble();
      PermanentLecturer pl = new PermanentLecturer(name, baseSalary, researchAllowance);
      System.out.println(pl.getInfor());
    } else {
      String name = sc.nextLine();
      int teachingHours = sc.nextInt();
      double paymentPerHour = sc.nextDouble();
      VisitingLecturer vl = new VisitingLecturer(name, teachingHours, paymentPerHour);
      System.out.println(vl.getInfor());
    }
    sc.close();
  }
}