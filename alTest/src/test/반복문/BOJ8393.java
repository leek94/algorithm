package test.반복문;

import java.util.Scanner;

public class BOJ8393 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int answer =0;
		for(int i =1; i<=N; i++) {
			answer += i;
		}
		System.out.println(answer);
	}

}
