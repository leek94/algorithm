package org.example.oneDaycoding.bronze3.day7;

import java.util.Scanner;

public class BOJ2442 {
    // 별찍기 - 5
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            for (int j = N-1; j >= 0; j--) {
                if(i>=j) System.out.print("*");
                else System.out.print(" ");
            }
            for (int j = 1; j < N; j++) {
                if(i>=j) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
