package test.배열1;

import java.util.Scanner;

public class BOj10813 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] array = new int[N + 1];
		int temp = 0;
		
		for (int i = 1; i <= N; i++) {
			array[i] = i;
		}

		for (int i = 1; i <= M; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			temp = array[A];
			array[A]=array[B];
			array[B]=temp;

		}

		for (int i = 1; i <= N; i++) {
			System.out.print(array[i] + " ");

		}
		System.out.println();
	}
}
