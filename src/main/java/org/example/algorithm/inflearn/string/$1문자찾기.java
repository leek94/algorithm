package org.example.algorithm.inflearn.string;

import java.util.Scanner;

public class $1문자찾기 {
    public int solution(String str, char t){
        int answer = 0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);

//        System.out.println(str +" " + t);

        // 기존 for문 사용
//        for(int i =0; i < str.length(); i++){
//            if(str.charAt(i) == t){
//                answer++;
//            }
//        }

        // 향상된 for문
        for( char x : str.toCharArray()){
            if(x == t) answer++;
        }


        return answer;
    }

    public static void main(String[] args){
        $1문자찾기 T = new $1문자찾기();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);
        System.out.println(T.solution(str,c));


    }
}
