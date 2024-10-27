package org.example.algorithm.programers.level1.배열;

// 배열을 통해서 String의 값을 contain, replaceAll로 변경해서 풀면 될거 같음
public class 숫자문자열과영단어 {
    public static void main(String[] args) {
        Solution sl = new Solution();
        int result = sl.solution("one4seveneight");

        System.out.println(result);
    }
    static class Solution{
        public int solution(String s){
            int answer = 0;
            String[] num = {"zero", "one", "two", "three", "four", "five", "six"
            , "seven", "eight", "nine" };

            for(int i = 0; i<10; i++){

                if(s.contains(num[i])){
                    System.out.println(num[i]);
                    s = s.replaceAll(num[i], String.valueOf(i));
                }
            }

            answer = Integer.parseInt(s);

            return answer;
        }
    }
}
