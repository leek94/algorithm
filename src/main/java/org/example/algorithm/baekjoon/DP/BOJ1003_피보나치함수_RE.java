package org.example.algorithm.baekjoon.DP;

import java.util.Scanner;

public class BOJ1003_피보나치함수_RE {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        int [][] fibonacci = new int[41][2];
        fibonacci[0][0] = 1; fibonacci[0][1] = 0;
        fibonacci[1][0] = 0; fibonacci[1][1] = 1;

        for(int i = 2; i < 41; i++){
            fibonacci[i][0] = fibonacci[i-1][0] + fibonacci[i-2][0];
            fibonacci[i][1] = fibonacci[i-1][1] + fibonacci[i-2][1];
        }

        for(int i = 0 ; i < T; i++){
            int N = sc.nextInt();
            System.out.println(fibonacci[N][0] + " " + fibonacci[N][1]);
        }

    }

}
