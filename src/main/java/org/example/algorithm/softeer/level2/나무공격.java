package org.example.algorithm.softeer.level2;

import java.io.*;
import java.util.*;

public class 나무공격 {

    public static void main(String[] args) {
        // 값 초기화
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] numArray = new int[N][M];
        int count = 0;

        // 2차원 배열 초기화
        for( int i = 0 ; i < N; i++){
            for( int j = 0; j < M; j++){
                numArray[i][j] = sc.nextInt();
                // System.out.print(numArray[i][j]);
            }
            // System.out.println();

        }
        System.out.println();
        // 공격 진행

        int N1 = sc.nextInt();
        int N2 = sc.nextInt();

        numArray = attack(N1, N2, M, numArray);

        int N3 = sc.nextInt();
        int N4 = sc.nextInt();

        numArray = attack(N3, N4, M, numArray);

        for( int i = 0 ; i < N; i++){
            for(int j = 0; j < M; j++){
                if(numArray[i][j] == 1) count++;
                // System.out.print(numArray[i][j]);
            }
            // System.out.println();
        }
        System.out.println(count);



    }

    public static int[][] attack (int N1, int N2, int M, int[][] numArray){

        for(int i = N1-1; i < N2; i++){
            for(int j = 0; j < M; j++){
                if(numArray[i][j] == 1) {
                    numArray[i][j] = 0;
                    break;
                }
            }
        }
        return numArray;
    }
}