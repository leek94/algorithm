package org.example.algorithm.doit_java.BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 미로탐색하기 {
    // dx, dy를 통해서 상하좌우로 이동을 나타냄
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    // 인덱스 별로 이동이 다름 0   1    2   3
    //                        하   우   상  좌  로 이동하라는 의미
    static boolean[][] visited;
    static int[][] A;
    static int N, M;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        A = new int[N][M];
        visited = new boolean[N][M];

        for(int i =0; i< N; i++){
            st = new StringTokenizer(br.readLine());
            String line = st.nextToken();
            for(int j=0; j<M; j++){
                A[i][j] = Integer.parseInt(line.substring(j, j+1));
            }
        }
        BFS(0,0);

        System.out.println(A[N-1][M-1]); // 0부터 시작하므로 -1 씩 한 곳이 내가 원하는 마지막 위치
    }

    private static void BFS(int i, int j) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {i,j});
        while(!queue.isEmpty()){
            int now[] = queue.poll();
            visited[i][j] = true;

            for(int k =0; k<4; k++){ // 상하좌우 탐색을 위해
                int x = now[0] + dx[k]; // x축 이동
                int y = now[1] + dy[k]; // y축 이동
                if(x >= 0 && y>=0 && x < N && y < M){ // 배열 크기를 넘어서 이동하면 안되기 때문에
                    if(A[x][y] !=0 && !visited[x][y]){ // 0 이여서 갈 수 없거나 방문한 곳 제외
                        // 1 이면서 False로 방문하지 않은 곳
                        visited[x][y] = true;
                        A[x][y] = A[now[0]][now[1]] + 1; // x,y을 나태냄 ->  핵심
                        queue.add(new int[] {x, y});
                    }

                }
            }
        }
    }
}
