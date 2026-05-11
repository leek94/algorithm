package org.example.algorithm.inflearn.array;

import java.util.Arrays;
import java.util.Scanner;

public class $7점수계산 {
    public static int solution(int[] arr, int[] result){
        int count = 1;
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                count = 1;
            continue;
            }
            result[i] = count;
            count++;
        }

        for(int i = 0; i < arr.length; i++){
            sum += result[i];
        }

        System.out.println(Arrays.toString(result));
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] result = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(solution(arr, result));

    }
}
