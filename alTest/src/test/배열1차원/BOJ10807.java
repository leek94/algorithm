package test.배열1차원;

import java.util.Scanner;

public class BOJ10807 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		String A = sc.nextLine();
		String [] AArray = A.split(" ");
		String s = sc.nextLine();
		int count = 0;
		for(int i =0; i<N; i++) {
			if(AArray[i].equals(s)) {
				count++;
			}
		}
		
		System.out.println(count);
	}

}
