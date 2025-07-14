package org.example.algorithm.softeer.codingtest;

import java.util.*;

public class 주차왕 {
    static class State {
        int position;
        int speed;
        int time;

        State(int position, int speed, int time) {
            this.position = position;
            this.speed = speed;
            this.time = time;
        }

        String getKey() {
            return position + "," + speed;
        }
    }

    public static int findMinTime(int N, int K) {
        Queue<State> queue = new LinkedList<>();
        Map<String, Integer> visited = new HashMap<>();

        // 시작 상태
        queue.offer(new State(1, 0, 0));
        visited.put("1,0", 0);

        while (!queue.isEmpty()) {
            State current = queue.poll();

            // 목표 도달
            if (current.position == N && current.speed == 0) {
                return current.time;
            }

            // 가능한 모든 속도 변화 (-K부터 +K까지)
            for (int speedChange = -K; speedChange <= K; speedChange++) {
                int newSpeed = current.speed + speedChange;
                if (newSpeed < 0) continue;

                // 새로운 위치 계산 (이동할 때만 시간 증가)
                int newPosition = current.position + newSpeed;
                if (newPosition < 1 || newPosition > N) continue;

                int newTime = current.time + 1;  // 이동할 때만 시간 증가
                String newKey = newPosition + "," + newSpeed;

                if (!visited.containsKey(newKey) || newTime < visited.get(newKey)) {
                    visited.put(newKey, newTime);
                    queue.offer(new State(newPosition, newSpeed, newTime));
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int N = 9;
        int K = 2;
        System.out.println(findMinTime(N, K));
    }
}