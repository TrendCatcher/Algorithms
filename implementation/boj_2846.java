package implementation;

import java.io.*;
import java.util.*;

class boj_2846{
    static int[] arr;
    static StringTokenizer st ;

    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//최대 오르막길크기 구하기 = 끝- 시작
        //계속 수열이 증가하면 다른 배열에 넣고 아니면 break;

//        int n  =Integer.parseInt(br.readLine());
//
//        int[] arr = new int[n];
//
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        for(int i=0;i<arr.length;i++){
//            arr[i] = Integer.parseInt(st.nextToken());
//        }
//
//        int max =0;
//        int start = arr[0];
//
//        for(int i=1;i<n;i++){
//            if(arr[i-1]<arr[i]){
//                max =Math.max(max,arr[i]-start);
//            }else{
//                start = arr[i];     //오르막 끝났으면 초기화
//            }
//        }   //end of for loop
//
//        System.out.println(max);
        int n = Integer.parseInt(br.readLine());
        arr = new int[n];
        st = new StringTokenizer(br.readLine());

        for(int i=0;i<n;i++){
            arr[i]=  Integer.parseInt(st.nextToken());
        }

        int max = 0;
        int start = arr[0];

        for(int i=1; i<arr.length;i++) {
            if(arr[i-1]<arr[i]){
                max = Math.max(max, arr[i] - start);
            }else{
                start = arr[i];//오르막길 끝나면 시작지점 초기화
            }
        }
        System.out.println(max);
    }
}
