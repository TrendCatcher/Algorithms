package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_2908 {

    public static void main(String[]args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb;
        StringTokenizer st = new StringTokenizer(br.readLine());
// sb가 초기화되지 않았으므로 다음 코드는 작동 ㄴㄴ
// int A = Integer.parseInt(sb(st.nextToken().reverse().toString));

        int A = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
        int B = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());

        System.out.println(Math.min(A, B));
    }
}
/* 유의점
* StringBuilder사용시 초기화한후 사용에 유의
* 숫자로 받아서 뒤집는건 reverse()
* StringBuilder은 문자열로 변환해 주어야 제대로 작동한다.
*
* */