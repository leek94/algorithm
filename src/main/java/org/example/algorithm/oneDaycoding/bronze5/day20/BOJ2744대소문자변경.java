package org.example.algorithm.oneDaycoding.bronze5.day20;

import java.util.Scanner;

public class BOJ2744대소문자변경 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //아스키 코드를 이용해서 문제 해결하기
        // A 는 65  a 는 97 로 32 정도 차이가 남
        char[] text = sc.nextLine().toCharArray();
        for (int i = 0; i < text.length; i++) {
            char temp = text[i];
            if(temp >='a' && temp <='z'){
                System.out.print((char)(temp - 32));
            }else{
                System.out.print((char)(temp + 32));
            }
        }


    }
}
