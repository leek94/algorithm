package org.example.algorithm.doit_java.DFS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// 인접 리스트 방식
// 1:     2   3
// 2:     1   4
// 3:     1   4
// 4:     2   3

public class DFS기본코드인접리스트 {

    ArrayList<Integer>[] arrayList;
    boolean[] visited;
    ArrayList<Integer> dfsList = new ArrayList<>();

    public DFS기본코드인접리스트(){
        Scanner sc = new Scanner(System.in);

        int vertex = sc.nextInt(); // 정점의 수
        int line = sc.nextInt(); // 간선의 수
        int startVertex = sc.nextInt(); // 시작 정점

        arrayList = new ArrayList[vertex + 1]; // 0을 안쓰기 위해서 +1 만큼

        for(int i = 0; i < arrayList.length; i++){
            arrayList[i] = new ArrayList<>(); // 각 배열 마다 Array 생성
        }

        visited = new boolean[vertex + 1]; //  방문했는지 확인하는 배열

        for(int i = 0; i < line; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();

            arrayList[x].add(y); // 간선으로 연결하는 작업
            arrayList[y].add(x);
        }

        for(int i = 1; i < vertex + 1; i++){
            Collections.sort(arrayList[i]); // 순서를 중요시하는 문제 때문에 정렬
        }

        dfs(startVertex);

        for(int integer : dfsList){
            System.out.println(integer + " ");
        }
        System.out.println();
    }

    public void dfs(int x){
        if(visited[x]) return; //  true일 경우 방문한 곳이기 때문에 패스

        visited[x] = true; // 방문하지 않았으면 방문 표시
        dfsList.add(x); // 출력을 위한 리스트에 값 추가

        for(int y : arrayList[x]){
            if(!visited[y]) dfs(y); // 추가된 리스트에 연결된 번호들이 방문이 안되었다면 재귀함수 실행
        }
    }

    public static void main(String[] args) {
        new DFS기본코드인접리스트();
    }
}
