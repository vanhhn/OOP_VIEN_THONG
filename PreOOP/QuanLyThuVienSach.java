import java.util.ArrayList;
import java.util.Scanner;

class Sach{
  private String maSach;
  private String tenSach;
  private String tacGia;
  private String nhaXuatBan;
  private int namXuatBan;
  private int soLuongHienCo;
  public Sach(String maSach, String tenSach, String tacGia, String nhaXuatBan, int namXuatBan, int soLuongHienCo) {
    this.maSach = maSach;
    this.tenSach = tenSach;
    this.tacGia = tacGia;
    this.nhaXuatBan = nhaXuatBan;
    this.namXuatBan = namXuatBan;
    this.soLuongHienCo = soLuongHienCo;
  }
  
  public void setSoLuongHienCo(int soLuongHienCo) {
    this.soLuongHienCo = soLuongHienCo;
  }

  public String getMaSach() {
    return maSach;
  }

  public String getTenSach() {
    return tenSach;
  }

  public int getSoLuongHienCo() {
    return soLuongHienCo;
  }

  public String hienThiThongTin(){
    return String.format("%s - %s - Tac gia: %s - NXB: %s - Nam: %d - So luong: %d",this.maSach,this.tenSach,this.tacGia,this.nhaXuatBan,this.namXuatBan,this.soLuongHienCo);
  }
  public boolean muonSach(int soLuongMuon){
    if(soLuongMuon>this.getSoLuongHienCo()){
      return false;
    }
    this.setSoLuongHienCo(this.getSoLuongHienCo()-soLuongMuon);
    return true;
  }
  public void traSach(int soLuongTra){
    this.setSoLuongHienCo(this.getSoLuongHienCo()+soLuongTra);
  }

}
public class QuanLyThuVienSach{
  public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      while(t-->0){
        int N=sc.nextInt();
        sc.nextLine();
        ArrayList<Sach>dsSach=new ArrayList<>();
        for(int i=0;i<N;i++){
          dsSach.add(new Sach(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
        }
        System.out.println("DANH SACH SACH BAN DAU:");
        for(Sach s:dsSach){
          System.out.println(s.hienThiThongTin());
        }
        int Q=Integer.parseInt(sc.nextLine());
        System.out.println("CAC THAO TAC:");
        while(Q-->0){
          String s=sc.nextLine();
          String[] arr=s.split("\\s+");
          if(arr[0].equals("MUON")){
            for(Sach sach:dsSach){
              if(sach.getMaSach().equals(arr[1])){
                if(sach.muonSach(Integer.parseInt(arr[2]))){
                  System.out.printf("MUON THANH CONG: Sach \"%s\" (Ma: %s) - So luong con lai: %d\n",sach.getTenSach(),sach.getMaSach(),sach.getSoLuongHienCo());
                }
                else{
                  System.out.printf("MUON THAT BAI: Sach \"%s\" (Ma: %s) khong du so luong (Con: %d, Can: %d)\n",sach.getTenSach(),sach.getMaSach(),sach.getSoLuongHienCo(),Integer.parseInt(arr[2]));
                }
                break;
              }
              
            }
           
          }
          else{
            for(Sach sach:dsSach){
              if(sach.getMaSach().equals(arr[1])){
                sach.traSach(Integer.parseInt(arr[2]));
                System.out.printf("TRA THANH CONG: Sach \"%s\" (Ma: %s) - So luong moi: %d\n",sach.getTenSach(),sach.getMaSach(),sach.getSoLuongHienCo());
                break;
              }
            }
          }
        }
        System.out.println("DANH SACH SACH CAP NHAT:");
        for(Sach s:dsSach){
          System.out.println(s.hienThiThongTin());
        }
      }
      sc.close();
  }
}