package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_2444 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i=N-1; i>=0;i--){
            for(int j=0;j<i;j++){
                sb.append(" ");
            }
            for(int j=0;j<2*(N-i)-1;j++) {
                sb.append("*");
            }
            sb.append("\n");
        }


        //역순 출력
        for(int i=1; i<N; i++){
            for(int j=0; j<i; j++){
                sb.append(" ");
            }
            for(int j=0; j<2*(N-i)-1; j++) {
                sb.append("*");
            }
            sb.append("\n"); // 공백 추가 X
        }
        System.out.println(sb);
    }
}
/*
    *           //공백 4
   ***          //공백 3
  *****         //공백 2
 *******        //공백 1
*********
 *******        //공백1
  *****         //공백2
  * ....        //...
* */

