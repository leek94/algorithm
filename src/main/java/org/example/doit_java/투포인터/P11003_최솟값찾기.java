package org.example.doit_java.투포인터;

import org.w3c.dom.Node;

import java.io.*;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class P11003_최솟값찾기 {
//    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 출력을 버퍼에 넣고 한 번에 출력하기 위햇 BuferredWrirter 사용 -- > System.out.print 와 비슷하지만 빠름
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine()); // 원하는 형식으로 받기 위해서 nextToken 사용
        int N = Integer.parseInt(st.nextToken()); // 데이터 개수
        int L = Integer.parseInt(st.nextToken()); // 윈도우슬라이딩의 범위

        st = new StringTokenizer(br.readLine()); // 다른 형식으로 받으려고 다시 사용
        Deque<Node> mydeque = new LinkedList<>(); // 덱 자료구조  덱 자료구조는 Array 방식과 LinkedList 방식으로 만들 수 있다.

        for (int i = 0; i < N; i++) { // 배열의 값을 받는 for 문
            int now = Integer.parseInt(st.nextToken()); // 1 5 2 3 6 2 3 7 값 들어옴
            // 새로운 값이 들어올 때마다 정렬 대신 현재 수보다 큰 값을 덱에서 제거해 시간 복잡도를 줄임

            while (!mydeque.isEmpty() && mydeque.getLast().value > now) { // 원래 있는 값이 들어올 값보다 크면 삭제
                mydeque.removeLast();
            }

            mydeque.addLast(new Node(now, i)); // 덱에 값 추가
            // 범위에서 벗어난 값은 덱에서 제거
            if (mydeque.getFirst().index <= i - L) { // 윈도우 슬라이딩 범위를 벗어나면 앞에 값을 삭제
                mydeque.removeFirst();
            }
            bw.write(mydeque.getFirst().value + " "); // 맨 앞에 있는 값을 출력
        }
        bw.flush();
        bw.close();
    }

    static class Node {
        public int value;
        public int index;

        Node(int value, int index) {
            this.value = value;
            this.index = index;
        }
    }
}
