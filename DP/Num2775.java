package DP;
/*
* [문제]
* a층의 b호에 살려면 자신의 아래(a-1)층의 1호부터 b호 까지
*  사람들의 수의 합만큼 사람들을 데려와 살아야한다.
*
* [입력]
*첫 줄: TC T가 주어짐
*
* [출력]
* */
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
 class Num2775 {
     int [][] residents = new int[15][15];

       void solution() throws IOException{
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         int T = Integer.parseInt(br.readLine());
         StringBuilder sb = new StringBuilder();

        for(int i=1;i<=14;i++){          // base case
            residents[0][i] = i;        // 0층의 i호에는 i명이 산다. (initialization)
        }
        for(int i =1; i<=14; i++){
            for(int j=1;j<=14;j++)
                residents[i][j] = residents[i-1][j]+ residents[i][j-1];
        }
        // recurrence(1층 이상인 경우)

         for(int i=0;i<T;i++){
             int k = Integer.parseInt(br.readLine());
             int n = Integer.parseInt(br.readLine());
             sb.append(residents[k][n]).append('\n');
         }
           System.out.println(sb);
    }
    public static void main(String[]args) throws IOException{
        new Num2775().solution();
    }
}
