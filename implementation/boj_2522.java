package implementation;

import java.io.*;
class boj_2522{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int j=0;j<N;j++){   //출력 라인 횟수 동안
            for(int i=N;i>j+1;i--){    //공백은 2 1 0
                sb.append(" ");
            }
            for(int i=0;i<=j;i++){
                sb.append("*");
            }
            sb.append("\n");
        }
        for (int j = 0; j < N - 1; j++) {
            for(int i=0;i<=j;i++){// 공백 1 2
                sb.append(" ");
            }
            for(int i=N;i>j+1;i--){   //별 2 1
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}