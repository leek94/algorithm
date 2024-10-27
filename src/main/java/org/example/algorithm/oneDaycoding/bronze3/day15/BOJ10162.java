package org.example.algorithm.oneDaycoding.bronze3.day15;

import java.util.Scanner;

public class BOJ10162 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        if (T % 10 != 0) { //A, B, C 3개의 버튼으로 조작 불가능
            System.out.println(-1);
        }else{
            int A = T/300;
            int B = (T%300)/60;
            int C = ((T%300)%60)/10;
            System.out.println(A+" "+B+" "+C);
        }

    }
}
