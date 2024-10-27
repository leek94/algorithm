package org.example.algorithm.doit_java.DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 연결요소의개수구하기 {
    static ArrayList<Integer>[] A; // 인접 리스트
    static boolean visted[]; // 검색 배열

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        //nextToken은 String으로 값이 나오므로 변환해줘야함
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        A = new ArrayList[n+1];
        visted = new boolean[n+1];

        // 인접 리스트 초기화 -> 뭐랑 인접해 있는지 표시하는 리스트
        for( int i = 1; i<n+1; i++){
            A[i] = new ArrayList<Integer>(); // 배열 마다 ArrayList로 초기화
        }

        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());

            int s = Integer.parseInt(st.nextToken()); // 시작점
            int e = Integer.parseInt(st.nextToken()); // 끝점

            // 방향이 없기 때문에 양쪽으로 연결된다고 생각해야함
            // ex 1 -> 2, 2 -> 1
            A[s].add(e);
            A[e].add(s);
        }

        int count = 0; // DFS가 몇개 사용되었는지 리턴

        for(int i =1; i< n+1; i++){
            if(!visted[i]){
                count++;
                DFS(i);
            }
        }
        System.out.println(count);

    }
    // n = 6 노드 수, m = 5 엣지 수
    // 1 -> 2
    // 2 -> 5
    // 5 -> 1
    // 3 -> 4
    // 4 -> 6
    // 1 -> 2 -> 5  | 3 -> 4 -> 6  이렇게 두번 돌면서 끝남

    // 1로 시작되면 false 이므로 true로 변경하고 인접 리스트에 있는 2도 false여서 재귀됨
    // 마찬가지로 false -> true 5도 false여서 재귀
    // 5는 1을 가지고 있는데 true여서 아무것도 리턴하지 않음 -> 위로 올라가서 if문 빠져나감
    // 그뒤로 3, 4, 6순으로 위와 똑같이 돌면서 count는 2가됨

    static void DFS(int v){
        if(visted[v]) return;

        visted[v] = true;
        for(int i : A[v]){
            if(visted[i] == false) DFS(i);
        }
    }
}
