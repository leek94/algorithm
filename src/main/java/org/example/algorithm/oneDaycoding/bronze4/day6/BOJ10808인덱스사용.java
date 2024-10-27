package org.example.algorithm.oneDaycoding.bronze4.day6;

import java.util.Scanner;

public class BOJ10808인덱스사용 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] result = new int[26];
        char[] temp = sc.next().toCharArray();
        for (int i = 0; i < temp.length; i++) {
            result[temp[i] - 97]++;
        }
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
