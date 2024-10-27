package org.example.algorithm.programers.해시.level1;

// hashSet을 이용해서 중복을 저장해서 풀어 보려고함
// treeSet을 사용하면 정렬이 필요 없음 -> 정렬이 됨
// Iterator 반복자를 사용해서 컬렉션을 순회함

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class 두개뽑아서더하기 {
    public static void main(String[] args) {

        Solution sl = new Solution();
        int[] answer = sl.solution1(new int[]{2,1,3,4,1});
        System.out.println(Arrays.toString(answer));
    }

    static class Solution{
        public int[] solution(int[] numbers){

            int[] answer;
            // set을 이용해서 중복을 삭제하려고함
            HashSet<Integer> hs = new HashSet<>();

            // 더해서 값들을 set에 넣어줌
            for(int i =0; i<numbers.length; i++){
                for(int j = i+1; j<numbers.length; j++){
                    hs.add(numbers[i] + numbers[j]);
                }
            }

            // Integer[] 타입의 배열을 생성
            Integer[] arr = hs.toArray(new Integer[0]);

            // 사이즈를 맞춰서 배열을 초기화
            answer = new int[hs.size()];

            // answer 배열에 순서에 맞게 값을 저장
            for(int i =0; i< arr.length; i++){
                answer[i] = arr[i];
            }

            // hashSet을 사용했으므로 순서가 보장되지 않아 여기서 정렬
            // TreeSet을 사용하면 순서가 오름차순 정렬됨
            Arrays.sort(answer);

            return answer;
        }

        public int[] solution1(int[] numbers){

            int[] answer;
            // TreeSet을 사용해서 오른차순 정렬
            TreeSet<Integer> tr = new TreeSet<>();

            for(int i =0; i<numbers.length; i++){
                for(int j = i+1; j<numbers.length; j++){
                    tr.add(numbers[i] + numbers[j]);
                }
            }
            // 사이즈에 맞게 배열 생성
            answer = new int[tr.size()];

            // 반복자를 통해서 순회
            Iterator<Integer> itor = tr.iterator();
            int index = 0;
            // hashNext는 안에 값이 있으면 True, 없으면 false 리턴
            while(itor.hasNext()){
                // next()는 커서를 통해서 순서에 맞게 같을 알려줌 ->  pop 하는게 아님
                answer[index] = itor.next();
                index++;
            }
            return answer;
        }
    }
}
