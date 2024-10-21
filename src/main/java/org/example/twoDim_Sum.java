package org.example;

import java.util.Scanner;

public class twoDim_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();
        int[][] arr1 = new int[row][column];
        int[][] arr2 = new int[row][column];
        int[][] sum = new int[row][column];

        System.out.println("Input for Array 1:");
        for(int i= 0;i<row;i++){
            for(int j=0;j<column;j++){
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Input for Array 2:");
        for(int i= 0;i<row;i++){
            for(int j=0;j<column;j++){
                arr2[i][j] = sc.nextInt();
            }
        }
        System.out.println("Output for Array 1:");
        for(int i= 0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print(arr1[i][j] +" ");
            }
            System.out.println();
        }

        System.out.println("Output for Array 2:");
        for(int i= 0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                sum[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        System.out.println("Sum:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}
