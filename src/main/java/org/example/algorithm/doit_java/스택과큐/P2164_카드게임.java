package org.example.algorithm.doit_java.스택과큐;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P2164_카드게임 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Queue<Integer> myQueue = new LinkedList<>();
        // Queue는 FIFO 퍼스트인 퍼스트 아웃
        for (int i = 1; i <= N; i++) { // N까지의 카드를 큐에 순서대로 저장
            myQueue.add(i);
        }
        while (myQueue.size() > 1) { // 카드가 1 장이 남을때까지
            myQueue.poll();            // 맨 위의 카드를 버림
            myQueue.add(myQueue.poll()); // 맨 위의 카드를 가장 아래 카드 밑으로 이동
        }
        System.out.println(myQueue.poll());
    }
}
