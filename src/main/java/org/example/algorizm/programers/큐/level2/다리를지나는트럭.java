package org.example.algorizm.programers.큐.level2;

import java.util.LinkedList;
import java.util.Queue;

// 다리를 큐로 생각함
// 무게를 sum을 사용해서 큐가 비었으면 truck을 올리고 time ++
// 큐가 다 차잇으면 poll로 빼고 시간은 여기서 더해주지 않음 -> 트럭이 다리에 올랐을 때만 time++로 생각
// 마지막 트럭의 경우에는 반복문이 끝나버리기 때문에 다리의 길이 만큼 마지막 time에 더해줌
public class 다리를지나는트럭 {
    public static void main(String[] args) {
        Solution sl = new Solution();
        int answer =  sl.solution(100,100,new int[]{10});
        System.out.println(answer);
    }

    static class Solution{
        public int solution(int bridge_length, int weight, int[] truck_weights){

            Queue<Integer> queue = new LinkedList<>();

            int time = 0;
            int sum = 0;

            for(int truck : truck_weights){

                while(true){
                    // 다리가 비었을 경우
                    if(queue.isEmpty()){
                        queue.add(truck); // 큐에 truck 넣어줌
                        time++;
                        sum += truck;
                        break; // while
                        // 트럭이 꽉찼다고 생각
                    } else if(bridge_length == queue.size()){
                        sum -= queue.poll(); // 큐에서 truck을 빼줌
                        // 다리가 꽉차지 않았을 경우
                    } else {
                        // 현재 다리의 트럭과 새로운 트럭을 더해도 무게가 넘지 않을 경우
                        if(weight >= sum + truck){
                            queue.add(truck); // 큐에 truck 넣어줌
                            time++;
                            sum += truck;
                            break;
                            // 현재 다리에 트럭의 무게가 허용 무게보다 높을 경우
                        } else {
                            queue.add(0); // // 큐에 0을 대입해 자리만 차지 -> 무게에는 변환 X
                            time++;
                        }
                    }

                }
            }

            // 마지막 트럭의 경우 다리에 올라가면 바로 반복문이 끝나므로 다리의 길이 만큼 더해줘야 함
            return time + bridge_length;

        }
    }
}
