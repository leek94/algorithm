package org.example.algorithm.baekjoon.그리디;
import java.util.*;

// 주어진 돈을 가장 최소의 갯수로 지불하기
public class 동전0_11047 {
    public static void main(String[] args) {
        Solution sl = new Solution();
        sl.solution();

    }

    static class Solution{
        public void solution(){
            Scanner sc = new Scanner(System.in);

            int N = sc.nextInt(); // 동전의 수
            int K = sc.nextInt(); // 금액

            int [] arr = new int[N]; // 동전의 수 만큼 배열 생성

            int count = 0; // 갯수를 새기 위해서 초기화

            // 각 배열의 인덱스에 값 저장
            for(int i = 0; i<N; i++){
                arr[i] = sc.nextInt();
            }

            // 배열의 가장 큰 값부터 나머지를 구해서 값 저장
            for(int i = N-1; i >=0; i --){
                count += K / arr[i];
                K = K % arr[i];
            }
            System.out.println(count);
        }
    }
}
