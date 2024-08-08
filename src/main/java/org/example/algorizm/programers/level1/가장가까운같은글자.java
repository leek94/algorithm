package org.example.algorizm.programers.level1;

// 이중 for문을 사용해서 한개의 값과 그앞의 값중에 같은 값이 있는지 확인 하는 방법
// -- 를 사용해서 자신의 바로 앞부터 하나씩 확인해서 가장 가까운 값을 찾을 수 있음
public class 가장가까운같은글자 {
    public static void main(String[] args) {

        Solution solution = new Solution();
        int[] answer = solution.solution("foobar");

        for(int i = 0; i<answer.length; i++){
            System.out.println(answer[i]);
        }

    }

    public static class Solution{
        public int[] solution(String s){

            // 매개변수 값을 각각 읽기 위해서 배열로 변경
            String [] sArray = s.split("");
            // sArray와 같은 크기의 배열 생성
            int[] answer = new int[s.length()];
            // 처음 단어는 무조건 -1 이므로 초기화
            answer[0] = -1;

            for(int i = 1; i<s.length(); i++){
                answer[i] = -1;
                // 값을 초기화해서 밑에서 변경되지 않으면 -1 값으로 들어가게함
                for(int j = i-1; j>=0; j--){
                    // i번쨰와 j 번째가 같은 경우
                    if(sArray[i].equals(sArray[j])){
                        // i-j는 1 부터 시작하여 ~
                        answer[i] = i - j;
                        // 두번째 for문에서 찾아가는 중에 같은 값을 찾으면 끝냄
                        // -> 그뒤에 다시 찾으면 그 값이 들어가므로
                        // 가장 가까운 값을 찾아야 하는 문제
                        break;
                    }
                }
            }
            return answer;
        }
    }
}
