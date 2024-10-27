package org.example.algorithm.doit_java.스택과큐;

import java.util.Scanner;
import java.util.Stack;

public class P1874_스택으로오름차순수열 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        Stack<Integer> stack = new Stack<>();
        StringBuffer bf = new StringBuffer();
        int num = 1; // 오름 차순 수
        boolean result = true;

        for (int i = 0; i < A.length; i++) {
            int su = A[i];
            if (su >= num) { // su = 4, num = 1 , 2 ,3 ,4
                // 현재 배열의 값이 오름 차순 보다 큰 경우 1부터 계속해서 값을 스택에 넣음

                while (su >= num) { // 수열의 값과 자연수가 같아 질때까지 스택에 값이 추가됨
                    stack.push(num++);
                    bf.append("+\n");
                }

                stack.pop(); // 4를 꺼내면
                bf.append("-\n");

            } else { // su < num 일 경우
                int n = stack.pop();
                if (n > su) {
                    System.out.println("NO");
                    result = false;
                    break;
                } else {
                    bf.append("-\n");
                }
            }
        }
        if(result) System.out.println(bf.toString());
    }
}
