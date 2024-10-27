package org.example.algorithm.baekjoon.그리디;
import java.util.*;
public class ATM_11399 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] arr = new int[N];

        int result = 0; // 합

        int add = 0; // 더할 수

        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }

        // 여기서 add 변수를 하나 더 선언해서 sum에 계속 더해주는 방법이 더 좋음
        // 정렬 - 해서 작은 값이 앞에 나올 수록 최소로 시간이 걸림
        Arrays.sort(arr);

//        for(int i = 0; i < N; i++){
//            for(int j = 0; j <= i; j++){
//                result += arr[j];
//            }
//        }

        for(int i = 0; i < N; i++){
            add += arr[i];
            result += add;
        }


        System.out.println(result);
    }

}
