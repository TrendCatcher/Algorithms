package implementation;

import java.io.*;
import java.util.*;

class boj_10811{
    static int a,b;
    static int []arr;

    //역순 구현부 (1<=i,j<N)
    static void reverse(int []arr, int a, int b){
        while(a<b){
            int tmp = arr[a];
            arr[a++] = arr[b];
            arr[b--] = tmp;
        }
    }

    public static void main(String[]args)throws IOException{    //입력부
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        arr = new int[N];    //배열 크기 선언

        //arr 1~N으로 초기화
        for(int i=0; i<arr.length;i++){
            arr[i] = i+1;
        }

        for(int i=0; i<M;i++){    // M의 개수만큼 역순으로 바꾸자하는 범위 입력 받기
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            reverse(arr,a-1,b-1);    //역순 구현 함수 호출
        }
        for(int num: arr){    //[배열 출력부] for-each문을 통한 arr내 모든 배열을 공백단위로
            System.out.print(num+" ");
        }
    }//end of main
}//end of class
