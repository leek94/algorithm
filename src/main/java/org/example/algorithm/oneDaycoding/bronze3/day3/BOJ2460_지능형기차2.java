package org.example.algorithm.oneDaycoding.bronze3.day3;

import java.util.Scanner;

public class BOJ2460_지능형기차2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int now = 0;
        int maxP = 0;

        for(int i =1; i <= 10; i++){
            int N = sc.nextInt();
            int M = sc.nextInt();
            now = now - N + M;
            if(now > maxP){
                maxP = now;
            }
        }

        System.out.println(maxP);


    }
}
