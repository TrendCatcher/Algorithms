package implementation;

import java.io.*;
class boj_17608{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] stick = new int[N];
        for(int i=0;i<N;i++){
            stick[i] = Integer.parseInt(br.readLine());
        }
        int max = stick[N-1];
        int count=1;

        for(int i=N-1;i>=0;i--){
            if(stick[i]>max){
                max = stick[i]; //취댓값 초기화
                count++;
            }
        }
        System.out.println(count);
    }
}