package org.example.oneDaycoding.bronze3.day18;

import java.util.Scanner;

public class BOJ10886 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        int com =0;
        for (int i = 0; i < N; i++) {
            int T = sc.nextInt();
            if(T==0) count++;
            else com++;
        }
        if(count>com) System.out.println("Junhee is not cute!");
        else System.out.println("Junhee is cute!");
    }
}
