package org.example.algorithm.baekjoon.그리디;
import java.util.*;

public class 회의실배정 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        // 시작과 끝나는 시간을 배열에 각각 저장
        int [][] arr = new int[N][2];

        for(int i = 0; i < N; i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2){
                if(o1[1] == o2[1]) return o1[0] - o2[0];
                return o1[1] - o2[1];
            }
        });

        int count = 0;
        int prevEndTime = 0;

        for(int i = 0; i < N; i++){
            if(prevEndTime <= arr[i][0]){
                prevEndTime = arr[i][1];
                count++;
            }
        }
        System.out.println(count);
    }
}
