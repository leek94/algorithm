package test.조건문;

import java.util.Scanner;

public class BOJ525 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int H = sc.nextInt();
		int N = sc.nextInt();
		int plusN = sc.nextInt();
		
		if(N+plusN >=60) {
			
			H += (N+plusN)/60;
			N =  (N+plusN)%60;
			if(H>=24) {
				H = H%24;
			}
		}else {
			N += plusN;
		}
		System.out.println(H+ " " +N);
	}

}
