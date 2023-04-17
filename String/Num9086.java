package String;
/*
* [개요] 입력 받은 문자열의 처음&끝글자 출력
* [입력]
* 1. 입력의 첫 줄에는 TC의 개수가 주어짐
* 2. 각 TC는 한줄에 하나의 문자열이 주어짐
*
* [출력]
*
* [고민]
* 1. 어떻게 3개를 입력받고 3개를 출력하지?
*   - 배열로 인덱스를 지정해서 접근?
* 2. 어떻게 특정 문자열의 위치를 출력하지?
*   - charAt(), substring()
*   - charAt(),
*
* [사용된 클래스]
* - StringBuilder
* public final class StringBuilder
* extends Object
* implements Serializable CharSequence
*>> Two principals of StringBuilder are the append and insert methods, which are overloaded
* so as to accept data of any type.
*
* */

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Num9086 {
    public void solve() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());     //TC입력

        for(int i =0; i<N;i++){
            String S = br.readLine();
            sb.append(S.charAt(0));
            sb.append(S.charAt(S.length()-1)+"\n");

        }
        System.out.println(sb);

    }
    public static void main(String[]args) throws IOException{
        new Num9086().solve();
    }
}
