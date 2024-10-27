package org.example.algorithm.baekjoon.DFS와BFS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BOJ2606_바이러스 {
    static ArrayList<Integer>[] arrayList;
    static boolean[] visited;
    static ArrayList<Integer> dfsList = new ArrayList<>();


        public void solution(){
            Scanner sc = new Scanner(System.in);

            int vertex = sc.nextInt();
            int edge = sc.nextInt();

            // 1번 부터 시작
            arrayList = new ArrayList[vertex + 1];

            for(int i = 1; i < arrayList.length; i++){
                arrayList[i] = new ArrayList<>();
            }

            visited = new boolean[vertex + 1];

            for(int i = 0; i < edge; i++){
                int x = sc.nextInt();
                int y = sc.nextInt();

                arrayList[x].add(y);
                arrayList[y].add(x);
            }

            for(int i = 1; i<vertex + 1; i++){
                Collections.sort(arrayList[i]);
            }

            dfs(1);

            System.out.println(dfsList.size() -1); // 자기 자신은 뺴야 해서 -1
        }

        public void dfs(int x){
            if(visited[x]) return;

            visited[x] = true;
//            System.out.println("x값: " +x);
            dfsList.add(x);

            for(int y : arrayList[x]){
                if(!visited[y]) dfs(y);
            }
        }


    public static void main(String[] args) {
        BOJ2606_바이러스 sl = new BOJ2606_바이러스();
        sl.solution();
    }
}
