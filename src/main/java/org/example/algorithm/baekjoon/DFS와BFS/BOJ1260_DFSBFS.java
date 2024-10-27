package org.example.algorithm.baekjoon.DFS와BFS;

import java.util.*;

public class BOJ1260_DFSBFS {

    static ArrayList<Integer>[] arrayList;
    static boolean[] visited;
    static ArrayList<Integer> bfsList = new ArrayList<>();
    static ArrayList<Integer> dfsList = new ArrayList<>();
    public void solution() {
        Scanner sc = new Scanner(System.in);

        int vertex = sc.nextInt();       //  정점의 수
        int edge = sc.nextInt();         //  간선의 수
        int startVertex = sc.nextInt();  // 시작하는 정점 번호

        arrayList = new ArrayList[vertex + 1];

        for(int i =0; i < arrayList.length; i++){
            arrayList[i] = new ArrayList<>();
        }

        visited = new boolean[vertex + 1];

        for(int i = 0; i < edge; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();

            arrayList[x].add(y);
            arrayList[y].add(x);
        }

        for(int i =1; i < vertex + 1; i++){
            Collections.sort(arrayList[i]);
        }

        dfs(startVertex);
        for(int integer: dfsList){
            System.out.print(integer + " ");
        }
        System.out.println();

        Arrays.fill(visited, false); // 초기화

        bfs(startVertex);
        for(int integer: bfsList){
            System.out.print(integer + " ");
        }
        System.out.println();
    }

    public void dfs(int x){
        if(visited[x]) return;

        visited[x] =true;
        dfsList.add(x);

        for(int y : arrayList[x]){
            if(!visited[y]) dfs(y);
        }
    }

    public void bfs(int x){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(x);
        visited[x] = true;

        while(!queue.isEmpty()){
            int y = queue.poll();
            bfsList.add(y);
//            System.out.println(y + " ");

            for(int c: arrayList[y]){
                if(!visited[c]){
                    visited[c] = true;
                    queue.add(c);
                }
            }
        }

    }

    public static void main(String[] args) {
        BOJ1260_DFSBFS sl = new BOJ1260_DFSBFS();
        sl.solution();


    }
}
