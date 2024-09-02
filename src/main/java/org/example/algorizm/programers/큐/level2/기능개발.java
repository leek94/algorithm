package org.example.algorizm.programers.큐.level2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

// 큐를 사용해서 배포 가능한 날짜를 리턴
// 순서대로 나오는 값중에 최댓값보다 작은 값들은 배포가 안되고 최고로 걸리는 날 배포됨

public class 기능개발 {
    public static void main(String[] args) {
        Solution sl = new Solution();

       ArrayList<Integer> answer =  sl.solution(new int[]{95, 90, 99, 99, 80, 99},new int[]{1, 1, 1, 1, 1, 1} );
        System.out.println(answer);
    }

    static class Solution {
        public ArrayList<Integer> solution(int[] progresses, int[] speeds) {
            // 자바에서는 Queue를 LinkedList로 구현
            Queue<Integer> qu = new LinkedList<>();
            // answer 값이 몇이 들어올지 모르기 때문에 ArrayList로 정의
            ArrayList<Integer> answer = new ArrayList<>();
            for(int i = 0 ; i<progresses.length; i++) {

                // 며칠이 걸리는지 알기위해서는 '올림'해야함
                int num =(int)Math.ceil((double)(100 - progresses[i]) / speeds[i]);

                qu.add(num);
            }

            // 첫번째 값은 무조건 max이므로 시작부터 초기화를 해주고 count를 1로 함
            int max = qu.poll();
            int count = 1;

            // 큐에 값이 있는지 없는지 확인을 한 후에 poll로 꺼내야함 .isEmpty()를 먼저사용해야함
//            for(int i=0; i < progresses.length; i++){
//
//                int now = qu.poll();
//                System.out.println(now);
//                max = now;
//                if(qu.isEmpty()){
//                    count++;
//                    answer.add(count);
//                } else if(qu.peek() > max){
//                    count++;
//                    answer.add(count);
//                    count = 1;
//                    max = now;
//                } else if(qu.peek() <= max){
//
//                    count++;
//                }
//            }

            // 비었는지 확인하고 나서 반복해야함
            while(!qu.isEmpty()){
                // 다음 값을 꺼내서 확인
                 int now = qu.poll();

                 if(now <= max ){
                     count++;
                 } else {
                     answer.add(count);
                     max = now;
                     count = 1;
                 }
            }
            answer.add(count);

            return answer;
        }
    }
}
