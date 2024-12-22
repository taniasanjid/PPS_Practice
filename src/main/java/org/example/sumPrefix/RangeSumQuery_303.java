package org.example.sumPrefix;
import java.util.Scanner;
public class RangeSumQuery_303 {

    static int[] prefixSum;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        int[] nums = new int[s.length];

        for (int i = 0; i < s.length; i++) {
            nums[i] = Integer.parseInt(s[i]);
        }

        // Precompute prefix sums
        prefixSum = new int[nums.length];
        prefixSum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i];
        }

        // Read range query
        int left = sc.nextInt();
        int right = sc.nextInt();

        // Calculate and print the result
        int result = sumRange(left, right);
        System.out.println(result);
    }

    public static int sumRange(int left, int right) {
        if (left == 0) {
            return prefixSum[right];
        } else {
            return prefixSum[right] - prefixSum[left - 1];
        }
    }
}
    /*Using iteratice, for smaller size of array
    static int[] nums;
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        nums = new int[s.length];

        for(int i =0;i<s.length;i++){
            nums[i] = Integer.parseInt(s[i]);
        }
        int left = sc.nextInt();
        sc.nextLine();
        int right = sc.nextInt();
        sc.nextLine();

        int result = sumRange(left, right);
        System.out.println(result);


    }

    public static int sumRange(int left, int right) {
        int sum =0;
        for(int i =left;i<=right;i++){
            sum+=nums[i];
        }
        return sum;
    }
}

*/



