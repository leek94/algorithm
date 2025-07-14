package org.example.algorithm.softeer.level2;

import java.io.*;
import java.util.*;

public class dfs_장애물인식프로그램 {
    static int[] dx = {1,-1,0,0};
    static int[] dy = {0,0,1,-1};
    static int n;
    static int[][] board;
    static boolean[][] visited;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        board = new int[n][n];
        visited = new boolean[n][n];

        // board 배열 초기화
        for(int i = 0 ; i < n; i++){
            String [] line = br.readLine().split("");
            for(int j = 0; j < n; j++){
                board[i][j] = Integer.parseInt(line[j]);
            }
        }
        List<Integer> result = new ArrayList<>();

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(board[i][j] == 1 && !visited[i][j]){
                    result.add(dfs(i,j));
                }
            }
        }
        System.out.println(result.size());
        for(int i = 0; i < result.size(); i++){
            System.out.println(result.get(i));
        }

    }

    private static int dfs(int x, int y) {
        visited[x][y] = true;
        int count = 1;

        for(int i = 0; i < 4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx >=0 && nx <n && ny >=0 && ny <n && board[nx][ny] == 1 && !visited[nx][ny]){
                count += dfs(nx, ny);

            }
        }
        return count;
    }
}
