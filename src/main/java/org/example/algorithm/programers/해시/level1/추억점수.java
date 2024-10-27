package org.example.algorithm.programers.해시.level1;

import java.util.Arrays;
import java.util.HashMap;

// 사진에 주어진 사람의 추억 점수를 합해서 배열로 출력해주는 문제
// getOrDefault를 사용해서 값을 주면 될걸로 보임
// 추억점수가 없는 사람은 0점이다
// for문을 통해서 3중 for사용해도 되고
// hashMap을 활용해서 문제를 풀어되 됨
public class 추억점수 {
    public static void main(String[] args) {
        Solution sl = new Solution();
        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning ={5, 10, 1, 3};
        String[][] photo = {{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};
        int[] result = sl.solution(name, yearning, photo);

        System.out.print(Arrays.toString(result));
    }
    static class Solution{
        public static int[] solution(String[] name, int[] yearning, String[][] photo){
            // 배열의 개수에 맞는 길이로 초기화 -> 외부 배열
            // 내부 배열은 photo[0].length 이런식으로 하면 내부 배열 길이 알 수 잇음
            int[] answer = new int[photo.length];

            // 이름과 추억 점수를 저장하기 위해 hashMap 생성
            HashMap<String, Integer> num = new HashMap<>();

            // hashMap에 이름과 추억점수 저장
            for(int i =0; i<name.length; i++){
                num.put(name[i], yearning[i]);
            }

//            for(String[] photoList : photo){
//                for(String photoperson : photoList){
//                    if(num.containsKey(photoperson)){
//
//                    }
//                }
//
//            }

            System.out.println("HashMap contents: " + num);

            // 추억점수를 더하여 배열에 저장
            for( int i = 0; i< photo.length; i++){
                for(int j = 0; j<photo[i].length; j++){
                    // 출력 확인
                    System.out.println(photo[i][j]);
                    if(num.containsKey(photo[i][j])){
                        answer[i] += num.get(photo[i][j]);
                    }
                    System.out.println("Total score for photo[" + i + "]: " + answer[i]);
                }
            }

            return answer;
        }
    }
}
