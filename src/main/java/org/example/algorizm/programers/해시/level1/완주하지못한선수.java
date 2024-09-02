package org.example.algorizm.programers.해시.level1;

import java.util.HashMap;

// hashMap을 사용해서 값을 저장하고 참가명을 키로 사용, 값에는 1을 넣어줌
// 완료자 명단에서 사람이름에 맞는 값을 0으로 변경해서 변경되지 않은 사람은 key값이 완주 하지 못한 사람임
// 여기서 hashMap으로 값에 +1, -1 을 하는 방식으로 겹치는 이름이 있을 경우에도 구분할 수 있게 함
public class 완주하지못한선수 {
    public static void main(String[] args) {

        Solution sl = new Solution();
        String result = sl.solution(new String[] {"leo", "kiki", "eden"}, new String[]{"leo", "kiki"});
        System.out.println(result);
    }
    static class Solution {
        public String solution(String[] participant, String[] completion) {

            HashMap<String, Integer> hm = new HashMap<>();
            // 참가자를 키 : name, 값 : +1 -> +1를 하는 이유는 중복된 이름이 있을 경우 사용
            for(String name : participant){
                // getOrDefault는 키값이 없을 경우 값을 디폴트값인 0을 주려고 사용함
                // 그냥 1을 줘버리면 중복된 이름이 있을경우 2가 되어야하는 알 수가 없음
                // 그래서 디폴트 0을 주고 +1로 값을 정함
                hm.put(name, hm.getOrDefault(name,0)+1);
            }
            for(String name : completion){
                hm.put(name, hm.get(name) -1);
            }

            // 여기서 participant를 hm.keySet() 으로 사용 가능함 -> 모든 키값을 순회함
            // hashMap 자체가 중복된 키값을 가질 수 없음
            for(String name : participant){
                if(hm.get(name) > 0){
                    return name;
                }
            }
            return "실패";
        }
    }
}
