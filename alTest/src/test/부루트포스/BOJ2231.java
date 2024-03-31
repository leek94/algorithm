package test.부루트포스;

import java.util.Scanner;

public class BOJ2231 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < N; i++) {
			int answer = i;
			int temp = i;
			while (temp > 0) {
				answer += temp % 10;
				temp /= 10;

			}
			if (answer == N && i < min) {
				min = i;
			}
		}

		if (min == Integer.MAX_VALUE) {
			System.out.println(0);
		} else {
			System.out.println(min);
		}
	}

}
