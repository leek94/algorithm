package org.example.doit_java.정렬.버블정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P1377_버블소트프로그램1 {
    // 버블 정렬로 풀 경우 시간 초과가 나서 아이디어 필요
    // 아이디어는 정렬전 인덱스 - 정렬후 인덱스 가장 큰 값 + 1 로 값 구하기
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        mData[] A = new mData[N];

        for (int i = 0; i < N; i++) {
            A[i] = new mData(Integer.parseInt(bf.readLine()), i);
        }
        Arrays.sort(A); // A 배열 정렬(nlogn) 시간 복잡도
        int Max = 0;
        
        for (int i = 0; i < N; i++) {
            if(Max < A[i].index -i) Max = A[i].index - i; // 정렬 전 index - 정렬 후 index 계산의 최댓값 저장
        }
        System.out.println(Max+1);
    }

    // comparable 사용해서 비교 방법 커스텀 하기
    public static class mData implements Comparable<mData> {
        int value;
        int index;

        public mData(int value, int index) {
            super();
            this.value = value;
            this.index = index;
        }
        @Override
        public int compareTo(mData o) {
            return this.value - o.value; // value 기준 오름 차순 정렬하기
        }
    }
}

