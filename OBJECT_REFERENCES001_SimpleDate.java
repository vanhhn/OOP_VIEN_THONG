class SimpleDate{
  private int ngay,thang,nam;

  public SimpleDate(int ngay, int thang, int nam) {
    this.ngay = ngay;
    this.thang = thang;
    this.nam = nam;
  }
  public boolean equals(SimpleDate d){
    return this.ngay==d.ngay&&this.thang==d.thang&&this.nam==d.nam;
  }
}

public class OBJECT_REFERENCES001_SimpleDate {

  public static void main(String[] args) {
    SimpleDate d0=new SimpleDate(1, 2, 2000);
    SimpleDate d1=new SimpleDate(0, 0, 0);
    SimpleDate d2=new SimpleDate(5, 2, 2012);
    SimpleDate d3=new SimpleDate(1, 2, 2000);
    System.out.println(d0.equals(d1));
    System.out.println(d0.equals(d2));
    System.out.println(d0.equals(d3));
  }
}