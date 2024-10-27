package org.example.algorithm.programers.해시.level2;

import java.util.HashMap;

// 의상은 한개 이상을 입어야함
// 카테고리 별로는 한개만 입을 수 있음
// 최대의 갯수를 구하시오
// 해시에서 getOrDefault를 사용해서 값이 없으면 0으로 치환해서 사용함
// 조합을 사용해서 각 구역에서 갯수를 뽑아서 사용함
public class 의상 {
    public static void main(String[] args) {
        Solution sl = new Solution();
        String[][] clothes = {
                {"yellow_hat", "headgear"},
                {"blue_sunglasses", "eyewear"},
                {"green_turban", "headgear"},
                {"green_turban1", "headgear"}
        };
        int result = sl.solution(clothes);
        System.out.println(result);
    }

    static class Solution {
        static int solution(String[][] clothes){
            // 곱셈을 사용하기 위해서 1로 시작함
            int answer = 1;
            // 카테고리 별로 몇개가 들어가 있는 지 알기위해서 해시를 사용

            HashMap<String, Integer> hm = new HashMap<>();

            //  배열의 값이 같은 카테고리에 몇개 있는 확인이 필요해서 해시를 통해서 저장
            for(String clo[] : clothes){
                // 키값 = 카테고리 가 없으면 0으로 치환 후 +1, 있으면 바로 + 1
                hm.put(clo[1], hm.getOrDefault(clo[1],0) + 1);
            }

            for(String s : hm.keySet()){
                answer *= hm.get(s) + 1; // 카테고리에서 입지 않는 경우가 있기 때문에 입지 않음 +1 해줌
            }

            return answer - 1; // 카테고리 모두 입지 않음을 제거하기 위해서 -1 해줌
        }
    }
}
