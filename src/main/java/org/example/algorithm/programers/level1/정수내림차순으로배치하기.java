package org.example.algorithm.programers.level1;

import java.util.Arrays;

public class 정수내림차순으로배치하기 {
    public static void main(String[] args) {
        ReverseLong rl = new 정수내림차순으로배치하기().new ReverseLong();
        Long l = rl.resverseLong(118372);
        System.out.println(l);
    }

    public class ReverseLong{
        public long resverseLong(long n){
            String [] s = String.valueOf(n).split("");
            Arrays.sort(s);

            StringBuilder sb = new StringBuilder();
            for(String z : s) sb.append(z);

            return Long.parseLong(sb.reverse().toString());
        }
    }
}
