package SamsungCodingTest;

import java.util.*;
import java.io.*;


class Rich_Project_fail
{
    public static void main(String args[]) throws IOException
    {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T;
        T=Integer.parseInt(br.readLine());


        for(int test_case = 1; test_case <= T; test_case++)
        {
            int count = Integer.parseInt(br.readLine());	//각 TC별 숫자 개수 입력 받기
            int nums[] =new int[count];



            for(int i=0; i<count; i++){		// 입력받은 숫자만큼 수 입력받기
                StringTokenizer st = new StringTokenizer(br.readLine(), " ");
                nums[i] = Integer.parseInt(st.nextToken());
            }
            long max = Long.MIN_VALUE;	//long 데이터 타입이 표현할 수 있는 가장 작은 숫자
            int num=0;
            long cost =0L;		// 구매가
            long result =0L;	// 최종
            for(int i = nums.length-1; i>=0;i--){
                if(nums[i]> max){
                    result += (max*num - cost);
                    max = nums[i];
                    //초기화
                    cost =0;
                    num =0;
                }else{
                    cost += nums[i];
                    num++;
                }
            }
            result += (max*num-cost);


            System.out.println("#"+test_case+" "+result);

        }
    }
}
