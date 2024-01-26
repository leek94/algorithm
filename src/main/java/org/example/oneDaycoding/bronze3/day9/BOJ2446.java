package org.example.oneDaycoding.bronze3.day9;

import java.util.Scanner;

public class BOJ2446 {
    public static void main(String[] args) {
        //별 찍기 -9
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 2*N-1-i; j++) {
                if(j>=i) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = 1; i < N; i++) {
            for (int j = 0; j<N+i; j++) {
                if(i+j>=N-1) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
