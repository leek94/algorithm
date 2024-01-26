package org.example.oneDaycoding.bronze3.day14;

import java.util.Scanner;

public class BOJ2455 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = 0;
        int now = 0;
        for (int i = 0; i < 4; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            now = now - A + B;
            max = Math.max(now, max);

        }
        System.out.println(max);
    }
}
