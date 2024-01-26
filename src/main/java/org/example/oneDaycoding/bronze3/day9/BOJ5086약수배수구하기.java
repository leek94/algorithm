package org.example.oneDaycoding.bronze3.day9;

import java.util.Scanner;

public class BOJ5086약수배수구하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {

            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a==0&&b==0) break;

            if(b%a==0) System.out.println("factor");
            else if(a%b==0) System.out.println("multiple");
            else System.out.println("neither");


        }

    }
}
