package test.심화1;

import java.io.IOException;
import java.util.Scanner;

public class BOJ1316 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

//		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//		String input = bf.readLine();
//		StringTokenizer st = new StringTokenizer(input);

		int N = Integer.parseInt(sc.nextLine());

		int count = 0;

		for (int i = 0; i < N; i++) {
			if (checker()) {
				count++;
			}

		}
		System.out.println(count);
	}

	static boolean checker() {

		boolean[] list = new boolean[26]; // 알파벳 갯수만큼 배열 생성 false로 초기화
		String str = sc.nextLine(); // 단어 받는 위치
		char prev = '-';// 이전 글자 비교시 사용
		
		for (int j = 0; j < str.length(); j++) {
			char now = str.charAt(j); // 현재 단어 받음
			if (prev != now) { // 같지 않으면 아래 실행문 실행
				if (!list[now - 'a']) { // list 배열이 false면 아직 안나옴
					list[now - 'a'] = true;
					prev = now;
				} else {
					return false; // 바로 전 단어와 같지 않은데 이미 true 라면 그룹단어 X
				}
			} else {
				continue; // 바로 전 단어와 같다면 다음 실행
			}
		}
		return true;
	}
}
