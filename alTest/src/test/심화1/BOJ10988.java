package test.심화1;

import java.util.Scanner;

public class BOJ10988 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
		
		int strLength = str.length();
		int count = 0;
		
		for(int i=0; i<strLength; i++){
			if(str.charAt(i) == str.charAt(strLength-i-1)) {
				count++;
			}
		}
		
		if(count == strLength) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
	}

}
