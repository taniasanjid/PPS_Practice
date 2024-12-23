package org.example.sumPrefix;
import java.util.Scanner;
public class middleIndex {
    static int[] nums;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        nums = new int[s.length];

        for (int i = 0; i < s.length; i++) {
            nums[i] = Integer.parseInt(s[i]);
        }


        int pivot = calculatePivot(nums);
        System.out.println(pivot);
    }
public static int calculatePivot(int[] nums){

        int left =0;
        int total =0;

        for(int num : nums){
            total += num;
        }
        for(int i=0;i<= nums.length-1;i++){
           int right = total - left - nums[i];
            if(left == right){
                return i;
            }
            left+=nums[i];
        }

        return -1;
}
}
