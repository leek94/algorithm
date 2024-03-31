package test.심화1;

import java.util.Scanner;

public class BOJ2941 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
		int count = 0;

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == 'c') {
				if (str.length() - 1 > i) {
					if (str.charAt(i + 1) == '=') {
						i++;

					} else if (str.charAt(i + 1) == '-') {
						i++;
					}

				}
			}

			if (str.charAt(i) == 'd') {
				if (str.length() - 1 > i) {
					if (str.charAt(i + 1) == 'z') {
						if (str.length() - 2 > i) {
							if (str.charAt(i + 2) == '=') {
								i += 2;

							}

						}

					} else if (str.charAt(i + 1) == '-') {
						i++;
					}
				}
			}

			if (str.charAt(i) == 'l') {
				if (str.length() - 1 > i) {
					if (str.charAt(i + 1) == 'j') {
						i++;

					}
				}
			}

			if (str.charAt(i) == 'n') {
				if (str.length() - 1 > i) {
					if (str.charAt(i + 1) == 'j') {
						i++;

					}
				}
			}

			if (str.charAt(i) == 's') {
				if (str.length() - 1 > i) {
					if (str.charAt(i + 1) == '=') {
						i++;

					}
				}
			}

			if (str.charAt(i) == 'z') {
				if (str.length() - 1 > i) {
					if (str.charAt(i + 1) == '=') {
						i++;

					}
				}
			}
			count++;
		}

		System.out.println(count);
	}

}
