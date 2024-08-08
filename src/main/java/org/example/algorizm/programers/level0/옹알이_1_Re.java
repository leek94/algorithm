package org.example.algorizm.programers.level0;

public class 옹알이_1_Re {

    public static void main(String[] args) {

        //babbling의 배열에 값을 넣어줌
     int result =  solution(new String[]{"aya", "yee", "u", "maa", "wyeoo"});
//    int result = solution(new String[]{"ayaye", "uuuma", "ye", "yemawoo", "ayaa"});
    System.out.println(result);
//    return result;

        }

    private static int solution(String[] strings) {


        int count = 0;
        for(String sound: strings){
            if(isValid(sound)){
                count++;
            }

            }
        System.out.println(count);
        return count;
        }

    private static boolean isValid(String sound) {
        String[] valid = {"aya", "ye", "ma", "woo"};

        for(String vSound : valid){
            sound = sound.replaceFirst(vSound, "-");
        }
        return sound.replaceAll("-", "").isEmpty();
    }
}

