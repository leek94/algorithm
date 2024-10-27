package org.example.algorithm.oneDaycoding.bronze3.day17;

import java.util.Scanner;

public class BOJ2576 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 7; i++) {
            int temp = sc.nextInt();
            if (temp % 2 != 0) { // 홀수 인지 확인
                sum += temp;
                if (min > temp) {
                    min = temp;
                }
            }
        }
        System.out.println(sum);
        System.out.println(min);
    }
}
