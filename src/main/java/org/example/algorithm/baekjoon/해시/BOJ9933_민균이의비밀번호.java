package org.example.algorithm.baekjoon.해시;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class BOJ9933_민균이의비밀번호 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        String[] passwords = new String[N];
        Set<String> set = new HashSet<>();

        for(int i =0 ; i < N; i++){
            st = new StringTokenizer(br.readLine());
            passwords[i] = st.nextToken();
            set.add(passwords[i]);
        }

        for(String password : passwords){
            String reversePassword = new StringBuilder(password).reverse().toString();
            if(set.contains(reversePassword)){
                System.out.println(password.length() + " " + password.charAt((password.length() - 1 )/2));
                return;
            }
        }
    }
}
