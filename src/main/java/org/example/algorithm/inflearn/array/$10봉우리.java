package org.example.algorithm.inflearn.array;

import java.util.Scanner;

public class $10봉우리 {
    static int[] dx  = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static int solution(int arr[][], int n){
        int answer = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                boolean flag = true;
                for(int k = 0; k < 4; k++){
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    if(ny<n && ny>=0 && nx<n && nx>=0 && arr[nx][ny] >= arr[i][j]){
                        flag = false;
                        break;
                    }
                }
                if(flag){answer++;}
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(solution(arr, n));
    }
}
