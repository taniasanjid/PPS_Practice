package org.example;

import java.util.Scanner;
/*
 * to find all repeating character from a given string in ascending order
 * */
public class all_repeating_asc {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean flag = all_repeating_asc(s);
        if(!flag){
            System.out.println("-1");
        }

    }

    public static boolean all_repeating_asc(String s){
        boolean flag = false;
        int n = s.length();
        String repeated = "";

        int i = 0, j = 0;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                }
                if (s.charAt(i) == s.charAt(j)) {
                    flag = true;
                    if(repeated.indexOf(s.charAt(i))==-1){
                        repeated+=s.charAt(i);
                    }
                    break;
                }
            }

        }
        int m= repeated.length();
        char[] ch = repeated.toCharArray();
        for(i=0;i<m-1;i++){
            for(j=i+1;j<m;j++){
                if(ch[i]>ch[j]){
              char  temp = ch[i];
              ch[i] = ch[j];
              ch[j] = temp;
            }
        }}

        for(i=0;i<m;i++){
            System.out.println(ch[i]);
        }
        return flag;
    }
}





