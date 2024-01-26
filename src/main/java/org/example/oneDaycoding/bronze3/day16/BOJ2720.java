package org.example.oneDaycoding.bronze3.day16;

import java.util.Scanner;

public class BOJ2720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();

        for (int i = 0; i < S; i++) {
            int C = sc.nextInt();

            int Q = C/25;
            int D = (C%25)/10;
            int N = ((C%25)%10)/5;
            int P = (((C%25)%10)%5)/1;

            System.out.println(Q + " " + D + " " + N + " " + P);
        }
    }
}
