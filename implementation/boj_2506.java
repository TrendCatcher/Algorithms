package implementation;

import java.io.*;
import java.util.StringTokenizer;

class boj_2506{
    static StringTokenizer st;

    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] pro = new int[N];
        int[] sum = new int[N];

        st = new StringTokenizer(br.readLine()," ");
        for(int i=0;i<N;i++){
            pro[i] = Integer.parseInt(st.nextToken());
        }

        sum[0] = pro[0];//첫 문제만 값지정

        for(int i=1;i<N;i++){
            if(pro[i]==0){  //문제 틀렸으면 그 문제 획득점수는 0
                sum[i] = 0;
            }else{  //맞혔으면
                if(pro[i-1]==1){    //이전 문제 맞혔으면 누적 count
                    sum[i] = sum[i-1]+1;
                }else{
                    sum[i]=1;//기본적으로는 1
                }
            }
        }
        int result=0;
        for(int i=0;i<N;i++){
            result += sum[i];
        }
        System.out.println(result);
    }//end of main
}//end of class
