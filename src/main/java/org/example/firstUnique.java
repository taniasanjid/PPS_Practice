package org.example;


import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String s = sc.nextLine();
      boolean firstUnique = firstUnique(s);
      if(!firstUnique){
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
