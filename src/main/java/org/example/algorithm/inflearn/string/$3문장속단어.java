package org.example.algorithm.inflearn.string;

import java.util.ArrayList;
import java.util.Scanner;

public class $3문장속단어 {

    public static void main(String[] args){
        $3문장속단어 T = new $3문장속단어();
        Scanner kb = new Scanner(System.in);
        ArrayList<String> arrays = new ArrayList<String>();
        String answer = "";

        // String.split(" ");로도 배열에 바로 넣을 수 있음
        while(kb.hasNext()){
            String str = kb.next();
            arrays.add(str);
        }

        for(String str : arrays){
            if(str.length() > answer.length()){
                answer = str;
            }
        }

        System.out.print(answer);
    }
}
