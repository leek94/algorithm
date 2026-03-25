package org.example.algorithm.inflearn.string;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class $6중복문자제거 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

//        indexOf를 사용해서 처음 나온 char만 저장해서 푸는 방식도있음, 2중 for문도 있음
//        for( int i =0; i < str.length(); i++){
//            System.out.println(str.charAt(i) +" "+ i +" "+str.indexOf(str.charAt(i)));
//        }


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
