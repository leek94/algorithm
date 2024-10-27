package org.example.algorithm.baekjoon.그리디;
import java.util.*;
public class 설탕배달_2839 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int count = 0;

        while(N>0) {
            if( N % 5 == 0){
                count += N / 5;
                break;
            } else {
                N -= 3;
                count++;
            }

            if(N < 0){
                count = -1;
                break;
            }

        }

        System.out.println(count);

    }
}
