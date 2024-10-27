package org.example.algorithm.programers.스택.level2;

// 스택과 이중 for문으로 문제를 해결
// 스택으로 문제 풀 경우
// index 값을 스택에 저장하여야함

import java.util.Arrays;
import java.util.Stack;

public class 주식가격 {
    public static void main(String[] args) {
        Solution1 sl = new Solution1();
        int[] answer = sl.solution(new int[] {1,2,3,2,3});

        System.out.println(Arrays.toString(answer));
    }

    // 2중 for문을 사용하여 푸는 방법
    static class Solution{
        public int[] solution(int[] prices){

            int[] answer = new int [prices.length];

            for(int i =0; i <prices.length; i++){
                for(int j =i+1; j<prices.length; j++){
                    answer[i]++;
                    if(prices[i] > prices[j]){
                        break;
                    }
                }
            }

            return answer;
        }
    }
    // Stack으로 풀이 방법
    static class Solution1{
        public int[] solution(int[] prices){

            int[] answer = new int[prices.length];
            Stack<Integer> st = new Stack<>();

            // for과 while을 사용하여 stack에 값을 넣는 작업
            for(int i=0; i<prices.length; i++){
                // 처음 stack이 비었을 경우에 값을 젖ㅇ
                // 스택의 인덱스를 확인하여 주식 값이 떨어졌으면 그 위치에
                // 몇 초간 떨어지지 않았는지 바로 저장
                while(!st.isEmpty() && prices[i] < prices[st.peek()]){
                    answer[st.peek()] = i - st.pop();
                }
                st.push(i);
            }

            // 스택에 저장되어 있는 값을 통해서 몇 초간 값이 떨어지지 않았는지 넣어줌
            while(!st.isEmpty()){
                answer[st.peek()] = prices.length - st.pop() - 1;
            }
            return answer;
        }
    }

}
