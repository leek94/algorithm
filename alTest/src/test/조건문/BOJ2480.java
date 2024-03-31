package test.조건문;

import java.util.Scanner;

public class BOJ2480 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();

		if (A == B && B == C) {
			System.out.println(10000 + (A * 1000));
		} else if (A == B && B!=C) {
			System.out.println(1000 + (A * 100));
		} else if (C == B&& B!=A) {
			System.out.println(1000 + (C * 100));
		} else if (A == C&& B!=A) {
			System.out.println(1000 + (A * 100));
		}else {
			int S = Math.max(A,Math.max(B,C));
			System.out.println( + (S * 100));
		}
	}

}
