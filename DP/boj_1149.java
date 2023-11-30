package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


//RGB거리
public class boj_1149 {
    static int [][] arr;
    static int [][] dp; // dp[i][0]: i번째까지 칠한곳의 최솟값 (단, 한재는 R)

    static int min;

    public static void main(String[]args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        arr = new int[N][3];
        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
<<<<<<< HEAD
            arr[i][0] = Integer.parseInt(st.nextToken());   // i번째 집의 빨간색의 값
            arr[i][1] = Integer.parseInt(st.nextToken());   // i번째 집의 초록색의 값
            arr[i][2] = Integer.parseInt(st.nextToken());   // i번째 집의 파란색의 값
=======
             arr[i][0] = Integer.parseInt(st.nextToken());   // i번째 집의 빨간색의 값
             arr[i][1] = Integer.parseInt(st.nextToken());   // i번째 집의 초록색의 값
             arr[i][2] = Integer.parseInt(st.nextToken());   // i번째 집의 파란색의 값
>>>>>>> 4bc17fe0cd9ac1b8133c440546ac94469ac69509

        }
        /*1. 테이블 정의*/
        dp = new int [N][3];
        /*3. 초기값 설정*/
        dp[0][0]= arr[0][0];
        dp[0][1]= arr[0][1];
        dp[0][2]= arr[0][2];

        /*2. 점화식 찾기*/
        for(int i=1;i<N;i++){
            dp[i][0] = Math.min(dp[i - 1][1], dp[i - 1][2]) + arr[i][0];
            dp[i][1] = Math.min(dp[i - 1][0], dp[i - 1][2]) + arr[i][1];
            dp[i][2] = Math.min(dp[i - 1][0], dp[i - 1][1]) + arr[i][2];
            min = dp[i][0];
            for(int j=1; j<=2; j++){
                if(min > dp[i][j]) min = dp[i][j];
            }
        }
        System.out.println(min);

//    특정 칸에 왔을 때 그 칸까지의 최솟값이 있다고 가정, 현재의 최솟값(최소비용의 색깔)을 더하면
//    특정 칸 까지의 최소비용 완성
//    예시) dp[i][0] = min(dp[i-1][1],dp[i-1][2])+ arr[i][0];

    }

}
