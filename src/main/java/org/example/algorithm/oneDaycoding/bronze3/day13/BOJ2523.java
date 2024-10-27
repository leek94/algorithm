package org.example.algorithm.oneDaycoding.bronze3.day13;

import java.util.Scanner;

public class BOJ2523 {
    // 별찍기 - 13
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

//        for (int i = 0; i < N; i++) {
//            for (int j = 0; j < N; j++) {
//                if (i >= j) System.out.print("*");
//                System.out.print(" ");
//            }
//            System.out.println();
//        }
        for (int i = N-1; i > 0; i--) {
            for (int j = 0; j < N; j++) {
                if (i < j) System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
