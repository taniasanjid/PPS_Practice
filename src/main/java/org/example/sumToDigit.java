package org.example;

import java.util.Scanner;
/*
 * to calculate sum until it's digit from given string
 * */
public class sumToDigit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = Integer.parseInt(s);
        System.out.println(checkDigit(n));

    }

    public static int calculateSum(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10) + calculateSum(n / 10);
    }

    public static int checkDigit(int n) {
        int sum = calculateSum(n);
        if (sum >= 10) {
            sum = calculateSum(sum);
        }
        return sum;
    }

}
