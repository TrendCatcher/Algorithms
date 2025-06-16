package DP;

import java.io.*;
import java.util.*;


public class boj_11659 {
    static int[] prefix;
    static StringTokenizer st;
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N,M;
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());


        st = new StringTokenizer(br.readLine());
        /*[핵심] 구간합을 미리 구한다!!*/
        prefix = new int[N+1];
        for(int i=1;i<=N;i++){
            prefix[i] = prefix[i-1]+Integer.parseInt(st.nextToken());
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            int sum=0;
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            sum = prefix[b] - prefix[a-1];
            sb.append(sum).append("\n");
        }
        System.out.println(sb);
    }

}

