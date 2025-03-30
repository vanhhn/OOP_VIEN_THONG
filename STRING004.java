import java.util.Scanner;

public class STRING004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine()); // Đọc số lượng test case
        
        for (int i = 0; i < n; i++) {
            StringBuffer sb = new StringBuffer(scanner.nextLine()); // Đọc chuỗi và tạo StringBuffer
            System.out.println(sb.length()); // In ra độ dài của chuỗi
        }
        
        scanner.close();
    }
}
