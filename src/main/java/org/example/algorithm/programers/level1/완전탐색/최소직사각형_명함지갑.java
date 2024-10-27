package org.example.algorithm.programers.level1.완전탐색;

// Math.max / Math.min을 활용해서 풀면 좋음 -> max에서 큰값 * min에서 큰값
// 처음에 나는 w, h 를 비교해서 한쪽으로 큰 값을 몰고 난 후에 양쪽에서 가장 큰값을 곱해서 풀었음

public class 최소직사각형_명함지갑 {
    public static void main(String[] args) {

        Solution sl = new Solution();
        //  바로 2중 배열 초기화하는 법
        int result = sl.solution(new int[][]{
                {60, 50},
                {30, 70},
                {60, 30},
                {80, 40}
        });

        System.out.println(result);
    }

    public static class Solution{
        public int solution(int[][] sizes){
            // 이중 배열의 0번째와 1번째 값중 최대값 초기화
            int length = 0;
            int heigth = 0;


            for(int[] size : sizes){
                // max 와 min을 사용해서 큰값 중에 큰값과 작은 값중에 큰값을 곱하면 됨
                int max = Math.max(size[0], size[1]);
                int min = Math.min(size[0], size[1]);

                if(max > length ){
                    length = max;
                }
                if(min > heigth){
                    heigth = min;
                }
            }

            return length * heigth;
        }

    }

    }

