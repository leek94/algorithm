package test.배열1;

import java.util.Scanner;

public class BOj2562 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int max = 0;
		int index = 0;
		int[] array = new int[9];

		for (int i = 0; i < 9; i++) {
			int A = sc.nextInt();
			array[i] = A;
		}

		for (int i = 0; i < 9; i++) {
			if (array[i] > max) {
				max = array[i];
				index = i+1;
			}

		}

		System.out.println(max);
		System.out.println(index);

	}
}
