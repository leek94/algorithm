package org.example.algorithm.oneDaycoding.bronze5.day20;

import java.util.Scanner;

public class BOJ4101크냐 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            if(N==0&&M==0) break;
            else if(N>M) System.out.println("Yes");
            else System.out.println("No");
        }
    }
}
