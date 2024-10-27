package org.example.algorithm.baekjoon.스택;

import java.util.Scanner;
import java.util.Stack;

// 단어 순서 뒤집기 -> 스택을 사용
// 스페이스를 기준으로 단어를 잘라서 사용 ->
//
public class BOJ12605_단어순서뒤집기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();

        Stack<String> st = new Stack<>();

        for(int i = 0; i < N; i++){
            String str = sc.nextLine();
            String[] strArray = str.split(" ");

            for(int j = 0; j< strArray.length; j++){
                st.push(strArray[j]);
            }

            System.out.print("Case #" + (i+1) + ":");

            for(int k = 0; k < strArray.length; k++){
                System.out.print(" " + st.pop());
            }
            System.out.println();

        }

    }
}
