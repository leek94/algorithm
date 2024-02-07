package org.example.doit_java.구간합;

import java.util.Scanner;

public class P10986_나머지합구하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        long[] S = new long[N];
        long[] C = new long[M];
        long answer = 0;
        S[0] = sc.nextInt(); // 0 번 인덱스를 초기화
        for (int i = 1; i < N; i++) {
            S[i] = S[i - 1] + sc.nextInt(); // 1번 인덱스 구할 떄 0번 인덱스를 사용함
        } // 합 배열 S를 전체적으로 완성

        for (int i = 0; i < N; i++) { // 합 배열에 모든 값에 % 연산 수행하기
            int remainder = (int) (S[i] % M); // 합배열을 M 나눈 나머지를 저장

            if(remainder == 0) answer++; // 나머지가 0 일 경우 answer 값 ++

            C[remainder]++; // 0 이후에 1 과 2 값일 경우 ++
        }

        for (int i = 0; i < M; i++) {
            if (C[i] > 1) {
                answer += (C[i] * (C[i] - 1) / 2); //3C2, 2C2로 해야하는데 식을 나중에 변경하면 좋을듯

            }
        }

        System.out.println(answer);
    }
}
