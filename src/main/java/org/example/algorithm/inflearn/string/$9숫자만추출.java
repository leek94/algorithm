package org.example.algorithm.inflearn.string;

import java.util.Scanner;

public class $9숫자만추출 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int answer = 0;
        for( char x : str.toCharArray()){
            if( x >=48 && x < 58){
                answer = answer * 10 + (x - 48);
            }
        }

        System.out.println(answer);
    }
}
