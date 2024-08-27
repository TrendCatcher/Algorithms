package DP;

import java.io.*;
import java.util.Arrays;

class boj_11726_fixed{
    static int memo[];
    static int box(int N){
        if(N==0) return 0;
        memo = new int[N+1];
        Arrays.fill(memo,0);
        //메모를 갖는 재귀
        return helper(memo,N);
    }

    static int helper(int [] memo, int n){
        //base case
        if (n==0) return 0;
        if(n==1) return 1;
        if(n==2) return 2;
        //상태전이 방정식
        if (memo[n] !=0) return memo[n];
        memo[n] = (helper(memo,n-1)+helper(memo,n-2))%10007;
        return memo[n];
    }
    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n1 = Integer.parseInt(br.readLine());
        System.out.println(box(n1));
    }
}
