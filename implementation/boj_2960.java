package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.Arrays;
//import java.util.StringTokenizer;
//
//public class boj_2960 {
//    static int[] arr;
//    static int count = 0;
//    public static void main(String[]args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//
//        //[input] N(2부터 N), K(particular num)
//        int N = Integer.parseInt(st.nextToken());
//        int K = Integer.parseInt(st.nextToken());
//
//        arr = new int[N - 1];
//
//        //fill array 2~N(정상 작동)
//        for(int i=0;i<arr.length;i++){
//            arr[i] = i+2;
//        }
//
//        //[배열 출력]
//        //Arrays.stream(arr).forEach(n -> System.out.print(" arrays " + n));
//
//        while(true) {
//            int min_num = 0;
//
//            for(int i=0;i<arr.length;i++) {
//                if (arr[i] != 0) {
//                    min_num = arr[i];   //0이 아닌 수중 최소값 설정
//                    break;
//                }
//            }
//
//            //min_num 배수 제거
//            for (int i = 0; i < arr.length; i++) {
//                if(arr[i]!=0) {
//                    if (arr[i] % min_num == 0) {
//                        count++;
//                        if (count == K) {
//                            System.out.println(arr[i]);
//                            return;
//                        }
//                        arr[i] = 0;
//                    }
//                }
//            }//end of for-loop
//        }//end of while
//    }//end of main
//}//end of class/**
/*
* review */
public class boj_2960{
    static int[] arr;
    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        arr = new int[N - 1];

        //fill array 2 through N
        for(int i=0 ;i<arr.length;i++){
            arr[i] = i + 2;
        }

        int count = 0;
        int min_num = 0;
        while(true) {
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                min_num = arr[i];
                break;
            }
        }


            for(int i = 0; i < arr.length; i++) {
                if (arr[i]!=0 ) {
                    if(arr[i] % min_num == 0) {//배수라면 삭제 (0으로 만듦)
                        count++;// 삭제 되는 수 count
                        if (count == K) {   //만약 K번째 수면 출력
                            System.out.println(arr[i]);
                            return;
                        }
                        arr[i] = 0;
                    }
                }
            }//end of for loop
        }//end of while lopop

    }//end of loop
}//end of class