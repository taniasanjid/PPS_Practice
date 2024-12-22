package org.example.sumPrefix;

import java.util.Map;
import java.util.Scanner;



public class maximumScore_1422 {
    static int[] prefixSum;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int result = maximumScore(s);
        System.out.println(result);
    }

    public static int maximumScore(String s) {

        int total_ones = 0;
        int zero_left = 0;
        int zero_right = 0;
        int maxscore = 0;

        for (char c : s.toCharArray()) {
            if (c == '1') {
                total_ones++;
            }
        }

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                zero_left++;
            } else {
                zero_right++;
            }
            int currentScore = zero_left + (total_ones - zero_right);
            maxscore = Math.max(maxscore, currentScore);
        }
        return maxscore;
    }
}

