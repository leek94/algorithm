package org.example.algorithm.inflearn.string;

import java.util.Scanner;

public class $문자열압축 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] arr = str.toCharArray();
        String answer = "";
        int cnt = 1;

        for(int i =0; i< arr.length; i++){
            if( i < arr.length-1 && arr[i] == arr[i+1]){
                cnt++;
            } else {
                answer = answer + arr[i];
                if(cnt != 1){
                    answer = answer + cnt;
                    cnt = 1;
                }
            }

        }
        System.out.println(answer);
    }
}
