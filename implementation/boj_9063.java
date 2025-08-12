package implementation;
import java.io.*;
import java.util.*;

public class boj_9063 {
    static StringTokenizer st;
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        //x좌표,y좌표 배열 sort 가장 낮고 높은 것의 차
        //x좌표,y좌표 배열
        int[] arrX = new int[N];
        int[] arrY = new int[N];

        for(int i=0;i<N;i++) {
            st = new StringTokenizer(br.readLine());
            arrX[i] = Integer.parseInt(st.nextToken());
            arrY[i] = Integer.parseInt(st.nextToken());
        }
        //오름차순 정렬
        Arrays.sort(arrX);
        Arrays.sort(arrY);
        int result;
        if(N==1){
            result = 0;
        }else{
            result = (arrX[N - 1] - arrX[0]) * (arrY[N - 1] - arrY[0]);
        }
        System.out.println(result);
    }
}
