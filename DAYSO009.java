import java.util.Scanner;

public class DAYSO009  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Số testcase
        sc.nextLine(); // Bỏ dòng trống sau số testcase

        for (int k = 0; k < t; k++) {
            String B = sc.nextLine();
            int maxDiff = findMaxDifference(B);
            System.out.println(maxDiff);
        }
        sc.close();
    }

    public static int findMaxDifference(String B) {
        int maxSum = Integer.MIN_VALUE; // Tổng lớn nhất tìm được
        int currentSum = 0;             // Tổng hiện tại
        boolean hasZero = false;        // Kiểm tra có bít 0 không

        for (char bit : B.toCharArray()) {
            int value = (bit == '0') ? 1 : -1; // 0 -> +1, 1 -> -1
            if (bit == '0') hasZero = true;    // Ghi nhận có bít 0

            currentSum += value;

            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
            if (currentSum < 0) {
                currentSum = 0; // Reset nếu tổng âm
            }
        }

        if (!hasZero) return -1; // Nếu không có bít 0 nào
        return maxSum;
    }
}
