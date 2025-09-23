package implementation;
import java.io.*;
import java.util.*;
class boj_10804{
    static StringTokenizer st;
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[21];
        // 배열 1,2,3,,,20까지 초기화
        for(int i=1; i<21;i++){
            arr[i]=i;
        }

        for(int i=0;i<10;i++) { //TC
            st = new StringTokenizer(br.readLine(), " ");
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());
            //a부터 b까지 배열을 뗴어와서 서로 swap

            for(int j=0;j<=(b-a)/2;j++){    //구간을 절반만 순회
                int tmp = arr[a+j]; //a+j구간의 왼쪽에서 j번째 원소
                arr[a+j] = arr[b-j];//b-j구간의 오른쪽에서 j번쨰 원소
                arr[b-j] = tmp;
            }
        }
        //출력
        StringBuilder sb = new StringBuilder();
        for(int i:arr){
            if(i!=0) sb.append(i).append(" ");
        }
        System.out.println(sb.toString().trim());

    }//end of main
}//end of   class