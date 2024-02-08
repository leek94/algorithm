package org.example.doit_java.투포인터;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P1253_좋은수구하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int result = 0;
        long[] A = new long[N];
        StringTokenizer st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Long.parseLong(st.nextToken());
        }
        Arrays.sort(A);
        for (int k = 0; k < N; k++) {
            long find = A[k];
            int i = 0;
            int j = N - 1;
            // 투포인트 알고리즘
            while (i < j) {
                if (A[i] + A[j] == A[k]) {
                    // find는 서로 다른 두 수의 합이어야 함을 체크
                    if (i != k && j != k) {// 같은 값이 들어 갈 수 있으므로 인덱스로 같은지 확인
                        result++;
                        break; // 0 + 자기 자신이 아니면 좋은 수라고 판단
                    } else if (i == k) {
                        i++;
                    } else {
                        j--;
                    }
                } else if (A[i] + A[j] < A[k]) {
                    i++;
                } else {
                    j--;
                }

            }
        }
        System.out.println(result);
        bf.close();
    }

}
