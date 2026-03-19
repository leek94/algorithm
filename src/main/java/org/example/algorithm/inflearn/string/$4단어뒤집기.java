package org.example.algorithm.inflearn.string;

import java.util.Scanner;

public class $4단어뒤집기 {

    public void solution (String[] arrays){

        for(int i = 0; i < arrays.length; i++) {
            String s = new StringBuilder(arrays[i]).reverse().toString();
            System.out.println(s);
        }
    }

    public static void main(String[] args){
        $4단어뒤집기 T = new $4단어뒤집기();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String[] arrays = new String[n];

        for(int i = 0; i < n; i++){
            arrays[i] = kb.next();
        }

        T.solution(arrays);
    }

}
