package DP;

import java.io.*;
public class Num24416 {
    private static int cnt1;
    private static int cnt2;
    static int memo [];
    static int fibo1(int n){
        if(n ==1 || n==2){
            cnt1++;
            return 1;
        }
        return fibo1(n-1)+fibo1(n-2);
    }
    static int fibo2(int n){
        memo[1] = 1;
        memo[2] = 2;
        for(int i=3;i<=n;i++){
            cnt2++;
            memo[i] =memo[i-1] + memo[i-2];
        }
        return memo[n];
    }
    static void solution() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        memo = new int [n+1];
        fibo1(n);
        fibo2(n);
        System.out.println(cnt1);
        System.out.println(cnt2);
    }
    public static void main(String[]args) throws IOException{
        new Num24416().solution();
    }
}
