package org.example.algorithm.baekjoon.스택;

import java.util.Scanner;
import java.util.Stack;

// 문제 풀이
// 1. 막대기를 오른쪽에서 보는데 배열로 할 경우 뒤집어야함...
// 그래서 스택을 사용하고 있는 듯
// 2. 앞에 나온 제일 높은 막대기보다 낮은 값들은 보이지 않음
//
public class BOJ17608_막대기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Stack<Integer> st = new Stack<>();

        for(int i = 0 ; i < N; i++){
            st.push(sc.nextInt());
        }

        int count = 0;
        // 제일 높은 막대기 높이
        int max = 0;

        for(int i = 0; i <N; i++){
            // 스택으로 뽑은 현재 막대기 높이
            int now = st.pop();
            // 최대 보다 막대기 높이가 높을 경우만 count ++
            if(max < now){
                count++;
                max = now;
            }

        }
        System.out.println(count);
    }
}
