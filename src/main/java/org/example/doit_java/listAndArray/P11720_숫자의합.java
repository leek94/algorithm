package org.example.doit_java.listAndArray;
import java.util.Scanner;

public class P11720_숫자의합 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // int 형 값을 입력 받음
        // 입력값을 String형 변수 sNum에 저장한 후 char[]형 변수로 변환하기

        String sNum = sc.next(); //String형 값을 입력 받음
        char[] cNum = sNum.toCharArray();
        int sum = 0;
        for(int i = 0; i <cNum.length; i++){
            sum += cNum[i] - '0';
        }
        // 아스키 코드를 이해해야 string에서 int 값으로 변환이 가능하다
        // 아스키 코드와 숫자에는 48의 차이가 남
        // 숫자 1은 아스키 코드로 49 번임
        // '1' - 48 or '1'-'0'로 계산하면 char에서 int로 변환이 가능함
        System.out.println(sum);
    }
}
