package org.example.oneDaycoding.bronze3.day7;

import java.util.Scanner;

public class BOJ11721 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        for (int i = 0; i < text.length(); i=i+10) {
            String temp;
            if (i + 10 < text.length()) {
                temp = text.substring(i, i + 10);
            } else {
                temp = text.substring(i);
            }

            System.out.println(temp);
        }

    }
}
