package org.example.algorithm.baekjoon.구현;

// 셀프 넘버릂 구하는 식
// white을 돌리고
// number 값 + number%10 으로 첫째 자리 수를 더하고 /10으로 첫째자리 삭제
// 10000번 까지 확인해야함

public class BOJ4673_셀프넘버 {
    public static void main(String[] args) {

        boolean[] checker = new boolean[10001];

        for(int i = 1; i <= 10000; i++){
            int n  = d(i);

            if(n < 10001){
                checker[n] = true;
            }
            // 이렇게 하는 방법과 StringBuilder를 사용해서 append로 \n을 추가해서 한번에 출력도 가능
            if(!checker[i]){
                System.out.println(i);
            }



        }


    }

    public static int d(int number){
        int sum = number;

        while(number != 0){
            // 첫번째 자리 값 더하기
            sum = sum + number%10;

            number /=10;
        }

        return sum;
    }

}
