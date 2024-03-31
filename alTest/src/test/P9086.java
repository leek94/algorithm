package test;

import java.util.Scanner;

public class P9086 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = Integer.parseInt(sc.nextLine());
		
		for(int i = 0; i<N; i++) {
			String A = sc.nextLine();
			System.out.println(A.charAt(0)+ "" + A.charAt(A.length()-1)+ "");
		}
	}

}
