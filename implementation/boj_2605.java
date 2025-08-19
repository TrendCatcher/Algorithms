package implementation;

import java.util.*;
import java.io.*;

class boj_2605{
    static StringTokenizer st;
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());    //학생수

        LinkedList<Integer> list = new LinkedList<>();

        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){//학생이 뽑은 번호표
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for(int i=0;i<N;i++) {
            list.add(i-arr[i], i + 1);  //핵심아이디어!!
        }
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<N;i++){
            sb.append(list.get(i)).append(" ");
        }
        System.out.println(sb);
    }
}