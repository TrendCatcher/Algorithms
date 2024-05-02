package String;

import java.io.*;
import java.util.*;

// 문자열 S를 입력받아 R번 반복해 P출력
class Boj_2765{
    static String S;
    static int R;

    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine()); // Test Case 입력받기

        for(int i=0; i<T; i++) {    // Test case 만큼 R, S입력받고
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            R = Integer.parseInt(st.nextToken());
            S = st.nextToken();

            for(int j=0; j<S.length(); j++){    // 문자열 S를 쪼개서 R만큼 반복
                for(int k=0; k<R; k++){
                    char ch = S.charAt(j);
                    sb.append(ch);    // StringBuilder에 R만큼 넣음
                }
            }
            sb.append("\n");

        }
        System.out.println(sb);
    }
}
