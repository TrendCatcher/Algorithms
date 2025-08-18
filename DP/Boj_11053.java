package DP;

/*수열을 입력받고
1.첫번째 요소를 스택에 넣음
2-1. 만약 다음 수열이 앞의 수열보다 크다면 다음 수열을 stack에 넣음
2-2. 다음 수열이 앞의 수열보다 작다면 stack에 넣지 않음
3. 현재 스택에 있는 원소의 가장 윗부분이 큰 수이므로 그것보다 크면 계속 스택에 넣고
4. 스택의 크기출력*/
// 근데 수열의 가장 첫원소가 LIS의 답이 될수 없다.
// 결국> 수열의 길이만큼 무차별 탐색!!
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import java.util.StringTokenizer;

class Boj_11053{
    static int arr[];
    static int result = 0;
    static int LIS(int arr[]) {
        /*dp table을 구하는 과정*/
        int[] dp = new int[arr.length];
        Arrays.fill(dp, 1);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i])   //만약 전의 원소가 더 크다면
                    dp[i] = Math.max(dp[i], dp[j] + 1);     //계속 dp[i]의 값을 갱신해 나간다!!
                //dp[i] = dp[j] + 1;가 안되는 이유는 단순히 arr[j]<arr[i] 일때만 dp[i]값을 갱신하므로 값을 잃어버릴 수 있다.
            }
        }
        /*dp테이블중 가장 큰값(LIS의 가장 큰 값, 즉, 정답)을 구하는 과정*/
        int res =0;     //LIS가 존재하지 않을 가능성 염두, res=1;보다 안전한 코드
        for(int i=0;i< dp.length;i++){
            res = Math.max(res, dp[i]);
        }
        return res;
    }
    public static void main(String[]args)throws IOException {

        //배열 입력부
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        arr = new int[N];// 배열크기 지정

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<N;i++) {      //배열 한칸 띄어 입력 받기
            arr[i] = Integer.parseInt(st.nextToken());
        }
        result = LIS(arr);
        System.out.println(result);
    }
}

/*다시풀기*/
// dp[i] 배열의 정의
// arr[i]로 끝나는 LIS
// 이 정의에 따르면 최종 결과는 dp배열의 최댓값이 되어야 함
//res = 0;
//for(int i=0;i<N;i++){
//    res = Math.max(res,dp[i])
//        return res;
//        }
// dp[1]=1 >> base case

