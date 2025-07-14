package org.example.algorithm.baekjoon.해시;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;


public class BOJ25593_근무지옥에빠진푸앙이 {

    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        Map<String, Integer> map = new HashMap<>();

        int[] time = {4, 6, 4, 10}; // 근무 시간

        // 주차별로 값을 받아서 저장
        for( int i = 0; i < N * 4; i++ ){
            int currentTime = time[i % 4];

            st = new StringTokenizer(br.readLine());
            for( int j = 0; j < 7; j++){

                String name = st.nextToken();
                if(!name.equals("-")){
                    map.put(name, map.getOrDefault(name, 0) + currentTime);
                }
            }
        }

        // 모든 값이 없을 경우 처리하는 구문
        if(map.isEmpty()) {
            System.out.println("Yes");
            return;
        }

        // 최소 / 최대값 구하는 문
        Integer maxValue = Collections.max(map.values());
        int minValue = Collections.min(map.values());

//        System.out.println("min : " + minValue + " ," + "max: " + maxValue);

        // 값으로 출력값 정하는 구문
        if(maxValue - minValue <= 12) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }


    }
}
