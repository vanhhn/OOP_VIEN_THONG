// day toi thang can sap xep la sinh vien
import java.util.*;// cu import nhu nay la do phai nghi
class SinhVien{
  private String ten;
  private int namSinh;
  private double GPA;
  private int tinChi;
  
  public String getTen() {
    return ten;
  }
  public SinhVien(String ten, int namSinh, double gPA, int tinChi) {
    this.ten = ten;
    this.namSinh = namSinh;
    GPA = gPA;
    this.tinChi = tinChi;
  }
  public void setTen(String ten) {
    this.ten = ten;
  }
  public int getNamSinh() {
    return namSinh;
  }
  public void setNamSinh(int namSinh) {
    this.namSinh = namSinh;
  }
  public double getGPA() {
    return GPA;
  }
  public void setGPA(double gPA) {
    GPA = gPA;
  }
  public int getTinChi() {
    return tinChi;
  }
  public void setTinChi(int tinChi) {
    this.tinChi = tinChi;
  }
  public String toString(){
    return String.format("%s %d %.1f %d",this.ten,this.namSinh,this.GPA,this.tinChi);// copy cai output vao roi thay vao cac truong tuong ung de tranh sai va nhanh
  }
}
//oke h tao lop Comparator de sap xep
class BY_GPA_CREDIT_NAME implements Comparator<SinhVien>{
  @Override
  public int compare(SinhVien o1,SinhVien o2){
    // toi thuong xet het cac truong hop no bang nhau truoc
    if(Double.compare(o1.getGPA(),o2.getGPA())==0){
       // diem bang nhau 
       if(o1.getTinChi()==o2.getTinChi()){
        // so tin bang nhau
        return o1.getTen().compareTo(o2.getTen());
       }
       else{
        return Integer.compare(o2.getTinChi(), o1.getTinChi());
       }
    }
    return Double.compare(o2.getGPA(), o1.getGPA());
  }
}
// oke h xong cai dau tien
class BY_BIRTH_GPA_NAME implements Comparator<SinhVien>{
  @Override
  public int compare(SinhVien o1,SinhVien o2){
    // toi thuong xet het cac truong hop no bang nhau truoc
    if(o1.getNamSinh()==o2.getNamSinh()){
      if(Double.compare(o1.getGPA(), o2.getGPA())==0){
        return o1.getTen().compareTo(o2.getTen());
      }
      else{
        return Double.compare(o2.getGPA(), o1.getGPA());
      }
    }
    return Integer.compare(o1.getNamSinh(), o2.getNamSinh());
  }
}
// oke duoc 80 % bai toan roi
public class COMPARATOR022 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=Integer.parseInt(sc.nextLine());
    ArrayList<SinhVien>arr=new ArrayList<>();
    for(int i=0;i<n;i++){
      String s=sc.nextLine();
      String[] ar=s.split("\\s+");
      arr.add(new SinhVien(ar[0], Integer.parseInt(ar[1]), Double.parseDouble(ar[2]), Integer.parseInt(ar[3])));
    }
    String type=sc.nextLine();
    if(type.equals("BY_GPA_CREDIT_NAME")){
      Collections.sort(arr, new BY_GPA_CREDIT_NAME());
    }
    else if(type.equals("BY_BIRTH_GPA_NAME")){
      Collections.sort(arr, new BY_BIRTH_GPA_NAME());
    }
    // oke h loop qua va in ra
    for(SinhVien sv: arr){
      System.out.println(sv);
    }
    sc.close();
  }
}
// code co the hoi dai nhung chung ta chi can nhu vay la duoc roi