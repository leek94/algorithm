package org.example.algorizm.programers.큐.level2;

import java.util.Collections;
import java.util.PriorityQueue;

// 1, 큐를 사용해서 풀려고 했으나 개념이 헷갈림
// 2. 우선 순위 큐라는 개념을 학습 및 뒤집어서 풀었음
// 3. ArrayList와 인덱스 번호를 알아도 풀 수는 있을 거 같음

public class 프로세스 {
    public static void main(String[] args) {

        Solution sl = new Solution();
        sl.solution(new int[]{1,1,9,1,1,1}, 0);
    }
    static class Solution {

        public int solution(int[] priorities, int location) {
            // 우선순위 큐를 초기화 -> 뒤집어서 Collections.reverseOrder() 우선순위 큰값이 먼저 나오게함( default는 작은 값나옴)
            PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

            int answer = 0;

            // 우선 순위 큐에 값을 저장
            for(Integer N : priorities){
                queue.offer(N);
            }

            // 비었을 때까지 반복
            while(!queue.isEmpty()){
                //
                for(int i = 0; i< priorities.length; i++){
                    // 여기서 9가 있는 인덱스 2번 이후에 3번 인덱스가 시작됨
                    // 9 1 1 1 1 1 순서로 큐에 저장되는데
                    // 2 3 4 5 0 1 의 인덱스를 가지고 있음
                    // 1 2 3 4 5 6 순서
                    // 우리가 원하는 0번 인덱스는 그래서 5번째에 실행됨
                    // 여기서 내가 이해를 못한게 9가 poll 된 이후 for문도 0번 인덱스 부터 다시 시작한다고 생각해서 오래 걸림
                    // 근데 그게 아니고 3번 부터 실행됨 그래서 2(9) 3(1) 4(1) 5(1) 이후에 0(1) 이 시작되어서 5번째임
                    if(queue.peek() == priorities[i]){
                        System.out.println("priority: " + priorities[i]);
                        int s = queue.poll();
                        System.out.println("queue : " + s);
                        answer++;
                        System.out.println("answer: " + answer);
                        System.out.println("index: " + i);

                        if(location == i ){
                            System.out.println(answer);
                            return answer;

                        }
                    }


                }
            }
            return answer;
        }
    }
}
