package implementation;

import java.io.*;
import java.util.*;

class boj_1357{
    static StringTokenizer st;
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        String a = st.nextToken();
        String b = st.nextToken();

        StringBuilder sb1 = new StringBuilder(a);
        int reversedA = Integer.parseInt(sb1.reverse().toString());
        StringBuilder sb2 = new StringBuilder(b);
        int reversedB = Integer.parseInt(sb2.reverse().toString());

        int sum = reversedA + reversedB;

        StringBuilder sb3 = new StringBuilder(sum+"");
        int result = Integer.parseInt(sb3.reverse().toString());
        System.out.println(result);
    }
}
