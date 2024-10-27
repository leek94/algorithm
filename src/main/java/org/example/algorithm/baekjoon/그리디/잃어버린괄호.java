package org.example.algorithm.baekjoon.그리디;
import java.util.*;

public class 잃어버린괄호 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();

        ArrayList<Integer> arrayList = new ArrayList<>();

        String[] splites = num.split("-"); // -를 기준으로 나눔
        // 40 , 30+20, 20

        for(String split : splites){
            int sum = 0;
            String[] splited = split.split("\\+"); // 이스케이프 문을 사용하지 않으면 정규식에서 하나 이상의 글을 의미해서 에러
            for(String sp : splited){
                sum += Integer.parseInt(sp);
            }
            arrayList.add(sum);
        }

        int answer = arrayList.get(0);

        for(int i = 1; i < arrayList.size(); i++){
            answer -= arrayList.get(i);
        }

        System.out.println(answer);


    }
}
