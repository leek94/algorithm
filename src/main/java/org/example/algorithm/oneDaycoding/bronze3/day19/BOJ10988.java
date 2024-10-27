package org.example.algorithm.oneDaycoding.bronze3.day19;

import java.util.Scanner;

public class BOJ10988 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] text = sc.nextLine().toCharArray();
        int start_index = 0;
        int end_index = text.length-1;
        boolean isF = true;

        while (start_index < end_index) {
            if (text[start_index] != text[end_index]) {
                isF = false;
                break;
            }
            start_index++;
            end_index--;
        }
    if(isF) System.out.println(1);
    else System.out.println(0);
    }
}
