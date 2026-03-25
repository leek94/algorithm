package org.example.algorithm.inflearn.string;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class $6중복문자제거 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        char[] arr = str.toCharArray();
        Set<Character> charSet = new LinkedHashSet<>();

        for(char c : arr){
            charSet.add(c);
        }

        StringBuilder sb = new StringBuilder();

        for(char c : charSet){
            sb.append(c);
        }

        System.out.println(sb.toString());


    }
}
