package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_10991 {
    public static void main(String[]args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<N;i++){//라인개수
            for(int j=0;j<(N-(i+1));j++){  //공백 입력
                sb.append(" ");
            }
            for(int j=0;j<=i;j++){  //별입력
                sb.append("*").append(" ");
            }
            sb.append("\n");
        }
        //각 라인마다
        //내림차순으로 공백 입력
        //
        System.out.println(sb);
    }
}
