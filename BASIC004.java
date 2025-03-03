

import java.util.Scanner;

public class BASIC004 {
	public static int splitArray(int[] nums, int k) {
        int max = 0;
        int sum = 0;
        for (int num : nums) {
            max = Math.max(max, num);
            sum += num;
        }
        
        if (k == 1) return sum;
        if (k >= nums.length) return max;
        
        int left = max;
        int right = sum;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (isPossible(nums, mid, k)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
	public static boolean isPossible(int[] nums, int mid, int k) {
        int currentSum = 0;
        int splits = 0;
        for (int num : nums) {
            if (currentSum + num > mid) {
                splits++;
                currentSum = num;
                if (splits >= k) {
                    return false;
                }
            } else {
                currentSum += num;
            }
        }
        return splits + 1 <= k;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0) {
        	String s=sc.next();
        	int k=sc.nextInt();
        	String[] arr=s.split(",");
        	int[] a=new int[arr.length];
        	int id=0;
        	for(String x:arr) {
        		a[id++]=Integer.parseInt(x);
        	}
        	System.out.println(splitArray(a,k));
        	
        }
        sc.close();
	}

}
