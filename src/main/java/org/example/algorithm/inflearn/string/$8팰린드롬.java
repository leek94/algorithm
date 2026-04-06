package org.example.algorithm.inflearn.string;

import java.util.Scanner;

public class $8팰린드롬 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str1 = str.toUpperCase();

        String input = str1.replaceAll("[^A-Z0-9]", "");
        StringBuilder sb = new StringBuilder(input).reverse();

        if(input.equals(sb.toString())){
            System.out.println("YES");
        } else{
            System.out.println("NO");
        }

    }
}
