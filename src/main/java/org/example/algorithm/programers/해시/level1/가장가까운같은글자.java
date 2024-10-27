package org.example.algorithm.programers.해시.level1;

import java.util.Arrays;
import java.util.HashMap;

public class 가장가까운같은글자 {
    public static void main(String[] args) {

        Solution sl = new Solution();

        int[] result = sl.solution("banana");
        System.out.println(Arrays.toString(result));

    }

    public static class Solution{
        public int[] solution(String s){

            // 중복이 없는 hashMap을 사용해서 값을 구하려함
            HashMap<Character, Integer> hm = new HashMap<>();
            //출력 배열 초기화
            int[] answer = new int[s.length()];

            for(int i = 0; i<s.length(); i++) {
                // 문자열에서 문자를 뽑음
                char ch = s.charAt(i);
                // 없으면 i+1, 있으면 value 값이 나오는 맵 함수 사용
                answer[i] = i - hm.getOrDefault(ch, i+1);
                hm.put(ch , i);
            }

            return answer;
        }
    }
}
