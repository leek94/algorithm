package test.배열1;

import java.util.Scanner;

public class BOj10871 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int X = sc.nextInt();

		int[] array = new int[N];

		for (int i = 0; i < N; i++) {
			int A = sc.nextInt();
			array[i] = A;
		}

		for (int i = 0; i < N; i++) {
			if (array[i] < X) {
				System.out.print(array[i] + " ");
			}
		}

	}
}
