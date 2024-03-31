package test.조건문;

import java.util.Scanner;

public class BOJ2884 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int N = sc.nextInt();
		
		if(N-45<0) {
			if(H-1<0) {
				H=23;
				N = N+60-45;
			}else {
				H -=1;
				N = N+60-45;
			}
			
		}else {
			N -=45;
		}
		
		System.out.println(H + " " + N);
	}

}
