package org.example.oneDaycoding.bronze3.day2;

import java.util.Scanner;

public class BOJ10818최소최대 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE; // -2^31 값이 초기화됨
        int min = Integer.MAX_VALUE;

        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int temp = sc.nextInt();
            if(max < temp) max = temp;
            if(min > temp) min = temp;
        }
        System.out.println(min + " " + max);
    }
}
