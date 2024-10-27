package org.example.algorithm.oneDaycoding.bronze4;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ15552버퍼사용 {
    public static void main(String[] args) throws IOException {


        //버퍼드 리더, 라이터
//        Scanner sc = new Scanner(System.in);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            //System.out.println(a+b);
            bw.write(a+b+"\n");
        }

//        bw.flush();
        bw.close(); // 내부적으로 flush가 작동함
    }



}
