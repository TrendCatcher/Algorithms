package implementation;

import java.io.*;
import java.util.*;

class boj_2577{
    static int A,B,C;

    public static void main(String[]args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        A = Integer.parseInt(br.readLine());
        B = Integer.parseInt(br.readLine());
        C = Integer.parseInt(br.readLine());
        int result = A*B*C;
        //숫자를 문자열로 변환후 춤자 배열로 분리

        char [] charArray = String.valueOf(result).toCharArray();

        //0~9까지 세는 카운팅 배열
        int counting[] = new int [10];
        for(int i=0 ;i<charArray.length;i++){
            counting[charArray[i]-'0']++;
        }
        //0부터 9까지 개수 출력
        for(int i=0;i<counting.length;i++){
            System.out.println(counting[i]);
        }
    }
}
