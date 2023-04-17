package String;
/*
* 문제: 단어 S와 정수 i가 주어졌을때 S의 i번째 글자 출력
*
* [입력]
* 1. 첫줄: 영어 소문자와 대문자로만 이루어진 단어S 주어짐, 최대 1000
* 2. 둘째줄: 정수 i 주어짐
*
* [고민]
* 어떻게 문자열을 입력받지?
* [substring]
*   subdtring[]
* */
/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num27866 {
    public void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S = br.readLine().trim();        //string 받기
        int index = Integer.parseInt(br.readLine());    // string이 아니면 형 변환 필수!

        System.out.println(S.substring(index - 1, index));
    }

    public static void main(String[] args) throws IOException {
        new Num27866().solve();
    }
}
*/

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Num27866{
    public void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S = br.readLine().trim();
        int index = Integer.parseInt(br.readLine());

        System.out.println(S.substring(index-1,index));
    }

    public static void main(String[]args) throws IOException{
        new Num27866().solve();
    }
}

