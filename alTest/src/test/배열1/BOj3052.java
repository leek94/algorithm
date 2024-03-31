package test.배열1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BOj3052 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Set 사용해서 중복 삭제하면 쉬울듯

		int[] array = new int[10];

		for (int i = 0; i < 10; i++) {
			int A = sc.nextInt();
			array[i] = A % 42;
		}
		Set<Integer> set = new HashSet<>();

		for (int i = 0; i < 10; i++) {
			set.add(array[i]);
		}

		System.out.println(set.size());

	}
}
