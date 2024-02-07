package org.example.doit_java.투포인터;

import java.util.Scanner;

public class P2018_연속된자연수의합구하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 1;
        int start_index = 1;
        int end_index = 1;
        int sum = 1;

        // 투 포인터 이동 원칙
        // sum > N : sum = sum -start_index; start_index++;
        // sum < N : sum = sum + end_index; end_index++;
        // sum == N : sum = sum + end_index; end_index++; count++;

        while (end_index != N) {
            if (sum == N) {
                count ++;
                end_index ++;
                sum += end_index;
            } else if (sum > N) {
                sum -= start_index;
                start_index++;
            } else {
                end_index++;
                sum += end_index;
            }
        }
        System.out.println(count);
    }
}
