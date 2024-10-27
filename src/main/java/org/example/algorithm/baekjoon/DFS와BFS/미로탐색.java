package org.example.algorithm.baekjoon.DFS와BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 미로탐색 {

    static int[][] maze;
    static int N,M;

    static boolean[][] visited;

    static int[] dx = {1, 0 ,-1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        maze = new int[N][M];
        visited =new boolean[N][M];

        for(int i=0;i <N; i++){

        }
        bfs(0,0);
    }

    public static void bfs(int x , int y){

    }

}
