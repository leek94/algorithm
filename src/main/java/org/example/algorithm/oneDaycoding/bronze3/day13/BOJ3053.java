package org.example.algorithm.oneDaycoding.bronze3.day13;

import java.util.Scanner;

public class BOJ3053 {
    public static void main(String[] args) {
        // 유클리드 기하학 기본 원의 넓이 = 3.14*R*R
        // 택시 기하학에서는 원의 넓이 = 2*R*R

        Scanner sc = new Scanner(System.in);
        double N = sc.nextDouble();

        System.out.println(Math.PI*N*N);
        System.out.println(2*N*N);
    }
}
