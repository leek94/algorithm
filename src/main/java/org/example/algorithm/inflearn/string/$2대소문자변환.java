package org.example.algorithm.inflearn.string;

import java.util.Scanner;

public class $2대소문자변환 {

    public String solution (String str){
        String answer = "";
        for(char x :  str.toCharArray()){
//            if(Character.isLowerCase(x)) answer += Character.toUpperCase(x);
//            else answer += Character.toLowerCase(x);

            // 아스키 넘버로도 가능함 65~90 대문자, 97~122 소문자 -- 32 차이남
            if( x >= 97 ) {
                x -= 32;
                answer += x;
            } else {
                x += 32;
                answer += x;
            }
        }

        return answer;
    }

    public static void main(String[] args){
        $2대소문자변환 T = new $2대소문자변환();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.print(T.solution(str));
    }
}
