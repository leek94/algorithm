package org.example.algorithm.doit_java.구간합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11659_구간합구하기 {
    public static void main(String[] args) throws IOException {
        // System.in 표준 입력 스트림, inputStreamReader를 통해 byte를 문자로 변환, bufferedReader를 통해 사용자 입력을 받음
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        // StringTokenizer는 입력된 문자열을 특정 구분자를 기준으로 나눔
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        //bufferedReader.readLine()을 통해서 문자열을 한줄씩 읽어옴(공백을 기준으로 분리)
        // 5 3
        int suNo = Integer.parseInt(stringTokenizer.nextToken()); // 5
        int quizNo = Integer.parseInt(stringTokenizer.nextToken()); // 3
        // stringTokenizer.nextToken()을 사용하면 공백을 기준으로 값이 들어옴
        Long[] S = new Long[suNo + 1]; // 3+1 4칸짜리 배열 생성
        S[0] = 0L; // 인덱스 0번 값을 0으로 초기화

        // 구하는 배열 값을 초기화 5 4 3 2 1
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        for(int i = 1; i <= suNo; i++){
            S[i] = S[i - 1] + Integer.parseInt(stringTokenizer.nextToken());
            // 구간합 배열 S을 구함
        }
        for (int s = 0; s < quizNo; s++) {
            // 구간합을 통해서 원하는 값 생성
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int i = Integer.parseInt(stringTokenizer.nextToken());
            int j = Integer.parseInt(stringTokenizer.nextToken());
            System.out.println(S[j] - S[i - 1]);

        }
    }
}
