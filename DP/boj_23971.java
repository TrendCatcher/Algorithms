package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_23971 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int H = Integer.parseInt(st.nextToken());   //행
        int W = Integer.parseInt(st.nextToken());   //열
        int N = Integer.parseInt(st.nextToken());   //세로, N+1칸마다 하나씩 설치 가능
        int M = Integer.parseInt(st.nextToken());   //가로, M+1칸마다


        int row = (int)Math.ceil((double)H / (N + 1));
        int col = (int)Math.ceil((double)W / (M + 1));

        /*정수 나눗셈 올림 방법*/
        // 방법 1: Math.ceil() -> double 반환  + (int) 캐스팅
        //방법 2: 나눗셈 올림 공식
        System.out.println(row * col);
    }

}
