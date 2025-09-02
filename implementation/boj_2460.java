package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_2460 {
    static StringTokenizer st;
    public static void main(String[]args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] in = new int[10];
        int[] out = new int[10];

        int total=0;
        int max=0;

        for(int i=0;i<10;i++){
            st = new StringTokenizer(br.readLine(), " ");
            out[i] =Integer.parseInt(st.nextToken());
            in[i] =Integer.parseInt(st.nextToken());
            total = total+ (in[i] - out[i]);
            max = Math.max(max, total);
        }
        System.out.println(max);
    }
}

