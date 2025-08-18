package DP;
import java.io.*;

//제한시간 0.5초
//[요구사항 1] 주어진 수를 1로 만드는 최소 횟수를 구한다.
//[요구사항 2] 1로 만드는 과정을 추적한다.

//[풀이법]
    // 처음에는 전반적인 풀이의 흐름만 잡기
    // 세부적인 것은 나중에

public class boj_12852 {
    static int[] dp;
    static int[] prefix;
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());

        //bottom-up방식으로 시간 복잡도가 O(X)가 되게
//        dp[i]를 정의 => i를 1로 만드는 최소 횟수
        dp = new int[X + 1];
        prefix = new int[X + 1];    //수정된 수를 저장할 배열 ex) 연산 수행후 수 저장
        dp[1]=0;
        //option1: minus 1
        //option1: divide with 2
        //option1: divide with 3
        for(int i=2;i<=X;i++){
            dp[i] = dp[i-1]+1;  //[key point] 2 이상의 모든 수에 대해서는  -1 연산을 할 수 있다.
            prefix[i] = i-1;
            if(i%2==0&&dp[i/2]+1<dp[i]){    //-1을 빼는 연산보다 /2연산이 횟수가 더 적으면 해당 연산으로 교체
                dp[i] = dp[i/2]+1;
                prefix[i] = i / 2;
            }
            if(i%3==0&&dp[i/3]+1<dp[i]){    //-1을 빼는 연산보다 /3연산이 횟수가 더 적으면 해당 연산으로 교체
                dp[i] = dp[i/3]+1;
                prefix[i] = i / 3;
            }
        }

        StringBuilder sb = new StringBuilder();
        System.out.println(dp[X]);
        sb.append(X);
        while(X>0){
            if(X==1)
                break;
            sb.append(" ").append(prefix[X]);
            X = prefix[X];  // X초기화
        }
//prefix[2] = 1, prefix[3] = 1, prefix[4] = 2
        //[output 1] 최소횟수 저장
        //[output 2] 1이 되는 과정 tracking
        System.out.println(sb);
    }//end of main
}//end of class
//시간 복잡도: dp배열을 채우는 연산: X번 반복, i에 따라 처리하는 연산 3가지는 상수시간(O(1))에 처리됨
//공간 복잡도: dp, prefix2가지 배열 사용됨 O(X)
