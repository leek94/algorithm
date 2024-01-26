package org.example.oneDaycoding.bronze3.day3;

import java.util.Scanner;

public class BOJ2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();
        int plus = sc.nextInt();
        M += plus;
        int temp = 0;
        if (M > 59) {
            H = (H + M / 60) % 24;
            M = M%60;
        }
        System.out.println(H+" "+ M);
    }
}
