package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.Arrays;
import java.util.StringTokenizer;

//연속합
//입력: N개의 정수 수열
//출력: 연속된 수를 선택해서 구할 수 있는 쵀대합
//dp[i]정의 : nums[i]까지 수중 선택할수 있는 연속된 쵀대의 정수의 합
public class boj_1912 {
    static int dp[];
    static int num[];
    static StringTokenizer st;

    public static void main(String[]args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        num = new int[N];
        st = new StringTokenizer(br.readLine(), " ");

        for(int i=0; i<N;i++){
            num[i] = Integer.parseInt(st.nextToken());
        }

        /*dp[i]정의 : nums[i]까지 연속된 정수의 최대합, 따라서 1. dp[i-1]+num[i]와 새로운 부분배열 2. num[i] 둘의 값을 비교해야함 */

        dp = new int[N];
        //상태전이 방정식
        //base case
        Arrays.fill(dp, num[0]);

        //dp[i]를 구하는 방법은 1.dp[i-1]과 num[i]를 포함한 그 전까지의 모든 수열의 조헙으로 만들수 있는 수중 가장 큰수중 큰값.
        for(int i=1 ;i<N;i++){
            dp[i] = Math.max(dp[i-1]+num[i], num[i]);   //dp[i-1]을 통해 이미 i-1전까지의 연속된 수의 최대값을 구했으므로 현재 인덱스인 num[i]를 더한것과 새로운 subArray num[i]중 큰수만 비교
        }

        //생성한 dp 배열중 최대값 = 정답
        int res =num[0];

        for(int i=0; i<dp.length;i++){
            res = Math.max(res, dp[i]);
        }
        System.out.println(res);

    }
}
