package org.example.algorithm.oneDaycoding.bronze3.day6;

import java.util.Scanner;

public class BOJ4153 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            if(x==0&&y==0&&z==0) break;
            boolean result = false;
            if(y<x&&z<x){
                if(x*x == y*y + z*z) result = true;
            }else if(x<y&&z<y){
                if(y*y == z*z + x*x) result = true;
            }else if(x<z&&y<z){
                if(z*z == y*y + x*x) result = true;
            }
            if(result) System.out.println("right");
            else System.out.println("wrong");
        }



    }
}
