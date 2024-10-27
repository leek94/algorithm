package org.example.algorithm.programers.해시.level1;

//  현재 순위의 players와 불리는 이름 callings를 받음
// 방식이 배열에서 값을 직접 변경하는 O(n*m)과 해시맵을 사용한 O(m) 방식이 있음
// 효율측면에서 해시를 사용한게 훨씬 우수함
// 해시맵에 초기 값을 모두 저장함
//  calling을 통해서 불리면 players에 저장됨 순서를 변경해줌 (바로 앞에 저장값과)
// 그리고 hashMap에도 인덱스(value)를 변경해서 다시 put하면 값을 덮어 씀

import java.util.HashMap;

public class 달리기경주 {
    public static void main(String[] args) {
        Solution sl = new Solution();
        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = {"kai", "kai", "mine", "mine"};
        String[] result=  sl.solution(players, callings);

        // 결과 출력
        for (String player : result) {
            System.out.print(player + " ");
        }

    }

    static class Solution {
        public static String[] solution(String[] players, String[] callings) {

            // 전체 선수들의 이름과 인덱스를 저장할 hashMap 생성
            HashMap<String, Integer> playerIndexMap = new HashMap<>();

            // 해시맵에 초기값 저장
            for (int i = 0; i < players.length; i++) {
                playerIndexMap.put(players[i], i);
            }

            // callings로 호출시 값 변경
            for (String calling : callings) {
                // 현재 불린 사람의 인덱스 확인
                int currentIndex = playerIndexMap.get(calling);

                // 불린 인원이 1등이면 아무일도 일어나지 않음
                if (currentIndex == 0) continue;

                // 바로 앞 선수의 정보 확인
                String frontPlayer = players[currentIndex - 1];

                // 배열에서 앞 선수와 값 변경
                players[currentIndex] = frontPlayer; // 앞선수 -> 불린 위치
                players[currentIndex - 1] = calling; // 불린 선수 -> 앞 위치

                // hashMap에서도 인덱스를 변경해줌
                playerIndexMap.put(frontPlayer, currentIndex);
                playerIndexMap.put(calling, currentIndex - 1);

            }

            return players;
        }
    }
}
