package org.example.algorithm.programers.level1.정렬;

import java.util.Arrays;

// copyOfRange를 사용해서 풀면 될걸로 보임
public class K번째수 {
    public static void main(String[] args) {

        Solution sl = new Solution();
        int[] array = new int[] {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = new int[][] {{2, 5, 3}, {4, 4, 1},{1, 7, 3}};
        int[] result = sl.solution(array, commands);
        System.out.println(Arrays.toString(result));
    }

    static class Solution{
        public int[] solution(int[] array, int[][] commands) {
            int[] answer = new int[commands.length];

            for(int i =0; i<commands.length; i++){

                int [] result = Arrays.copyOfRange(array, commands[i][0] -1,commands[i][1]);
                Arrays.sort(result);
                answer[i] = result[commands[i][2]-1];

            }

            return answer;
        }
    }
}
