package org.example.algorithm.programers.스택.level2;

import java.util.Stack;

// 큐를 활요해서 풀었으나 효율성 테스트에서 실패하여 스택으로 풀어야함
public class 올바른괄호 {
    public static void main(String[] args) {
        Solution sl = new Solution();

       boolean answer = sl.solution("()(()))");
        System.out.println(answer);
    }

    static class Solution {
        public boolean solution(String s) {

//            String[] sArray = s.split("");
            // 여기서 이렇게 분리하는거 보다 s.charAt(i)을 사용하는게 좋다고함
            // 공백일때 문제나 배열에 저장하는 시간이 줄어듬
            Stack<Character> st = new Stack<>();

            for(int i = 0 ; i <s.length(); i++) {

                if(s.charAt(i) == '('){
                    st.push(s.charAt(i));
                } else {
                    if(st.isEmpty()){
                        return false;
                    }
                    st.pop();
                }

            }
                return st.isEmpty();
        }
    }
}
