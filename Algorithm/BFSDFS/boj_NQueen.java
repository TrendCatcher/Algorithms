package Algorithm.BFSDFS;
/*문제핵심*/
/*1. 재귀호출을 어떻게 할 것이냐.
2. 퀸을 놓을 수 있는지 여부를 어떻게 판별? */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_NQueen {
    static int[] arr;
    static int N;
    static int count =0;

    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];

        nQueen(0);
        System.out.println(count);
    }
    //1.재귀 함수 부분
    static void nQueen(int depth) {
        if(depth == N){
            count++;
            return;
        }
        for(int i=0; i<N;i++){
            arr[depth] = i;
            //Possibility() 해당열에서 i번째 행에 놓을 수 있는지를 검사
            if(Possibility(depth)){
                nQueen(depth+1);
            }
        }
    }
    // 행: 원소값
    // 열: index
    static boolean Possibility(int col){
        for(int i=0; i<col;i++){
            //해당열의 행과 i열의 행이 일치할 경우
            if(arr[col] == arr[i]){
                return false;
            }
            //같은 대각선에 있는 경우(행의차와 열의 차가 같음 >> 약간의 암기(?))
            else if (Math.abs(col - i)==Math.abs(arr[col]-arr[i])){
                return false;
            }
        }
        return true;
    }
}
