package implementation;

import java.io.*;
import java.util.*;

class boj_14501{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N= Integer.parseInt(br.readLine());

        //[input] N(일), 상담을 완료하는데 걸리는 기간 T, 상담을 했을 때 받을 수 있는 금액 Pi

        //상담을 할 수 있는 날은 N까지 넘어가면 상담 불가하다.
        //최대 수입이 가능한 선택지를 골라야한다.
        // 상담한 날 카운트는 시작일부터 카운트한다.

        //일단 그리디로 첫번째 날짜부터 끝까지 하면 되지 않을까..? >> 시간 복잡도 최악O(N*N)
        //그러나 N은 1이상 15이하이미로 ㄱㅊ

        //그럼 결과를 어떠게 비교/저장?
        //비교-> 일단 1모든 결과를 저장
            //단, N일 넘어가면 안되는 로직 포함

        int[] T = new int[N];    //일자 배열
        int[] P = new int[N];    // 금액 배열
        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            T[i] = Integer.parseInt(st.nextToken());
            P[i] = Integer.parseInt(st.nextToken());
        }

        int[] sum = new int[N];   // 1일차부터 그리디로 각 시작 날짜에 대한 값 저장 저장
        //[비교 로직]
        for(int i=0;i<N;i++){
            while(T[i]<N){
                sum[i] = P[i];
                T[i] = T[i + T[i]]; //다 더했으면 다음 일자로 jump
                P[i] = P[i + T[i]];//금액도 갱신
            }
        }
        int result = 0;

        for (int i =0;i<sum.length-1;i++) {
            result = Math.max(sum[i],sum[i+1]);
        }
        System.out.println(result);
    }//end of main
}