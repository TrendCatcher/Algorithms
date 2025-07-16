package implementation;

import java.io.*;
import java.util.*;

class boj_11170{
    static StringTokenizer st;
    static int count_A;
    static int count_B;

    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int TC = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while(TC-->0){
            st = new StringTokenizer(br.readLine());
            int N= Integer.parseInt(st.nextToken());
            int M= Integer.parseInt(st.nextToken());

            int count = 0;

            for (int i = N; i <= M; i++) {
                String numStr = String.valueOf(i);
                for (char c : numStr.toCharArray()) {   //core logic!!
                    if(c=='0') count++;
                }
            }
            sb.append(count).append("\n");
        }//end of while
        System.out.println(sb);
    }//end of main
}//end of Class