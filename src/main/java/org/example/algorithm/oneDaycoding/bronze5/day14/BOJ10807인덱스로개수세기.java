package org.example.algorithm.oneDaycoding.bronze5.day14;

import java.util.Scanner;

public class BOJ10807인덱스로개수세기 {
    public static void main(String[] args) {
        //인덱스를 이용해서 개수 세기
        Scanner sc = new Scanner(System.in);
        int A[] = new int[201]; // 범위가 -100부터 100 까지
        // 11 정수의 수
        // 1 3 4 4 5 3 2 3 2 2 3 3 정수
        // 2 찾는 수
        // 찾는 수의 개수 3 이 나와야함

        int N = sc.nextInt(); // N의 개수 받음
        for (int i = 0; i < N; i++) {
            int index = sc.nextInt(); // 인덱스로 정수 값을 받음
            A[index + 100]++; // 인덱스 + 100의 자리에 1씩 플러스 됨
        }
        int V = sc.nextInt();
        System.out.println(A[V + 100]); // 개수를 리턴함
    }
}