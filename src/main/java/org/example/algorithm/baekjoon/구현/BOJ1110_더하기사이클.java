package org.example.algorithm.baekjoon.구현;

import java.util.Scanner;

// 0이면 1 출력
// 10 보다 작으면 앞에 0을 붙여줌 -> String으로 사용해야 할거 같음
//  뒷자리 수와 앞자리 수와 뒷자리 수를 더해서 나온 뒷자리 수를 다시합쳐서
// 새로운 수를 구함 -> 계속 반복해서 원래 값과 같아지면 stop
// 여기서 첫번쨰 자리수를 사용할 경우 %로 값을 사용해야함.
public class BOJ1110_더하기사이클 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        // String으로 값을 변경 -> 밑에서 부호 쓸려면 INT로도 필요
        String NStr = Integer.toString(N);
        String changeNStr = "";
        int sum =- 0;
        int count = 0;

        if(N == 0){
            count ++;

        } else if (N < 10){
            // int와 String을 더하면 스트링으로 변경됨
            NStr = "0" + N;
            changeNStr = "0" + N;

            while(true){
                sum = Integer.parseInt(changeNStr.substring(0,1)) + Integer.parseInt(changeNStr.substring(1));
                changeNStr = changeNStr.substring(1)  + sum%10;

                count++;

                if(NStr.equals(changeNStr)){
                    break;
                }
            }
        } else {
            changeNStr = "" + NStr;
            while(true){
                sum = Integer.parseInt(changeNStr.substring(0,1)) + Integer.parseInt(changeNStr.substring(1));
                changeNStr = changeNStr.substring(1)  + sum%10;

                count++;

                if(NStr.equals(changeNStr)){
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
