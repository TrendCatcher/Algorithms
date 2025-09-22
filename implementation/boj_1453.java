package implementation;
import java.io.*;
import java.util.*;

class boj_1453{
    static StringTokenizer st;

    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] pc = new int[100];
        //logic
        //100번까지 배열 만들고 들어오는 숫자에 대한 index ++ ,
        //만약 해당 인덱스 1이라면 COUNT++, count출력

        //input

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<num;i++){
            int per = Integer.parseInt(st.nextToken());
            pc[per]++;
        }
        int count =0;
        for(int i=0;i<101;i++){
            if(pc[i]>1){
                count+=pc[i]-1;
            }
        }
        System.out.println(count);
    }//end of main
}//end of class