package org.example.baekjoon.구현;

import java.util.Scanner;

// 소문자 a가 유니코드 97임
// 대문자 A는 65
// 배열로 만들어서 각각의 값을 읽고 int [26]으로 만든 배열에 값 1씩 추가
// char 타입은 연산시 int로 자동 변환된다
public class BOJ10808 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();

        // String을 char[] 배열로 만드는 법
        char[] sArray = S.toCharArray();

        // 알파벳 26개의 배열를 생성
        int[] sNumber = new int[26];

        for(int i = 0; i< sArray.length; i++){
            sNumber[sArray[i] -97]++;
        }

        for(int i = 0; i < sNumber.length; i++){
            System.out.print(sNumber[i] + " ");
        }

    }
}
