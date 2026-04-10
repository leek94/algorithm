package org.example.algorithm.inflearn.string;

import java.util.Arrays;
import java.util.Scanner;

public class $10문자거리 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char t = sc.next().charAt(0);

        char[] strArr = str.toCharArray();
        int[] answer = new int[str.length()];
        int num = 1000;

        for(int i =0; i<strArr.length; i++){
            if(strArr[i] == t){
                num = 0;
            } else {
                num++;
            }
            answer[i] = num;
        }

        num = 1000; // 실제로는 안해도 상관 없이 답이 나온다.

        for(int j = strArr.length-1; j>=0; j--){
            if(strArr[j] == t){
                num = 0;
            } else{
                num++;
            }
            if(answer[j] > num){
                answer[j] = num;
            }
        }

        for (int x : answer) {
            System.out.print(x + " ");
        }

    }
}
