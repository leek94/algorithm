package org.example.algorithm.inflearn.array;

import java.util.ArrayList;
import java.util.Scanner;

public class $6뒤집은소수 {

    public static boolean isResult(int res){
        if(res == 1) return false;
        for(int i = 2; i <res; i++){
            if(res % i == 0) return false;
        }
        return true;
    }

    public static ArrayList<Integer> solution(int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();

        for(int i = 0; i<arr.length; i++){
            int tmp = arr[i];
            int res = 0;
            while(tmp > 0){
                int t = tmp%10;
                res = res*10+t;
                tmp = tmp/10;
            }
            if(isResult(res)) answer.add(res);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i : solution(arr)) {
            System.out.print(i + " ");
        }
    }
}
