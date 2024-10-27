package org.example.algorithm.doit_java.DFS;

import java.util.Scanner;
//      1  2  3  4
//
// 1    0  1  1  0
// 2    1  0  0  1
// 3    1  0  0  1
// 4    0  1  1  0
// 위에 처럼 배열로 푸는 방식
public class DFS기본코드배열 {
    static int edge; // 간선의 수  4
    static int vertex; // 정점의 수  4
    static int[][] map; // 정점 간의 연결의 정보를 담는 객체
    static boolean[] visited; // 정점 방문 체크를 위한 객체
    public static void main(String[] args) {
        // [vertex + 1] 을 하는 것은 0 번째 인덱스를 사용하지 않으려고 1부터 사용하려고
        Scanner sc = new Scanner(System.in);
        vertex = sc.nextInt();
        edge = sc.nextInt();
        map = new int[vertex + 1][vertex + 1];
        visited = new boolean[vertex + 1];

        for(int i = 0; i < edge; i++){
            int start = sc.nextInt();
            int next = sc.nextInt();

            map[start][next] = 1; //  1번과 4번이 연결되어 있다하면 map[1][4]를 1로 만든 것
            map[next][start] = 1; // 반대로 map[4][1]도 1이 되어야함 ->하지만 방향이 정해져 있으면 이건 안씀
        }

        dfs(1);


    }

    private static void dfs(int start) {
        visited[start] = true; // 1 2 3
        System.out.println(start + " ");

        for(int i = 1; i <vertex + 1; i++){
            if(map[start][i] == 1 && visited[i] == false){
                dfs(i);
            }
        }
    }
}
