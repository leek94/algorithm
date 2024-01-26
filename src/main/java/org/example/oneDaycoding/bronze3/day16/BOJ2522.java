package org.example.oneDaycoding.bronze3.day16;

import java.util.Scanner;

public class BOJ2522 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = N-1; i >= 0; i--) {
            for (int j = 0; j < N; j++) {
                if(i<=j)System.out.print("*");
               else System.out.print(" ");
            }
            System.out.println();
        }

        for (int i = 1; i <N; i++) {
            for (int j = 0; j < N; j++) {
                if(i<=j)System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }



    }
}
