package test.배열1;

import java.util.Scanner;

public class BOj5597 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] array = new int[31];
		int temp = 0;

		for (int i = 1; i <= 30; i++) {
			array[i] = i;
		}

		for (int i = 1; i <= 28; i++) {
			int A = sc.nextInt();
			array[A] = 0;
		}
		for (int i = 1; i <= 30; i++) {
			if (array[i] != 0) {
				System.out.println(array[i]);
			}
		}

	}
}
