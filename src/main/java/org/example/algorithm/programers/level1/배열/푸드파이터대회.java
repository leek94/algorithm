package org.example.algorithm.programers.level1.배열;

// 이중 for문을 사용해서 풀기
// StringBuilder를 사용해서도 풀어보기

public class 푸드파이터대회 {
    public static void main(String[] args) {
    Solution sl = new Solution();

    String result = sl.solution2(new int[]{1,3,4,6});
    System.out.println(result);

    }
    static class Solution{
        public String solution(int[] food){
            String answer = "";

            for(int i =1; i<food.length; i++){
                if(food[i]/2 >= 1){
                    for(int j=0; j<food[i]/2; j++){
                        answer += i;
                    }
                }
            }

            answer += "0";

            for(int i =food.length-1; i>=1; i--){
                if(food[i]/2 >= 1){
                    for(int j=food[i]/2; j>=1; j--){
                        answer += i;
                    }
                }
            }

            return answer;
        }

        public String solution1(int[] food){
            String answer = "0";

            for(int i= food.length- 1; i>=1; i--){
                for(int j=0; j<food[i]/2; j++){
                    answer = i + answer + i;
                }
            }

            return answer;
        }

        public String solution2(int[] food){
            StringBuilder sb = new StringBuilder();

//            for(int i =1; i<food.length; i++){
//                for(int j=0; j<food[i]/2; j++){
//                    sb.append(i);
//                }
//            }

            // 위의 2중 for문을 밑에처럼 repeat를 사용해서도 풀 수 있음 -> 가독성 올라감
            for(int i =1; i<food.length; i++){
                sb.append(Integer.toString(i).repeat(food[i]/2));
            }

            // 이방식으로 값을 리턴했더니 내가 원하는 값이 1223330333221 이였는데 3332210333221 이 리턴됨
            // 이유를 보니 sb를 reverse() 함수를 하니 sb 자체 값을 이미 변경해버린것임
            // return이 끝나지 않았으니 sb까지 영향이 가버림
            // 그래서 밑에 처럼 toString()으로 sb을 String으로 변경해 버린 후 연산하여 해결
//            return sb + "0" + sb.reverse();

            return sb.toString() + "0" + sb.reverse().toString();
        }

    }
}
