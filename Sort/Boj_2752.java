package Sort;

import java.io.*;
import java.util.*;

class Boj_2752{
    static int[] arr;
    public static void main(String[]args)throws IOException{
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        arr = new int[3];

        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        for(int val : arr){
            sb.append(val).append(" ");
        }
        System.out.println(sb);
    }
}
