package String;

/*
* 문자열 S를 입력받고 각 문자를 R번 반복해 새문자열 P를 만든 후 출력하는 프로그램
*
* [입력]
* 첫째줄: TC의 개수 T
* 각 TC는 반복 횟수 R (1이상 8이하)
* 문자열 S가 공백으로 구분되어 주어진다.
* S의 길이는 적어도 1이며, 20글자를 넘지 않는다.
*
* [출력]
* 각 TC에 대해 P 출력
*
* [고민]
* 1. 문자열을 분해해서 받되
* 2.
* */
import java.util.Scanner;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Num2675 {
    public void solution() throws IOException{
        Scanner scan = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = scan.nextInt();     //  TC 입력받기
        for(int i=0;i<T;i++){       //  TC의 크기만큼 반복횟수, 문자열 입력받기
            int n = scan.nextInt(); // for 문안에 입력받아야 될 것:1. 반복횟수 2. 문자열
            String S  = br.readLine();
        }

    }
    public static void main(String[]args) throws IOException{
        new Num2675().solution();
    }
}
