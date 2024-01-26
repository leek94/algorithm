package org.example.oneDaycoding.bronze3.day5;

import java.util.Scanner;

public class BOJ1085직사각형탈출 {
    public static void main(String[] args) {
        //정답으로 나올 수 있는 값 x , y , w - x, h - y 이렇게 네가지 값이 나올 수 있음
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        int min = x;
        if(min > y) min = y;
        if(min > h-y) min = h-y;
        if(min > w-x) min = w-x;
        System.out.println(min);
        //
    }
}
