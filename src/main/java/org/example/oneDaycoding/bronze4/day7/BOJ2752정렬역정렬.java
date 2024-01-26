package org.example.oneDaycoding.bronze4.day7;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BOJ2752정렬역정렬 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer[] A = new Integer[3];
        A[0] = sc.nextInt();
        A[1] = sc.nextInt();
        A[2] = sc.nextInt();
        //Arrays.sort(A);
        Arrays.sort(A, Collections.reverseOrder()); // 역정렬 올림 차순
        System.out.println(A[0]+ " " + A[1] + " " + A[2]);


    }
}
