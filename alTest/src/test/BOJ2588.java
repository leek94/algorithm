package test;

import java.util.Scanner;

public class BOJ2588 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		System.out.println(A*(B%10));
		System.out.println(A*((B%100)-(B%10))/10);
		System.out.println(A*(((B%1000)-(B%100)))/100);
		System.out.println(A*B);
		
	}

}
