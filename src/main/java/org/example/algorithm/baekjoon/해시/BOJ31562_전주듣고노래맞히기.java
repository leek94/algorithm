package org.example.algorithm.baekjoon.해시;

import java.io.*;
import java.util.*;
public class BOJ31562_전주듣고노래맞히기 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 중복된 키값에 대한 벨류를 저장할 수 없으므로 List로 값을 저장해서 중복된 값을 저장
        Map<String, List<String>> map = new HashMap<>();

        for(int i = 0 ; i < N; i++){
            st = new StringTokenizer(br.readLine());
            st.nextToken(); // T는 사용하지 않지만 형식을 맞추기위해 값 받아옴
            String title = st.nextToken(); // 밸류값으로 저장

            StringBuilder sb = new StringBuilder();

            for( int j = 0; j < 3; j++){
                sb = sb.append(st.nextToken()).append(" ");
            }

            // code 값으로 키 값을 공백과 3글자를 저장 / trim을 통해 앞뒤 공백 삭제
            String code = sb.toString().trim();

            // 맵에 키값이 없다면 밸류를 리스트로 생성
            if(!map.containsKey(code)){
                map.put(code, new ArrayList<>());
            }
            // 키가 있든 없든 값을 추가
            map.get(code).add(title);
        }

        for(int i = 0; i < M; i++){
            String song = br.readLine();

            // 키값이 존재하는 지 확인
            if(map.containsKey(song)){
                // 벨류값이 1개일경우
                if(map.get(song).size() == 1){
                    // 맵 안의 리스트 안의 첫번째 인덱스 값
                    System.out.println(map.get(song).get(0));
                } else {
                    // 2개 이상일 경우
                    System.out.println("?");
                }
            } else {
                System.out.println("!");
            }
        }
        br.close();
    }
}
