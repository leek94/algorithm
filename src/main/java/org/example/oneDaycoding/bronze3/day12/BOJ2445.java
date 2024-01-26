package org.example.oneDaycoding.bronze3.day12;

import java.util.Scanner;

public class BOJ2445 {
    //별찍기 - 8
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 2*N; j++) {
                if(j<=i||j>=2*N-1-i) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = N; i < 2*N; i++) {
            for (int j = 0; j < 2 * N; j++) {
                if (j > i || j < 2 * N - 1 - i) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
