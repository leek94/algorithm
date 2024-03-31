package test.배열1;

import java.util.Scanner;

public class BOj10818 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int max = -1000000;
		int min = 1000000;

		int[] array = new int[N];

		for (int i = 0; i < N; i++) {
			int A = sc.nextInt();
			array[i] = A;
		}

		for (int i = 0; i < N; i++) {
			if (array[i] > max) {
				max = array[i];
			}

			if (array[i] < min) {
				min = array[i];
			}

		}

		System.out.print(min + " " + max);

	}
}
