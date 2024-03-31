package test.과제2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//1. 3개 이하일때 같은 값이 들어올 경우
//2. 3개 초과일 때 
public class ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int W = sc.nextInt();
		int count = 0;

		List<String> list = new ArrayList<>();

		sc.nextLine();
		String str = sc.nextLine();

		String[] strArray = str.split(" ");
		for(int i =0; i<strArray.length; i++) {
			System.out.println(strArray[i]);
		}
		
		
		for (int i = 0; i < strArray.length; i++) {
			if (list.contains(strArray[i])) { // 들어올 값이 이미 포함되어 있으면 삭제후 추가
				int index = list.indexOf(strArray[i]);
				list.remove(index);
				list.add(strArray[i]);
				count++;
				
			} else { // 들어올 값이 포함되어 있지 않으면
				if (list.size() < N) { // 배열에 빈자리가 있으면
					list.add(strArray[i]);
					count += 3;
					
				} else { // 배열에 빈자리가 없으면
					
					double avg = average(list); // 평균 메서드로 구함
					for (int j = 0; j < list.size(); j++) {
						if (list.get(j).length() >= avg) { // 제거할 값이 평균보다 크다면 넘어감
							
							continue;
						} else { // 평균보다 작은 값이 삭제 그리고 추가
							list.remove(j);
							list.add(strArray[i]);
							count +=3;
							break;
						}
					}
				}
			}
			System.out.println(list.toString() + count);

		}
		System.out.println(count);

	}

	public static double average(List<String> list) {
		
		int answer = 0;
		for (int i = 0; i < list.size(); i++) {
			answer += list.get(i).length();
			
		}
		System.out.println(answer);
		return answer /(double) (list.size());
	}
}
