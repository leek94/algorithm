package org.example.algorithm.doit_java.스택과큐;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class P11286_절댓값힙_우선순위큐 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());

        // 우선순위 큐 자체 정의
        PriorityQueue<Integer> MyQueue = new PriorityQueue<>((o1,o2) -> {
            // 절댓값 작은 데이터 우선
            int first_abs = Math.abs(o1);
            int second_abs = Math.abs(o2);

            // 절댓값이 같은 경우 음수 우선
            if (first_abs == second_abs) {
                return o1 > o2 ? 1 : -1; // o1이 크면 1 o2가 크면 -1이 리턴
            }
            return first_abs - second_abs; // 첫번째가 크면 양수를 두번째가 크면 음수를 리턴
        });
        // compare 매서드를 오버라이드 한것으로
        // compare 메서드는 o1 o2 를 비교해서 양수면 o1이 더 크다고 봐서 비교순위 뒤에 두게된다
        // 큐에 o1 o2 순서로 poll 시 o2가 먼저 poll 되게 된다

        for (int i = 0; i < N; i++) {
            int request = Integer.parseInt(bf.readLine());
            if (request == 0) {
                if (MyQueue.isEmpty()) System.out.println("0");
                else System.out.println(MyQueue.poll());
            } else {
                MyQueue.add(request);
            }
        }
    }
}
