package Array;
import java.io.*;
import java.util.*;

class Boj_1546{
    static int [] score;
    static int max=-1;
    static double sum=0.0;
    static StringTokenizer st;
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N= Integer.parseInt(br.readLine());//과목개수 입력받기
        score = new int[N];
        st = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<N;i++){    //과목 점수 입력받기
            score[i] = Integer.parseInt(st.nextToken());
            if(score[i]>max)
                max = score[i];
            sum+=score[i];
        }



        System.out.println((sum/max*100)/N);
    }
}
