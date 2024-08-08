package test.심화1;

import java.util.Scanner;

public class BOJ25206 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num = 0;
		double Gnum = 0;
		
		for (int i = 0; i < 20; i++) {
			String str = sc.nextLine();
			String[] strArray = str.split(" ");
			double num1 = Double.parseDouble(strArray[1]);

			if (strArray[2].equals("P")) {
				continue;
			} else if (strArray[2].equals("A+")) {
				Gnum += num1 * 4.5;
			} else if (strArray[2].equals("A0")) {
				Gnum += num1 * 4.0;
			} else if (strArray[2].equals("B+")) {
				Gnum += num1 * 3.5;
			} else if (strArray[2].equals("B0")) {
				Gnum += num1 * 3.0;
			} else if (strArray[2].equals("C+")) {
				Gnum += num1 * 2.5;
			} else if (strArray[2].equals("C0")) {
				Gnum += num1 * 2.0;
			} else if (strArray[2].equals("D+")) {
				Gnum += num1 * 1.5;
			} else if (strArray[2].equals("D0")) {
				Gnum += num1 * 1.0;
			} else if (strArray[2].equals("F")) {
				Gnum += num1 * 0.0;
			}
			num += num1;
		}
		
		System.out.println(Gnum/num);
	}

}
