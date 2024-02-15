package org.example.doit_java.스택과큐;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class P17298_오큰수구하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine()); // 수열의 수를 받음
        int[] A = new int[N]; // 수열 배열을 초기화
        int[] ans = new int[N]; // 정답 배열 생성
        String[] str = bf.readLine().split(" ");
        // readLine을 사용해서 String으로 값을 한번에 받아서 배열에 넣음
        // StringTokenizer st = new StringTokenizer(bf.readLine());
        // 배열에 stringTokenizer를 사용해서 한번에 받을 수가 없음

        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(str[i]);
        }

        Stack<Integer> myStack = new Stack<>();
        myStack.push(0); // 처음에는 항상 스택이 비어있으므로 최초 값을 push해서 초기화
        for (int i = 1; i < N; i++) { // 0번째는 이미 푸시 했기 때매 1 부터 시작
            //3 5 2 7
            //스택이 비어 있지 않고, 현재 수열이 스택 top 인덱스가 가리키는 수열보다 클 경우
            while (!myStack.isEmpty() && A[myStack.peek()] < A[i]) { // 3  < 5
                // .peek()은 현재 스택을 top 값을 가져옴
                ans[myStack.pop()] = A[i]; // 정답 배열에 오큰수를 현재 수열로 저장하기
            }
            myStack.push(i); // 신규 데이터 psuh
        }
        while (!myStack.empty()) {
            ans[myStack.pop()] = -1; // 스택에 쌓인 index에 -1을 넣고

        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < N; i++) {
            bw.write(ans[i] + " "); // 출력한다
        }

        bw.write("\n");
        bw.close(); // flush나 close를 해줘야 출력이됨 그전까지는 bw.write를 하면 버퍼에 넣어둠
    }

}
