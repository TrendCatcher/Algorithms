package DP;
/*[DP]
1. 테이블 설정
2. 점화식 찾기
3. 초기값 설정*/
import java.io.*;
import java.util.StringTokenizer;

public class boj_1932 {

    static StringTokenizer st;
    static int triangle[][];
    static void BFS(int triangle[][]){
        int dp[] = new int[triangle.length]; //dp정의: dp[i]는 triangle의 i번째 행까지의 최대 합
        //base case
        dp[0] = triangle[0][0];


    }
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        triangle = new int [N][];   // triangle의 행의 개수는 입력받은 정수의 개수

        for(int i=0 ;i<N;i++){
            st = new StringTokenizer(br.readLine(), " ");
            int len = st.countTokens();
            triangle[i] = new int[len];     //triangle의 각 행에 " "단위로 들어갈 수 있는 숫자는 입력받은 숫자의 개수(len)

            for(int j=0; j<len;j++){
                triangle[i][j] = Integer.parseInt(st.nextToken());
            }
        }

//output test
        for(int i=0; i<N;i++){
            for(int j=0;j< triangle[i].length;j++){
                sb.append(triangle[i][j]).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}

