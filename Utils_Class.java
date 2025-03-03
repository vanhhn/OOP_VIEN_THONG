import java.io.IOException;
import java.util.Scanner;

class Utils {
    public static void u(String s) {
        try {
            System.out.println(s);
            new Utils().z(s); // Sửa lỗi gọi phương thức không static

            try {
                System.out.println(Integer.parseInt(s) + 1);
            } catch (NumberFormatException e) { // Sửa lỗi thiếu kiểu dữ liệu trong catch
                System.out.println(s.toUpperCase());
            }
        } catch (IOException e) { // Sửa lỗi bắt sai ngoại lệ
            System.out.println(1);
        }
    }

    public void z(String s) throws IOException { // Sửa lỗi thiếu throws IOException
        System.out.println(2);
        if (s.length() == 1)
            throw new IOException();
        System.out.println(3);
    }
}

public class Utils_Class {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Utils.u(s);
        sc.close();

    }
}
