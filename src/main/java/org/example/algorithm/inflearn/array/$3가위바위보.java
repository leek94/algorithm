package org.example.algorithm.inflearn.array;

import java.util.Scanner;

public class $3가위바위보 {

    String answer = "";

    public static String solution(int a, int b){

        if(a == b) return "D";
        else if(a == 1 && b == 3) return "A";
        else if(a == 2 && b == 1) return "A";
        else if(a == 3 && b == 2) return "A";
        else return "B";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] Aarr = new int[n];
        int[] Barr = new int[n];

        for(int i =0; i<n; i++){
            Aarr[i] = sc.nextInt();
        }

        for(int i =0; i<n; i++){
            Barr[i] = sc.nextInt();
        }

        for(int i =0; i<n; i++) {
            System.out.println(solution(Aarr[i], Barr[i]));
        }
    }
}

