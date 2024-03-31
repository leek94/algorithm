package test;

import java.util.Scanner;

public class P11720 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int N = Integer.parseInt(sc.nextLine());
		String num = sc.nextLine();
		int[] numArray = new int[N];
		for(int i = 0; i<N; i++) {
			numArray[i] = Integer.parseInt(String.valueOf(num.charAt(i)));
		}
		
		for(int i = 0 ; i <N; i++) {
			sum +=numArray[i];
		}
		System.out.println(sum);
	}

}
