package org.example.oneDaycoding.bronze3.day1;

import java.util.Scanner;

// 세변이 같을 경우 Equilateral
// 두변이 같을 경우 Isosceles
// 세변이 모두 다를 경우 Scalence
// 제일 긴변보다 두변의 합이 작을 경우 Invalid

public class BOJ5073삼각형세자리 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();


            if(A == 0 && B == 0 && C == 0){
                break;
            } else if( Math.max(Math.max(A, B), C) >= A + B +C - Math.max(Math.max(A, B), C) ){
                System.out.println("Invalid");
            } else if(A == B && B == C){
                System.out.println("Equilateral");
            } else if(A == B || B == C || A == C){
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene");
            }



        }
    }

}
