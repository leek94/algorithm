package org.example.algorithm.programers.level0;

// 풀이 방법
// 재귀 함수를 활용하여 확인하는 방법 1
// "-"로 치환하여 값을 확인하는 방법 2

public class 옹알이_1 {

    public static void main(String[] args){

        // 객체를 생성
    Solution sol = new Solution();
    //babbling의 배열에 값을 넣어줌
    int result = sol.solution(new String[]{"aya", "yee", "u", "maa", "wyeoo"});
//    int result = sol.solution(new String[]{"ayaye", "uuuma", "ye", "yemawoo", "ayaa"});
    // 값 출력
    System.out.println(result);
    }

    // 방법 1
    public static class Solution{
        public int solution(String[] babbling){
            // count를 초기화
            int count = 0;
            // 밑에 매서드들을 통과하면 count 값 1개씩 증가
            for(String word : babbling){
                if(isValidWord2(word)){
                    count++;
                }
            }

            return count;
        }

        // 들어온 값중에 validSounds와 일치하는게 있는지 확인
        public boolean isValidWord(String word) {
            String[] validSounds = {"aya", "ye", "woo", "ma"};
            return checkWord(word, validSounds);
        }
        // 재귀함수로 다시 checkWord를 호출해서 계속 호출됨
        private boolean checkWord(String word, String[] validSounds){
            // 값이 비었으면 통과한 것으로 봄
            if(word.isEmpty()){
                return true;
            }

            for(String sound: validSounds){
                // word가 sound로 시작되면 if문 타게됨
                if(word.startsWith(sound)){
                    // 조합된 음만을 낼 수 있어서 위의 4가지로 시작하고 중간에 값이 있는 경우
                    // 원하는 값이 아님
                    return checkWord(word.substring(sound.length()), validSounds);
                }
            }
            return false;
        }

        // 방법 2
        private boolean isValidWord2(String word){
            String[] validSounds = {"aya", "ye", "woo", "ma"};

            for(String sound : validSounds){
                word = word.replaceFirst(sound, "-");
            }
            return word.replaceAll("-", "").isEmpty();
        }
    }
}
