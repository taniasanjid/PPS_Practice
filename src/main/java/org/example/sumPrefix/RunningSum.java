package org.example.sumPrefix;

import java.util.Scanner;

public class RunningSum {
    static int[] nums;
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        nums = new int[s.length];

        for(int i =0;i<s.length;i++){
            nums[i] = Integer.parseInt(s[i]);
        }

        int[] result = sumRange(nums);

        for (int num : result) {
            System.out.print(num + " ");
        }

    }
    public static int[] sumRange(int[] nums) {
        int sum =0;
        int[] result = new int[nums.length];
        for(int i =0;i< nums.length;i++){
            sum+=nums[i];
            result[i] = sum;
        }
        return result;
    }
}
