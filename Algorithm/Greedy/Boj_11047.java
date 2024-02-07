package Algorithm.Greedy;

import java.io.*;
import java.util.*;

public class Boj_11047 {
    // 입력 받을 변수 선언
    static int n,k;
    static int [] coins;
    static int mincount = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        // 동전 가지 수 , 총합 k 입력받기
        n= Integer.parseInt(st.nextToken());
        k= Integer.parseInt(st.nextToken());
        //동전 종류만큼 단위 입력 받기
        coins =new int [n];
        for(int i=0; i<n;i++){
            coins[i] = Integer.parseInt(br.readLine());
        }
        // 입력받은 coins 배열 내의 값들을 하나 하나 꺼내보면서 총합k 값에 나눈뒤 몫을 mincount에 저장
        for(int i=n-1; i>=0; i--){
            mincount+=(k/coins[i]);// mincount+=(k/val);
            k = k % coins[i];        // k값 초기화
        }
//        for(int val: coins){
//            mincount+=(k/val);// mincount+=(k/val);
//            k = k % val;        // k값 초기화
//        }
        System.out.println(mincount);
    }

}
