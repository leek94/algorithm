package org.example.algorithm.baekjoon.해시;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class BOJ27160_할리갈리 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Map<String,Integer> hm = new HashMap<>();
        int N = Integer.parseInt(st.nextToken());
        boolean flag = false;

        for(int i =0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            String fruit = st.nextToken();
            int fruitNum = Integer.parseInt(st.nextToken());

            hm.put(fruit, hm.getOrDefault(fruit, 0) + fruitNum);
        }

        for(Integer num: hm.values()){
            if(num == 5) {
                System.out.println("YES");
                flag = true;
                break;
            }

        }

        if(!flag) System.out.println("NO");

        br.close();
    }
}
