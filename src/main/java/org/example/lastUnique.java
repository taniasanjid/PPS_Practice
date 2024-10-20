package org.example;

import java.util.Scanner;
/*
* to find the last unique character from given string
* */
public class lastUnique {

    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    boolean flag = lastUnique(s);
    if(!flag==true)

    {
    System.out.println("-1");
    }
}

public static boolean lastUnique(String s){
        int i,j;
        int n = s.length();
        boolean flag = false;
        for(i=n-1;i>=0;i--){
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
                break;
            }
        }
    return flag;
}
}

