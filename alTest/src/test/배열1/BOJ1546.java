package test.배열1;

import java.util.Scanner;

public class BOJ1546 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] array = new int[N];
		int max = 0;
		int sum = 0;

		for (int i = 0; i < N; i++) {
			int A = sc.nextInt();
			array[i] = A;
			if (A > max) {
				max = A;
			}
		}
		for (int i = 0; i < N; i++) {
			sum += array[i];
		}
		
		System.out.println((((double)sum/N)/max)*100);
	}
}
