package implementation;

import java.io.*;
class boj_2576{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int sum=0;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<7;i++){
            int N = Integer.parseInt(br.readLine());
            if(N%2!=0){
                min = Math.min(min, N);
                sum+=N;
            }
        }
        if(sum==0){ //홀수 없으면 -1출력
            sb.append(-1);
        }else{  //아니면 정답 출력
            sb.append(sum).append("\n").append(min);
        }

        System.out.println(sb);
    }
}