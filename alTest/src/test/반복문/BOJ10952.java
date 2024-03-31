package test.반복문;

import java.util.Scanner;

public class BOJ10952 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			if(A == 0&& B == 0) {
				break;
			}
			
			System.out.println(A+B);
			
		}
	}

}
