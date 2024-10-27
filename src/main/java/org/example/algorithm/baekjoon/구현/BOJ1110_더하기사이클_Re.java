package org.example.algorithm.baekjoon.구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 0이면 1 출력
// 10 보다 작으면 앞에 0을 붙여줌 -> String으로 사용해야 할거 같음
//  뒷자리 수와 앞자리 수와 뒷자리 수를 더해서 나온 뒷자리 수를 다시합쳐서
// 새로운 수를 구함 -> 계속 반복해서 원래 값과 같아지면 stop
// 여기서 첫번쨰 자리수를 사용할 경우 %로 값을 사용해야함.
public class BOJ1110_더하기사이클_Re {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // 숫자로 변경해서
        int N = Integer.parseInt(reader.readLine());

        int count = 0;
        int M = N;
        while(true){

            N = N%10*10 + (N/10 + N%10)%10;
            count++;
            if(M == N){
                break;
            }
        }
        System.out.println(count);
    }
}
