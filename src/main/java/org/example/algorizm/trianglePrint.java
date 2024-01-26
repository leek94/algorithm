package org.example.algorizm;

import java.util.Scanner;

public class trianglePrint {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        for(int i = 0; i < n; i++){
//            for(int j = 0; j < i+1; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

        for(int i=1; i<=n; i++){
        System.out.println("*".repeat(i));
    }
}

}
