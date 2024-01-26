package org.example.oneDaycoding.bronze4.day14;

import java.util.Scanner;

public class BOJ11945 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        if(M>0) {
            sc.nextLine(); // 밑에서 nextLine 사용하려면 이렇게 적어줘야함
            //왜냐하면 nextInt는 바로 옆에를 계속해서 읽으려고 하는데 nextLine으로 다음 줄로 이동을 시켜야함
            for (int i = 0; i < N; i++) {
                char[] text = sc.nextLine().toCharArray();
                for (int j = M - 1; j >= 0; j--) {
                    System.out.print(text[j]);
                }
                System.out.println();
            }

        }
    }
}
