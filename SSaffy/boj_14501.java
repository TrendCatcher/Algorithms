package SSaffy;

import java.io.*;
import java.util.*;

//요구사항 분석
//제약사항
//1. 상담을 한 날포함 소요일수 만큼 상담 불가 => 그리디로 모든 경우의 수? 부분합의 최대?=> DP
//2.greedy로 한다면, 입력받은 모든 날과 Ti에 대해서 최대의 경우를 계산(Math.max())

class boj_14501{
    static StringTokenizer st;

    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());    //날짜 입력받기

        //dp[i]: i일째 얻을 수 있는 최대 수익
        //dp[i-1]일까지의 최대수익 활용
        //1. dp[i]는 i-1일의 최대수익 dp[i-1]을 그대로 가져오거나
        // 2. i일째에 상담을 시작하는 경우
        //로 나뉜다.
    }
}