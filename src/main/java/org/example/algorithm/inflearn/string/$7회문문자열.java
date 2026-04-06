package org.example.algorithm.inflearn.string;

import java.util.Scanner;

public class $7회문문자열 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String strUpper = str.toUpperCase();
        String reversed = new StringBuilder(strUpper).reverse().toString();

        System.out.println(strUpper);
        System.out.println(reversed);

        if(strUpper.equals(reversed)){
            System.out.println("YES");
        } else{
            System.out.println("NO");
        }

    }
}
