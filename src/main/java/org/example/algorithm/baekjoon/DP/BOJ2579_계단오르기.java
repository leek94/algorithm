package org.example.algorithm.baekjoon.DP;

import java.util.Scanner;

// 1. 계단은 1개 또는 2개씩 올라갈 수 있음
// 2. 3개의 계단을 연속으로 밟을 수는 없음
// 3. 마지막 계단은 무조건 밟아야함
// 4. 마지막 계단인 n번 계단을 밟기위한 규칙은 n-3, n-1,n 순으로 밟던지 n-2, n 을 밟아야함
public class BOJ2579_계단오르기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] score = new int[301]; // 구간 합 개념 -> 최고 점수
        int[] stair = new int[301]; // 각 자리의 정해진 값

        // 각각의 점수를 받음
        for(int i =1; i<= N; i++) stair[i] = sc.nextInt();

        score[1] = stair[1];
        score[2] = stair[1] + stair[2];
        score[3] = Math.max(stair[1], stair[2]) + stair[3];

        // 구간합같이 최고 점수를 저장함
        for(int i = 4; i<=N; i++){
            score[i] = Math.max(score[i - 3] + stair[i - 1], score[i - 2]) + stair[i];
        }

        System.out.println(score[N]);


    }
}
