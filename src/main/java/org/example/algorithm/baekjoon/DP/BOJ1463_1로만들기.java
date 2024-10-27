package org.example.algorithm.baekjoon.DP;

import java.util.Scanner;

public class BOJ1463_1로만들기 {
    static Integer[] dp;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        dp = new Integer[n + 1];
        dp[0] = dp[1] = 0;
        System.out.println(calculator(n));

    }

    static int calculator(int n) {
        if (dp[n] == null) {
            if (n % 6 == 0) {
                dp[n] = Math.min(calculator(n - 1), Math.min(calculator(n / 3), calculator(n / 2))) + 1;
            } else if (n % 3 == 0) {
                dp[n] = Math.min(calculator(n - 1), calculator(n / 3)) + 1;
            } else if (n % 2 == 0) {
                dp[n] = Math.min(calculator(n - 1), calculator(n / 2)) + 1;
            } else {
                dp[n] = calculator(n - 1) + 1;
            }

        }
        return dp[n];
    }

}