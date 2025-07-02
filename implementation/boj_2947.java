package implementation;

import java.io.*;
import java.util.*;
class boj_2947{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[5];
        //input
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<5;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        StringBuilder sb = new StringBuilder();

        //logic
        while(true) {
            boolean check = false;
            for (int i = 0; i < 4; i++) {
                if (arr[i] > arr[i + 1]) {    //swap조건 맞을 때만 swap
                    int tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                    check = true;
                    //output
                    for (int j = 0; j < 4; j++) {
                        sb.append(arr[j]).append(" ");
                    }
                    sb.append(arr[4]).append("\n");
                }
            }
            if(!check)  break;
        }
        System.out.println(sb);
    }
}
