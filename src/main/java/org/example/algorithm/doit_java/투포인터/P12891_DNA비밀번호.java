package org.example.algorithm.doit_java.투포인터;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P12891_DNA비밀번호 {
    static int checkArr[];
    static int myArr[];
    static int checkSecret;

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int S = Integer.parseInt(st.nextToken()); // DNA 문자열의 길이
        int P = Integer.parseInt(st.nextToken()); // 부분 문자열의 길이

        int Result = 0; // count++로 결과값 플러스
        checkArr = new int[4]; // 비밀번호 체크 배열
        myArr = new int[4];//현재 상태 배열
        char A[] = new char[S];
        checkSecret = 0; // 숫자가 4일 경우 만족하는 걸로 봄

        A = bf.readLine().toCharArray(); // DNA 문자열 받음
        st = new StringTokenizer(bf.readLine());

        //최초 DNA 배열의 초기 세팅
        for (int i = 0; i < 4; i++) {
            checkArr[i] = Integer.parseInt(st.nextToken());
            if (checkArr[i] == 0) {
                checkSecret++; // 4개가 만족해야 하는데 이미 하나가 0 이므로 만족한걸로 보고 1개 업
            }
        }

        for (int i = 0; i < P; i++) { // 부분 문자열을 처음 받을 떄 세팅
            Add(A[i]);
        }

        if(checkSecret == 4) Result++;

        //슬라이딩 윈도우
        for (int i = P; i < S; i++) { // i는P고 j는 i - P 면 0임 여기서 i 가 ++ 되면 한칸씩 증가하게됨
            int j = i - P;
            //여기까지 하면 윈도우가 한번 슬라이딩해서 오른쪽으로 이동한거부터  add 됨
            Add(A[i]);
            Remove(A[j]);
            if(checkSecret == 4) Result++;
        }
        System.out.println(Result);
        bf.close();
    }

    private static void Remove(char c) {
        switch (c) {
            case 'A':
                if (myArr[0] == checkArr[0]) {
                    checkSecret--;
                    myArr[0]--;
                }
                break;
            case 'C':
                if (myArr[1] == checkArr[1]) {
                    checkSecret--;
                    myArr[1]--;

                }
                break;
            case 'G':
                if (myArr[2] == checkArr[2]) {
                    checkSecret--;
                    myArr[2]--;
                }
                break;
            case 'T':
                if (myArr[3] == checkArr[3]) {
                    checkSecret--;
                    myArr[3]--;
                }
                break;
        }
    }

    private static void Add(char c) {
        switch (c) {
            case 'A':
                myArr[0]++;
                if (myArr[0] == checkArr[0]) {
                    checkSecret++;
                }
                break;
            case 'C':
                myArr[1]++;
                if (myArr[1] == checkArr[1]) {
                    checkSecret++;
                }
                break;
            case 'G':
                myArr[2]++;
                if (myArr[2] == checkArr[2]) {
                    checkSecret++;
                }
                break;
            case 'T':
                myArr[3]++;
                if (myArr[3] == checkArr[3]) {
                    checkSecret++;
                }
                break;
        }
    }
}
