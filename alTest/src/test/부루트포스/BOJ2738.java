package test.부루트포스;

import java.util.Scanner;

public class BOJ2738 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		int[][] array1 = new int[N][M];
		int[][] array2 = new int[N][M];
		int[][] sumArray = new int[N][M];
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				int T = sc.nextInt();
				array1[i][j] = T;
			}
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				int T = sc.nextInt();
				array2[i][j] = T;
			}
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				
				sumArray[i][j] = array1[i][j] + array2[i][j];
			}
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				
				System.out.print(sumArray[i][j] + " "); 
			}
			System.out.println();
		}

	}

}
