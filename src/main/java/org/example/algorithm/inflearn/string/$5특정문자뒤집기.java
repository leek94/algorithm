package org.example.algorithm.inflearn.string;

import java.util.Scanner;

public class $5특정문자뒤집기 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        char[] arr = str.toCharArray();

        int lt = 0;
        int rt = arr.length - 1;
        char tmp = ' ';

        while (rt > lt) {

            if (Character.isLetter(arr[lt]) && Character.isLetter(arr[rt])) {
                tmp = arr[lt];
                arr[lt] = arr[rt];
                arr[rt] = tmp;

                lt++;
                rt--;
            } else if (Character.isLetter(arr[lt])){
                rt--;
            } else if(Character.isLetter(arr[rt])){
                lt++;
            } else {
                lt++;
                rt--;
            }
        }

        System.out.println(String.valueOf(arr));
    }
}
