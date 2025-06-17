package DP;

import java.io.*;
import java.util.*;
//dp의 풀이법 >> memoization

public class boj_11659 {
    static int[] prefix;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N, M;
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        //1. 배열 정의 + 3.base case: prefix[i]는 i번째 까지의 합 > 이미 다 구해 놓는다.
        prefix = new int[N+1];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {  //prefix[1] = prefix[0] + 현재입력받는 원소
            prefix[i] = prefix[i - 1] + Integer.parseInt(st.nextToken());
        }
        StringBuilder sb = new StringBuilder();

        //2. 점화식 설정: 결과는 j번째까지의 합 - i-1번째 까지의 합이다.
        for (int i = 0; i < M; i++) {       //M은 100000  O(M)
            int result = 0;
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            result = prefix[b] - prefix[a - 1];
            sb.append(result).append("\n");
        }
        System.out.println(sb);
    }
}

