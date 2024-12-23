package org.example.sumPrefix;

import java.util.Scanner;

public class contigous_array {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String[] s = sc.nextLine().split(" ");
            int[] nums = new int[s.length];

            for (int i = 0; i < s.length; i++) {
                nums[i] = Integer.parseInt(s[i]);
            }

            int result = maximumScore(nums);
            System.out.println(result);


        }

    public static int maximumScore(int[] nums) {


        int maxscore = 0;

        for (int i = 0; i < nums.length; i++) {
            int sum =0;
            for(int j =i;j<nums.length;j++){
                if (nums[j] == 0) {
                    sum += -1;
                } else {
                    sum += 1;
                }
                if(sum==0){
                    maxscore = Math.max(maxscore, j-i+1);
                }
            }


        }
        return maxscore;
    }
}
