package org.example.oneDaycoding.bronze3.day19;

import java.util.Scanner;

public class BOJ10991 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N+i; j++) {
                if((i+j)%2==1&&j>= N-i-1) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
