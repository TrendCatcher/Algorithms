package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_1100 {
    static String[][] chess;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        chess = new String[8][8];
        int count = 0;

        //logic
        for (int i = 0; i < chess.length; i++) {
            String line = br.readLine();
            for (int j = 0; j < chess[i].length; j++) {
                if(i%2==0&&j%2==0){ //홀수줄(wbwb)에서는 홀수번째가 w이고 F이어야 함
                    if(line.charAt(j)=='F'){
                        count++;
                    }
                }else if(i%2==1&&j%2==1){   //짝수줄(bwbw)에서는 짝수번째가 w이고 F이어야 함
                    if(line.charAt(j)=='F'){
                        count++;
                    }
                }
            }
        }

        //[output] : 흰칸 위의 체스 개수
        System.out.println(count);
    }//end of main
}//end of class
