package org.example;


import java.util.Scanner;
/*
 * to find all prime number in given range and contains 1
 * */
public class Prime_contain1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int lower = sc.nextInt();
        int upper = sc.nextInt();
        int count = 0;
        for(int i =lower;i<=upper;i++){
            if(isPrime(i) && contains1(i)){
                count++;
                System.out.println(i);
            }
        }

    }

    public static boolean isPrime(int x){
        if (x <= 1) {
            return false;
        }
        for(int i = 2;i*i<=x;i++){
            if((x%i)==0){
                return false;
            }
        }
        return true;
    }
    public static boolean contains1(int x){
        String s = String.valueOf(x);
        if(s.contains("1")){
            return true;
        }
        return false;
    }
}
