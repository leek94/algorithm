package org.example.algorithm.programers.큐.level2;

import java.util.LinkedList;
import java.util.Queue;

// 큐를 활요해서 풀었으나 효율성 테스트에서 실패하여 스택으로 풀어야함
public class 올바른괄호 {
    public static void main(String[] args) {
        Solution sl = new Solution();

       boolean answer = sl.solution("()(())");
        System.out.println(answer);
    }

    static class Solution {
        public boolean solution(String s) {

            String[] sArray = s.split("");
            System.out.println(sArray[0] + "  " + sArray[1]);
            Queue<String> qu = new LinkedList<>();

            for(int i = 0 ; i <s.length(); i++){
                qu.add(sArray[i]);
            }
            System.out.println(qu.size());
            int count = 0;

            while(!qu.isEmpty()){

                if(qu.poll().equals("(")){
                    count++;
                } else {
                    count--;
                }
                System.out.println(count);
                if(count < 0){
                    return false;

                }
            }

            if(count == 0){
                return true;
            } else {
                return false;
            }
        }
    }
}
