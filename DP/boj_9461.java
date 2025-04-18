package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_9461 {
    static long[] p;
    public static void main(String[] args) throws IOException {
        /*
        * p1
        * p2
        * p3
        * p4  = P3 + P1
        * p5  = P4
        * p6  = p5 + P3
        * p7  = P6 + P2
        * P8  = P7 + P1
        * [PN = PN-1 + PN-5 ] 시작
        * P9  = P8 + P4
        * P10  = P9 + P5
        * P11  = P10 + P6
        * P12 = P11 + P7
        * */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int test_case = Integer.parseInt(br.readLine());

        //2. 하위 문제 저장 배열
        p = new long[101]; // 1<=N<=100

        //1. 초기값 설정
        p[1] = p[2] = p[3] = 1L;

        //3. memoization
        for(int i=4;i<101;i++){
            p[i] = p[i - 2] + p[i - 3];
        }

        for(int i=0; i<test_case;i++){
            int num = Integer.parseInt(br.readLine());
            sb.append(p[num]).append("\n");
        }
        System.out.println(sb);

    }
}
