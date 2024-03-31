package test.배열1;

import java.util.Scanner;

public class BOj10811 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int basket = sc.nextInt();
		int repeat = sc.nextInt();
		int temp = 0;

		int[] array = new int[basket];

		for (int i = 1; i <= basket; i++) {
			array[i - 1] = i;
		}

		for (int i = 0; i < repeat; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			A--;
			B--;
			for (int j = 0; j < (B-A+1) / 2; j++) {

				temp = array[A + j];
				array[A + j] = array[B - j];
				array[B - j] = temp;

			}

		}

		for (int i = 0; i < basket; i++) {
			System.out.print(array[i] + " ");

		}
		System.out.println();
	}
}
