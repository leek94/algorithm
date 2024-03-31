package test.심화1;

import java.util.Scanner;

public class BOJ1157 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();

		int[] alphabet = new int[26];
		int max = 0;
		int index = 0;
		for (int i = 0; i < str.length(); i++) {
			char charStr = str.charAt(i);
			int re =  (charStr - 97);
			if (re >= 0) {
				alphabet[re]++;
			} else {
				re += 32;
				alphabet[re]++;
			}
		}

		for (int i = 0; i < 26; i++) {
			if(alphabet[i] > max) {
				max = alphabet[i];
				index = i;
			} else if(alphabet[i] == max) {
				index = -2; // ? 는 유니코드로 63임
			}
		}
		System.out.println((char)(index+65));

	}

}
