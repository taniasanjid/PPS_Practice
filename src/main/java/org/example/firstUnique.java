package org.example;
import java.util.Scanner;

/*
 * to find the first unique character from given string
 * */

public class firstUnique {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String s = sc.nextLine();
      boolean flag = firstUnique(s);
      if(!flag){
          System.out.println("-1");
      }
    }

      public static boolean firstUnique(String s) {
        boolean flag = false;
          int n = s.length();
          int i = 0, j = 0;
          for (i = 0; i < n; i++) {
              for (j = 0; j < n; j++) {
                  if (i == j) {
                      continue;
                  }
                  if (s.charAt(i) == s.charAt(j)) {
                      break;
                  }
              }
              if (n == j) {
                  System.out.println(s.charAt(i));
                  flag = true;
                  break;
              }

          }
          return flag;
      }


    }
