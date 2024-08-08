package org.example.oneDaycoding.bronze3.day3;

import java.util.Scanner;

public class BOJ2010플러그 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int answer = 0;
        for(int i=0; i<N; i++){
            int S = sc.nextInt();
            answer += S;
        }
        answer  = answer - (N-1);
        System.out.println(answer);
    }
}
