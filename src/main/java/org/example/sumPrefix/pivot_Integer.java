package org.example.sumPrefix;

import java.util.Scanner;

public class pivot_Integer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int pivot = calculatePivot(n);
        System.out.println(pivot);
    }

    public static int calculatePivot(int n){

        int left =0;
        int right =0;

        for(int i =0;i<=n;i++){
            left = i*(i+1)/2;
            right = n*(n+1)/2 -i*(i-1)/2;

            if(left==right){
                return i;
            }
        }
        return -1;
    }

}
