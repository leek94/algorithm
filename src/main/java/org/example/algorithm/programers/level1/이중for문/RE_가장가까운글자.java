package org.example.algorithm.programers.level1.이중for문;

import java.util.Arrays;

// 이중 for문을 사용해서 해결하려고함
// banana -> -1 -1 -1 2 2 2
// 012345
// 앞에 같은 글자가 있으면 몇번째에 있는지 출력하는 문제
// 앞에 없으면 -1 출력
public class RE_가장가까운글자 {
    public static void main(String[] args) {

        Solution sl = new Solution();
        int[] result = sl.solution("banana");
        System.out.println(Arrays.toString(result));
    }

    static class Solution{
        public static int[] solution(String s){
            // 출력하는 배열 초기화
            int [] answer = new int[s.length()];

            //처음 나오는 값은 무조건 -1이므로 초기화
            answer[0] = -1;

            // 위에서 0번 인덱스를 초기화 했으므로 1번부터 시작
            for(int i = 1; i<s.length(); i++){
                // -1로 초기화하고 값이 있으면 아래에서 변경해줌
                answer[i] = -1;
                // j를 i보다 -1 하여 앞에 부터 찾아서 같은 값을 찾으면 배열에 i -j로 몇개 앞에 있는지 찾아줌
                for(int j = i-1; j>=0; j--){
                    if(s.charAt(i) == s.charAt(j)){
                        answer[i] = i - j;

                        break; // break를 안해주면 banana 같은 경우 앞에 a가 두개 여서 2, 4 번을 모두 찾게 되는데 뒤에 나오는 4가 출력됨
                    }
                }
            }

            return answer;
        }
    }
}
