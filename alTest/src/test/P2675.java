package test;

import java.util.Scanner;

public class P2675 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = Integer.parseInt(sc.nextLine());
		
		for(int i = 0; i < N; i++) {
			String answer = "";
			int NN = Integer.parseInt(sc.nextLine());
			String s = sc.nextLine();
			for(int j = 0; j<s.length(); j++) {
				for(int k = 0; k<NN; k++) {
					answer +=String.valueOf(s.charAt(j));
				}
			}
			System.out.println(answer);
		}
	}

}
