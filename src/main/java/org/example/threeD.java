package org.example;

import java.util.Scanner;

public class threeD {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int row = sc.nextInt();
            int column = sc.nextInt();
            int depth = sc.nextInt();
            int[][][] arr = new int[row][column][depth];


            for (int k = 0; k < depth; k++) {
                for (int i = 0; i < row; i++) {
                    for (int j = 0; j < column; j++) {
                        arr[i][j][k] = sc.nextInt();
                    }
                }
            }

            for (int k = 0; k < depth; k++) {
                for (int i = 0; i < row; i++) {
                    for (int j = 0; j < column; j++) {
                        System.out.print(arr[i][j][k] + " ");
                    }
                    System.out.println();
                }
                System.out.println();
            }


        }
    }


