package org.example.algorithm.oneDaycoding.bronze3.day11;

import java.util.Scanner;

public class BOJ2443 {
    // 별찍기 - 9
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N*2-1-i; j++) {
            if(j>=i) System.out.print("*");
            else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
