package Deepening;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
[그룹단어 개수 출력]
*/
//그룹단어란? : 단어에 존재하는 모든문자에 대해서 각 문자가 연속해서 나타나는 경우
//happy, new, year => 그룹문자
//bab, aabbccaa => 그룹문자아님.
//
//즉, 그룹문자는
/*1.연속해서 나타나고 끊어졌다가 또 나타나면 안됨*/
/*이를 체크하는 로직 필요 (check())*/
//    -전에 나타났던 문자열을 기억해야함
//        - [고민] 어떻게 기억하지?
//        - [해결] prev 변수 생성, prev의 문자와 해당 문자가 같으면 검사 X, 같지 않으면 검사 O
//    -연속되었다가 끊어졌다가 연속되는 것을 감지(?) >> [고민]

public class Num1316 {
    public void solution()  {
        Scanner scan = new Scanner(System.in);
        int count =0;
        int N = scan.nextInt();

        for(int i =0; i<N;i++){
            if(check() == true){
                count ++;
            }
        }
        System.out.println(count);
    }

    public static boolean check() {
        Scanner scan = new Scanner(System.in);
        boolean[] check = new boolean[26];
        int prev = 0;
        String str = scan.next();

        for(int i =0; i<str.length();i++){
            int now = str.charAt(i);    // i번째 문자 저장 (현재 문자)

            //앞선 문자와 i번째 문자가 같지 않다면? 검사
            if(prev != now){
                // 해당 문자를 처음보는 경우
                if(check[now - 'a'] == false){
                    check[now -'a'] = true;     //true로 바꿈
                    prev = now;                 // 갱신
                }
                //해당 문자를 본 경우
                else{
                    return false;   //함수 종료
                }
            }
            // 앞선 문자와 i번째 문자가 같다면 (연속된 문자)
            continue;
        }
        return true;
    }
    public static void main(String[]args) throws IOException{
        new Num1316().solution();
    }
}
