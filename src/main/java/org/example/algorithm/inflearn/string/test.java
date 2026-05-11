package org.example.algorithm.inflearn.string;

public class test { // 관례상 클래스 첫 글자는 대문자로 씁니다.
    public static void main(String[] args) {
        // 이제 main 밖에서 정의된 static 메서드를 호출할 수 있습니다.
        System.out.println(fibo(5));
    }

    // 1. main 메서드 밖으로 이동
    // 2. static 추가 (main에서 바로 쓰기 위함)
    public static int fibo(int n) {
        if(n <= 1) return n;
        return fibo(n-1) + fibo(n-2);
    }
}