package Deepening;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/*
[그룹단어 개수 출력]
그룹단어란? : 단어에 존재하는 모든문자에 대해서 각 문자가 연속해서 나타나는 경우
happy, new, year => 그룹문자
bab, aabbccaa => 그룹문자아님.
즉, 그룹문자는
1.연속해서 나타나고 끊어졌다가 또 나타나면 안됨
* */
public class Num1316 {
    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {       // 그룹단어인지 체크하는 로직
            String word = br.readLine();    // 단어(String) 입력받고
            pw.println(word);               //
        }
        pw.flush();
        pw.close();
        br.close();
    }
    public static void main(String[]args) throws IOException {
        new Num1316().solution();
    }
}
