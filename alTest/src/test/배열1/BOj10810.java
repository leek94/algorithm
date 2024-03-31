package test.배열1;

import java.util.Scanner;

public class BOj10810 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int basket = sc.nextInt();
		int repeat = sc.nextInt();

		int[] array = new int[basket];

		for (int i = 0; i < repeat; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			int C = sc.nextInt();
			for (int j = A - 1; j <= B - 1; j++) {

				array[j] = C;
			}

		}

		for (int i = 0; i < basket; i++) {
			System.out.print(array[i] + " ");

		}
		System.out.println();
	}
}
