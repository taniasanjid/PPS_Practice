package org.example.sumPrefix;

import java.util.Scanner;

public class leftright_diff {
   static int[] nums;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        nums = new int[s.length];

        for (int i = 0; i < s.length; i++) {
            nums[i] = Integer.parseInt(s[i]);
        }

        int[] result = leftRigthDifference(nums);
        for(int n:result){
            System.out.print(n+ " ");
        }

    }
    public static int[] leftRigthDifference(int[] nums) {
        int leftSum = 0, rightSum = 0, n = nums.length;
        for(int num : nums) rightSum += num;
        for(int i = 0; i < n; i++) {
            int val = nums[i];
            rightSum -= val;
            nums[i] = Math.abs(leftSum - rightSum);
            leftSum += val;
        }
        return nums;
    }
}
