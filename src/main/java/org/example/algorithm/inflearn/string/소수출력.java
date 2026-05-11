package org.example.algorithm.inflearn.string;

public class 소수출력 {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            boolean isPrime = true;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) { isPrime = false; break; }
            }
            if (isPrime) System.out.print(i + " ");
        }
    }
}
