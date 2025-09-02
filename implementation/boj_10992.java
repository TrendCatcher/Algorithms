package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_10992 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i=1;i<=N;i++){   //line개수는 N에 비례
            //공백 출력
            for(int j=N;j>i;j--){
                sb.append(" ");
            }

            if(i==N){
                for (int j = 0; j < 2 * i - 1; j++) {
                    sb.append("*");
                }
            }else{
                for(int j=0;j<2*i-1;j++){
                    if (j == 0 || j == 2 * i - 1 - 1) {  //인덱스의 처음 또는 가장 끝 부분일 때 별을 출력
                        sb.append("*");
                    }else{
                        sb.append(" ");
                    }
                }
            }
            sb.append("\n");
        }

        System.out.println(sb);

    }
}
