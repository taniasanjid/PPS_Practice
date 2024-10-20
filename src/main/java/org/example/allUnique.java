package org.example;

import java.util.Scanner;
/*
 * to find all unique character from a given string
 * */
public class allUnique {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean flag = all_unique(s);
        if(!flag){
            System.out.println("-1");
        }

    }

    public static boolean all_unique(String s){
        boolean flag = false;
        int i,j;
        int n = s.length();
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                if(i==j){
                    continue;
                }
                if(s.charAt(i)==s.charAt(j)){
                    break;
                }
            }
            if(n==j){
                System.out.println(s.charAt(i));
                flag = true;
            }
        }
        return flag;
    }
}
