package implementation;

import java.io.*;
import java.util.*;

class boj_2455{
    static StringTokenizer st;
    static int[] out;
    static int[] in;
    static int[] present;
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        out = new int[4];
        in = new int[4];
        present = new int[4];

        int presentPeople=0;

        for(int i=0;i<4;i++){
            st = new StringTokenizer(br.readLine());
            out[i] =Integer.parseInt(st.nextToken());
            in[i] = Integer.parseInt(st.nextToken());
            presentPeople += in[i] - out[i];
            present[i] = presentPeople;
        }
        int max =0;
        for (int i = 0; i < 4; i++) {
            max = Math.max(max, present[i]);
        }
        System.out.println(max);
    }
}