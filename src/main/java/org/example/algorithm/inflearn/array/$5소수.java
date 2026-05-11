package org.example.algorithm.inflearn.array;

import java.util.Arrays;
import java.util.Scanner;

public class $5소수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n ==1) System.out.println(0);

        int[] arr =  new int[n+1];
        int answer = 0;
        for(int i = 2; i <= n; i++) {
            if(arr[i] == 0){
                answer++;
                for(int j = i; j <= n; j= j + i){
                    arr[j] = 1;
                }
            }
        }

        System.out.println(answer);
    }
}
