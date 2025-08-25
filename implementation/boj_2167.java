package implementation;
import java.io.*;
import java.util.*;

class boj_2167{

    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] arr = new int[N+1][M+1];
        for(int i=1;i<=N;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=1;j<=M;j++){
                arr[i][j] =Integer.parseInt(st.nextToken());
            }
        }
        int count = Integer.parseInt(br.readLine());
        for(int i=0;i<count;i++){   //부분합 구하기: 우선 열기준으로 먼저 더하기가 이루어진다.

        }
    }
}