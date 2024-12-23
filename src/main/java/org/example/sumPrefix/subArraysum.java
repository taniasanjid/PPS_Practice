package org.example.sumPrefix;

import java.util.Scanner;

public class subArraysum {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        int[] nums = new int[s.length];

        for (int i = 0; i < s.length; i++) {
            nums[i] = Integer.parseInt(s[i]);
        }
        int k = sc.nextInt();

        int result = subarraySum(nums, k);
        System.out.println(result);

    }

    public static int subarraySum(int[] nums, int k) {
        int count=0;

        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=i;j<nums.length;j++){
                sum+=nums[j];
                if(sum==k){
                    count++;
                }
            }
        }

        return count;
    }
}

