package org.example.algorithm.inflearn.string;

import java.util.Scanner;

public class $12암호 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        String answer = "";
        for(int i = 0; i < n; i++){
            String tmp = s.substring(0,7);
            String tmpStr = tmp.replace("#","1").replace("*","0");
            int num = Integer.parseInt(tmpStr,2);
            answer +=  (char)num;
            s=s.substring(7);
        }
        System.out.println(answer);
    }
}

