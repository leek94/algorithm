package org.example.algorithm.oneDaycoding.bronze3.day2;

import java.util.Scanner;

public class BOJ2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();
        int setM = M-45;
        int setH = H;
        if (setM < 0) {
            if(H==0) setH=23;
            else setH--;
            setM +=60;
        }
        System.out.println(setH + " " +setM );
    }
}
