package DP;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.lang.Math;

 class Boj2579 {
     static int stairs[];
     static int n;
     static int dp[][];

    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        // 1. 테이블 설정, 크기 배분
        stairs = new int [301];     // 계단의 개수는 300이하
        dp = new int [301][3];      // 배열 정의: 현재까지 j개의 계단을 연속해서 밟고 i번째 계단까지 올라섰을 때 점수의 합의 최댓값

        for(int i=1; i<=n; i++){
            stairs[i] = Integer.parseInt(br.readLine());
        }
        //3. 초기값 설정
        dp[1][1] = stairs[1];
        dp[1][2] = 0;
        dp[2][1] = stairs[2];
        dp[2][2] = stairs[1]+stairs[2];
        // 2. 점화식 설정
        for(int i = 3; i <= n; i++){
            dp[i][1] = Math.max(dp[i-2][2], dp[i-2][1]) + stairs[i];
            dp[i][2] = dp[i-1][1] +stairs[i];
        }
        System.out.println(Math.max(dp[n][1], dp[n][2]));
    }

}
