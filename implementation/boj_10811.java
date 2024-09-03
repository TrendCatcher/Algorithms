package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_10811 {
    static Integer[] arr;
    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        arr = new Integer[N];
        //1부터 N번까지 배열 생성

        for(int i=0; i<arr.length;i++){
            arr[i] = i + 1;
        }
        //M번 만큼 범위 입력받기 + 입력받고 뒤집는 함수 reverse호출 (M번 수행)
        for(int i=0;i<M;i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            reverse(arr ,a-1, b-1);
        }

//        for(int i=0; i< arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }
        //for - each 문
        for(int num :arr){
            System.out.print(num +" ");
        }
    }

     static void reverse(Integer []arr, int a, int b) {

        while(a<b) {
            int tmp = arr[b];
            arr[b--] = arr[a];
            arr[a++] = tmp;
        }
    }

}
