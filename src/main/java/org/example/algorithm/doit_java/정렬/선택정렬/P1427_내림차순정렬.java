package org.example.algorithm.doit_java.정렬.선택정렬;

import java.util.Scanner;

public class P1427_내림차순정렬 {
    public static void main(String[] args) {
        // 선택 정렬은 1번째 값과 비교해서 최댓값을 찾아서 위치를 swqp하는 방식
        Scanner sc = new Scanner(System.in);
        String str = sc.next(); // 숫자를 String으로 받음 2143
        int[] A = new int[str.length()]; // 배열 생성
        for (int i = 0; i < str.length(); i++) { // for 문을 통해서
            A[i] = Integer.parseInt(str.substring(i, i + 1)); // String 값을 1개씩 int로 변경해서 저장
        }
        for (int i = 0; i < str.length(); i++) {
            int max = i;
            for (int j = i + 1; j < str.length(); j++) {
                if(A[j] > A[max]) max = j;
            }
            if (A[i] < A[max]) {
                int temp = A[i];
                A[i] = A[max];
                A[max] = temp;
            }
        }
        for (int i = 0; i < str.length(); i++) {
            System.out.print(A[i]);
        }
    }
}
