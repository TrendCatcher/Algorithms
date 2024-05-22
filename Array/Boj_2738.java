package Array;
import java.io.*;
import java.util.*;
class Boj_2738{
    static int arr1 [][];
    static int arr2 [][];
    static int sumArr[][];

    static StringTokenizer st;
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        arr1 = new int [N][M];
        arr2 = new int [N][M];
        sumArr = new int [N][M];

        for(int i=0; i<N;i++ ){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<M;j++){
                arr1[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i=0; i<N;i++ ){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<M;j++){
                arr2[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for(int i=0; i<N;i++ ){
            for(int j=0;j<M;j++){
                sumArr[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<N;i++ ){
            for(int j=0;j<M;j++){
                sb.append(sumArr[i][j]).append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb);

    }
}