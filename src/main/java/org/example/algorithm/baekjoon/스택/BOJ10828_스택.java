package org.example.algorithm.baekjoon.스택;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ10828_스택 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        Stack<Integer> stack = new Stack<>();

        int num = 0;
        for( int i =0; i< N; i++){
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            if(st.hasMoreTokens()) {
                stack.add(Integer.parseInt(st.nextToken()));
            }

            if(str.equals("top")){
                if(stack.empty()){
                    System.out.println(-1);
                } else {
                    System.out.println(stack.peek());
                }
            } else if(str.equals("size")){
                System.out.println(stack.size());
            } else if(str.equals("empty")){
                if(stack.empty()) {
                 System.out.println(1);
                } else {
                    System.out.println(0);
                }
            } else if(str.equals("pop")){
                if(stack.empty()){
                    System.out.println(-1);
                } else {
                    System.out.println(stack.pop());
                }
            }

        }

    }
}
