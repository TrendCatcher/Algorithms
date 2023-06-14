package Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
* N*M 크기의 두행렬이 주어졌을 때,  두 행렬을 더하는 프로그램 작성하기
*
* [입력]
* 1. 첫줄 행렬의 크기 N,M이 주어짐
* 2  둘째 줄: N개의 줄에 행렬 A의 원소 M개가 차례대로 주어짐,
* 3. 이어서 N개의 줄에 행렬 B의 원소가 주어짐
* N&M은 100보다 작거나 같고 행렬의 원소는 절댓값이 100보다 같은 정수이다.
*
* >> N행이 주어지면 그만큼의 M행렬의 크기만큼 입력받고 vice versa....
*
* [고민]
* N,M을 입력받는다 하더라도 어떻게 다음 입력을 받을수 있을까?
* 일단 N,M을 입력받고
*
* sol> reference to 김씨의 코딩 이야기
*
*
* */
import java.io.*;
import java.util.StringTokenizer;

public class Num2738 {
    public void solve()throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        /*
        * <<StringTokenizer클래스>>는 문자열을 지정한 구분자로 쪼개주는 역할임.
        * 토큰: 쪼개진 문자열
        *생성자:
        *   1. public StringTokenizer(String str); :
        *       - 전달된 매개변수str을 기본 default delim으로 분리
        *       - 기본 delimiter는 공뱁 문자인 "\t\n\r"이다.
        *   2. public StringTokenizer(String str, String delim);
        *       - 특정 delim으로 문자열을 분리합니다.
        *   3. public StringTokenizer(String str, String delim,boolean returnDelims);
        *       - str을 특정 delim으로 분리
        *       - 해당 delim까지 토큰으로 분리할지 결정
        *       - returnDelims가 true: 포함, false: 미포함
        *
        * <<nextToken()>>은 StringTokenizer에서 다음 토큰을 불러오는 메서드임.

        * */
        int n = Integer.parseInt(st.nextToken());
        int m =Integer.parseInt(st.nextToken());

        int [][] numArr = new int [n][m];   // 배열 선언

        for(int i=0; i<2;i++) {     // 2이 행렬을 입력받기
            for(int j=0;j<n;j++){   //n개의 행렬을 읽음
                st = new StringTokenizer(br.readLine());    //n번쨰 줄의 m번째 열
                for(int k=0; k<m; k++){                     // B번째
                    numArr[j][k] += Integer.parseInt(st.nextToken());
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++){
            for(int j=0;j<m;j++){
                sb.append("\n");
            }
            System.out.println(sb.toString());
        }
    }
    public static void main(String[]args) throws IOException{
        new Num2738().solve();
    }
}
