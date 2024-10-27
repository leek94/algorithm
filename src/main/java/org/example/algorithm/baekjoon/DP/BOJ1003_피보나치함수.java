package org.example.algorithm.baekjoon.DP;

import java.util.*;
public class BOJ1003_피보나치함수 {
    static int countZero;
    static int countOne;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i = 0; i < T; i ++){
            countZero = 0;
            countOne = 0;
            int N = sc.nextInt();
            calculator(N);

            System.out.print(countZero + " ");
            System.out.println(countOne);


        }
    }

    static int calculator(int N){
        if(N == 0){
            countZero++;
            return 0;
        } else if(N == 1){
            countOne++;
            return 0;
        } else {
            return calculator(N-1) + calculator(N-2);
        }
    }
}
