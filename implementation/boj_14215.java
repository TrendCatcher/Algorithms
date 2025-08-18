package implementation;
import java.io.*;
import java.util.*;

class boj_14215{
    static StringTokenizer st;
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[3];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<3;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        int result = arr[2] + arr[1] + arr[0];
        //[줄여야 하는 경우의 수]  //1. 가장 긴막대 = 나머지 막대의 합
        if(arr[2]>=(arr[1]+arr[0])){
            arr[2] = arr[1]+arr[0]-1;
            result = arr[2]+arr[1]+arr[0];
        }
        System.out.println(result);

        // 긴막대 = 나머지 막대의합 -1으로 초기화

    }
}