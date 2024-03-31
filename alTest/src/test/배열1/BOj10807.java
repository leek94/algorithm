package test.배열1;

import java.util.Scanner;

public class BOj10807 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] AArray = new int[N];
		int count = 0;
		
		for (int i = 0; i < N; i++) {
			int A = sc.nextInt();
			AArray[i] = A;
		}
		
		int v = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			if (AArray[i] == v) {
				count++;
			}
		}
		System.out.println(count);
	}
}
