package implementation;

import java.io.*;
import java.util.*;

class boj_1236{
    static char[][] arr;
    static StringTokenizer st;
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        arr = new char[N][M];
        for(int i=0 ;i<N;i++){  //입력이 정확히 M개의 열이라 가정
            arr[i] = br.readLine().toCharArray();
        }

        int needRow = 0;
        for(int i=0; i<N;i++){
            boolean guard = false;      //일단 false처리를 한다.
            for(int j=0;j<M;j++){
                if (arr[i][j] == 'X') {
                    guard = true;
                    break;
                }
            }
            if(!guard)  needRow++;
        }

        int needCol=0;

        for(int j=0;j<M;j++){
            boolean guard = false;
            for(int i=0; i<N;i++){
                if(arr[i][j]=='X'){
                    guard = true;
                    break;
                }
            }
            if(!guard)  needCol++;
        }
        int answer = Math.max(needRow, needCol);

        System.out.println(answer);


    }//end of main

}//end of class
/*
1. 만약 열에는 있고? 행에는 없다면 그 반대는 어떻게 처리?
    >> 행조사, 열 조사해서 둘다 있으면 pass
    >> 열에만 없으면
    >> 행에만 없으면
* */