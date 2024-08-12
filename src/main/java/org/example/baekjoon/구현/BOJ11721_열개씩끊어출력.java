package org.example.baekjoon.구현;

import java.util.Scanner;

// 보른즈3
// 10개씩 끊어서 문자열 출력하기
// String을 substring을 사용해야할거 같음
public class BOJ11721_열개씩끊어출력 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        for(int i = 0; i < str.length(); i+= 10){
            // 마지막에는 10개보다 작은 값이 와야해서 min 사용
            // i+10을 해주는 이유는 마지막 인덱스를 구하는것이기에
            // i 만 쓰면 0에[서 0을 구하게됨
            int lastIndex = Math.min(i+10, str.length());
            String string1 = str.substring(i, lastIndex);

            System.out.println(string1);
        }
    }
}
