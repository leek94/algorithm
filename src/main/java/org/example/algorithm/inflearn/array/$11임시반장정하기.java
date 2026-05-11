package org.example.algorithm.inflearn.array;

import java.util.Scanner;

public class $11임시반장정하기 {
    public static int solution(int n, int[][] arr){
        int[] result = new int[n];
        int answer = 0;
        int max = -1;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i == j) continue;
                for(int k = 0; k < 5; k++){
                    if(arr[i][k] == arr[j][k]){
                        result[i]++;
                        break; // 한번이라도 같은 반이었던 친구는 다른 학년에서 또 친구여도 카운팅하지 않음
                    }
                }
            }
        }
        for(int i = 0; i < n; i++){
            if(result[i] > max){
                max = result[i];
                answer = i +1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][5];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < 5; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(solution(n, arr));
    }
}
