package org.example.oneDaycoding.bronze4.day11;

import java.util.Scanner;

public class BOJ1264모음세기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String text = sc.nextLine();
            if(text.equals('#')) break;
            char[] textarr = text.toCharArray();
            int count = 0;
            for (int i = 0; i < textarr.length; i++) {
                if(textarr[i]=='a'||textarr[i]=='e'||textarr[i]=='i'||textarr[i]=='o'||textarr[i]=='u'
                ||textarr[i]=='A'||textarr[i]=='E'||textarr[i]=='I'||textarr[i]=='O'||textarr[i]=='U'){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
