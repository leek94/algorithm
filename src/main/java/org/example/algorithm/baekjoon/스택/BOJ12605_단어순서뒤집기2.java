package org.example.algorithm.baekjoon.스택;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

// 단어 순서 뒤집기 -> 스택을 사용
// 스페이스를 기준으로 단어를 잘라서 사용 ->
//
public class BOJ12605_단어순서뒤집기2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Stack<String> stack = new Stack<>();

        int N = Integer.parseInt(st.nextToken());

        for(int i =1; i <=N; i++){
            st = new StringTokenizer(br.readLine());
            while(st.hasMoreTokens()){
                stack.add(st.nextToken());
            }
            System.out.print("Case #" + i+":");
            while(!stack.isEmpty()){
                System.out.print(" "+stack.pop());
            }
            System.out.println();
        }


    }
}
