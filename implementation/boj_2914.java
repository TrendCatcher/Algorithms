package implementation;

import java.io.*;
import java.util.*;
class boj_2914 {
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int I = Integer.parseInt(st.nextToken());

        //result / A = I
        System.out.println(A*(I-1)+1);
    }
}
