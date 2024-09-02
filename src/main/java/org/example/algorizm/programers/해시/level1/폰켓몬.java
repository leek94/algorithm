package org.example.algorizm.programers.해시.level1;

import java.util.HashSet;

// 해시에는 hashMap과 hashSet이 있음
// 해시 set을 사용해서 중복을 없애서 문제를 풀어 보려함
public class 폰켓몬 {
    public static void main(String[] args) {

        Solution sl = new Solution();
        int result = sl.solution(new int[] {3,1,2,3});
        System.out.println("result : " + result);
    }

    static class Solution{
        public int solution(int[] nums){
            int max = nums.length/2;


            HashSet<Integer> hs = new HashSet<>();

            for(int num: nums){
                hs.add(num);
            }

            if(hs.size() <= max){
                 return hs.size();
            } else {
                return max;
            }
        }
    }
}
