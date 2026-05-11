package org.example.algorithm.inflearn.array;

import java.util.Scanner;

public class $8등수구하기 {
    public static int[] solution(int[] arr, int[] result){
        for(int i = 0; i < arr.length; i++){
            int cnt = 1;
            for(int j = 0; j<arr.length; j++){
                if(arr[i] < arr[j]){
                    cnt++;
                }
            }
            result[i] = cnt;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] result = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i : solution(arr, result)){
            System.out.print(i+" ");
        }
    }
}
