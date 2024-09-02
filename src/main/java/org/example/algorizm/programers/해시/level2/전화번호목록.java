package org.example.algorizm.programers.해시.level2;

// 해시를 사용해서
// for 문을 사용해서 있는 String contain되어 있는지 확인
// contain이 하나라도 되어 있으면 FALSE 리턴
// 부르트 포스(2중for문)로는 풀 수 있을 거 같은데 -> 해시는 모르겠음
// 중복되는 번호는 없으므로 HashSet도 가능할거 같음
// hashMap을 사용해서 containsKey를 통해서도 , containsValue를 통해서도 가능할 거 같음
// 인덱스, value를 map에 넣을거면 그냥 배열을 사용해도 되는 거 아닌지 의문

import org.example.algorizm.programers.해시.level1.폰켓몬;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class 전화번호목록 {
    public static void main(String[] args) {
       Solution sl = new Solution();
       Boolean result = sl.solution(new String[] {"119", "456", "119789"});
       System.out.println(result);
    }

    // 방법 1. 2중 for문을 사용한 브루트 포스를 사용
//    static class Solution{
//        static boolean solution(String[] phone_book){
//
//            String [] copy = Arrays.copyOf(phone_book, phone_book.length);
//
//            for( int i = 0; i < phone_book.length; i++){
//                for(int j = i+1; j < phone_book.length; j++){
//                    if(phone_book[j].contains(phone_book[i])){
//                        System.out.println("phone_book[i]: " + phone_book[i] + " / " + "phone_book[j]: " + phone_book[j]);
//                        return false;
//                    }
//                }
//            }
//
//            return true;
//        }
//    }



    // 방법 2. HashSet을 사용한 방법
//    static class Solution{
//        static boolean solution(String[] phone_book){
//
//            HashSet<String> hs = new HashSet<>();
//
//            for(String num : phone_book){
//                hs.add(num);
//            }
//
//            // 이렇게 풀려고 시도 했는데 이렇게 푸니깐 자기 자신을 보게되는 상황이 때문에 무조건 false를 리턴하게됨
////            for(int i = 0; i < phone_book.length; i++){
////               if( hs.contains(phone_book[i])) {
////                   System.out.println(phone_book[i]);
////                   return false;
////               }
////            }
//
//            for(String num: phone_book){
//                // 여기서 for문이 subString을 할 경우에  무조건 단어 길이에 -1 까지만 갈 수 있음
//                // 접두어이기 때문에 끝까지 갈 필요가 없음 -> 자기 자신을 검사하지 않게 됨
//                for(int i =1; i < num.length(); i++){
//                    if(hs.contains(num.substring(0, i))){
//                        System.out.println(num);
//                        return false;
//                    }
//                }
//            }
//
//
//
//            return true;
//        }
//    }

    // 방법 3. HashMap을 사용한 방법
    static class Solution{
        static boolean solution(String[] phone_book){

            HashMap<String, Integer> hm = new HashMap<>();

            for (int i = 0; i < phone_book.length; i++)
                hm.put(phone_book[i], i);

            for(int i=0; i<phone_book.length; i++){
                for(int j=0; j<phone_book[i].length(); j++){
                    if(hm.containsKey(phone_book[i].substring(0,j))){
                        return false;
                    }
                }
            }

            return true;
        }
    }

}
