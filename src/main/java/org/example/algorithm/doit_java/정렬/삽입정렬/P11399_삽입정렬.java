package org.example.algorithm.doit_java.정렬.삽입정렬;

import java.util.Scanner;

public class P11399_삽입정렬 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        int[] S = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        for (int i = 1; i < N; i++) { // 삽입 정렬
            int insert_point = i;
            int insert_value = A[i];

            for (int j = i - 1; j >=0; j--) { //
                if (A[j] < A[i]) { // 앞에 더 큰 수가 있으면 삽입하기 위한
                    insert_point = j + 1;
                    break;
                }
                if (j == 0) {
                    insert_point = 0;
                }
            }
            for (int k = i; k > insert_point; k--) { // 값을 오른쪽으로 옮기는 역할
                A[k] = A[k-1];
            }
            A[insert_point] = insert_value; // 새로 A 배열에 값 저장
        }
        S[0] = A[0]; // 합배열 초기값 세팅
        for (int i = 1; i < N; i++) { // 합배열을 이용해서 한번에 더한 값을 구함
            S[i] = S[i - 1] + A[i];
        }
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum = sum + S[i];
        }
        System.out.println(sum); // 결과 값 출력
    }
}
