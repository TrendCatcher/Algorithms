package DP;
    //가장 긴 감소하는 부분수열

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class boj_11722 {
    static int [] arr;
    static int [] dp;
    static int N;   //(1<=N<=10000>)
    static int max=0;
     public static void main(String[]args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         StringTokenizer st;
         //[input]
         N = Integer.parseInt(br.readLine());
         arr = new int [N];
         st = new StringTokenizer(br.readLine(), " ");
         for(int i=0; i<N; i++){
             arr[i] = Integer.parseInt(st.nextToken());
             dp[i] = 1;     //3. 초기값설정
         }

        // 1. 테이블 설정
         dp =  new int [N];   // dp[i]를 원소 i번째까지 최장 감소 부분수열의 개수로 정의
         //2. 점화식 설정
        for(int i=1;i<N;i++){
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[i]) { // 감소하는 조건
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
         // 가장 긴 감소하는 부분 수열 찾았으면 [그 배열의 개수 출력] !!!
         int max = 0;
         for (int i = 0; i < N; i++) {
             max = Math.max(max, dp[i]);
         }
         System.out.println(max);
    }
}
