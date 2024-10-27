package org.example.algorithm.programers.level1;

// a == 97 / A == 65 아스키코드 알파베 + 25 씩 하면됨
//

public class 시저암호 {
    public static void main(String[] args) {
        Solution sl = new Solution();
        String result = sl.solution("AB",1);
        System.out.println(result);
    }

    public static class Solution{
        public String solution(String s, int n){
            char[] sCharArray = s.toCharArray();

            for(int i =0; i< s.length(); i++){

                if(sCharArray[i] >= 'a' && sCharArray[i] <= 'z'){
                    sCharArray[i] = (char)((sCharArray[i] -'a' + n)%26 + 'a');
                } else if(sCharArray[i] >= 'A' && sCharArray[i] <= 'Z'){
                    sCharArray[i] = (char)((sCharArray[i] -'A' + n)%26 + 'A');
                }

            }
            StringBuilder sb = new StringBuilder();

            for(char c : sCharArray){
                sb.append(c);
            }
            String answer = sb.toString();

            return answer;
        }
    }
}
